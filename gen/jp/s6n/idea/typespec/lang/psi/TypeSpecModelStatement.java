// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface TypeSpecModelStatement extends TypeSpecStatement {

  @NotNull
  List<TypeSpecDecoratorLike> getDecoratorLikeList();

  @NotNull
  TypeSpecIdentifier getIdentifier();

  @Nullable
  TypeSpecModelExpression getModelExpression();

  @Nullable
  TypeSpecModelExtends getModelExtends();

  @Nullable
  TypeSpecModelIs getModelIs();

  @Nullable
  TypeSpecTypeParameterList getTypeParameterList();

  @Nullable
  ItemPresentation getPresentation();

}
