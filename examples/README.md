# Examples

プラグインの動作確認用サンプルファイル集です。

## ファイル一覧

| ファイル | 確認できる機能 |
|---|---|
| `basic.tsp` | シンタックスハイライト、基本的な TypeSpec 構文 |
| `navigation.tsp` | Go to Declaration (Cmd+Click / Ctrl+Click) |
| `folding.tsp` | コードフォールディング (namespace / model / interface ブロック) |
| `structure.tsp` | Structure View (ファイル構造ツリー) |
| `lsp.tsp` | LSP 機能 (補完・ホバー・診断・`@doc` 表示) |

## 前提条件

LSP 機能 (`lsp.tsp`) を確認するには `@typespec/compiler` がインストールされている必要があります。

```bash
npm install -g @typespec/compiler
```

## 使い方

1. IntelliJ IDEA でプラグインをビルド・起動 (`./gradlew runIde`)
2. `examples/` ディレクトリを開く
3. 各ファイルを開いて該当機能を確認
