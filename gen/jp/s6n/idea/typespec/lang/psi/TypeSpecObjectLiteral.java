// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TypeSpecObjectLiteral extends TypeSpecNonArrayExpression {

  @NotNull
  List<TypeSpecObjectLiteralProperty> getObjectLiteralPropertyList();

  @NotNull
  List<TypeSpecSpreadObjectLiteralProperty> getSpreadObjectLiteralPropertyList();

}
