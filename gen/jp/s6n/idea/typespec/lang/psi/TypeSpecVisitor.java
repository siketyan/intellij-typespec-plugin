// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;

public class TypeSpecVisitor extends PsiElementVisitor {

  public void visitArgumentsList(@NotNull TypeSpecArgumentsList o) {
    visitElement(o);
  }

  public void visitArrayType(@NotNull TypeSpecArrayType o) {
    visitType(o);
  }

  public void visitDecorator(@NotNull TypeSpecDecorator o) {
    visitElement(o);
  }

  public void visitExpression(@NotNull TypeSpecExpression o) {
    visitElement(o);
  }

  public void visitImportStatement(@NotNull TypeSpecImportStatement o) {
    visitElement(o);
  }

  public void visitInterfaceOperation(@NotNull TypeSpecInterfaceOperation o) {
    visitElement(o);
  }

  public void visitInterfaceStatement(@NotNull TypeSpecInterfaceStatement o) {
    visitElement(o);
  }

  public void visitLiteralExpression(@NotNull TypeSpecLiteralExpression o) {
    visitExpression(o);
  }

  public void visitLiteralType(@NotNull TypeSpecLiteralType o) {
    visitType(o);
  }

  public void visitModelProperty(@NotNull TypeSpecModelProperty o) {
    visitElement(o);
  }

  public void visitModelStatement(@NotNull TypeSpecModelStatement o) {
    visitElement(o);
  }

  public void visitNamedArgument(@NotNull TypeSpecNamedArgument o) {
    visitElement(o);
  }

  public void visitNamespaceStatement(@NotNull TypeSpecNamespaceStatement o) {
    visitElement(o);
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

  public void visitOperationArgument(@NotNull TypeSpecOperationArgument o) {
    visitElement(o);
  }

  public void visitOperationArgumentList(@NotNull TypeSpecOperationArgumentList o) {
    visitElement(o);
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

  public void visitType(@NotNull TypeSpecType o) {
    visitElement(o);
  }

  public void visitUnionType(@NotNull TypeSpecUnionType o) {
    visitType(o);
  }

  public void visitUsingStatement(@NotNull TypeSpecUsingStatement o) {
    visitElement(o);
  }

  public void visitVariadicArgument(@NotNull TypeSpecVariadicArgument o) {
    visitElement(o);
  }

  public void visitElement(@NotNull TypeSpecElement o) {
    super.visitElement(o);
  }

}
