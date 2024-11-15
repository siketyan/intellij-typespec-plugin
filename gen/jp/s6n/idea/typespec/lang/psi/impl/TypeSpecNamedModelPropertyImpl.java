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

public class TypeSpecNamedModelPropertyImpl extends TypeSpecModelPropertyImpl implements TypeSpecNamedModelProperty {

  public TypeSpecNamedModelPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull TypeSpecVisitor visitor) {
    visitor.visitNamedModelProperty(this);
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
  public TypeSpecExpression getExpression() {
    return findChildByClass(TypeSpecExpression.class);
  }

  @Override
  @NotNull
  public TypeSpecIdentifier getIdentifier() {
    return findNotNullChildByClass(TypeSpecIdentifier.class);
  }

  @Override
  @NotNull
  public TypeSpecType getType() {
    return findNotNullChildByClass(TypeSpecType.class);
  }

}
