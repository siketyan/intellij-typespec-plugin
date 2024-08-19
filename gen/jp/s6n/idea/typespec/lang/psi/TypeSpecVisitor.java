// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;

public class TypeSpecVisitor extends PsiElementVisitor {

  public void visitAliasStatement(@NotNull TypeSpecAliasStatement o) {
    visitStatement(o);
  }

  public void visitArgument(@NotNull TypeSpecArgument o) {
    visitElement(o);
  }

  public void visitArgumentList(@NotNull TypeSpecArgumentList o) {
    visitElement(o);
  }

  public void visitArgumentsList(@NotNull TypeSpecArgumentsList o) {
    visitElement(o);
  }

  public void visitArrayType(@NotNull TypeSpecArrayType o) {
    visitType(o);
  }

  public void visitDecorator(@NotNull TypeSpecDecorator o) {
    visitElement(o);
  }

  public void visitEnumStatement(@NotNull TypeSpecEnumStatement o) {
    visitStatement(o);
  }

  public void visitEnumVariant(@NotNull TypeSpecEnumVariant o) {
    visitElement(o);
  }

  public void visitEnumVariantsBlock(@NotNull TypeSpecEnumVariantsBlock o) {
    visitElement(o);
  }

  public void visitExpression(@NotNull TypeSpecExpression o) {
    visitElement(o);
  }

  public void visitExternDecoratorStatement(@NotNull TypeSpecExternDecoratorStatement o) {
    visitElement(o);
  }

  public void visitImportStatement(@NotNull TypeSpecImportStatement o) {
    visitStatement(o);
  }

  public void visitInterfaceOperation(@NotNull TypeSpecInterfaceOperation o) {
    visitElement(o);
  }

  public void visitInterfaceOperationsBlock(@NotNull TypeSpecInterfaceOperationsBlock o) {
    visitElement(o);
  }

  public void visitInterfaceStatement(@NotNull TypeSpecInterfaceStatement o) {
    visitStatement(o);
  }

  public void visitLiteralExpression(@NotNull TypeSpecLiteralExpression o) {
    visitExpression(o);
  }

  public void visitLiteralType(@NotNull TypeSpecLiteralType o) {
    visitType(o);
  }

  public void visitModelExtends(@NotNull TypeSpecModelExtends o) {
    visitElement(o);
  }

  public void visitModelIs(@NotNull TypeSpecModelIs o) {
    visitElement(o);
  }

  public void visitModelPropertiesBlock(@NotNull TypeSpecModelPropertiesBlock o) {
    visitElement(o);
  }

  public void visitModelProperty(@NotNull TypeSpecModelProperty o) {
    visitElement(o);
  }

  public void visitModelStatement(@NotNull TypeSpecModelStatement o) {
    visitStatement(o);
  }

  public void visitNamedArgument(@NotNull TypeSpecNamedArgument o) {
    visitElement(o);
  }

  public void visitNamespaceStatement(@NotNull TypeSpecNamespaceStatement o) {
    visitStatement(o);
  }

  public void visitObjectExpression(@NotNull TypeSpecObjectExpression o) {
    visitExpression(o);
  }

  public void visitObjectExpressionProperty(@NotNull TypeSpecObjectExpressionProperty o) {
    visitElement(o);
  }

  public void visitOperation(@NotNull TypeSpecOperation o) {
    visitElement(o);
  }

  public void visitOperationStatement(@NotNull TypeSpecOperationStatement o) {
    visitStatement(o);
  }

  public void visitPath(@NotNull TypeSpecPath o) {
    visitElement(o);
  }

  public void visitPathExpression(@NotNull TypeSpecPathExpression o) {
    visitExpression(o);
  }

  public void visitPathType(@NotNull TypeSpecPathType o) {
    visitType(o);
  }

  public void visitStatement(@NotNull TypeSpecStatement o) {
    visitElement(o);
  }

  public void visitType(@NotNull TypeSpecType o) {
    visitElement(o);
  }

  public void visitUnionStatement(@NotNull TypeSpecUnionStatement o) {
    visitStatement(o);
  }

  public void visitUnionType(@NotNull TypeSpecUnionType o) {
    visitType(o);
  }

  public void visitUnionVariant(@NotNull TypeSpecUnionVariant o) {
    visitElement(o);
  }

  public void visitUnionVariantsBlock(@NotNull TypeSpecUnionVariantsBlock o) {
    visitElement(o);
  }

  public void visitUsingStatement(@NotNull TypeSpecUsingStatement o) {
    visitStatement(o);
  }

  public void visitValueOfType(@NotNull TypeSpecValueOfType o) {
    visitType(o);
  }

  public void visitVariadicArgument(@NotNull TypeSpecVariadicArgument o) {
    visitElement(o);
  }

  public void visitElement(@NotNull TypeSpecElement o) {
    super.visitElement(o);
  }

}
