// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TypeSpecInterfaceStatement extends TypeSpecStatement {

  @NotNull
  List<TypeSpecDecorator> getDecoratorList();

  @NotNull
  TypeSpecInterfaceOperationsBlock getInterfaceOperationsBlock();

  @NotNull
  PsiElement getIdentifier();

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(TypeSpecInterfaceStatement, ...)
  //methods are not found in TypeSpecImplUtil

}
