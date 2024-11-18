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

public class TypeSpecEnumStatementImpl extends TypeSpecStatementImpl implements TypeSpecEnumStatement {

  public TypeSpecEnumStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull TypeSpecVisitor visitor) {
    visitor.visitEnumStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TypeSpecVisitor) accept((TypeSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TypeSpecDecoratorLike> getDecoratorLikeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TypeSpecDecoratorLike.class);
  }

  @Override
  @Nullable
  public TypeSpecEnumVariantsBlock getEnumVariantsBlock() {
    return findChildByClass(TypeSpecEnumVariantsBlock.class);
  }

  @Override
  @Nullable
  public TypeSpecIdentifier getIdentifier() {
    return findChildByClass(TypeSpecIdentifier.class);
  }

  @Override
  @Nullable
  public ItemPresentation getPresentation() {
    return TypeSpecImplUtil.getPresentation(this);
  }

}
