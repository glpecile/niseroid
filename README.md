# Niseroid

A personal fork of [Lemuroid](https://github.com/Swordfish90/Lemuroid) with a handful of quality-of-life
changes. Installs alongside the original (different application id), black icon, cyan accent.

**Grab the APK from [Releases](https://github.com/glpecile/Niseroid/releases).**

### What's different

- **Multi-speed fast forward (1x-16x)** in the game menu — [Lemuroid#1115](https://github.com/Swordfish90/Lemuroid/pull/1115) by [@mdevolde](https://github.com/mdevolde), cherry-picked.
- **Fast forward and mute persist between sessions** instead of resetting to 1x / unmuted on every launch.
- **The game menu stays open** when you toggle mute, fast forward, disk or tilt, so you can change more than one thing per visit. (Mobile menu; the TV menu still closes.)
- Black launcher icon and a cyan accent color, so it is easy to tell apart from Lemuroid.

Everything below is from upstream Lemuroid.

## Description

Lemuroid is an open-source emulation project for Android based on Libretro. Its main goal is ease of use, good Android integration and a great user experience.

It originated from a rib of [Retrograde](https://github.com/retrograde/retrograde-android), but graduated to a standalone project integrating [LibretroDroid](https://github.com/Swordfish90/LibretroDroid).

|Screen 1|Screen 2|Screen 3|
|---|---|---|
|![Screen1](https://github.com/Swordfish90/Lemuroid/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/1.jpg)|![Screen2](https://github.com/Swordfish90/Lemuroid/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/2.jpg)|![Screen3](https://github.com/Swordfish90/Lemuroid/blob/master/fastlane/metadata/android/en-US/images/phoneScreenshots/3.jpg)|

### Supported Systems:
- Atari 2600 (A26) ([stella](https://docs.libretro.com/library/stella/))
- Atari 7800 (A78) ([prosystem](https://docs.libretro.com/library/prosystem/))
- Atari Lynx (Lynx) ([handy](https://docs.libretro.com/library/handy/))
- Nintendo (NES) ([fceumm](https://docs.libretro.com/library/fceumm/))
- Super Nintendo (SNES) ([snes9x](https://docs.libretro.com/library/snes9x/))
- Game Boy (GB) ([gambatte](https://docs.libretro.com/library/gambatte/))
- Game Boy Color (GBC) ([gambatte](https://docs.libretro.com/library/gambatte/))
- Game Boy Advance (GBA) ([mgba](https://docs.libretro.com/library/mgba/))
- Sega Genesis (aka Megadrive) ([genesis_plus_gx](https://docs.libretro.com/library/genesis_plus_gx/))
- Sega CD (aka Mega CD) ([genesis_plus_gx](https://docs.libretro.com/library/genesis_plus_gx/))
- Sega Master System (SMS) ([genesis_plus_gx](https://docs.libretro.com/library/genesis_plus_gx/))
- Sega Game Gear (GG) ([genesis_plus_gx](https://docs.libretro.com/library/genesis_plus_gx/))
- Nintendo 64 (N64) ([mupen64plus](https://docs.libretro.com/library/mupen64plus/))
- PlayStation (PSX) ([PCSX-ReARMed](https://docs.libretro.com/library/pcsx_rearmed/))
- PlayStation Portable (PSP) ([ppsspp](https://docs.libretro.com/library/ppsspp/))
- FinalBurn Neo (Arcade) ([fbneo](https://github.com/libretro/FBNeo/))
- Nintendo DS (NDS) ([desmume](https://docs.libretro.com/library/desmume/)/[MelonDS](https://docs.libretro.com/library/melonds/))
- NEC PC Engine (PCE) ([beetle_pce_fast](https://docs.libretro.com/library/beetle_pce_fast/))
- Neo Geo Pocket (NGP) ([mednafen_ngp](https://docs.libretro.com/library/beetle_neopop/))
- Neo Geo Pocket Color (NGC) ([mednafen_ngp](https://docs.libretro.com/library/beetle_neopop/))
- WonderSwan (WS) ([beetle_cygne](https://docs.libretro.com/library/beetle_cygne/))
- WonderSwan Color (WSC) ([beetle_cygne](https://docs.libretro.com/library/beetle_cygne/))
- Nintendo 3DS (3DS) ([citra](https://docs.libretro.com/library/citra/))

### Features:
- Android TV support
- Automatically save and restore game states.
- ROMs scanning and indexing
- Optimized touch controls
- Quick save/load
- Support for Zipped ROMs
- Display simulation (LCD/CRT)
- Gamepad support
- Local multiplayer
- Tilt input
- Customizable touch controls (size and position)
- Cloud save sync
- HD mode

### Languages:
You can help translate Lemuroid in your native language by going here: https://crowdin.com/project/lemuroid
