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

  public void visitArrayExpression(@NotNull TypeSpecArrayExpression o) {
    visitOperatorExpression(o);
  }

  public void visitArrayLiteral(@NotNull TypeSpecArrayLiteral o) {
    visitNonArrayExpression(o);
  }

  public void visitAugmentDecoratorStatement(@NotNull TypeSpecAugmentDecoratorStatement o) {
    visitStatement(o);
  }

  public void visitCallExpression(@NotNull TypeSpecCallExpression o) {
    visitOperatorExpression(o);
  }

  public void visitDecorator(@NotNull TypeSpecDecorator o) {
    visitElement(o);
  }

  public void visitDecoratorLike(@NotNull TypeSpecDecoratorLike o) {
    visitElement(o);
  }

  public void visitDirective(@NotNull TypeSpecDirective o) {
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

  public void visitIntersectionExpression(@NotNull TypeSpecIntersectionExpression o) {
    visitUnionExpression(o);
  }

  public void visitKeywordExpression(@NotNull TypeSpecKeywordExpression o) {
    visitNonArrayExpression(o);
  }

  public void visitLiteralExpression(@NotNull TypeSpecLiteralExpression o) {
    visitNonArrayExpression(o);
  }

  public void visitMemberExpression(@NotNull TypeSpecMemberExpression o) {
    visitNonArrayExpression(o);
  }

  public void visitModelExpression(@NotNull TypeSpecModelExpression o) {
    visitExpression(o);
  }

  public void visitModelExtends(@NotNull TypeSpecModelExtends o) {
    visitElement(o);
  }

  public void visitModelIs(@NotNull TypeSpecModelIs o) {
    visitElement(o);
  }

  public void visitModelProperty(@NotNull TypeSpecModelProperty o) {
    visitModelPropertyLike(o);
  }

  public void visitModelPropertyLike(@NotNull TypeSpecModelPropertyLike o) {
    visitElement(o);
  }

  public void visitModelStatement(@NotNull TypeSpecModelStatement o) {
    visitStatement(o);
  }

  public void visitNamedParameter(@NotNull TypeSpecNamedParameter o) {
    visitElement(o);
  }

  public void visitNamespaceStatement(@NotNull TypeSpecNamespaceStatement o) {
    visitStatement(o);
  }

  public void visitNonArrayExpression(@NotNull TypeSpecNonArrayExpression o) {
    visitElement(o);
  }

  public void visitObjectLiteral(@NotNull TypeSpecObjectLiteral o) {
    visitNonArrayExpression(o);
  }

  public void visitObjectLiteralProperty(@NotNull TypeSpecObjectLiteralProperty o) {
    visitElement(o);
  }

  public void visitOperation(@NotNull TypeSpecOperation o) {
    visitElement(o);
  }

  public void visitOperationSignature(@NotNull TypeSpecOperationSignature o) {
    visitElement(o);
  }

  public void visitOperationSignatureDeclarationNode(@NotNull TypeSpecOperationSignatureDeclarationNode o) {
    visitElement(o);
  }

  public void visitOperationSignatureReferenceNode(@NotNull TypeSpecOperationSignatureReferenceNode o) {
    visitElement(o);
  }

  public void visitOperationStatement(@NotNull TypeSpecOperationStatement o) {
    visitStatement(o);
  }

  public void visitOperatorExpression(@NotNull TypeSpecOperatorExpression o) {
    visitElement(o);
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

  public void visitScalarConstructor(@NotNull TypeSpecScalarConstructor o) {
    visitElement(o);
  }

  public void visitScalarConstructorList(@NotNull TypeSpecScalarConstructorList o) {
    visitElement(o);
  }

  public void visitScalarExtends(@NotNull TypeSpecScalarExtends o) {
    visitElement(o);
  }

  public void visitScalarStatement(@NotNull TypeSpecScalarStatement o) {
    visitStatement(o);
  }

  public void visitSpreadModelProperty(@NotNull TypeSpecSpreadModelProperty o) {
    visitModelPropertyLike(o);
  }

  public void visitSpreadObjectLiteralProperty(@NotNull TypeSpecSpreadObjectLiteralProperty o) {
    visitElement(o);
  }

  public void visitStatement(@NotNull TypeSpecStatement o) {
    visitElement(o);
  }

  public void visitTupleExpression(@NotNull TypeSpecTupleExpression o) {
    visitNonArrayExpression(o);
  }

  public void visitTypeArgumentList(@NotNull TypeSpecTypeArgumentList o) {
    visitElement(o);
  }

  public void visitTypeOfExpression(@NotNull TypeSpecTypeOfExpression o) {
    visitOperatorExpression(o);
  }

  public void visitTypeParameter(@NotNull TypeSpecTypeParameter o) {
    visitElement(o);
  }

  public void visitTypeParameterList(@NotNull TypeSpecTypeParameterList o) {
    visitElement(o);
  }

  public void visitTypeReference(@NotNull TypeSpecTypeReference o) {
    visitNonArrayExpression(o);
  }

  public void visitUnionExpression(@NotNull TypeSpecUnionExpression o) {
    visitExpression(o);
  }

  public void visitUnionStatement(@NotNull TypeSpecUnionStatement o) {
    visitStatement(o);
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

  public void visitValueOfExpression(@NotNull TypeSpecValueOfExpression o) {
    visitOperatorExpression(o);
  }

  public void visitVariadicParameter(@NotNull TypeSpecVariadicParameter o) {
    visitElement(o);
  }

  public void visitElement(@NotNull TypeSpecElement o) {
    super.visitElement(o);
  }

}
