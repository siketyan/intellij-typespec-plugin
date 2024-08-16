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
    create_token_set_(EXPRESSION, LITERAL_EXPRESSION, OBJECT_EXPRESSION, PATH_EXPRESSION),
    create_token_set_(ARRAY_TYPE, LITERAL_TYPE, PATH_TYPE, TYPE,
      UNION_TYPE),
    create_token_set_(ALIAS_STATEMENT, ENUM_STATEMENT, IMPORT_STATEMENT, INTERFACE_STATEMENT,
      MODEL_STATEMENT, NAMESPACE_STATEMENT, OPERATION_STATEMENT, STATEMENT,
      UNION_STATEMENT, USING_STATEMENT),
  };

  /* ********************************************************** */
  // ALIAS Identifier EQ Type SEMICOLON
  public static boolean AliasStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AliasStatement")) return false;
    if (!nextTokenIs(b, ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALIAS);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && Type(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ALIAS_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN [Expression (COMMA Expression)*] RPAREN
  public static boolean ArgumentsList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentsList")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && ArgumentsList_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, ARGUMENTS_LIST, r);
    return r;
  }

  // [Expression (COMMA Expression)*]
  private static boolean ArgumentsList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentsList_1")) return false;
    ArgumentsList_1_0(b, l + 1);
    return true;
  }

  // Expression (COMMA Expression)*
  private static boolean ArgumentsList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentsList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression(b, l + 1);
    r = r && ArgumentsList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA Expression)*
  private static boolean ArgumentsList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentsList_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ArgumentsList_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArgumentsList_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA Expression
  private static boolean ArgumentsList_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArgumentsList_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AT PathExpression ArgumentsList?
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

  // ArgumentsList?
  private static boolean Decorator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Decorator_2")) return false;
    ArgumentsList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Decorator* ENUM Identifier EnumVariantsBlock
  public static boolean EnumStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumStatement")) return false;
    if (!nextTokenIs(b, "<enum statement>", AT, ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_STATEMENT, "<enum statement>");
    r = EnumStatement_0(b, l + 1);
    r = r && consumeToken(b, ENUM);
    r = r && Identifier(b, l + 1);
    r = r && EnumVariantsBlock(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Decorator*
  private static boolean EnumStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumStatement_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Decorator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumStatement_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Decorator* Identifier
  public static boolean EnumVariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariant")) return false;
    if (!nextTokenIs(b, "<enum variant>", AT, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_VARIANT, "<enum variant>");
    r = EnumVariant_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Decorator*
  private static boolean EnumVariant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariant_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Decorator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumVariant_0", c)) break;
    }
    return true;
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
  // IDENTIFIER
  static boolean Identifier(PsiBuilder b, int l) {
    return consumeToken(b, IDENTIFIER);
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
  // Decorator* Operation SEMICOLON
  public static boolean InterfaceOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceOperation")) return false;
    if (!nextTokenIs(b, "<interface operation>", AT, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_OPERATION, "<interface operation>");
    r = InterfaceOperation_0(b, l + 1);
    r = r && Operation(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Decorator*
  private static boolean InterfaceOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceOperation_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Decorator(b, l + 1)) break;
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
  // Decorator* INTERFACE Identifier InterfaceOperationsBlock
  public static boolean InterfaceStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceStatement")) return false;
    if (!nextTokenIs(b, "<interface statement>", AT, INTERFACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_STATEMENT, "<interface statement>");
    r = InterfaceStatement_0(b, l + 1);
    r = r && consumeToken(b, INTERFACE);
    r = r && Identifier(b, l + 1);
    r = r && InterfaceOperationsBlock(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Decorator*
  private static boolean InterfaceStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InterfaceStatement_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Decorator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InterfaceStatement_0", c)) break;
    }
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
  // EXTENDS PathType
  public static boolean ModelExtends(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelExtends")) return false;
    if (!nextTokenIs(b, EXTENDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS);
    r = r && PathType(b, l + 1);
    exit_section_(b, m, MODEL_EXTENDS, r);
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
  // Decorator* Identifier QUEST? COLON Type SEMICOLON
  public static boolean ModelProperty(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelProperty")) return false;
    if (!nextTokenIs(b, "<model property>", AT, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODEL_PROPERTY, "<model property>");
    r = ModelProperty_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && ModelProperty_2(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Type(b, l + 1, -1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Decorator*
  private static boolean ModelProperty_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelProperty_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Decorator(b, l + 1)) break;
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

  /* ********************************************************** */
  // Decorator* MODEL Identifier (ModelExtends | ModelIs)? ModelPropertiesBlock
  public static boolean ModelStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelStatement")) return false;
    if (!nextTokenIs(b, "<model statement>", AT, MODEL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODEL_STATEMENT, "<model statement>");
    r = ModelStatement_0(b, l + 1);
    r = r && consumeToken(b, MODEL);
    r = r && Identifier(b, l + 1);
    r = r && ModelStatement_3(b, l + 1);
    r = r && ModelPropertiesBlock(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Decorator*
  private static boolean ModelStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelStatement_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Decorator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModelStatement_0", c)) break;
    }
    return true;
  }

  // (ModelExtends | ModelIs)?
  private static boolean ModelStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelStatement_3")) return false;
    ModelStatement_3_0(b, l + 1);
    return true;
  }

  // ModelExtends | ModelIs
  private static boolean ModelStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModelStatement_3_0")) return false;
    boolean r;
    r = ModelExtends(b, l + 1);
    if (!r) r = ModelIs(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Decorator* Identifier COLON Type
  public static boolean NamedArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedArgument")) return false;
    if (!nextTokenIs(b, "<named argument>", AT, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_ARGUMENT, "<named argument>");
    r = NamedArgument_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Type(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Decorator*
  private static boolean NamedArgument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamedArgument_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Decorator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NamedArgument_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Decorator* NAMESPACE Path (SEMICOLON | LBRACE Statement* RBRACE)
  public static boolean NamespaceStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceStatement")) return false;
    if (!nextTokenIs(b, "<namespace statement>", AT, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMESPACE_STATEMENT, "<namespace statement>");
    r = NamespaceStatement_0(b, l + 1);
    r = r && consumeToken(b, NAMESPACE);
    r = r && Path(b, l + 1);
    r = r && NamespaceStatement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Decorator*
  private static boolean NamespaceStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NamespaceStatement_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Decorator(b, l + 1)) break;
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
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, OBJECT_EXPRESSION_PROPERTY, r);
    return r;
  }

  /* ********************************************************** */
  // Identifier OperationArgumentList COLON Type
  public static boolean Operation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Operation")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && OperationArgumentList(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Type(b, l + 1, -1);
    exit_section_(b, m, OPERATION, r);
    return r;
  }

  /* ********************************************************** */
  // NamedArgument
  //     | VariadicArgument
  public static boolean OperationArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATION_ARGUMENT, "<operation argument>");
    r = NamedArgument(b, l + 1);
    if (!r) r = VariadicArgument(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LPAREN [OperationArgument (COMMA OperationArgument)*] RPAREN
  public static boolean OperationArgumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationArgumentList")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && OperationArgumentList_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, OPERATION_ARGUMENT_LIST, r);
    return r;
  }

  // [OperationArgument (COMMA OperationArgument)*]
  private static boolean OperationArgumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationArgumentList_1")) return false;
    OperationArgumentList_1_0(b, l + 1);
    return true;
  }

  // OperationArgument (COMMA OperationArgument)*
  private static boolean OperationArgumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationArgumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OperationArgument(b, l + 1);
    r = r && OperationArgumentList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA OperationArgument)*
  private static boolean OperationArgumentList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationArgumentList_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!OperationArgumentList_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OperationArgumentList_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA OperationArgument
  private static boolean OperationArgumentList_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationArgumentList_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && OperationArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Decorator* OP Operation SEMICOLON
  public static boolean OperationStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationStatement")) return false;
    if (!nextTokenIs(b, "<operation statement>", AT, OP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATION_STATEMENT, "<operation statement>");
    r = OperationStatement_0(b, l + 1);
    r = r && consumeToken(b, OP);
    r = r && Operation(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Decorator*
  private static boolean OperationStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OperationStatement_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Decorator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "OperationStatement_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Identifier (DOT Identifier)*
  public static boolean Path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Path")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Identifier(b, l + 1);
    r = r && Path_1(b, l + 1);
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

  /* ********************************************************** */
  // Path
  public static boolean PathExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathExpression")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Path(b, l + 1);
    exit_section_(b, m, PATH_EXPRESSION, r);
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
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Decorator* UNION Identifier UnionVariantsBlock
  public static boolean UnionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionStatement")) return false;
    if (!nextTokenIs(b, "<union statement>", AT, UNION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNION_STATEMENT, "<union statement>");
    r = UnionStatement_0(b, l + 1);
    r = r && consumeToken(b, UNION);
    r = r && Identifier(b, l + 1);
    r = r && UnionVariantsBlock(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Decorator*
  private static boolean UnionStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionStatement_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Decorator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnionStatement_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Decorator* Identifier COLON PathType
  public static boolean UnionVariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariant")) return false;
    if (!nextTokenIs(b, "<union variant>", AT, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNION_VARIANT, "<union variant>");
    r = UnionVariant_0(b, l + 1);
    r = r && Identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && PathType(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Decorator*
  private static boolean UnionVariant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnionVariant_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Decorator(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnionVariant_0", c)) break;
    }
    return true;
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
  // DOTDOTDOT Identifier
  public static boolean VariadicArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariadicArgument")) return false;
    if (!nextTokenIs(b, DOTDOTDOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTDOTDOT);
    r = r && Identifier(b, l + 1);
    exit_section_(b, m, VARIADIC_ARGUMENT, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: Type
  // Operator priority table:
  // 0: N_ARY(UnionType)
  // 1: POSTFIX(ArrayType)
  // 2: ATOM(PathType)
  // 3: ATOM(LiteralType)
  public static boolean Type(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Type")) return false;
    addVariant(b, "<type>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<type>");
    r = PathType(b, l + 1);
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
      else if (g < 1 && parseTokensSmart(b, 0, LBRACKET, RBRACKET)) {
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

  // Path
  public static boolean PathType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathType")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Path(b, l + 1);
    exit_section_(b, m, PATH_TYPE, r);
    return r;
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
