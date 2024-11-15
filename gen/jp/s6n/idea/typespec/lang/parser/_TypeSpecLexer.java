// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: _TypeSpecLexer.flex

package jp.s6n.idea.typespec.lang.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static jp.s6n.idea.typespec.lang.psi.TypeSpecElementTypes.*;


public class _TypeSpecLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\1\0"+
    "\1\4\1\5\2\0\1\6\1\0\1\7\1\10\1\11"+
    "\1\0\1\12\1\13\1\14\1\15\12\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\32\26\1\27\1\30"+
    "\1\31\1\0\1\32\1\33\1\34\1\26\1\35\1\36"+
    "\1\37\1\40\1\41\1\26\1\42\2\26\1\43\1\44"+
    "\1\45\1\46\1\47\1\26\1\50\1\51\1\52\1\53"+
    "\1\54\1\26\1\55\2\26\1\56\1\57\1\60\7\0"+
    "\1\61\u01a2\0\2\61\326\0\u0100\61";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\1\1\11\1\1\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\1"+
    "\11\22\1\25\1\26\1\27\1\3\3\0\1\30\1\0"+
    "\1\31\2\0\6\22\1\32\2\22\1\33\3\22\1\34"+
    "\2\0\1\12\3\22\1\35\11\22\3\0\1\36\1\22"+
    "\1\37\10\22\1\36\1\0\1\40\1\41\4\22\1\42"+
    "\1\22\1\43\1\44\1\22\1\40\1\22\1\45\1\46"+
    "\3\22\1\47\2\22\1\50\2\22\1\51\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[117];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\62\0\62\0\62\0\62"+
    "\0\62\0\310\0\372\0\u012c\0\u015e\0\62\0\62\0\62"+
    "\0\62\0\62\0\62\0\u0190\0\u01c2\0\62\0\62\0\u01f4"+
    "\0\u0226\0\u0258\0\u028a\0\u02bc\0\u02ee\0\u0320\0\u0352\0\u0384"+
    "\0\u03b6\0\62\0\62\0\62\0\62\0\u03e8\0\u041a\0\u044c"+
    "\0\u047e\0\u04b0\0\62\0\u04e2\0\u0514\0\u0546\0\u0578\0\u05aa"+
    "\0\u05dc\0\u060e\0\u0640\0\u01c2\0\u0672\0\u06a4\0\u01c2\0\u06d6"+
    "\0\u0708\0\u073a\0\62\0\u076c\0\u079e\0\u04b0\0\62\0\u04e2"+
    "\0\u07d0\0\u01c2\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca\0\u08fc"+
    "\0\u092e\0\u0960\0\u0992\0\u09c4\0\u09f6\0\u0a28\0\u09f6\0\u0a5a"+
    "\0\u01c2\0\u0a8c\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8"+
    "\0\u0bea\0\62\0\u0c1c\0\u076c\0\u01c2\0\u0c4e\0\u0c80\0\u0cb2"+
    "\0\u0ce4\0\u01c2\0\u0d16\0\u01c2\0\u01c2\0\u0d48\0\62\0\u0d7a"+
    "\0\u01c2\0\u01c2\0\u0dac\0\u0dde\0\u0e10\0\u01c2\0\u0e42\0\u0e74"+
    "\0\u01c2\0\u0ea6\0\u0ed8\0\u01c2\0\u01c2";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[117];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\2"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\2\1\27"+
    "\1\2\1\30\1\31\1\25\1\32\1\33\2\25\1\34"+
    "\1\25\1\35\1\36\1\37\4\25\1\40\1\41\1\25"+
    "\1\42\1\43\1\44\1\2\63\0\3\3\56\0\2\4"+
    "\1\0\1\4\1\45\23\4\1\46\31\4\16\0\1\15"+
    "\57\0\1\47\56\0\1\50\3\0\1\51\60\0\1\52"+
    "\1\0\1\15\70\0\1\53\47\0\1\25\2\0\1\25"+
    "\7\0\1\25\3\0\1\25\1\0\22\25\4\0\30\54"+
    "\1\55\2\54\1\0\26\54\13\0\1\25\2\0\1\25"+
    "\7\0\1\25\3\0\1\25\1\0\7\25\1\56\12\25"+
    "\17\0\1\25\2\0\1\25\7\0\1\25\3\0\1\25"+
    "\1\0\3\25\1\57\16\25\17\0\1\25\2\0\1\25"+
    "\7\0\1\25\3\0\1\25\1\0\11\25\1\60\7\25"+
    "\1\61\17\0\1\25\2\0\1\25\7\0\1\25\3\0"+
    "\1\25\1\0\10\25\1\62\1\63\3\25\1\64\4\25"+
    "\17\0\1\25\2\0\1\25\7\0\1\25\3\0\1\25"+
    "\1\0\12\25\1\65\7\25\17\0\1\25\2\0\1\25"+
    "\7\0\1\25\3\0\1\25\1\0\1\66\21\25\17\0"+
    "\1\25\2\0\1\25\7\0\1\25\3\0\1\25\1\0"+
    "\13\25\1\67\6\25\17\0\1\25\2\0\1\25\7\0"+
    "\1\25\3\0\1\25\1\0\11\25\1\70\3\25\1\71"+
    "\4\25\17\0\1\25\2\0\1\25\7\0\1\25\3\0"+
    "\1\25\1\0\1\72\21\25\4\0\2\4\1\0\57\4"+
    "\14\0\1\73\45\0\11\74\1\75\50\74\2\51\2\0"+
    "\55\51\17\0\1\76\43\0\30\54\1\55\2\54\1\77"+
    "\56\54\1\55\2\54\1\100\26\54\13\0\1\25\2\0"+
    "\1\25\7\0\1\25\3\0\1\25\1\0\6\25\1\101"+
    "\13\25\17\0\1\25\2\0\1\25\7\0\1\25\3\0"+
    "\1\25\1\0\1\25\1\102\20\25\17\0\1\25\2\0"+
    "\1\25\7\0\1\25\3\0\1\25\1\0\17\25\1\103"+
    "\2\25\17\0\1\25\2\0\1\25\7\0\1\25\3\0"+
    "\1\25\1\0\16\25\1\104\3\25\17\0\1\25\2\0"+
    "\1\25\7\0\1\25\3\0\1\25\1\0\13\25\1\105"+
    "\6\25\17\0\1\25\2\0\1\25\7\0\1\25\3\0"+
    "\1\25\1\0\16\25\1\106\3\25\17\0\1\25\2\0"+
    "\1\25\7\0\1\25\3\0\1\25\1\0\2\25\1\107"+
    "\17\25\17\0\1\25\2\0\1\25\7\0\1\25\3\0"+
    "\1\25\1\0\10\25\1\110\11\25\17\0\1\25\2\0"+
    "\1\25\7\0\1\25\3\0\1\25\1\0\6\25\1\111"+
    "\13\25\17\0\1\25\2\0\1\25\7\0\1\25\3\0"+
    "\1\25\1\0\6\25\1\112\13\25\17\0\1\25\2\0"+
    "\1\25\7\0\1\25\3\0\1\25\1\0\7\25\1\113"+
    "\12\25\4\0\11\74\1\114\50\74\11\115\1\116\3\115"+
    "\1\117\44\115\13\0\1\25\2\0\1\25\7\0\1\25"+
    "\3\0\1\25\1\0\1\120\21\25\17\0\1\25\2\0"+
    "\1\25\7\0\1\25\3\0\1\25\1\0\10\25\1\121"+
    "\11\25\17\0\1\25\2\0\1\25\7\0\1\25\3\0"+
    "\1\25\1\0\3\25\1\122\16\25\17\0\1\25\2\0"+
    "\1\25\7\0\1\25\3\0\1\25\1\0\12\25\1\123"+
    "\7\25\17\0\1\25\2\0\1\25\7\0\1\25\3\0"+
    "\1\25\1\0\3\25\1\124\16\25\17\0\1\25\2\0"+
    "\1\25\7\0\1\25\3\0\1\25\1\0\3\25\1\125"+
    "\16\25\17\0\1\25\2\0\1\25\7\0\1\25\3\0"+
    "\1\25\1\0\3\25\1\126\16\25\17\0\1\25\2\0"+
    "\1\25\7\0\1\25\3\0\1\25\1\0\12\25\1\127"+
    "\7\25\17\0\1\25\2\0\1\25\7\0\1\25\3\0"+
    "\1\25\1\0\11\25\1\130\10\25\17\0\1\25\2\0"+
    "\1\25\7\0\1\25\3\0\1\25\1\0\17\25\1\131"+
    "\2\25\4\0\15\74\1\132\44\74\11\115\1\133\61\115"+
    "\1\75\3\115\1\134\44\115\13\0\1\25\2\0\1\25"+
    "\7\0\1\25\3\0\1\25\1\0\15\25\1\135\4\25"+
    "\17\0\1\25\2\0\1\25\7\0\1\25\3\0\1\25"+
    "\1\0\11\25\1\136\2\25\1\137\5\25\17\0\1\25"+
    "\2\0\1\25\7\0\1\25\3\0\1\25\1\0\14\25"+
    "\1\140\5\25\17\0\1\25\2\0\1\25\7\0\1\25"+
    "\3\0\1\25\1\0\14\25\1\141\5\25\17\0\1\25"+
    "\2\0\1\25\7\0\1\25\3\0\1\25\1\0\7\25"+
    "\1\142\12\25\17\0\1\25\2\0\1\25\7\0\1\25"+
    "\3\0\1\25\1\0\15\25\1\143\4\25\17\0\1\25"+
    "\2\0\1\25\7\0\1\25\3\0\1\25\1\0\11\25"+
    "\1\144\10\25\17\0\1\25\2\0\1\25\7\0\1\25"+
    "\3\0\1\25\1\0\5\25\1\145\14\25\17\0\1\25"+
    "\2\0\1\25\7\0\1\25\3\0\1\25\1\0\3\25"+
    "\1\146\16\25\4\0\15\115\1\147\44\115\13\0\1\25"+
    "\2\0\1\25\7\0\1\25\3\0\1\25\1\0\2\25"+
    "\1\150\17\25\17\0\1\25\2\0\1\25\7\0\1\25"+
    "\3\0\1\25\1\0\11\25\1\151\10\25\17\0\1\25"+
    "\2\0\1\25\7\0\1\25\3\0\1\25\1\0\16\25"+
    "\1\152\3\25\17\0\1\25\2\0\1\25\7\0\1\25"+
    "\3\0\1\25\1\0\4\25\1\153\15\25\17\0\1\25"+
    "\2\0\1\25\7\0\1\25\3\0\1\25\1\0\13\25"+
    "\1\154\6\25\17\0\1\25\2\0\1\25\7\0\1\25"+
    "\3\0\1\25\1\0\12\25\1\155\7\25\17\0\1\25"+
    "\2\0\1\25\7\0\1\25\3\0\1\25\1\0\15\25"+
    "\1\156\4\25\17\0\1\25\2\0\1\25\7\0\1\25"+
    "\3\0\1\25\1\0\1\157\21\25\17\0\1\25\2\0"+
    "\1\25\7\0\1\25\3\0\1\25\1\0\1\160\21\25"+
    "\17\0\1\25\2\0\1\25\7\0\1\25\3\0\1\25"+
    "\1\0\4\25\1\161\15\25\17\0\1\25\2\0\1\25"+
    "\7\0\1\25\3\0\1\25\1\0\1\25\1\162\20\25"+
    "\17\0\1\25\2\0\1\25\7\0\1\25\3\0\1\25"+
    "\1\0\1\25\1\163\20\25\17\0\1\25\2\0\1\25"+
    "\7\0\1\25\3\0\1\25\1\0\3\25\1\164\16\25"+
    "\17\0\1\25\2\0\1\25\7\0\1\25\3\0\1\25"+
    "\1\0\3\25\1\165\16\25\4\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[3850];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\5\11\4\1\6\11\2\1\2\11"+
    "\12\1\4\11\3\0\1\1\1\0\1\11\2\0\15\1"+
    "\1\11\2\0\1\1\1\11\14\1\3\0\13\1\1\11"+
    "\1\0\13\1\1\11\16\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[117];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  public _TypeSpecLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _TypeSpecLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return BAD_CHARACTER;
            }
          // fall through
          case 43: break;
          case 2:
            { return WHITE_SPACE;
            }
          // fall through
          case 44: break;
          case 3:
            { return STRING_LITERAL;
            }
          // fall through
          case 45: break;
          case 4:
            { return HASH;
            }
          // fall through
          case 46: break;
          case 5:
            { return AMP;
            }
          // fall through
          case 47: break;
          case 6:
            { return LPAREN;
            }
          // fall through
          case 48: break;
          case 7:
            { return RPAREN;
            }
          // fall through
          case 49: break;
          case 8:
            { return COMMA;
            }
          // fall through
          case 50: break;
          case 9:
            { return DOT;
            }
          // fall through
          case 51: break;
          case 10:
            { return NUMERIC_LITERAL;
            }
          // fall through
          case 52: break;
          case 11:
            { return COLON;
            }
          // fall through
          case 53: break;
          case 12:
            { return SEMICOLON;
            }
          // fall through
          case 54: break;
          case 13:
            { return LT;
            }
          // fall through
          case 55: break;
          case 14:
            { return EQ;
            }
          // fall through
          case 56: break;
          case 15:
            { return GT;
            }
          // fall through
          case 57: break;
          case 16:
            { return QUEST;
            }
          // fall through
          case 58: break;
          case 17:
            { return AT;
            }
          // fall through
          case 59: break;
          case 18:
            { return IDENT;
            }
          // fall through
          case 60: break;
          case 19:
            { return LBRACKET;
            }
          // fall through
          case 61: break;
          case 20:
            { return RBRACKET;
            }
          // fall through
          case 62: break;
          case 21:
            { return LBRACE;
            }
          // fall through
          case 63: break;
          case 22:
            { return PIPE;
            }
          // fall through
          case 64: break;
          case 23:
            { return RBRACE;
            }
          // fall through
          case 65: break;
          case 24:
            { return LINE_COMMENT;
            }
          // fall through
          case 66: break;
          case 25:
            { return ATAT;
            }
          // fall through
          case 67: break;
          case 26:
            { return IS;
            }
          // fall through
          case 68: break;
          case 27:
            { return OP;
            }
          // fall through
          case 69: break;
          case 28:
            { return DOTDOTDOT;
            }
          // fall through
          case 70: break;
          case 29:
            { return DEC;
            }
          // fall through
          case 71: break;
          case 30:
            { return BLOCK_COMMENT;
            }
          // fall through
          case 72: break;
          case 31:
            { return ENUM;
            }
          // fall through
          case 73: break;
          case 32:
            { return DOC_COMMENT;
            }
          // fall through
          case 74: break;
          case 33:
            { return ALIAS;
            }
          // fall through
          case 75: break;
          case 34:
            { return MODEL;
            }
          // fall through
          case 76: break;
          case 35:
            { return UNION;
            }
          // fall through
          case 77: break;
          case 36:
            { return USING;
            }
          // fall through
          case 78: break;
          case 37:
            { return EXTERN;
            }
          // fall through
          case 79: break;
          case 38:
            { return IMPORT;
            }
          // fall through
          case 80: break;
          case 39:
            { return EXTENDS;
            }
          // fall through
          case 81: break;
          case 40:
            { return VALUEOF;
            }
          // fall through
          case 82: break;
          case 41:
            { return INTERFACE;
            }
          // fall through
          case 83: break;
          case 42:
            { return NAMESPACE;
            }
          // fall through
          case 84: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
