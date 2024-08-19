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

public class TypeSpecInterfaceStatementImpl extends TypeSpecStatementImpl implements TypeSpecInterfaceStatement {

  public TypeSpecInterfaceStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull TypeSpecVisitor visitor) {
    visitor.visitInterfaceStatement(this);
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
  @Nullable
  public TypeSpecInterfaceExtends getInterfaceExtends() {
    return findChildByClass(TypeSpecInterfaceExtends.class);
  }

  @Override
  @NotNull
  public TypeSpecInterfaceOperationsBlock getInterfaceOperationsBlock() {
    return findNotNullChildByClass(TypeSpecInterfaceOperationsBlock.class);
  }

  @Override
  @Nullable
  public TypeSpecTypeParameterList getTypeParameterList() {
    return findChildByClass(TypeSpecTypeParameterList.class);
  }

  @Override
  @Nullable
  public ItemPresentation getPresentation() {
    return TypeSpecImplUtil.getPresentation(this);
  }

}
