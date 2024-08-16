// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import jp.s6n.idea.typespec.lang.psi.impl.*;

public interface TypeSpecElementTypes {

  IElementType ALIAS_STATEMENT = new TypeSpecElementType("ALIAS_STATEMENT");
  IElementType ARGUMENTS_LIST = new TypeSpecElementType("ARGUMENTS_LIST");
  IElementType ARRAY_TYPE = new TypeSpecElementType("ARRAY_TYPE");
  IElementType DECORATOR = new TypeSpecElementType("DECORATOR");
  IElementType ENUM_STATEMENT = new TypeSpecElementType("ENUM_STATEMENT");
  IElementType ENUM_VARIANT = new TypeSpecElementType("ENUM_VARIANT");
  IElementType ENUM_VARIANTS_BLOCK = new TypeSpecElementType("ENUM_VARIANTS_BLOCK");
  IElementType EXPRESSION = new TypeSpecElementType("EXPRESSION");
  IElementType IMPORT_STATEMENT = new TypeSpecElementType("IMPORT_STATEMENT");
  IElementType INTERFACE_OPERATION = new TypeSpecElementType("INTERFACE_OPERATION");
  IElementType INTERFACE_OPERATIONS_BLOCK = new TypeSpecElementType("INTERFACE_OPERATIONS_BLOCK");
  IElementType INTERFACE_STATEMENT = new TypeSpecElementType("INTERFACE_STATEMENT");
  IElementType LITERAL_EXPRESSION = new TypeSpecElementType("LITERAL_EXPRESSION");
  IElementType LITERAL_TYPE = new TypeSpecElementType("LITERAL_TYPE");
  IElementType MODEL_EXTENDS = new TypeSpecElementType("MODEL_EXTENDS");
  IElementType MODEL_IS = new TypeSpecElementType("MODEL_IS");
  IElementType MODEL_PROPERTIES_BLOCK = new TypeSpecElementType("MODEL_PROPERTIES_BLOCK");
  IElementType MODEL_PROPERTY = new TypeSpecElementType("MODEL_PROPERTY");
  IElementType MODEL_STATEMENT = new TypeSpecElementType("MODEL_STATEMENT");
  IElementType NAMED_ARGUMENT = new TypeSpecElementType("NAMED_ARGUMENT");
  IElementType NAMESPACE_STATEMENT = new TypeSpecElementType("NAMESPACE_STATEMENT");
  IElementType OBJECT_EXPRESSION = new TypeSpecElementType("OBJECT_EXPRESSION");
  IElementType OBJECT_EXPRESSION_PROPERTY = new TypeSpecElementType("OBJECT_EXPRESSION_PROPERTY");
  IElementType OPERATION = new TypeSpecElementType("OPERATION");
  IElementType OPERATION_ARGUMENT = new TypeSpecElementType("OPERATION_ARGUMENT");
  IElementType OPERATION_ARGUMENT_LIST = new TypeSpecElementType("OPERATION_ARGUMENT_LIST");
  IElementType OPERATION_STATEMENT = new TypeSpecElementType("OPERATION_STATEMENT");
  IElementType PATH = new TypeSpecElementType("PATH");
  IElementType PATH_EXPRESSION = new TypeSpecElementType("PATH_EXPRESSION");
  IElementType PATH_TYPE = new TypeSpecElementType("PATH_TYPE");
  IElementType STATEMENT = new TypeSpecElementType("STATEMENT");
  IElementType TYPE = new TypeSpecElementType("TYPE");
  IElementType UNION_STATEMENT = new TypeSpecElementType("UNION_STATEMENT");
  IElementType UNION_TYPE = new TypeSpecElementType("UNION_TYPE");
  IElementType UNION_VARIANT = new TypeSpecElementType("UNION_VARIANT");
  IElementType UNION_VARIANTS_BLOCK = new TypeSpecElementType("UNION_VARIANTS_BLOCK");
  IElementType USING_STATEMENT = new TypeSpecElementType("USING_STATEMENT");
  IElementType VARIADIC_ARGUMENT = new TypeSpecElementType("VARIADIC_ARGUMENT");

  IElementType ALIAS = new TypeSpecTokenType("alias");
  IElementType AT = new TypeSpecTokenType("@");
  IElementType BLOCK_COMMENT = new TypeSpecTokenType("BLOCK_COMMENT");
  IElementType COLON = new TypeSpecTokenType(":");
  IElementType COMMA = new TypeSpecTokenType(",");
  IElementType DOC_COMMENT = new TypeSpecTokenType("DOC_COMMENT");
  IElementType DOT = new TypeSpecTokenType(".");
  IElementType DOTDOTDOT = new TypeSpecTokenType("...");
  IElementType ENUM = new TypeSpecTokenType("enum");
  IElementType EQ = new TypeSpecTokenType("=");
  IElementType EXTENDS = new TypeSpecTokenType("extends");
  IElementType IDENTIFIER = new TypeSpecTokenType("IDENTIFIER");
  IElementType IMPORT = new TypeSpecTokenType("import");
  IElementType INTERFACE = new TypeSpecTokenType("interface");
  IElementType IS = new TypeSpecTokenType("is");
  IElementType LBRACE = new TypeSpecTokenType("{");
  IElementType LBRACKET = new TypeSpecTokenType("[");
  IElementType LINE_COMMENT = new TypeSpecTokenType("LINE_COMMENT");
  IElementType LPAREN = new TypeSpecTokenType("(");
  IElementType MODEL = new TypeSpecTokenType("model");
  IElementType NAMESPACE = new TypeSpecTokenType("namespace");
  IElementType NUMERIC_LITERAL = new TypeSpecTokenType("NUMERIC_LITERAL");
  IElementType OP = new TypeSpecTokenType("op");
  IElementType PIPE = new TypeSpecTokenType("|");
  IElementType QUEST = new TypeSpecTokenType("?");
  IElementType RBRACE = new TypeSpecTokenType("}");
  IElementType RBRACKET = new TypeSpecTokenType("]");
  IElementType RPAREN = new TypeSpecTokenType(")");
  IElementType SEMICOLON = new TypeSpecTokenType(";");
  IElementType STRING_LITERAL = new TypeSpecTokenType("STRING_LITERAL");
  IElementType UNION = new TypeSpecTokenType("union");
  IElementType USING = new TypeSpecTokenType("using");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIAS_STATEMENT) {
        return new TypeSpecAliasStatementImpl(node);
      }
      else if (type == ARGUMENTS_LIST) {
        return new TypeSpecArgumentsListImpl(node);
      }
      else if (type == ARRAY_TYPE) {
        return new TypeSpecArrayTypeImpl(node);
      }
      else if (type == DECORATOR) {
        return new TypeSpecDecoratorImpl(node);
      }
      else if (type == ENUM_STATEMENT) {
        return new TypeSpecEnumStatementImpl(node);
      }
      else if (type == ENUM_VARIANT) {
        return new TypeSpecEnumVariantImpl(node);
      }
      else if (type == ENUM_VARIANTS_BLOCK) {
        return new TypeSpecEnumVariantsBlockImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new TypeSpecImportStatementImpl(node);
      }
      else if (type == INTERFACE_OPERATION) {
        return new TypeSpecInterfaceOperationImpl(node);
      }
      else if (type == INTERFACE_OPERATIONS_BLOCK) {
        return new TypeSpecInterfaceOperationsBlockImpl(node);
      }
      else if (type == INTERFACE_STATEMENT) {
        return new TypeSpecInterfaceStatementImpl(node);
      }
      else if (type == LITERAL_EXPRESSION) {
        return new TypeSpecLiteralExpressionImpl(node);
      }
      else if (type == LITERAL_TYPE) {
        return new TypeSpecLiteralTypeImpl(node);
      }
      else if (type == MODEL_EXTENDS) {
        return new TypeSpecModelExtendsImpl(node);
      }
      else if (type == MODEL_IS) {
        return new TypeSpecModelIsImpl(node);
      }
      else if (type == MODEL_PROPERTIES_BLOCK) {
        return new TypeSpecModelPropertiesBlockImpl(node);
      }
      else if (type == MODEL_PROPERTY) {
        return new TypeSpecModelPropertyImpl(node);
      }
      else if (type == MODEL_STATEMENT) {
        return new TypeSpecModelStatementImpl(node);
      }
      else if (type == NAMED_ARGUMENT) {
        return new TypeSpecNamedArgumentImpl(node);
      }
      else if (type == NAMESPACE_STATEMENT) {
        return new TypeSpecNamespaceStatementImpl(node);
      }
      else if (type == OBJECT_EXPRESSION) {
        return new TypeSpecObjectExpressionImpl(node);
      }
      else if (type == OBJECT_EXPRESSION_PROPERTY) {
        return new TypeSpecObjectExpressionPropertyImpl(node);
      }
      else if (type == OPERATION) {
        return new TypeSpecOperationImpl(node);
      }
      else if (type == OPERATION_ARGUMENT) {
        return new TypeSpecOperationArgumentImpl(node);
      }
      else if (type == OPERATION_ARGUMENT_LIST) {
        return new TypeSpecOperationArgumentListImpl(node);
      }
      else if (type == OPERATION_STATEMENT) {
        return new TypeSpecOperationStatementImpl(node);
      }
      else if (type == PATH) {
        return new TypeSpecPathImpl(node);
      }
      else if (type == PATH_EXPRESSION) {
        return new TypeSpecPathExpressionImpl(node);
      }
      else if (type == PATH_TYPE) {
        return new TypeSpecPathTypeImpl(node);
      }
      else if (type == UNION_STATEMENT) {
        return new TypeSpecUnionStatementImpl(node);
      }
      else if (type == UNION_TYPE) {
        return new TypeSpecUnionTypeImpl(node);
      }
      else if (type == UNION_VARIANT) {
        return new TypeSpecUnionVariantImpl(node);
      }
      else if (type == UNION_VARIANTS_BLOCK) {
        return new TypeSpecUnionVariantsBlockImpl(node);
      }
      else if (type == USING_STATEMENT) {
        return new TypeSpecUsingStatementImpl(node);
      }
      else if (type == VARIADIC_ARGUMENT) {
        return new TypeSpecVariadicArgumentImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
