// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import jp.s6n.idea.typespec.lang.psi.impl.*;

public interface TypeSpecElementTypes {

  IElementType ALIAS_STATEMENT = new TypeSpecElementType("ALIAS_STATEMENT");
  IElementType ARGUMENT_LIST = new TypeSpecElementType("ARGUMENT_LIST");
  IElementType ARRAY_EXPRESSION = new TypeSpecElementType("ARRAY_EXPRESSION");
  IElementType ARRAY_LITERAL = new TypeSpecElementType("ARRAY_LITERAL");
  IElementType AUGMENT_DECORATOR_STATEMENT = new TypeSpecElementType("AUGMENT_DECORATOR_STATEMENT");
  IElementType CALL_EXPRESSION = new TypeSpecElementType("CALL_EXPRESSION");
  IElementType DECORATOR = new TypeSpecElementType("DECORATOR");
  IElementType DECORATOR_LIKE = new TypeSpecElementType("DECORATOR_LIKE");
  IElementType DIRECTIVE = new TypeSpecElementType("DIRECTIVE");
  IElementType ENUM_STATEMENT = new TypeSpecElementType("ENUM_STATEMENT");
  IElementType ENUM_VARIANT = new TypeSpecElementType("ENUM_VARIANT");
  IElementType ENUM_VARIANTS_BLOCK = new TypeSpecElementType("ENUM_VARIANTS_BLOCK");
  IElementType EXPRESSION = new TypeSpecElementType("EXPRESSION");
  IElementType EXTERN_DECORATOR_STATEMENT = new TypeSpecElementType("EXTERN_DECORATOR_STATEMENT");
  IElementType IDENTIFIER = new TypeSpecElementType("IDENTIFIER");
  IElementType IMPORT_STATEMENT = new TypeSpecElementType("IMPORT_STATEMENT");
  IElementType INTERFACE_EXTENDS = new TypeSpecElementType("INTERFACE_EXTENDS");
  IElementType INTERFACE_OPERATION = new TypeSpecElementType("INTERFACE_OPERATION");
  IElementType INTERFACE_OPERATIONS_BLOCK = new TypeSpecElementType("INTERFACE_OPERATIONS_BLOCK");
  IElementType INTERFACE_STATEMENT = new TypeSpecElementType("INTERFACE_STATEMENT");
  IElementType INTERSECTION_EXPRESSION = new TypeSpecElementType("INTERSECTION_EXPRESSION");
  IElementType KEYWORD_EXPRESSION = new TypeSpecElementType("KEYWORD_EXPRESSION");
  IElementType LITERAL_EXPRESSION = new TypeSpecElementType("LITERAL_EXPRESSION");
  IElementType MEMBER_EXPRESSION = new TypeSpecElementType("MEMBER_EXPRESSION");
  IElementType MODEL_EXPRESSION = new TypeSpecElementType("MODEL_EXPRESSION");
  IElementType MODEL_EXTENDS = new TypeSpecElementType("MODEL_EXTENDS");
  IElementType MODEL_IS = new TypeSpecElementType("MODEL_IS");
  IElementType MODEL_PROPERTY = new TypeSpecElementType("MODEL_PROPERTY");
  IElementType MODEL_PROPERTY_LIKE = new TypeSpecElementType("MODEL_PROPERTY_LIKE");
  IElementType MODEL_STATEMENT = new TypeSpecElementType("MODEL_STATEMENT");
  IElementType NAMED_PARAMETER = new TypeSpecElementType("NAMED_PARAMETER");
  IElementType NAMESPACE_STATEMENT = new TypeSpecElementType("NAMESPACE_STATEMENT");
  IElementType OBJECT_LITERAL = new TypeSpecElementType("OBJECT_LITERAL");
  IElementType OBJECT_LITERAL_PROPERTY = new TypeSpecElementType("OBJECT_LITERAL_PROPERTY");
  IElementType OPERATION = new TypeSpecElementType("OPERATION");
  IElementType OPERATION_SIGNATURE = new TypeSpecElementType("OPERATION_SIGNATURE");
  IElementType OPERATION_SIGNATURE_DECLARATION_NODE = new TypeSpecElementType("OPERATION_SIGNATURE_DECLARATION_NODE");
  IElementType OPERATION_SIGNATURE_REFERENCE_NODE = new TypeSpecElementType("OPERATION_SIGNATURE_REFERENCE_NODE");
  IElementType OPERATION_STATEMENT = new TypeSpecElementType("OPERATION_STATEMENT");
  IElementType PARAMETER = new TypeSpecElementType("PARAMETER");
  IElementType PARAMETER_LIST = new TypeSpecElementType("PARAMETER_LIST");
  IElementType PATH = new TypeSpecElementType("PATH");
  IElementType SCALAR_CONSTRUCTOR = new TypeSpecElementType("SCALAR_CONSTRUCTOR");
  IElementType SCALAR_CONSTRUCTOR_LIST = new TypeSpecElementType("SCALAR_CONSTRUCTOR_LIST");
  IElementType SCALAR_EXTENDS = new TypeSpecElementType("SCALAR_EXTENDS");
  IElementType SCALAR_STATEMENT = new TypeSpecElementType("SCALAR_STATEMENT");
  IElementType SPREAD_MODEL_PROPERTY = new TypeSpecElementType("SPREAD_MODEL_PROPERTY");
  IElementType SPREAD_OBJECT_LITERAL_PROPERTY = new TypeSpecElementType("SPREAD_OBJECT_LITERAL_PROPERTY");
  IElementType STATEMENT = new TypeSpecElementType("STATEMENT");
  IElementType TUPLE_EXPRESSION = new TypeSpecElementType("TUPLE_EXPRESSION");
  IElementType TYPE_ARGUMENT_LIST = new TypeSpecElementType("TYPE_ARGUMENT_LIST");
  IElementType TYPE_OF_EXPRESSION = new TypeSpecElementType("TYPE_OF_EXPRESSION");
  IElementType TYPE_PARAMETER = new TypeSpecElementType("TYPE_PARAMETER");
  IElementType TYPE_PARAMETER_LIST = new TypeSpecElementType("TYPE_PARAMETER_LIST");
  IElementType TYPE_REFERENCE = new TypeSpecElementType("TYPE_REFERENCE");
  IElementType UNION_EXPRESSION = new TypeSpecElementType("UNION_EXPRESSION");
  IElementType UNION_STATEMENT = new TypeSpecElementType("UNION_STATEMENT");
  IElementType UNION_VARIANT = new TypeSpecElementType("UNION_VARIANT");
  IElementType UNION_VARIANTS_BLOCK = new TypeSpecElementType("UNION_VARIANTS_BLOCK");
  IElementType USING_STATEMENT = new TypeSpecElementType("USING_STATEMENT");
  IElementType VALUE_OF_EXPRESSION = new TypeSpecElementType("VALUE_OF_EXPRESSION");
  IElementType VARIADIC_PARAMETER = new TypeSpecElementType("VARIADIC_PARAMETER");

  IElementType ALIAS = new TypeSpecTokenType("alias");
  IElementType AMP = new TypeSpecTokenType("&");
  IElementType ANY = new TypeSpecTokenType("any");
  IElementType AT = new TypeSpecTokenType("@");
  IElementType ATAT = new TypeSpecTokenType("@@");
  IElementType BLOCK_COMMENT = new TypeSpecTokenType("BLOCK_COMMENT");
  IElementType COLON = new TypeSpecTokenType(":");
  IElementType COLONCOLON = new TypeSpecTokenType("::");
  IElementType COMMA = new TypeSpecTokenType(",");
  IElementType DEC = new TypeSpecTokenType("dec");
  IElementType DOC_COMMENT = new TypeSpecTokenType("DOC_COMMENT");
  IElementType DOT = new TypeSpecTokenType(".");
  IElementType DOTDOTDOT = new TypeSpecTokenType("...");
  IElementType ENUM = new TypeSpecTokenType("enum");
  IElementType EQ = new TypeSpecTokenType("=");
  IElementType EXTENDS = new TypeSpecTokenType("extends");
  IElementType EXTERN = new TypeSpecTokenType("extern");
  IElementType FALSE = new TypeSpecTokenType("false");
  IElementType GT = new TypeSpecTokenType(">");
  IElementType HASH = new TypeSpecTokenType("#");
  IElementType HASHLBRACE = new TypeSpecTokenType("#{");
  IElementType HASHLBRACKET = new TypeSpecTokenType("#[");
  IElementType IDENT = new TypeSpecTokenType("IDENT");
  IElementType IMPORT = new TypeSpecTokenType("import");
  IElementType INIT = new TypeSpecTokenType("init");
  IElementType INTERFACE = new TypeSpecTokenType("interface");
  IElementType IS = new TypeSpecTokenType("is");
  IElementType LBRACE = new TypeSpecTokenType("{");
  IElementType LBRACKET = new TypeSpecTokenType("[");
  IElementType LINE_COMMENT = new TypeSpecTokenType("LINE_COMMENT");
  IElementType LPAREN = new TypeSpecTokenType("(");
  IElementType LT = new TypeSpecTokenType("<");
  IElementType MODEL = new TypeSpecTokenType("model");
  IElementType NAMESPACE = new TypeSpecTokenType("namespace");
  IElementType NEVER = new TypeSpecTokenType("never");
  IElementType NUMERIC_LITERAL = new TypeSpecTokenType("NUMERIC_LITERAL");
  IElementType OP = new TypeSpecTokenType("op");
  IElementType PIPE = new TypeSpecTokenType("|");
  IElementType QUEST = new TypeSpecTokenType("?");
  IElementType RBRACE = new TypeSpecTokenType("}");
  IElementType RBRACKET = new TypeSpecTokenType("]");
  IElementType RPAREN = new TypeSpecTokenType(")");
  IElementType SCALAR = new TypeSpecTokenType("scalar");
  IElementType SEMICOLON = new TypeSpecTokenType(";");
  IElementType STRING_LITERAL = new TypeSpecTokenType("STRING_LITERAL");
  IElementType TRUE = new TypeSpecTokenType("true");
  IElementType TYPEOF = new TypeSpecTokenType("typeof");
  IElementType UNION = new TypeSpecTokenType("union");
  IElementType USING = new TypeSpecTokenType("using");
  IElementType VALUEOF = new TypeSpecTokenType("valueof");
  IElementType VOID = new TypeSpecTokenType("void");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIAS_STATEMENT) {
        return new TypeSpecAliasStatementImpl(node);
      }
      else if (type == ARGUMENT_LIST) {
        return new TypeSpecArgumentListImpl(node);
      }
      else if (type == ARRAY_EXPRESSION) {
        return new TypeSpecArrayExpressionImpl(node);
      }
      else if (type == ARRAY_LITERAL) {
        return new TypeSpecArrayLiteralImpl(node);
      }
      else if (type == AUGMENT_DECORATOR_STATEMENT) {
        return new TypeSpecAugmentDecoratorStatementImpl(node);
      }
      else if (type == CALL_EXPRESSION) {
        return new TypeSpecCallExpressionImpl(node);
      }
      else if (type == DECORATOR) {
        return new TypeSpecDecoratorImpl(node);
      }
      else if (type == DECORATOR_LIKE) {
        return new TypeSpecDecoratorLikeImpl(node);
      }
      else if (type == DIRECTIVE) {
        return new TypeSpecDirectiveImpl(node);
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
      else if (type == EXTERN_DECORATOR_STATEMENT) {
        return new TypeSpecExternDecoratorStatementImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new TypeSpecIdentifierImpl(node);
      }
      else if (type == IMPORT_STATEMENT) {
        return new TypeSpecImportStatementImpl(node);
      }
      else if (type == INTERFACE_EXTENDS) {
        return new TypeSpecInterfaceExtendsImpl(node);
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
      else if (type == INTERSECTION_EXPRESSION) {
        return new TypeSpecIntersectionExpressionImpl(node);
      }
      else if (type == KEYWORD_EXPRESSION) {
        return new TypeSpecKeywordExpressionImpl(node);
      }
      else if (type == LITERAL_EXPRESSION) {
        return new TypeSpecLiteralExpressionImpl(node);
      }
      else if (type == MEMBER_EXPRESSION) {
        return new TypeSpecMemberExpressionImpl(node);
      }
      else if (type == MODEL_EXPRESSION) {
        return new TypeSpecModelExpressionImpl(node);
      }
      else if (type == MODEL_EXTENDS) {
        return new TypeSpecModelExtendsImpl(node);
      }
      else if (type == MODEL_IS) {
        return new TypeSpecModelIsImpl(node);
      }
      else if (type == MODEL_PROPERTY) {
        return new TypeSpecModelPropertyImpl(node);
      }
      else if (type == MODEL_STATEMENT) {
        return new TypeSpecModelStatementImpl(node);
      }
      else if (type == NAMED_PARAMETER) {
        return new TypeSpecNamedParameterImpl(node);
      }
      else if (type == NAMESPACE_STATEMENT) {
        return new TypeSpecNamespaceStatementImpl(node);
      }
      else if (type == OBJECT_LITERAL) {
        return new TypeSpecObjectLiteralImpl(node);
      }
      else if (type == OBJECT_LITERAL_PROPERTY) {
        return new TypeSpecObjectLiteralPropertyImpl(node);
      }
      else if (type == OPERATION) {
        return new TypeSpecOperationImpl(node);
      }
      else if (type == OPERATION_SIGNATURE) {
        return new TypeSpecOperationSignatureImpl(node);
      }
      else if (type == OPERATION_SIGNATURE_DECLARATION_NODE) {
        return new TypeSpecOperationSignatureDeclarationNodeImpl(node);
      }
      else if (type == OPERATION_SIGNATURE_REFERENCE_NODE) {
        return new TypeSpecOperationSignatureReferenceNodeImpl(node);
      }
      else if (type == OPERATION_STATEMENT) {
        return new TypeSpecOperationStatementImpl(node);
      }
      else if (type == PARAMETER) {
        return new TypeSpecParameterImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new TypeSpecParameterListImpl(node);
      }
      else if (type == PATH) {
        return new TypeSpecPathImpl(node);
      }
      else if (type == SCALAR_CONSTRUCTOR) {
        return new TypeSpecScalarConstructorImpl(node);
      }
      else if (type == SCALAR_CONSTRUCTOR_LIST) {
        return new TypeSpecScalarConstructorListImpl(node);
      }
      else if (type == SCALAR_EXTENDS) {
        return new TypeSpecScalarExtendsImpl(node);
      }
      else if (type == SCALAR_STATEMENT) {
        return new TypeSpecScalarStatementImpl(node);
      }
      else if (type == SPREAD_MODEL_PROPERTY) {
        return new TypeSpecSpreadModelPropertyImpl(node);
      }
      else if (type == SPREAD_OBJECT_LITERAL_PROPERTY) {
        return new TypeSpecSpreadObjectLiteralPropertyImpl(node);
      }
      else if (type == STATEMENT) {
        return new TypeSpecStatementImpl(node);
      }
      else if (type == TUPLE_EXPRESSION) {
        return new TypeSpecTupleExpressionImpl(node);
      }
      else if (type == TYPE_ARGUMENT_LIST) {
        return new TypeSpecTypeArgumentListImpl(node);
      }
      else if (type == TYPE_OF_EXPRESSION) {
        return new TypeSpecTypeOfExpressionImpl(node);
      }
      else if (type == TYPE_PARAMETER) {
        return new TypeSpecTypeParameterImpl(node);
      }
      else if (type == TYPE_PARAMETER_LIST) {
        return new TypeSpecTypeParameterListImpl(node);
      }
      else if (type == TYPE_REFERENCE) {
        return new TypeSpecTypeReferenceImpl(node);
      }
      else if (type == UNION_EXPRESSION) {
        return new TypeSpecUnionExpressionImpl(node);
      }
      else if (type == UNION_STATEMENT) {
        return new TypeSpecUnionStatementImpl(node);
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
      else if (type == VALUE_OF_EXPRESSION) {
        return new TypeSpecValueOfExpressionImpl(node);
      }
      else if (type == VARIADIC_PARAMETER) {
        return new TypeSpecVariadicParameterImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
