// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TypeSpecNamespaceStatement extends TypeSpecElement {

  @NotNull
  List<TypeSpecDecorator> getDecoratorList();

  @NotNull
  List<TypeSpecImportStatement> getImportStatementList();

  @NotNull
  List<TypeSpecInterfaceStatement> getInterfaceStatementList();

  @NotNull
  List<TypeSpecModelStatement> getModelStatementList();

  @NotNull
  List<TypeSpecNamespaceStatement> getNamespaceStatementList();

  @NotNull
  TypeSpecPath getPath();

  @NotNull
  List<TypeSpecUsingStatement> getUsingStatementList();

}
