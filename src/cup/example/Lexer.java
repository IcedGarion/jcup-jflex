/* The following code was generated by JFlex 1.3.5 on 09/05/17 15.11 */

package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 09/05/17 15.11 from the specification file
 * <tt>file:/home/ubuntu/scuola/LinguaggiTraduttori2/Workspace/jcup/lexer.jflex</tt>
 */
public class Lexer implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int CODESEG = 1;
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\11\7\1\3\1\2\1\0\1\3\1\1\16\7\4\0\1\3\3\0"+
    "\1\5\3\0\1\13\1\14\1\6\1\11\1\0\1\12\1\0\1\0"+
    "\12\4\1\0\1\10\1\0\1\15\3\0\4\5\1\17\6\5\1\16"+
    "\7\5\1\20\6\5\4\0\1\5\1\0\32\5\4\0\41\7\2\0"+
    "\4\5\4\0\1\5\2\0\1\7\7\0\1\5\4\0\1\5\5\0"+
    "\27\5\1\0\37\5\1\0\u01ca\5\4\0\14\5\16\0\5\5\7\0"+
    "\1\5\1\0\1\5\21\0\160\7\5\5\1\0\2\5\2\0\4\5"+
    "\10\0\1\5\1\0\3\5\1\0\1\5\1\0\24\5\1\0\123\5"+
    "\1\0\213\5\1\0\5\7\2\0\236\5\11\0\46\5\2\0\1\5"+
    "\7\0\47\5\7\0\1\5\1\0\55\7\1\0\1\7\1\0\2\7"+
    "\1\0\2\7\1\0\1\7\10\0\33\5\5\0\3\5\15\0\5\7"+
    "\6\0\1\5\4\0\13\7\5\0\53\5\37\7\4\0\2\5\1\7"+
    "\143\5\1\0\1\5\10\7\1\0\6\7\2\5\2\7\1\0\4\7"+
    "\2\5\12\7\3\5\2\0\1\5\17\0\1\7\1\5\1\7\36\5"+
    "\33\7\2\0\131\5\13\7\1\5\16\0\12\7\41\5\11\7\2\5"+
    "\4\0\1\5\5\0\26\5\4\7\1\5\11\7\1\5\3\7\1\5"+
    "\5\7\22\0\31\5\3\7\104\0\1\5\1\0\13\5\67\0\33\7"+
    "\1\0\4\7\66\5\3\7\1\5\22\7\1\5\7\7\12\5\2\7"+
    "\2\0\12\7\1\0\7\5\1\0\7\5\1\0\3\7\1\0\10\5"+
    "\2\0\2\5\2\0\26\5\1\0\7\5\1\0\1\5\3\0\4\5"+
    "\2\0\1\7\1\5\7\7\2\0\2\7\2\0\3\7\1\5\10\0"+
    "\1\7\4\0\2\5\1\0\3\5\2\7\2\0\12\7\4\5\7\0"+
    "\1\5\5\0\3\7\1\0\6\5\4\0\2\5\2\0\26\5\1\0"+
    "\7\5\1\0\2\5\1\0\2\5\1\0\2\5\2\0\1\7\1\0"+
    "\5\7\4\0\2\7\2\0\3\7\3\0\1\7\7\0\4\5\1\0"+
    "\1\5\7\0\14\7\3\5\1\7\13\0\3\7\1\0\11\5\1\0"+
    "\3\5\1\0\26\5\1\0\7\5\1\0\2\5\1\0\5\5\2\0"+
    "\1\7\1\5\10\7\1\0\3\7\1\0\3\7\2\0\1\5\17\0"+
    "\2\5\2\7\2\0\12\7\1\0\1\5\17\0\3\7\1\0\10\5"+
    "\2\0\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0\5\5"+
    "\2\0\1\7\1\5\7\7\2\0\2\7\2\0\3\7\10\0\2\7"+
    "\4\0\2\5\1\0\3\5\2\7\2\0\12\7\1\0\1\5\20\0"+
    "\1\7\1\5\1\0\6\5\3\0\3\5\1\0\4\5\3\0\2\5"+
    "\1\0\1\5\1\0\2\5\3\0\2\5\3\0\3\5\3\0\14\5"+
    "\4\0\5\7\3\0\3\7\1\0\4\7\2\0\1\5\6\0\1\7"+
    "\16\0\12\7\11\0\1\5\7\0\3\7\1\0\10\5\1\0\3\5"+
    "\1\0\27\5\1\0\12\5\1\0\5\5\3\0\1\5\7\7\1\0"+
    "\3\7\1\0\4\7\7\0\2\7\1\0\2\5\6\0\2\5\2\7"+
    "\2\0\12\7\22\0\2\7\1\0\10\5\1\0\3\5\1\0\27\5"+
    "\1\0\12\5\1\0\5\5\2\0\1\7\1\5\7\7\1\0\3\7"+
    "\1\0\4\7\7\0\2\7\7\0\1\5\1\0\2\5\2\7\2\0"+
    "\12\7\1\0\2\5\17\0\2\7\1\0\10\5\1\0\3\5\1\0"+
    "\51\5\2\0\1\5\7\7\1\0\3\7\1\0\4\7\1\5\10\0"+
    "\1\7\10\0\2\5\2\7\2\0\12\7\12\0\6\5\2\0\2\7"+
    "\1\0\22\5\3\0\30\5\1\0\11\5\1\0\1\5\2\0\7\5"+
    "\3\0\1\7\4\0\6\7\1\0\1\7\1\0\10\7\22\0\2\7"+
    "\15\0\60\5\1\7\2\5\7\7\4\0\10\5\10\7\1\0\12\7"+
    "\47\0\2\5\1\0\1\5\2\0\2\5\1\0\1\5\2\0\1\5"+
    "\6\0\4\5\1\0\7\5\1\0\3\5\1\0\1\5\1\0\1\5"+
    "\2\0\2\5\1\0\4\5\1\7\2\5\6\7\1\0\2\7\1\5"+
    "\2\0\5\5\1\0\1\5\1\0\6\7\2\0\12\7\2\0\4\5"+
    "\40\0\1\5\27\0\2\7\6\0\12\7\13\0\1\7\1\0\1\7"+
    "\1\0\1\7\4\0\2\7\10\5\1\0\44\5\4\0\24\7\1\0"+
    "\2\7\5\5\13\7\1\0\44\7\11\0\1\7\71\0\53\5\24\7"+
    "\1\5\12\7\6\0\6\5\4\7\4\5\3\7\1\5\3\7\2\5"+
    "\7\7\3\5\4\7\15\5\14\7\1\5\17\7\2\0\46\5\1\0"+
    "\1\5\5\0\1\5\2\0\53\5\1\0\u014d\5\1\0\4\5\2\0"+
    "\7\5\1\0\1\5\1\0\4\5\2\0\51\5\1\0\4\5\2\0"+
    "\41\5\1\0\4\5\2\0\7\5\1\0\1\5\1\0\4\5\2\0"+
    "\17\5\1\0\71\5\1\0\4\5\2\0\103\5\2\0\3\7\40\0"+
    "\20\5\20\0\125\5\14\0\u026c\5\2\0\21\5\1\0\32\5\5\0"+
    "\113\5\3\0\3\5\17\0\15\5\1\0\4\5\3\7\13\0\22\5"+
    "\3\7\13\0\22\5\2\7\14\0\15\5\1\0\3\5\1\0\2\7"+
    "\14\0\64\5\40\7\3\0\1\5\3\0\2\5\1\7\2\0\12\7"+
    "\41\0\3\7\2\0\12\7\6\0\130\5\10\0\51\5\1\7\1\5"+
    "\5\0\106\5\12\0\35\5\3\0\14\7\4\0\14\7\12\0\12\7"+
    "\36\5\2\0\5\5\13\0\54\5\4\0\21\7\7\5\2\7\6\0"+
    "\12\7\46\0\27\5\5\7\4\0\65\5\12\7\1\0\35\7\2\0"+
    "\13\7\6\0\12\7\15\0\1\5\130\0\5\7\57\5\21\7\7\5"+
    "\4\0\12\7\21\0\11\7\14\0\3\7\36\5\15\7\2\5\12\7"+
    "\54\5\16\7\14\0\44\5\24\7\10\0\12\7\3\0\3\5\12\7"+
    "\44\5\122\0\3\7\1\0\25\7\4\5\1\7\4\5\3\7\2\5"+
    "\11\0\300\5\47\7\25\0\4\7\u0116\5\2\0\6\5\2\0\46\5"+
    "\2\0\6\5\2\0\10\5\1\0\1\5\1\0\1\5\1\0\1\5"+
    "\1\0\37\5\2\0\65\5\1\0\7\5\1\0\1\5\3\0\3\5"+
    "\1\0\7\5\3\0\4\5\2\0\6\5\4\0\15\5\5\0\3\5"+
    "\1\0\7\5\16\0\5\7\32\0\5\7\20\0\2\5\23\0\1\5"+
    "\13\0\5\7\5\0\6\7\1\0\1\5\15\0\1\5\20\0\15\5"+
    "\3\0\33\5\25\0\15\7\4\0\1\7\3\0\14\7\21\0\1\5"+
    "\4\0\1\5\2\0\12\5\1\0\1\5\3\0\5\5\6\0\1\5"+
    "\1\0\1\5\1\0\1\5\1\0\4\5\1\0\13\5\2\0\4\5"+
    "\5\0\5\5\4\0\1\5\21\0\51\5\u0a77\0\57\5\1\0\57\5"+
    "\1\0\205\5\6\0\4\5\3\7\2\5\14\0\46\5\1\0\1\5"+
    "\5\0\1\5\2\0\70\5\7\0\1\5\17\0\1\7\27\5\11\0"+
    "\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0"+
    "\7\5\1\0\7\5\1\0\7\5\1\0\40\7\57\0\1\5\u01d5\0"+
    "\3\5\31\0\11\5\6\7\1\0\5\5\2\0\5\5\4\0\126\5"+
    "\2\0\2\7\2\0\3\5\1\0\132\5\1\0\4\5\5\0\51\5"+
    "\3\0\136\5\21\0\33\5\65\0\20\5\u0200\0\u19b6\5\112\0\u51cd\5"+
    "\63\0\u048d\5\103\0\56\5\2\0\u010d\5\3\0\20\5\12\7\2\5"+
    "\24\0\57\5\1\7\4\0\12\7\1\0\31\5\7\0\1\7\120\5"+
    "\2\7\45\0\11\5\2\0\147\5\2\0\4\5\1\0\4\5\14\0"+
    "\13\5\115\0\12\5\1\7\3\5\1\7\4\5\1\7\27\5\5\7"+
    "\20\0\1\5\7\0\64\5\14\0\2\7\62\5\21\7\13\0\12\7"+
    "\6\0\22\7\6\5\3\0\1\5\4\0\12\7\34\5\10\7\2\0"+
    "\27\5\15\7\14\0\35\5\3\0\4\7\57\5\16\7\16\0\1\5"+
    "\12\7\46\0\51\5\16\7\11\0\3\5\1\7\10\5\2\7\2\0"+
    "\12\7\6\0\27\5\3\0\1\5\1\7\4\0\60\5\1\7\1\5"+
    "\3\7\2\5\2\7\5\5\2\7\1\5\1\7\1\5\30\0\3\5"+
    "\2\0\13\5\5\7\2\0\3\5\2\7\12\0\6\5\2\0\6\5"+
    "\2\0\6\5\11\0\7\5\1\0\7\5\221\0\43\5\10\7\1\0"+
    "\2\7\2\0\12\7\6\0\u2ba4\5\14\0\27\5\4\0\61\5\u2104\0"+
    "\u016e\5\2\0\152\5\46\0\7\5\14\0\5\5\5\0\1\5\1\7"+
    "\12\5\1\0\15\5\1\0\5\5\1\0\1\5\1\0\2\5\1\0"+
    "\2\5\1\0\154\5\41\0\u016b\5\22\0\100\5\2\0\66\5\50\0"+
    "\15\5\3\0\20\7\20\0\7\7\14\0\2\5\30\0\3\5\31\0"+
    "\1\5\6\0\5\5\1\0\207\5\2\0\1\7\4\0\1\5\13\0"+
    "\12\7\7\0\32\5\4\0\1\5\1\0\32\5\13\0\131\5\3\0"+
    "\6\5\2\0\6\5\2\0\6\5\2\0\3\5\3\0\2\5\3\0"+
    "\2\5\22\0\3\7\4\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    17,    34,    51,    34,    68,    85,    34,    34,    34, 
       34,    34,    34,    34,   102,   119,    85
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\3\1\4\2\5\1\6\1\7\1\10\1\3\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\2\7\21\3"+
    "\23\0\1\5\22\0\1\6\20\0\2\7\1\0\1\7"+
    "\6\0\3\7\4\0\2\7\1\0\1\7\6\0\1\7"+
    "\1\20\1\7\4\0\2\7\1\0\1\7\6\0\2\7"+
    "\1\21";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  0,  9,  1,  9,  1,  1,  9,  9,  9,  9,  9,  9,  9,  1,  1,  1
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[136];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2188) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
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
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
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
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      yychar+= yy_markedPos_l-yy_startRead;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 5: 
          {  return symbolFactory.newSymbol("NUMBER", NUMBER, Integer.parseInt(yytext()));  }
        case 18: break;
        case 8: 
          {  return symbolFactory.newSymbol("SEMI", SEMI);  }
        case 19: break;
        case 9: 
          {  return symbolFactory.newSymbol("PLUS", PLUS);  }
        case 20: break;
        case 3: 
        case 4: 
          {                                }
        case 21: break;
        case 6: 
        case 14: 
        case 15: 
          {  return symbolFactory.newSymbol("ID", ID, yytext());  }
        case 22: break;
        case 7: 
          {  return symbolFactory.newSymbol("TIMES", TIMES);  }
        case 23: break;
        case 10: 
          {  return symbolFactory.newSymbol("MINUS", MINUS);  }
        case 24: break;
        case 2: 
          {  emit_warning("Unrecognized character '" +yytext()+"' -- ignored");  }
        case 25: break;
        case 16: 
          {  return symbolFactory.newSymbol("LET",LET); }
        case 26: break;
        case 13: 
          {  return symbolFactory.newSymbol("EQUALS", EQUALS);  }
        case 27: break;
        case 12: 
          {  return symbolFactory.newSymbol("RPAREN", RPAREN);  }
        case 28: break;
        case 11: 
          {  return symbolFactory.newSymbol("LPAREN", LPAREN);  }
        case 29: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              {     return symbolFactory.newSymbol("EOF",sym.EOF);
 }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
