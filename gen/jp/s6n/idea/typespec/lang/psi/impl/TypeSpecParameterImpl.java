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

public class TypeSpecParameterImpl extends TypeSpecElementImpl implements TypeSpecParameter {

  public TypeSpecParameterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TypeSpecVisitor visitor) {
    visitor.visitParameter(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TypeSpecVisitor) accept((TypeSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TypeSpecNamedParameter getNamedParameter() {
    return findChildByClass(TypeSpecNamedParameter.class);
  }

  @Override
  @Nullable
  public TypeSpecVariadicParameter getVariadicParameter() {
    return findChildByClass(TypeSpecVariadicParameter.class);
  }

}
