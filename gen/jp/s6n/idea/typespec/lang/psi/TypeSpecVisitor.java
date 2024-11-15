// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;

public class TypeSpecVisitor extends PsiElementVisitor {

  public void visitAliasStatement(@NotNull TypeSpecAliasStatement o) {
    visitStatement(o);
  }

  public void visitArgumentList(@NotNull TypeSpecArgumentList o) {
    visitElement(o);
  }

  public void visitArrayType(@NotNull TypeSpecArrayType o) {
    visitType(o);
  }

  public void visitAugmentDecoratorStatement(@NotNull TypeSpecAugmentDecoratorStatement o) {
    visitElement(o);
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
    visitStatement(o);
  }

  public void visitIdentifier(@NotNull TypeSpecIdentifier o) {
    visitElement(o);
  }

  public void visitImportStatement(@NotNull TypeSpecImportStatement o) {
    visitStatement(o);
  }

  public void visitInterfaceExtends(@NotNull TypeSpecInterfaceExtends o) {
    visitElement(o);
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

  public void visitNamedModelProperty(@NotNull TypeSpecNamedModelProperty o) {
    visitModelProperty(o);
  }

  public void visitNamedParameter(@NotNull TypeSpecNamedParameter o) {
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

  public void visitOperationIs(@NotNull TypeSpecOperationIs o) {
    visitElement(o);
  }

  public void visitOperationSignature(@NotNull TypeSpecOperationSignature o) {
    visitElement(o);
  }

  public void visitOperationStatement(@NotNull TypeSpecOperationStatement o) {
    visitStatement(o);
  }

  public void visitParameter(@NotNull TypeSpecParameter o) {
    visitElement(o);
  }

  public void visitParameterList(@NotNull TypeSpecParameterList o) {
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

  public void visitSpreadModelProperty(@NotNull TypeSpecSpreadModelProperty o) {
    visitModelProperty(o);
  }

  public void visitStatement(@NotNull TypeSpecStatement o) {
    visitElement(o);
  }

  public void visitType(@NotNull TypeSpecType o) {
    visitElement(o);
  }

  public void visitTypeArgumentList(@NotNull TypeSpecTypeArgumentList o) {
    visitElement(o);
  }

  public void visitTypeParameterList(@NotNull TypeSpecTypeParameterList o) {
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

  public void visitVariadicParameter(@NotNull TypeSpecVariadicParameter o) {
    visitElement(o);
  }

  public void visitElement(@NotNull TypeSpecElement o) {
    super.visitElement(o);
  }

}
