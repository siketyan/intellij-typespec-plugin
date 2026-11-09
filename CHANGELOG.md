# Changelog

## [0.4.1](https://github.com/siketyan/intellij-typespec-plugin/compare/v0.4.0...v0.4.1) (2026-11-09)


### Features

* depend on the LSP module instead of the Ultimate module ([#94](https://github.com/siketyan/intellij-typespec-plugin/issues/94)) ([ffa5726](https://github.com/siketyan/intellij-typespec-plugin/commit/ffa572699ba323bba313889bb1a3f1ffe7b188b9))

## [0.4.0](https://github.com/siketyan/intellij-typespec-plugin/compare/v0.3.0...v0.4.0) (2026-11-09)


### ⚠ BREAKING CHANGES

* migrate to LspClient API, require 2026.1.4 or later ([#88](https://github.com/siketyan/intellij-typespec-plugin/issues/88))

### Features

* migrate to LspClient API, require 2026.1.4 or later ([#88](https://github.com/siketyan/intellij-typespec-plugin/issues/88)) ([826baaf](https://github.com/siketyan/intellij-typespec-plugin/commit/826baafcc7f7b9009a0c25e78c137576f72325af))


### Bug Fixes

* allow IDE builds 263.* ([#85](https://github.com/siketyan/intellij-typespec-plugin/issues/85)) ([4fc89c6](https://github.com/siketyan/intellij-typespec-plugin/commit/4fc89c6c49541b11a5e213da6297eaf42ee39748))
* override getFileUri instead of internal getFilePath in LSP descriptor ([#86](https://github.com/siketyan/intellij-typespec-plugin/issues/86)) ([5fae1bb](https://github.com/siketyan/intellij-typespec-plugin/commit/5fae1bb9a0fa5830e1b3818b2241adc5ba89a142))

## [0.3.0](https://github.com/siketyan/intellij-typespec-plugin/compare/v0.2.9...v0.3.0) (2026-07-09)


### ⚠ BREAKING CHANGES

* Remove support for 2024.3.

### Features

* Add support for 2026.2.
* Update language syntax to TypeSpec 1.13.0.

## [0.2.9](https://github.com/siketyan/intellij-typespec-plugin/compare/v0.2.8...v0.2.9) (2026-04-01)


### Features

* Add support for 2026.1.

## [0.2.8](https://github.com/siketyan/intellij-typespec-plugin/compare/v0.2.7...v0.2.8) (2025-12-01)


### Features

* Add support for 2025.3.
* Update language syntax.

## [0.2.7](https://github.com/siketyan/intellij-typespec-plugin/compare/v0.2.6...v0.2.7) (2025-08-05)


### Features

* Add support for 2025.2.
* Update language syntax.

## [0.2.6](https://github.com/siketyan/intellij-typespec-plugin/compare/v0.2.5...v0.2.6) (2025-04-17)


### Features

* Add support for 2025.1.

## [0.2.5](https://github.com/siketyan/intellij-typespec-plugin/compare/v0.2.4...v0.2.5) (2025-02-02)


### Bug Fixes

* Remove unnecessary dependencies.

## [0.2.4](https://github.com/siketyan/intellij-typespec-plugin/compare/v0.2.3...v0.2.4) (2025-02-02)


### Bug Fixes

* Fix duplicated server version in "Language Services" view.
* Fix the TSP icon in "Language Services" view.

## [0.2.3](https://github.com/siketyan/intellij-typespec-plugin/compare/v0.2.2...v0.2.3) (2025-02-02)


### Features

* Add "Create new TypeSpec file" action.
* Add icon for the plugin and the file type.
* Support 2025.1 builds.

## [0.2.2](https://github.com/siketyan/intellij-typespec-plugin/compare/v0.2.1...v0.2.2) (2024-11-26)


### Miscellaneous Chores

* Remove internal API usages.
* Remove unnecessary files.

## [0.2.1](https://github.com/siketyan/intellij-typespec-plugin/compare/v0.2.0...v0.2.1) (2024-11-23)


### Bug Fixes

* Fix PluginException during plugin initialisation.
* Fix invalid file paths on LSP server on WSL 2 environment.

## [0.2.0](https://github.com/siketyan/intellij-typespec-plugin/compare/v0.1.5...v0.2.0) (2024-11-23)


### ⚠ BREAKING CHANGES

* Language syntax now follows the official tmLanguage definition. Results of syntax highlighting may differ.

### Features

* Semantic highlighting is now provided by the LSP server.
* Code folding is now provided by the LSP server (textDocument/foldingRange).
* Structure view is now provided by the LSP server (textDocument/documentSymbol).
