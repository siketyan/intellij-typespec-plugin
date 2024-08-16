// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TypeSpecModelStatement extends TypeSpecStatement {

  @NotNull
  List<TypeSpecDecorator> getDecoratorList();

  @Nullable
  TypeSpecModelExtends getModelExtends();

  @Nullable
  TypeSpecModelIs getModelIs();

  @NotNull
  TypeSpecModelPropertiesBlock getModelPropertiesBlock();

  @NotNull
  PsiElement getIdentifier();

}
