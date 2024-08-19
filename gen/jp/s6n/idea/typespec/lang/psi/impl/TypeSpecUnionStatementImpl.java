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

public class TypeSpecUnionStatementImpl extends TypeSpecStatementImpl implements TypeSpecUnionStatement {

  public TypeSpecUnionStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull TypeSpecVisitor visitor) {
    visitor.visitUnionStatement(this);
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
  public TypeSpecIdentifier getIdentifier() {
    return findNotNullChildByClass(TypeSpecIdentifier.class);
  }

  @Override
  @NotNull
  public TypeSpecUnionVariantsBlock getUnionVariantsBlock() {
    return findNotNullChildByClass(TypeSpecUnionVariantsBlock.class);
  }

  @Override
  @Nullable
  public ItemPresentation getPresentation() {
    return TypeSpecImplUtil.getPresentation(this);
  }

}
