// This is a generated file. Not intended for manual editing.
package jp.s6n.idea.typespec.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static jp.s6n.idea.typespec.lang.psi.TypeSpecElementTypes.*;
import static jp.s6n.idea.typespec.lang.parser.TypeSpecParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class TypeSpecParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return File(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(MODEL_PROPERTY, NAMED_MODEL_PROPERTY, SPREAD_MODEL_PROPERTY),
    create_token_set_(EXPRESSION, LITERAL_EXPRESSION, OBJECT_EXPRESSION, PATH_EXPRESSION),
    create_token_set_(ARRAY_TYPE, INTERSECTION_TYPE, LITERAL_TYPE, OBJECT_TYPE,
      PATH_TYPE, TYPE, UNION_TYPE, VALUE_OF_TYPE),
    create_token_set_(ALIAS_STATEMENT, ENUM_STATEMENT, EXTERN_DECORATOR_STATEMENT, IMPORT_STATEMENT,
      INTERFACE_STATEMENT, MODEL_STATEMENT, NAMESPACE_STATEMENT, OPERATION_STATEMENT,
      STATEMENT, UNION_STATEMENT, USING_STATEMENT),
  };

  /* ********************************************************** */
  // DecoratorLike* ALIAS Identifier TypeParameterList? EQ Type SEMICOLON
  public static boolean AliasStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIAS_STATEMENT, "<alias statement>");
    r = AliasStatement_0(b, l + 1);
    r = r && consumeToken(b, ALIAS);
    r = r && Identifier(b, l + 1);
    r = r && AliasStatement_3(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Type(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean AliasStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasStatement_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AliasStatement_0", c)) break;
    }
    return true;
  }

  // TypeParameterList?
  private static boolean AliasStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasStatement_3")) return false;
    TypeParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAREN [Expression (COMMA Expression)*] RPAREN
  public static boolean ArgumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ArgumentList_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, ARGUMENT_LIST, r);
    return r;
  }

  // [Expression (COMMA Expression)*]
  private static boolean ArgumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_1")) return false;
    ArgumentList_1_0(b, l + 1);
    return true;
  }

  // Expression (COMMA Expression)*
  private static boolean ArgumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && ArgumentList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA Expression)*
  private static boolean ArgumentList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ArgumentList_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArgumentList_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA Expression
  private static boolean ArgumentList_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ATAT PathExpression ArgumentList? SEMICOLON
  public static boolean AugmentDecoratorStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AugmentDecoratorStatement")) return false;
    if (!nextTokenIs(b, ATAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATAT);
    r = r && PathExpression(b, l + 1);
    r = r && AugmentDecoratorStatement_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, AUGMENT_DECORATOR_STATEMENT, r);
    return r;
  }

  // ArgumentList?
  private static boolean AugmentDecoratorStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AugmentDecoratorStatement_2")) return false;
    ArgumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AT PathExpression ArgumentList?
  public static boolean Decorator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decorator")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && PathExpression(b, l + 1);
    r = r && Decorator_2(b, l + 1);
    exit_section_(b, m, DECORATOR, r);
    return r;
  }

  // ArgumentList?
  private static boolean Decorator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decorator_2")) return false;
    ArgumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Decorator | Directive
  public static boolean DecoratorLike(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DecoratorLike")) return false;
    if (!nextTokenIs(b, "<decorator like>", AT, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECORATOR_LIKE, "<decorator like>");
    r = Decorator(b, l + 1);
    if (!r) r = Directive(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // HASH Identifier LiteralExpression*
  public static boolean Directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Directive")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HASH);
    r = r && Identifier(b, l + 1);
    r = r && Directive_2(b, l + 1);
    exit_section_(b, m, DIRECTIVE, r);
    return r;
  }

  // LiteralExpression*
  private static boolean Directive_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Directive_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!LiteralExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Directive_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DecoratorLike* ENUM Identifier EnumVariantsBlock
  public static boolean EnumStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_STATEMENT, "<enum statement>");
    r = EnumStatement_0(b, l + 1);
    r = r && consumeToken(b, ENUM);
    r = r && Identifier(b, l + 1);
    r = r && EnumVariantsBlock(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean EnumStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumStatement_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumStatement_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DecoratorLike* Identifier (COLON LiteralExpression)?
  public static boolean EnumVariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_VARIANT, "<enum variant>");
    r = EnumVariant_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && EnumVariant_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean EnumVariant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariant_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumVariant_0", c)) break;
    }
    return true;
  }

  // (COLON LiteralExpression)?
  private static boolean EnumVariant_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariant_2")) return false;
    EnumVariant_2_0(b, l + 1);
    return true;
  }

  // COLON LiteralExpression
  private static boolean EnumVariant_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariant_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && LiteralExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE [EnumVariant (COMMA EnumVariant)* COMMA?] RBRACE
  public static boolean EnumVariantsBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariantsBlock")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && EnumVariantsBlock_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, ENUM_VARIANTS_BLOCK, r);
    return r;
  }

  // [EnumVariant (COMMA EnumVariant)* COMMA?]
  private static boolean EnumVariantsBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariantsBlock_1")) return false;
    EnumVariantsBlock_1_0(b, l + 1);
    return true;
  }

  // EnumVariant (COMMA EnumVariant)* COMMA?
  private static boolean EnumVariantsBlock_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariantsBlock_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnumVariant(b, l + 1);
    r = r && EnumVariantsBlock_1_0_1(b, l + 1);
    r = r && EnumVariantsBlock_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA EnumVariant)*
  private static boolean EnumVariantsBlock_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariantsBlock_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EnumVariantsBlock_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumVariantsBlock_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA EnumVariant
  private static boolean EnumVariantsBlock_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariantsBlock_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && EnumVariant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean EnumVariantsBlock_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariantsBlock_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // ObjectExpression
  //     | PathExpression
  //     | LiteralExpression
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = ObjectExpression(b, l + 1);
    if (!r) r = PathExpression(b, l + 1);
    if (!r) r = LiteralExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EXTERN DEC Identifier ParameterList SEMICOLON
  public static boolean ExternDecoratorStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternDecoratorStatement")) return false;
    if (!nextTokenIs(b, EXTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EXTERN, DEC);
    r = r && Identifier(b, l + 1);
    r = r && ParameterList(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, EXTERN_DECORATOR_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // Statement*
  static boolean File(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "File", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENT
  public static boolean Identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Identifier")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // IMPORT STRING_LITERAL SEMICOLON
  public static boolean ImportStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportStatement")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IMPORT, STRING_LITERAL, SEMICOLON);
    exit_section_(b, m, IMPORT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // EXTENDS [PathType (COMMA PathType)*]
  public static boolean InterfaceExtends(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends")) return false;
    if (!nextTokenIs(b, EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && InterfaceExtends_1(b, l + 1);
    exit_section_(b, m, INTERFACE_EXTENDS, r);
    return r;
  }

  // [PathType (COMMA PathType)*]
  private static boolean InterfaceExtends_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends_1")) return false;
    InterfaceExtends_1_0(b, l + 1);
    return true;
  }

  // PathType (COMMA PathType)*
  private static boolean InterfaceExtends_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PathType(b, l + 1);
    r = r && InterfaceExtends_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA PathType)*
  private static boolean InterfaceExtends_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!InterfaceExtends_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterfaceExtends_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA PathType
  private static boolean InterfaceExtends_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && PathType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DecoratorLike* Operation SEMICOLON
  public static boolean InterfaceOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_OPERATION, "<interface operation>");
    r = InterfaceOperation_0(b, l + 1);
    r = r && Operation(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean InterfaceOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceOperation_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterfaceOperation_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LBRACE InterfaceOperation* RBRACE
  public static boolean InterfaceOperationsBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceOperationsBlock")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && InterfaceOperationsBlock_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, INTERFACE_OPERATIONS_BLOCK, r);
    return r;
  }

  // InterfaceOperation*
  private static boolean InterfaceOperationsBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceOperationsBlock_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!InterfaceOperation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterfaceOperationsBlock_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DecoratorLike* INTERFACE Identifier TypeParameterList? InterfaceExtends? InterfaceOperationsBlock
  public static boolean InterfaceStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_STATEMENT, "<interface statement>");
    r = InterfaceStatement_0(b, l + 1);
    r = r && consumeToken(b, INTERFACE);
    r = r && Identifier(b, l + 1);
    r = r && InterfaceStatement_3(b, l + 1);
    r = r && InterfaceStatement_4(b, l + 1);
    r = r && InterfaceOperationsBlock(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean InterfaceStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceStatement_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterfaceStatement_0", c)) break;
    }
    return true;
  }

  // TypeParameterList?
  private static boolean InterfaceStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceStatement_3")) return false;
    TypeParameterList(b, l + 1);
    return true;
  }

  // InterfaceExtends?
  private static boolean InterfaceStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceStatement_4")) return false;
    InterfaceExtends(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // STRING_LITERAL | NUMERIC_LITERAL
  public static boolean LiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralExpression")) return false;
    if (!nextTokenIs(b, "<literal expression>", NUMERIC_LITERAL, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPRESSION, "<literal expression>");
    r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, NUMERIC_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EXTENDS [PathType (COMMA PathType)*]
  public static boolean ModelExtends(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelExtends")) return false;
    if (!nextTokenIs(b, EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && ModelExtends_1(b, l + 1);
    exit_section_(b, m, MODEL_EXTENDS, r);
    return r;
  }

  // [PathType (COMMA PathType)*]
  private static boolean ModelExtends_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelExtends_1")) return false;
    ModelExtends_1_0(b, l + 1);
    return true;
  }

  // PathType (COMMA PathType)*
  private static boolean ModelExtends_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelExtends_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PathType(b, l + 1);
    r = r && ModelExtends_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA PathType)*
  private static boolean ModelExtends_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelExtends_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ModelExtends_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModelExtends_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA PathType
  private static boolean ModelExtends_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelExtends_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && PathType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IS PathType
  public static boolean ModelIs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelIs")) return false;
    if (!nextTokenIs(b, IS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IS);
    r = r && PathType(b, l + 1);
    exit_section_(b, m, MODEL_IS, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE ModelProperty* RBRACE
  public static boolean ModelPropertiesBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelPropertiesBlock")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && ModelPropertiesBlock_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, MODEL_PROPERTIES_BLOCK, r);
    return r;
  }

  // ModelProperty*
  private static boolean ModelPropertiesBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelPropertiesBlock_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ModelProperty(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModelPropertiesBlock_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // NamedModelProperty | SpreadModelProperty
  public static boolean ModelProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelProperty")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, MODEL_PROPERTY, "<model property>");
    r = NamedModelProperty(b, l + 1);
    if (!r) r = SpreadModelProperty(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DecoratorLike* MODEL Identifier TypeParameterList? (ModelExtends | ModelIs)? (SEMICOLON | ModelPropertiesBlock)
  public static boolean ModelStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODEL_STATEMENT, "<model statement>");
    r = ModelStatement_0(b, l + 1);
    r = r && consumeToken(b, MODEL);
    r = r && Identifier(b, l + 1);
    r = r && ModelStatement_3(b, l + 1);
    r = r && ModelStatement_4(b, l + 1);
    r = r && ModelStatement_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean ModelStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelStatement_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModelStatement_0", c)) break;
    }
    return true;
  }

  // TypeParameterList?
  private static boolean ModelStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelStatement_3")) return false;
    TypeParameterList(b, l + 1);
    return true;
  }

  // (ModelExtends | ModelIs)?
  private static boolean ModelStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelStatement_4")) return false;
    ModelStatement_4_0(b, l + 1);
    return true;
  }

  // ModelExtends | ModelIs
  private static boolean ModelStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelStatement_4_0")) return false;
    boolean r;
    r = ModelExtends(b, l + 1);
    if (!r) r = ModelIs(b, l + 1);
    return r;
  }

  // SEMICOLON | ModelPropertiesBlock
  private static boolean ModelStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelStatement_5")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = ModelPropertiesBlock(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // DecoratorLike* Identifier QUEST? COLON Type (EQ Expression)? SEMICOLON
  public static boolean NamedModelProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedModelProperty")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_MODEL_PROPERTY, "<named model property>");
    r = NamedModelProperty_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && NamedModelProperty_2(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Type(b, l + 1, -1);
    r = r && NamedModelProperty_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean NamedModelProperty_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedModelProperty_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NamedModelProperty_0", c)) break;
    }
    return true;
  }

  // QUEST?
  private static boolean NamedModelProperty_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedModelProperty_2")) return false;
    consumeToken(b, QUEST);
    return true;
  }

  // (EQ Expression)?
  private static boolean NamedModelProperty_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedModelProperty_5")) return false;
    NamedModelProperty_5_0(b, l + 1);
    return true;
  }

  // EQ Expression
  private static boolean NamedModelProperty_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedModelProperty_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DecoratorLike* Identifier QUEST? COLON Type
  public static boolean NamedParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_PARAMETER, "<named parameter>");
    r = NamedParameter_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && NamedParameter_2(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Type(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean NamedParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedParameter_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NamedParameter_0", c)) break;
    }
    return true;
  }

  // QUEST?
  private static boolean NamedParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedParameter_2")) return false;
    consumeToken(b, QUEST);
    return true;
  }

  /* ********************************************************** */
  // DecoratorLike* NAMESPACE Path (SEMICOLON | LBRACE Statement* RBRACE)
  public static boolean NamespaceStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMESPACE_STATEMENT, "<namespace statement>");
    r = NamespaceStatement_0(b, l + 1);
    r = r && consumeToken(b, NAMESPACE);
    r = r && Path(b, l + 1);
    r = r && NamespaceStatement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean NamespaceStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceStatement_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NamespaceStatement_0", c)) break;
    }
    return true;
  }

  // SEMICOLON | LBRACE Statement* RBRACE
  private static boolean NamespaceStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceStatement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    if (!r) r = NamespaceStatement_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE Statement* RBRACE
  private static boolean NamespaceStatement_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceStatement_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && NamespaceStatement_3_1_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // Statement*
  private static boolean NamespaceStatement_3_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceStatement_3_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NamespaceStatement_3_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LBRACE [ObjectExpressionProperty (COMMA ObjectExpressionProperty)* COMMA?] RBRACE
  public static boolean ObjectExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && ObjectExpression_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, OBJECT_EXPRESSION, r);
    return r;
  }

  // [ObjectExpressionProperty (COMMA ObjectExpressionProperty)* COMMA?]
  private static boolean ObjectExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_1")) return false;
    ObjectExpression_1_0(b, l + 1);
    return true;
  }

  // ObjectExpressionProperty (COMMA ObjectExpressionProperty)* COMMA?
  private static boolean ObjectExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ObjectExpressionProperty(b, l + 1);
    r = r && ObjectExpression_1_0_1(b, l + 1);
    r = r && ObjectExpression_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA ObjectExpressionProperty)*
  private static boolean ObjectExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ObjectExpression_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectExpression_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA ObjectExpressionProperty
  private static boolean ObjectExpression_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ObjectExpressionProperty(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean ObjectExpression_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpression_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // Identifier COLON Expression
  public static boolean ObjectExpressionProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpressionProperty")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, OBJECT_EXPRESSION_PROPERTY, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier (OperationSignature | OperationIs)
  public static boolean Operation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operation")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && Operation_1(b, l + 1);
    exit_section_(b, m, OPERATION, r);
    return r;
  }

  // OperationSignature | OperationIs
  private static boolean Operation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operation_1")) return false;
    boolean r;
    r = OperationSignature(b, l + 1);
    if (!r) r = OperationIs(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IS Path
  public static boolean OperationIs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationIs")) return false;
    if (!nextTokenIs(b, IS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IS);
    r = r && Path(b, l + 1);
    exit_section_(b, m, OPERATION_IS, r);
    return r;
  }

  /* ********************************************************** */
  // TypeParameterList? ParameterList COLON Type
  public static boolean OperationSignature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationSignature")) return false;
    if (!nextTokenIs(b, "<operation signature>", LPAREN, LT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATION_SIGNATURE, "<operation signature>");
    r = OperationSignature_0(b, l + 1);
    r = r && ParameterList(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Type(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TypeParameterList?
  private static boolean OperationSignature_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationSignature_0")) return false;
    TypeParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DecoratorLike* OP Operation SEMICOLON
  public static boolean OperationStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATION_STATEMENT, "<operation statement>");
    r = OperationStatement_0(b, l + 1);
    r = r && consumeToken(b, OP);
    r = r && Operation(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean OperationStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationStatement_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OperationStatement_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // NamedParameter
  //     | VariadicParameter
  public static boolean Parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = NamedParameter(b, l + 1);
    if (!r) r = VariadicParameter(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LPAREN [(Parameter COMMA)* Parameter?] RPAREN
  public static boolean ParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ParameterList_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PARAMETER_LIST, r);
    return r;
  }

  // [(Parameter COMMA)* Parameter?]
  private static boolean ParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1")) return false;
    ParameterList_1_0(b, l + 1);
    return true;
  }

  // (Parameter COMMA)* Parameter?
  private static boolean ParameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterList_1_0_0(b, l + 1);
    r = r && ParameterList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Parameter COMMA)*
  private static boolean ParameterList_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ParameterList_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ParameterList_1_0_0", c)) break;
    }
    return true;
  }

  // Parameter COMMA
  private static boolean ParameterList_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Parameter(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // Parameter?
  private static boolean ParameterList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParameterList_1_0_1")) return false;
    Parameter(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Identifier (DOT Identifier)* TypeArgumentList?
  public static boolean Path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Path")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && Path_1(b, l + 1);
    r = r && Path_2(b, l + 1);
    exit_section_(b, m, PATH, r);
    return r;
  }

  // (DOT Identifier)*
  private static boolean Path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Path_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Path_1", c)) break;
    }
    return true;
  }

  // DOT Identifier
  private static boolean Path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeArgumentList?
  private static boolean Path_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Path_2")) return false;
    TypeArgumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Path
  public static boolean PathExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathExpression")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Path(b, l + 1);
    exit_section_(b, m, PATH_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // DecoratorLike* Identifier QUEST? COLON Type SEMICOLON
  public static boolean Property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = Property_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && Property_2(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Type(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean Property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Property_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Property_0", c)) break;
    }
    return true;
  }

  // QUEST?
  private static boolean Property_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Property_2")) return false;
    consumeToken(b, QUEST);
    return true;
  }

  /* ********************************************************** */
  // DOTDOTDOT PathType SEMICOLON
  public static boolean SpreadModelProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpreadModelProperty")) return false;
    if (!nextTokenIs(b, DOTDOTDOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTDOTDOT);
    r = r && PathType(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SPREAD_MODEL_PROPERTY, r);
    return r;
  }

  /* ********************************************************** */
  // ImportStatement
  //     | UsingStatement
  //     | NamespaceStatement
  //     | EnumStatement
  //     | UnionStatement
  //     | ModelStatement
  //     | InterfaceStatement
  //     | OperationStatement
  //     | AliasStatement
  //     | ExternDecoratorStatement
  //     | AugmentDecoratorStatement
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, STATEMENT, "<statement>");
    r = ImportStatement(b, l + 1);
    if (!r) r = UsingStatement(b, l + 1);
    if (!r) r = NamespaceStatement(b, l + 1);
    if (!r) r = EnumStatement(b, l + 1);
    if (!r) r = UnionStatement(b, l + 1);
    if (!r) r = ModelStatement(b, l + 1);
    if (!r) r = InterfaceStatement(b, l + 1);
    if (!r) r = OperationStatement(b, l + 1);
    if (!r) r = AliasStatement(b, l + 1);
    if (!r) r = ExternDecoratorStatement(b, l + 1);
    if (!r) r = AugmentDecoratorStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LT [(Type COMMA)* Type?] GT
  public static boolean TypeArgumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentList")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TypeArgumentList_1(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, TYPE_ARGUMENT_LIST, r);
    return r;
  }

  // [(Type COMMA)* Type?]
  private static boolean TypeArgumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentList_1")) return false;
    TypeArgumentList_1_0(b, l + 1);
    return true;
  }

  // (Type COMMA)* Type?
  private static boolean TypeArgumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeArgumentList_1_0_0(b, l + 1);
    r = r && TypeArgumentList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Type COMMA)*
  private static boolean TypeArgumentList_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentList_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeArgumentList_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeArgumentList_1_0_0", c)) break;
    }
    return true;
  }

  // Type COMMA
  private static boolean TypeArgumentList_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentList_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Type(b, l + 1, -1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // Type?
  private static boolean TypeArgumentList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentList_1_0_1")) return false;
    Type(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // Identifier (EXTENDS Type)? (EQ Type)?
  public static boolean TypeParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && TypeParameter_1(b, l + 1);
    r = r && TypeParameter_2(b, l + 1);
    exit_section_(b, m, TYPE_PARAMETER, r);
    return r;
  }

  // (EXTENDS Type)?
  private static boolean TypeParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter_1")) return false;
    TypeParameter_1_0(b, l + 1);
    return true;
  }

  // EXTENDS Type
  private static boolean TypeParameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && Type(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EQ Type)?
  private static boolean TypeParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter_2")) return false;
    TypeParameter_2_0(b, l + 1);
    return true;
  }

  // EQ Type
  private static boolean TypeParameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && Type(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LT [(TypeParameter COMMA)* TypeParameter?] GT
  public static boolean TypeParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameterList")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TypeParameterList_1(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, TYPE_PARAMETER_LIST, r);
    return r;
  }

  // [(TypeParameter COMMA)* TypeParameter?]
  private static boolean TypeParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameterList_1")) return false;
    TypeParameterList_1_0(b, l + 1);
    return true;
  }

  // (TypeParameter COMMA)* TypeParameter?
  private static boolean TypeParameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeParameterList_1_0_0(b, l + 1);
    r = r && TypeParameterList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TypeParameter COMMA)*
  private static boolean TypeParameterList_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameterList_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeParameterList_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeParameterList_1_0_0", c)) break;
    }
    return true;
  }

  // TypeParameter COMMA
  private static boolean TypeParameterList_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameterList_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeParameter(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeParameter?
  private static boolean TypeParameterList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameterList_1_0_1")) return false;
    TypeParameter(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DecoratorLike* UNION Identifier UnionVariantsBlock
  public static boolean UnionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNION_STATEMENT, "<union statement>");
    r = UnionStatement_0(b, l + 1);
    r = r && consumeToken(b, UNION);
    r = r && Identifier(b, l + 1);
    r = r && UnionVariantsBlock(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean UnionStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionStatement_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnionStatement_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DecoratorLike* (Identifier COLON)? Type
  public static boolean UnionVariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNION_VARIANT, "<union variant>");
    r = UnionVariant_0(b, l + 1);
    r = r && UnionVariant_1(b, l + 1);
    r = r && Type(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean UnionVariant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariant_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnionVariant_0", c)) break;
    }
    return true;
  }

  // (Identifier COLON)?
  private static boolean UnionVariant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariant_1")) return false;
    UnionVariant_1_0(b, l + 1);
    return true;
  }

  // Identifier COLON
  private static boolean UnionVariant_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariant_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE [UnionVariant (COMMA UnionVariant)* COMMA?] RBRACE
  public static boolean UnionVariantsBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariantsBlock")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && UnionVariantsBlock_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, UNION_VARIANTS_BLOCK, r);
    return r;
  }

  // [UnionVariant (COMMA UnionVariant)* COMMA?]
  private static boolean UnionVariantsBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariantsBlock_1")) return false;
    UnionVariantsBlock_1_0(b, l + 1);
    return true;
  }

  // UnionVariant (COMMA UnionVariant)* COMMA?
  private static boolean UnionVariantsBlock_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariantsBlock_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnionVariant(b, l + 1);
    r = r && UnionVariantsBlock_1_0_1(b, l + 1);
    r = r && UnionVariantsBlock_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA UnionVariant)*
  private static boolean UnionVariantsBlock_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariantsBlock_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UnionVariantsBlock_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnionVariantsBlock_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA UnionVariant
  private static boolean UnionVariantsBlock_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariantsBlock_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && UnionVariant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean UnionVariantsBlock_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariantsBlock_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // USING Path SEMICOLON
  public static boolean UsingStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UsingStatement")) return false;
    if (!nextTokenIs(b, USING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USING);
    r = r && Path(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, USING_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // DOTDOTDOT PathType
  public static boolean VariadicParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariadicParameter")) return false;
    if (!nextTokenIs(b, DOTDOTDOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTDOTDOT);
    r = r && PathType(b, l + 1);
    exit_section_(b, m, VARIADIC_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: Type
  // Operator priority table:
  // 0: N_ARY(UnionType)
  // 1: N_ARY(IntersectionType)
  // 2: PREFIX(ValueOfType)
  // 3: ATOM(ObjectType)
  // 4: POSTFIX(ArrayType)
  // 5: ATOM(PathType)
  // 6: ATOM(LiteralType)
  public static boolean Type(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Type")) return false;
    addVariant(b, "<type>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<type>");
    r = ValueOfType(b, l + 1);
    if (!r) r = ObjectType(b, l + 1);
    if (!r) r = PathType(b, l + 1);
    if (!r) r = LiteralType(b, l + 1);
    p = r;
    r = r && Type_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean Type_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Type_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, PIPE)) {
        while (true) {
          r = report_error_(b, Type(b, l, 0));
          if (!consumeTokenSmart(b, PIPE)) break;
        }
        exit_section_(b, l, m, UNION_TYPE, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, AMP)) {
        while (true) {
          r = report_error_(b, Type(b, l, 1));
          if (!consumeTokenSmart(b, AMP)) break;
        }
        exit_section_(b, l, m, INTERSECTION_TYPE, r, true, null);
      }
      else if (g < 4 && parseTokensSmart(b, 0, LBRACKET, RBRACKET)) {
        r = true;
        exit_section_(b, l, m, ARRAY_TYPE, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean ValueOfType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueOfType")) return false;
    if (!nextTokenIsSmart(b, VALUEOF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, VALUEOF);
    p = r;
    r = p && Type(b, l, 2);
    exit_section_(b, l, m, VALUE_OF_TYPE, r, p, null);
    return r || p;
  }

  // LBRACE Property* RBRACE
  public static boolean ObjectType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectType")) return false;
    if (!nextTokenIsSmart(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACE);
    r = r && ObjectType_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, OBJECT_TYPE, r);
    return r;
  }

  // Property*
  private static boolean ObjectType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Property(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectType_1", c)) break;
    }
    return true;
  }

  // Path TypeArgumentList?
  public static boolean PathType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathType")) return false;
    if (!nextTokenIsSmart(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Path(b, l + 1);
    r = r && PathType_1(b, l + 1);
    exit_section_(b, m, PATH_TYPE, r);
    return r;
  }

  // TypeArgumentList?
  private static boolean PathType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathType_1")) return false;
    TypeArgumentList(b, l + 1);
    return true;
  }

  // STRING_LITERAL | NUMERIC_LITERAL
  public static boolean LiteralType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralType")) return false;
    if (!nextTokenIsSmart(b, NUMERIC_LITERAL, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_TYPE, "<literal type>");
    r = consumeTokenSmart(b, STRING_LITERAL);
    if (!r) r = consumeTokenSmart(b, NUMERIC_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
