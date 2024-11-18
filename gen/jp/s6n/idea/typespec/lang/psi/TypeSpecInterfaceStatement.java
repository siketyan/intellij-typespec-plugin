// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface TypeSpecInterfaceStatement extends TypeSpecStatement {

  @NotNull
  List<TypeSpecDecoratorLike> getDecoratorLikeList();

  @Nullable
  TypeSpecIdentifier getIdentifier();

  @Nullable
  TypeSpecInterfaceExtends getInterfaceExtends();

  @Nullable
  TypeSpecInterfaceOperationsBlock getInterfaceOperationsBlock();

  @Nullable
  TypeSpecTypeParameterList getTypeParameterList();

  @Nullable
  ItemPresentation getPresentation();

}
