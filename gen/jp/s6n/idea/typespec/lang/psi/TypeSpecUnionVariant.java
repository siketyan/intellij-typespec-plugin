// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TypeSpecUnionVariant extends TypeSpecElement {

  @NotNull
  List<TypeSpecDecorator> getDecoratorList();

  @NotNull
  TypeSpecPath getPath();

  @NotNull
  PsiElement getIdentifier();

}