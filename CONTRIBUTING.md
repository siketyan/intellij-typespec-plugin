# Contributing

This document covers setting up a development environment, running the plugin locally, debugging, and cutting a release.

## Prerequisites

| Tool | Purpose | Install |
|------|---------|---------|
| [mise](https://mise.jdx.dev/) | Manages Java version automatically | `brew install mise` |
| Java 21 | Build toolchain | Managed by mise (see below) |
| [GitHub CLI](https://cli.github.com/) | Releases only | `brew install gh && gh auth login` |

> [!NOTE]
> mise handles Java installation. If you already have Java 21 on `PATH`, you can skip mise and use `./gradlew` directly — but version consistency is not guaranteed.

## Setup

```bash
git clone https://github.com/<your-username>/intellij-typespec-plugin
cd intellij-typespec-plugin
mise install        # installs Java 21 as specified in mise.toml
```

## Running the Plugin

Launch a sandbox IntelliJ IDEA instance with the plugin loaded:

```bash
mise run run
# equivalent to:
./gradlew runIde
```

The sandbox IDE opens as a separate process. Your main IDE is unaffected.

### Preparing a Test Project

The `examples/` directory contains sample TypeSpec files covering syntax, folding, LSP features, and navigation.

On first use, install the TypeSpec compiler inside `examples/`:

```bash
cd examples && npm install
```

Then, in the sandbox IDE:

1. Open the `examples/` directory as a project (**File > Open...**).
2. Open any `*.tsp` file.
3. Confirm the **TypeSpec** widget appears in the bottom status bar — this indicates the LSP server started successfully.

## Debugging

### Viewing Logs

```bash
tail -f .intellijPlatform/sandbox/intellij-typespec-plugin/IU-*/log/idea.log | grep -i typespec
```

A successful LSP startup produces output like:

```
INFO - TypeSpec file opened: /path/to/file.tsp
INFO - Node.js interpreter found: /usr/local/bin/node
INFO - TypeSpec LSP server starting with root: [/path/to/examples]
```

### Common Issues

| Symptom | Likely Cause | Resolution |
|---------|-------------|------------|
| `File is not a supported TypeSpec file` in logs | File type not recognized on first open | Restart the sandbox IDE |
| `Node.js interpreter not found` notification | Node.js not configured in the sandbox IDE | **Settings > Languages & Frameworks > Node.js** — select a Node.js interpreter |
| `TypeSpec is not installed` notification | `@typespec/compiler` not found in the project tree | Run `npm install @typespec/compiler` in the project root, then reopen a `.tsp` file |
| No TypeSpec widget in status bar | LSP server failed to start | Check logs for any error after `TypeSpec file opened` |

## Building

```bash
mise run build
# equivalent to:
./gradlew buildPlugin
```

Output artifact: `build/distributions/intellij-typespec-plugin-<version>.zip`

## Releasing

### 1. Update the version

Edit `build.gradle.kts`:

```kotlin
version = "0.x.x"
```

Commit the change:

```bash
git add build.gradle.kts
git commit -m "chore: bump version to 0.x.x"
```

### 2. Build and publish

```bash
mise run release
```

This task:
1. Runs `./gradlew buildPlugin` to produce the zip.
2. Derives the tag name from `build.gradle.kts` (e.g., `v0.3.1`).
3. Creates a GitHub Release via `gh release create` and uploads the zip with auto-generated release notes.

Requires `gh auth login` beforehand.

### 3. Installing a release build

Download the `.zip` from the [Releases page](../../releases), then in IntelliJ:

**Settings > Plugins > ⚙️ > Install Plugin from Disk...**

## Architecture

```
src/main/kotlin/jp/s6n/idea/typespec/
├── actions/
│   └── CreateTypeSpecFileAction.kt          # "New File > TypeSpec File" action
├── folding/
│   └── TypeSpecFoldingBuilder.kt            # Code folding
├── icons/
│   └── TypeSpecIcons.kt
├── lang/
│   ├── TypeSpecFileType.kt                  # File type definition (.tsp)
│   └── TypeSpecStructureViewFactory.kt      # Structure view (Outline panel)
├── lsp/
│   ├── TypeSpecLspServerSupportProvider.kt  # LSP server lifecycle (start/stop)
│   ├── TypeSpecLspServerDescriptor.kt       # LSP command line and configuration
│   └── LspServerUtil.kt                     # Server lookup helpers
└── textmate/
    └── TypeSpecTextMateBundleProvider.kt    # Syntax highlighting via TextMate grammar
```

### LSP Startup Flow

1. A `.tsp` (or `tspconfig.yaml`) file is opened in the editor.
2. `TypeSpecLspServerSupportProvider.fileOpened()` is called by the platform.
3. The configured Node.js interpreter is resolved via the IDE's Node.js settings.
4. The plugin walks up the directory tree looking for `node_modules/@typespec/compiler/cmd/tsp-server.js`.
5. On success, the LSP server is started as `node tsp-server.js --stdio`.

### IDE Version Compatibility

The plugin targets `sinceBuild = "243"` (IntelliJ IDEA 2024.3) with no `untilBuild` constraint, so it runs on all IDE versions from 2024.3 onward without code changes.

To compile against a newer IDE version, update `build.gradle.kts`:

```kotlin
intellijIdeaUltimate("2026.1")  // change to the target version
```
