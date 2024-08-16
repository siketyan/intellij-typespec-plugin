// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static jp.s6n.idea.typespec.lang.psi.TypeSpecElementTypes.*;
import jp.s6n.idea.typespec.lang.psi.*;

public class TypeSpecNamespaceStatementImpl extends TypeSpecElementImpl implements TypeSpecNamespaceStatement {

  public TypeSpecNamespaceStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TypeSpecVisitor visitor) {
    visitor.visitNamespaceStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TypeSpecVisitor) accept((TypeSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TypeSpecDecorator> getDecoratorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TypeSpecDecorator.class);
  }

  @Override
  @NotNull
  public List<TypeSpecEnumStatement> getEnumStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TypeSpecEnumStatement.class);
  }

  @Override
  @NotNull
  public List<TypeSpecImportStatement> getImportStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TypeSpecImportStatement.class);
  }

  @Override
  @NotNull
  public List<TypeSpecInterfaceStatement> getInterfaceStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TypeSpecInterfaceStatement.class);
  }

  @Override
  @NotNull
  public List<TypeSpecModelStatement> getModelStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TypeSpecModelStatement.class);
  }

  @Override
  @NotNull
  public List<TypeSpecNamespaceStatement> getNamespaceStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TypeSpecNamespaceStatement.class);
  }

  @Override
  @NotNull
  public List<TypeSpecOperationStatement> getOperationStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TypeSpecOperationStatement.class);
  }

  @Override
  @NotNull
  public TypeSpecPath getPath() {
    return findNotNullChildByClass(TypeSpecPath.class);
  }

  @Override
  @NotNull
  public List<TypeSpecUnionStatement> getUnionStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TypeSpecUnionStatement.class);
  }

  @Override
  @NotNull
  public List<TypeSpecUsingStatement> getUsingStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TypeSpecUsingStatement.class);
  }

}
