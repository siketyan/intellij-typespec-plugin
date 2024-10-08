// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface TypeSpecModelStatement extends TypeSpecStatement {

  @NotNull
  List<TypeSpecDecorator> getDecoratorList();

  @NotNull
  TypeSpecIdentifier getIdentifier();

  @Nullable
  TypeSpecModelExtends getModelExtends();

  @Nullable
  TypeSpecModelIs getModelIs();

  @Nullable
  TypeSpecModelPropertiesBlock getModelPropertiesBlock();

  @Nullable
  TypeSpecTypeParameterList getTypeParameterList();

  @Nullable
  ItemPresentation getPresentation();

}
