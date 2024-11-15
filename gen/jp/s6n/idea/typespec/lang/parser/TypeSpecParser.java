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
    create_token_set_(MODEL_PROPERTY, MODEL_PROPERTY_LIKE, SPREAD_MODEL_PROPERTY),
    create_token_set_(ALIAS_STATEMENT, ENUM_STATEMENT, EXTERN_DECORATOR_STATEMENT, IMPORT_STATEMENT,
      INTERFACE_STATEMENT, MODEL_STATEMENT, NAMESPACE_STATEMENT, OPERATION_STATEMENT,
      STATEMENT, UNION_STATEMENT, USING_STATEMENT),
    create_token_set_(ARRAY_EXPRESSION, ARRAY_LITERAL, CALL_EXPRESSION, EXPRESSION,
      INTERSECTION_EXPRESSION, KEYWORD_EXPRESSION, LITERAL_EXPRESSION, MEMBER_EXPRESSION,
      MODEL_EXPRESSION, OBJECT_LITERAL, TUPLE_EXPRESSION, TYPE_OF_EXPRESSION,
      TYPE_REFERENCE, UNION_EXPRESSION, VALUE_OF_EXPRESSION),
  };

  /* ********************************************************** */
  // DecoratorLike* ALIAS Identifier TypeParameterList? EQ Expression SEMICOLON
  public static boolean AliasStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIAS_STATEMENT, "<alias statement>");
    r = AliasStatement_0(b, l + 1);
    r = r && consumeToken(b, ALIAS);
    r = r && Identifier(b, l + 1);
    r = r && AliasStatement_3(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Expression(b, l + 1, -1);
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
  // LPAREN [(Expression COMMA)* Expression?] RPAREN
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

  // [(Expression COMMA)* Expression?]
  private static boolean ArgumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_1")) return false;
    ArgumentList_1_0(b, l + 1);
    return true;
  }

  // (Expression COMMA)* Expression?
  private static boolean ArgumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArgumentList_1_0_0(b, l + 1);
    r = r && ArgumentList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expression COMMA)*
  private static boolean ArgumentList_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ArgumentList_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArgumentList_1_0_0", c)) break;
    }
    return true;
  }

  // Expression COMMA
  private static boolean ArgumentList_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean ArgumentList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentList_1_0_1")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // ATAT Path ArgumentList? SEMICOLON
  public static boolean AugmentDecoratorStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AugmentDecoratorStatement")) return false;
    if (!nextTokenIs(b, ATAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATAT);
    r = r && Path(b, l + 1);
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
  // AT Path ArgumentList?
  public static boolean Decorator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decorator")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && Path(b, l + 1);
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
  // EXTENDS [TypeReference (COMMA TypeReference)*]
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

  // [TypeReference (COMMA TypeReference)*]
  private static boolean InterfaceExtends_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends_1")) return false;
    InterfaceExtends_1_0(b, l + 1);
    return true;
  }

  // TypeReference (COMMA TypeReference)*
  private static boolean InterfaceExtends_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeReference(b, l + 1);
    r = r && InterfaceExtends_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA TypeReference)*
  private static boolean InterfaceExtends_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!InterfaceExtends_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterfaceExtends_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA TypeReference
  private static boolean InterfaceExtends_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceExtends_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeReference(b, l + 1);
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
  // EXTENDS Expression
  public static boolean ModelExtends(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelExtends")) return false;
    if (!nextTokenIs(b, EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, MODEL_EXTENDS, r);
    return r;
  }

  /* ********************************************************** */
  // IS Expression
  public static boolean ModelIs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelIs")) return false;
    if (!nextTokenIs(b, IS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IS);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, MODEL_IS, r);
    return r;
  }

  /* ********************************************************** */
  // DecoratorLike* Identifier QUEST? COLON Expression (EQ Expression)? (COMMA | SEMICOLON)
  public static boolean ModelProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelProperty")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODEL_PROPERTY, "<model property>");
    r = ModelProperty_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && ModelProperty_2(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1, -1);
    r = r && ModelProperty_5(b, l + 1);
    r = r && ModelProperty_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DecoratorLike*
  private static boolean ModelProperty_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelProperty_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DecoratorLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModelProperty_0", c)) break;
    }
    return true;
  }

  // QUEST?
  private static boolean ModelProperty_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelProperty_2")) return false;
    consumeToken(b, QUEST);
    return true;
  }

  // (EQ Expression)?
  private static boolean ModelProperty_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelProperty_5")) return false;
    ModelProperty_5_0(b, l + 1);
    return true;
  }

  // EQ Expression
  private static boolean ModelProperty_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelProperty_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA | SEMICOLON
  private static boolean ModelProperty_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelProperty_6")) return false;
    boolean r;
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // ModelProperty | SpreadModelProperty
  public static boolean ModelPropertyLike(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelPropertyLike")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, MODEL_PROPERTY_LIKE, "<model property like>");
    r = ModelProperty(b, l + 1);
    if (!r) r = SpreadModelProperty(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DecoratorLike* MODEL Identifier TypeParameterList? (ModelExtends | ModelIs)? (SEMICOLON | ModelExpression)
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

  // SEMICOLON | ModelExpression
  private static boolean ModelStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelStatement_5")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = ModelExpression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // DecoratorLike* Identifier QUEST? COLON Expression
  public static boolean NamedParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_PARAMETER, "<named parameter>");
    r = NamedParameter_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && NamedParameter_2(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1, -1);
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
  // Identifier COLON Expression
  public static boolean ObjectLiteralProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectLiteralProperty")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, OBJECT_LITERAL_PROPERTY, r);
    return r;
  }

  /* ********************************************************** */
  // ObjectLiteralProperty | SpreadObjectLiteralProperty
  static boolean ObjectLiteralPropertyLike(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectLiteralPropertyLike")) return false;
    if (!nextTokenIs(b, "", DOTDOTDOT, IDENT)) return false;
    boolean r;
    r = ObjectLiteralProperty(b, l + 1);
    if (!r) r = SpreadObjectLiteralProperty(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Identifier TypeParameterList? OperationSignature
  public static boolean Operation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operation")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && Operation_1(b, l + 1);
    r = r && OperationSignature(b, l + 1);
    exit_section_(b, m, OPERATION, r);
    return r;
  }

  // TypeParameterList?
  private static boolean Operation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operation_1")) return false;
    TypeParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OperationSignatureDeclarationNode
  //     | OperationSignatureReferenceNode
  public static boolean OperationSignature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationSignature")) return false;
    if (!nextTokenIs(b, "<operation signature>", IS, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATION_SIGNATURE, "<operation signature>");
    r = OperationSignatureDeclarationNode(b, l + 1);
    if (!r) r = OperationSignatureReferenceNode(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ParameterList COLON Expression
  public static boolean OperationSignatureDeclarationNode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationSignatureDeclarationNode")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ParameterList(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, OPERATION_SIGNATURE_DECLARATION_NODE, r);
    return r;
  }

  /* ********************************************************** */
  // IS TypeReference
  public static boolean OperationSignatureReferenceNode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationSignatureReferenceNode")) return false;
    if (!nextTokenIs(b, IS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IS);
    r = r && TypeReference(b, l + 1);
    exit_section_(b, m, OPERATION_SIGNATURE_REFERENCE_NODE, r);
    return r;
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
  // MemberExpression | Identifier
  public static boolean Path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Path")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MemberExpression(b, l + 1);
    if (!r) r = Identifier(b, l + 1);
    exit_section_(b, m, PATH, r);
    return r;
  }

  /* ********************************************************** */
  // DOTDOTDOT Expression (COMMA | SEMICOLON)
  public static boolean SpreadModelProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpreadModelProperty")) return false;
    if (!nextTokenIs(b, DOTDOTDOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTDOTDOT);
    r = r && Expression(b, l + 1, -1);
    r = r && SpreadModelProperty_2(b, l + 1);
    exit_section_(b, m, SPREAD_MODEL_PROPERTY, r);
    return r;
  }

  // COMMA | SEMICOLON
  private static boolean SpreadModelProperty_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpreadModelProperty_2")) return false;
    boolean r;
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // DOTDOTDOT Expression
  public static boolean SpreadObjectLiteralProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpreadObjectLiteralProperty")) return false;
    if (!nextTokenIs(b, DOTDOTDOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTDOTDOT);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, SPREAD_OBJECT_LITERAL_PROPERTY, r);
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
  // LT [(Expression COMMA)* Expression?] GT
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

  // [(Expression COMMA)* Expression?]
  private static boolean TypeArgumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentList_1")) return false;
    TypeArgumentList_1_0(b, l + 1);
    return true;
  }

  // (Expression COMMA)* Expression?
  private static boolean TypeArgumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeArgumentList_1_0_0(b, l + 1);
    r = r && TypeArgumentList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expression COMMA)*
  private static boolean TypeArgumentList_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentList_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeArgumentList_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeArgumentList_1_0_0", c)) break;
    }
    return true;
  }

  // Expression COMMA
  private static boolean TypeArgumentList_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentList_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean TypeArgumentList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentList_1_0_1")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // Identifier (EXTENDS Expression)? (EQ Expression)?
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

  // (EXTENDS Expression)?
  private static boolean TypeParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter_1")) return false;
    TypeParameter_1_0(b, l + 1);
    return true;
  }

  // EXTENDS Expression
  private static boolean TypeParameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EQ Expression)?
  private static boolean TypeParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter_2")) return false;
    TypeParameter_2_0(b, l + 1);
    return true;
  }

  // EQ Expression
  private static boolean TypeParameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && Expression(b, l + 1, -1);
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
  // DecoratorLike* (Identifier COLON)? Expression
  public static boolean UnionVariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNION_VARIANT, "<union variant>");
    r = UnionVariant_0(b, l + 1);
    r = r && UnionVariant_1(b, l + 1);
    r = r && Expression(b, l + 1, -1);
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
  // LBRACE [(UnionVariant COMMA)* UnionVariant?] RBRACE
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

  // [(UnionVariant COMMA)* UnionVariant?]
  private static boolean UnionVariantsBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariantsBlock_1")) return false;
    UnionVariantsBlock_1_0(b, l + 1);
    return true;
  }

  // (UnionVariant COMMA)* UnionVariant?
  private static boolean UnionVariantsBlock_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariantsBlock_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnionVariantsBlock_1_0_0(b, l + 1);
    r = r && UnionVariantsBlock_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (UnionVariant COMMA)*
  private static boolean UnionVariantsBlock_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariantsBlock_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UnionVariantsBlock_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnionVariantsBlock_1_0_0", c)) break;
    }
    return true;
  }

  // UnionVariant COMMA
  private static boolean UnionVariantsBlock_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariantsBlock_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnionVariant(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // UnionVariant?
  private static boolean UnionVariantsBlock_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariantsBlock_1_0_1")) return false;
    UnionVariant(b, l + 1);
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
  // DOTDOTDOT Expression
  public static boolean VariadicParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariadicParameter")) return false;
    if (!nextTokenIs(b, DOTDOTDOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTDOTDOT);
    r = r && Expression(b, l + 1, -1);
    exit_section_(b, m, VARIADIC_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: Expression
  // Operator priority table:
  // 0: N_ARY(UnionExpression)
  // 1: N_ARY(IntersectionExpression)
  // 2: ATOM(TupleExpression)
  // 3: POSTFIX(ArrayExpression)
  // 4: PREFIX(ValueOfExpression)
  // 5: PREFIX(TypeOfExpression)
  // 6: ATOM(TypeReference)
  // 7: ATOM(MemberExpression)
  // 8: ATOM(ModelExpression)
  // 9: ATOM(ObjectLiteral)
  // 10: ATOM(ArrayLiteral)
  // 11: POSTFIX(CallExpression)
  // 12: ATOM(LiteralExpression)
  // 13: ATOM(KeywordExpression)
  public static boolean Expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = TupleExpression(b, l + 1);
    if (!r) r = ValueOfExpression(b, l + 1);
    if (!r) r = TypeOfExpression(b, l + 1);
    if (!r) r = TypeReference(b, l + 1);
    if (!r) r = MemberExpression(b, l + 1);
    if (!r) r = ModelExpression(b, l + 1);
    if (!r) r = ObjectLiteral(b, l + 1);
    if (!r) r = ArrayLiteral(b, l + 1);
    if (!r) r = LiteralExpression(b, l + 1);
    if (!r) r = KeywordExpression(b, l + 1);
    p = r;
    r = r && Expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean Expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, PIPE)) {
        while (true) {
          r = report_error_(b, Expression(b, l, 0));
          if (!consumeTokenSmart(b, PIPE)) break;
        }
        exit_section_(b, l, m, UNION_EXPRESSION, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, AMP)) {
        while (true) {
          r = report_error_(b, Expression(b, l, 1));
          if (!consumeTokenSmart(b, AMP)) break;
        }
        exit_section_(b, l, m, INTERSECTION_EXPRESSION, r, true, null);
      }
      else if (g < 3 && parseTokensSmart(b, 0, LBRACKET, RBRACKET)) {
        r = true;
        exit_section_(b, l, m, ARRAY_EXPRESSION, r, true, null);
      }
      else if (g < 11 && leftMarkerIs(b, MEMBER_EXPRESSION) && ArgumentList(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, CALL_EXPRESSION, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // LBRACKET [(Expression COMMA)* Expression?] RBRACKET
  public static boolean TupleExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExpression")) return false;
    if (!nextTokenIsSmart(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACKET);
    r = r && TupleExpression_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, TUPLE_EXPRESSION, r);
    return r;
  }

  // [(Expression COMMA)* Expression?]
  private static boolean TupleExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExpression_1")) return false;
    TupleExpression_1_0(b, l + 1);
    return true;
  }

  // (Expression COMMA)* Expression?
  private static boolean TupleExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TupleExpression_1_0_0(b, l + 1);
    r = r && TupleExpression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expression COMMA)*
  private static boolean TupleExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExpression_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TupleExpression_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TupleExpression_1_0_0", c)) break;
    }
    return true;
  }

  // Expression COMMA
  private static boolean TupleExpression_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExpression_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean TupleExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExpression_1_0_1")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  public static boolean ValueOfExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueOfExpression")) return false;
    if (!nextTokenIsSmart(b, VALUEOF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, VALUEOF);
    p = r;
    r = p && Expression(b, l, 4);
    exit_section_(b, l, m, VALUE_OF_EXPRESSION, r, p, null);
    return r || p;
  }

  public static boolean TypeOfExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeOfExpression")) return false;
    if (!nextTokenIsSmart(b, TYPEOF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, TYPEOF);
    p = r;
    r = p && Expression(b, l, 5);
    exit_section_(b, l, m, TYPE_OF_EXPRESSION, r, p, null);
    return r || p;
  }

  // Path TypeArgumentList?
  public static boolean TypeReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeReference")) return false;
    if (!nextTokenIsSmart(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Path(b, l + 1);
    r = r && TypeReference_1(b, l + 1);
    exit_section_(b, m, TYPE_REFERENCE, r);
    return r;
  }

  // TypeArgumentList?
  private static boolean TypeReference_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeReference_1")) return false;
    TypeArgumentList(b, l + 1);
    return true;
  }

  // Identifier ((DOT | COLONCOLON) Identifier)+
  public static boolean MemberExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberExpression")) return false;
    if (!nextTokenIsSmart(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && MemberExpression_1(b, l + 1);
    exit_section_(b, m, MEMBER_EXPRESSION, r);
    return r;
  }

  // ((DOT | COLONCOLON) Identifier)+
  private static boolean MemberExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MemberExpression_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!MemberExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MemberExpression_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOT | COLONCOLON) Identifier
  private static boolean MemberExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MemberExpression_1_0_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT | COLONCOLON
  private static boolean MemberExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MemberExpression_1_0_0")) return false;
    boolean r;
    r = consumeTokenSmart(b, DOT);
    if (!r) r = consumeTokenSmart(b, COLONCOLON);
    return r;
  }

  // LBRACE ModelPropertyLike* RBRACE
  public static boolean ModelExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelExpression")) return false;
    if (!nextTokenIsSmart(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LBRACE);
    r = r && ModelExpression_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, MODEL_EXPRESSION, r);
    return r;
  }

  // ModelPropertyLike*
  private static boolean ModelExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ModelPropertyLike(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModelExpression_1", c)) break;
    }
    return true;
  }

  // HASHLBRACE [(ObjectLiteralPropertyLike COMMA)* ObjectLiteralPropertyLike?] RBRACE
  public static boolean ObjectLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectLiteral")) return false;
    if (!nextTokenIsSmart(b, HASHLBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, HASHLBRACE);
    r = r && ObjectLiteral_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, OBJECT_LITERAL, r);
    return r;
  }

  // [(ObjectLiteralPropertyLike COMMA)* ObjectLiteralPropertyLike?]
  private static boolean ObjectLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectLiteral_1")) return false;
    ObjectLiteral_1_0(b, l + 1);
    return true;
  }

  // (ObjectLiteralPropertyLike COMMA)* ObjectLiteralPropertyLike?
  private static boolean ObjectLiteral_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectLiteral_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ObjectLiteral_1_0_0(b, l + 1);
    r = r && ObjectLiteral_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ObjectLiteralPropertyLike COMMA)*
  private static boolean ObjectLiteral_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectLiteral_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ObjectLiteral_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectLiteral_1_0_0", c)) break;
    }
    return true;
  }

  // ObjectLiteralPropertyLike COMMA
  private static boolean ObjectLiteral_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectLiteral_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ObjectLiteralPropertyLike(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // ObjectLiteralPropertyLike?
  private static boolean ObjectLiteral_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectLiteral_1_0_1")) return false;
    ObjectLiteralPropertyLike(b, l + 1);
    return true;
  }

  // HASHLBRACKET [(Expression COMMA)* Expression?] RBRACKET
  public static boolean ArrayLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral")) return false;
    if (!nextTokenIsSmart(b, HASHLBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, HASHLBRACKET);
    r = r && ArrayLiteral_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, ARRAY_LITERAL, r);
    return r;
  }

  // [(Expression COMMA)* Expression?]
  private static boolean ArrayLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral_1")) return false;
    ArrayLiteral_1_0(b, l + 1);
    return true;
  }

  // (Expression COMMA)* Expression?
  private static boolean ArrayLiteral_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayLiteral_1_0_0(b, l + 1);
    r = r && ArrayLiteral_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (Expression COMMA)*
  private static boolean ArrayLiteral_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral_1_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ArrayLiteral_1_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayLiteral_1_0_0", c)) break;
    }
    return true;
  }

  // Expression COMMA
  private static boolean ArrayLiteral_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1, -1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // Expression?
  private static boolean ArrayLiteral_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayLiteral_1_0_1")) return false;
    Expression(b, l + 1, -1);
    return true;
  }

  // STRING_LITERAL | NUMERIC_LITERAL | TRUE | FALSE
  public static boolean LiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LiteralExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPRESSION, "<literal expression>");
    r = consumeTokenSmart(b, STRING_LITERAL);
    if (!r) r = consumeTokenSmart(b, NUMERIC_LITERAL);
    if (!r) r = consumeTokenSmart(b, TRUE);
    if (!r) r = consumeTokenSmart(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VOID | NEVER | ANY
  public static boolean KeywordExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KeywordExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD_EXPRESSION, "<keyword expression>");
    r = consumeTokenSmart(b, VOID);
    if (!r) r = consumeTokenSmart(b, NEVER);
    if (!r) r = consumeTokenSmart(b, ANY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
