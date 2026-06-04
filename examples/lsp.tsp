// LSP 機能 (補完・ホバー・診断) のテスト用
// typespec-language-server が起動していることが前提

import "@typespec/http";

using TypeSpec.Http;

@service({
  title: "LSP Test",
  version: "0.1.0",
})
namespace LspTest;

// 補完テスト: "@" を入力してデコレータ候補が出るか確認
// ホバーテスト: 型名の上にカーソルを置いて説明が表示されるか確認
// 診断テスト: 意図的なエラーを入れて赤下線が出るか確認

scalar Uuid extends string;

@doc("ユーザーを表すモデル")
model User {
  @doc("ユーザーの一意識別子")
  id: Uuid;

  @doc("表示名")
  @minLength(1)
  @maxLength(100)
  name: string;

  @doc("メールアドレス")
  @format("email")
  email: string;

  @doc("作成日時")
  createdAt: utcDateTime;
}

@route("/users")
@tag("Users")
interface Users {
  @summary("ユーザー一覧取得")
  @get list(
    @query skip?: int32,
    @query top?: int32,
  ): User[];

  @summary("ユーザー取得")
  @get read(@path id: Uuid): User;

  @summary("ユーザー作成")
  @post create(@body body: Omit<User, "id" | "createdAt">): User;
}
