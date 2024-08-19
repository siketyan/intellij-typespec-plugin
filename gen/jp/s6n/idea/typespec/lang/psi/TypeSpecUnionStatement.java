// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TypeSpecUnionStatement extends TypeSpecStatement {

  @NotNull
  List<TypeSpecDecorator> getDecoratorList();

  @NotNull
  TypeSpecUnionVariantsBlock getUnionVariantsBlock();

  @NotNull
  PsiElement getIdentifier();

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(TypeSpecUnionStatement, ...)
  //methods are not found in TypeSpecImplUtil

}
