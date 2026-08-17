package com.swordfish.lemuroid.app.mobile.feature.settings.advanced

import android.content.Context
import android.net.Uri
import androidx.documentfile.provider.DocumentFile
import com.swordfish.lemuroid.lib.storage.DirectoriesManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import timber.log.Timber
import java.io.File

/**
 * Imports saves and save states from a folder picked by the user, usually a copy of another
 * installation's files directory. Apps cannot read each other's Android/data folders on modern
 * Android, so the files have to be moved somewhere readable first.
 */
object SavesImporter {
    suspend fun import(
        context: Context,
        treeUri: Uri,
    ): Int =
        withContext(Dispatchers.IO) {
            val root = DocumentFile.fromTreeUri(context, treeUri) ?: return@withContext 0
            val directoriesManager = DirectoriesManager(context)

            val destinations =
                mapOf(
                    "saves" to directoriesManager.getSavesDirectory(),
                    "states" to directoriesManager.getStatesDirectory(),
                    "state-previews" to directoriesManager.getStatesPreviewDirectory(),
                )

            // Both the files directory and any of its save folders are valid picks.
            val sources =
                destinations[root.name]
                    ?.let { listOf(root to it) }
                    ?: root.listFiles()
                        .filter { it.isDirectory }
                        .mapNotNull { source -> destinations[source.name]?.let { source to it } }

            sources.sumOf { (source, destination) -> copyDirectory(context, source, destination) }
        }

    private fun copyDirectory(
        context: Context,
        source: DocumentFile,
        destination: File,
    ): Int {
        return source.listFiles().sumOf { child ->
            val name = child.name ?: return@sumOf 0
            if (child.isDirectory) {
                copyDirectory(context, child, File(destination, name))
            } else {
                copyFile(context, child, File(destination, name))
            }
        }
    }

    private fun copyFile(
        context: Context,
        source: DocumentFile,
        destination: File,
    ): Int {
        // Never replace a save which is newer than the one being imported.
        if (destination.exists() && destination.lastModified() >= source.lastModified()) {
            return 0
        }

        return runCatching {
            destination.parentFile?.mkdirs()
            context.contentResolver.openInputStream(source.uri)?.use { input ->
                destination.outputStream().use { output -> input.copyTo(output) }
            } ?: return 0
            1
        }
            .onFailure { Timber.e(it, "Error importing ${source.uri}") }
            .getOrDefault(0)
    }
}
