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
import com.intellij.navigation.ItemPresentation;

public class TypeSpecModelStatementImpl extends TypeSpecStatementImpl implements TypeSpecModelStatement {

  public TypeSpecModelStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull TypeSpecVisitor visitor) {
    visitor.visitModelStatement(this);
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
  @Nullable
  public TypeSpecModelExtends getModelExtends() {
    return findChildByClass(TypeSpecModelExtends.class);
  }

  @Override
  @Nullable
  public TypeSpecModelIs getModelIs() {
    return findChildByClass(TypeSpecModelIs.class);
  }

  @Override
  @NotNull
  public TypeSpecModelPropertiesBlock getModelPropertiesBlock() {
    return findNotNullChildByClass(TypeSpecModelPropertiesBlock.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public ItemPresentation getPresentation() {
    return TypeSpecImplUtil.getPresentation(this);
  }

}
