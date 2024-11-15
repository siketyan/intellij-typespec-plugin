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

public class TypeSpecNonArrayExpressionImpl extends TypeSpecElementImpl implements TypeSpecNonArrayExpression {

  public TypeSpecNonArrayExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TypeSpecVisitor visitor) {
    visitor.visitNonArrayExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TypeSpecVisitor) accept((TypeSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TypeSpecModelExpression getModelExpression() {
    return findChildByClass(TypeSpecModelExpression.class);
  }

}
