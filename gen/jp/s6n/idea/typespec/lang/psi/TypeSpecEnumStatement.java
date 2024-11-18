// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface TypeSpecEnumStatement extends TypeSpecStatement {

  @NotNull
  List<TypeSpecDecoratorLike> getDecoratorLikeList();

  @Nullable
  TypeSpecEnumVariantsBlock getEnumVariantsBlock();

  @Nullable
  TypeSpecIdentifier getIdentifier();

  @Nullable
  ItemPresentation getPresentation();

}
