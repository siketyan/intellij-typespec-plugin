// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TypeSpecModelStatement extends TypeSpecElement {

  @NotNull
  List<TypeSpecDecorator> getDecoratorList();

  @Nullable
  TypeSpecModelExtends getModelExtends();

  @Nullable
  TypeSpecModelIs getModelIs();

  @NotNull
  List<TypeSpecModelProperty> getModelPropertyList();

  @NotNull
  PsiElement getIdentifier();

}
