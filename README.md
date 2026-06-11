<img src="/src/main/resources/META-INF/pluginIcon.svg" alt="TypeSpec Plugin Icon" width="128" height="128" />

# TypeSpec Language Support for IntelliJ Platform

IntelliJ Platform plugin that provides [TypeSpec](https://typespec.io/) language support via the official LSP integration.

This is a personal fork of [siketyan/intellij-typespec-plugin](https://github.com/siketyan/intellij-typespec-plugin). All original work and credit belong to [@siketyan](https://github.com/siketyan). This fork is maintained for personal use and distributed under the same [MIT License](LICENCE).

## Features

| Feature | Status |
|---------|--------|
| Syntax highlighting | |
| Code folding | |
| Structure view (Outline panel) | |
| Diagnostics | |
| Quick fixes | |
| Go to definition | |
| Find usages | |

## Requirements

- JetBrains IDE **2024.3 or later** (IntelliJ IDEA Ultimate, WebStorm, GoLand, or any paid JetBrains IDE)
- **Node.js** configured in IDE settings
- **`@typespec/compiler`** installed in your project (`npm install @typespec/compiler`)

> [!NOTE]
> This plugin requires a **paid JetBrains IDE**. It relies on the IntelliJ Platform LSP API, which is not available in Community editions.

## Installation

### From GitHub Releases (recommended)

1. Download the latest `.zip` from the [Releases page](../../releases).
2. In your IDE, open **Settings > Plugins > ⚙️ > Install Plugin from Disk...**.
3. Select the downloaded `.zip` file and restart the IDE.

### From Source

See [CONTRIBUTING.md](CONTRIBUTING.md) for build instructions.

## Usage

1. Configure a Node.js interpreter: **Settings > Languages & Frameworks > Node.js**.
2. Ensure `@typespec/compiler` is installed in your project root:
   ```bash
   npm install @typespec/compiler
   ```
3. Open any `*.tsp` file. The LSP server starts automatically and a **TypeSpec** widget appears in the status bar.

## Upstream

This fork tracks [siketyan/intellij-typespec-plugin](https://github.com/siketyan/intellij-typespec-plugin). Upstream changes are periodically merged. Bug reports and feature requests that are not fork-specific should be directed to the upstream repository.

## License

[MIT License](LICENCE) — Copyright (c) 2024 Naoki Ikeguchi
