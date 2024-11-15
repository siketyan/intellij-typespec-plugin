// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TypeSpecScalarStatement extends TypeSpecElement {

  @NotNull
  List<TypeSpecDecoratorLike> getDecoratorLikeList();

  @NotNull
  TypeSpecIdentifier getIdentifier();

  @Nullable
  TypeSpecScalarConstructorList getScalarConstructorList();

  @Nullable
  TypeSpecScalarExtends getScalarExtends();

  @Nullable
  TypeSpecTypeParameterList getTypeParameterList();

}
