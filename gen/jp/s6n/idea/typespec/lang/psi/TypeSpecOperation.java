// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TypeSpecOperation extends TypeSpecElement {

  @NotNull
  TypeSpecIdentifier getIdentifier();

  @NotNull
  TypeSpecOperationSignature getOperationSignature();

  @Nullable
  TypeSpecTypeParameterList getTypeParameterList();

}
