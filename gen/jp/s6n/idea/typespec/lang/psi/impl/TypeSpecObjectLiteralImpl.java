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

public class TypeSpecObjectLiteralImpl extends TypeSpecExpressionImpl implements TypeSpecObjectLiteral {

  public TypeSpecObjectLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull TypeSpecVisitor visitor) {
    visitor.visitObjectLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TypeSpecVisitor) accept((TypeSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TypeSpecObjectLiteralProperty> getObjectLiteralPropertyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TypeSpecObjectLiteralProperty.class);
  }

  @Override
  @NotNull
  public List<TypeSpecSpreadObjectLiteralProperty> getSpreadObjectLiteralPropertyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TypeSpecSpreadObjectLiteralProperty.class);
  }

}
