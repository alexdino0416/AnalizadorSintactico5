/* The following code was generated by JFlex 1.4.3 on 8/15/20 1:55 AM */

package Code;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 8/15/20 1:55 AM from the specification file
 * <tt>C:/Users/leona/P5-Compiladores/AnalizadorSintactico5/src/Code/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

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
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  4,  4,  0,  0,  4,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     4, 27,  0,  0,  0,  0,  0,  0, 23, 24, 29, 28,  4, 17,  0, 30, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  0, 32, 25, 26, 18,  0, 
     0,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0,  0,  0, 31,  3, 
     0,  7,  2,  5, 21,  9, 19,  2,  2, 10,  2,  2,  6, 15, 11, 14, 
    16,  2, 13,  8, 12, 20, 22,  2,  2,  2,  2,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\7\3\1\5"+
    "\1\6\2\3\1\7\1\10\1\11\1\1\1\12\1\13"+
    "\1\14\1\15\1\16\6\17\1\20\3\17\1\21\1\6"+
    "\2\17\1\0\4\17\1\22\7\17\1\0\2\17\1\23"+
    "\2\17\1\24\4\17\1\2\1\25\1\26\6\17\1\27"+
    "\1\17\1\30\4\17\1\31\1\17\1\32\1\33\3\17"+
    "\1\34";

  private static int [] zzUnpackAction() {
    int [] result = new int[88];
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
    "\0\0\0\41\0\102\0\143\0\143\0\204\0\245\0\306"+
    "\0\347\0\u0108\0\u0129\0\u014a\0\u016b\0\u018c\0\u01ad\0\u01ce"+
    "\0\u01ef\0\u0210\0\41\0\u01ad\0\u01ad\0\41\0\41\0\41"+
    "\0\41\0\41\0\143\0\u0231\0\u0252\0\u0273\0\u0294\0\u02b5"+
    "\0\143\0\u02d6\0\u02f7\0\u0318\0\41\0\41\0\u0339\0\u035a"+
    "\0\u037b\0\u039c\0\u03bd\0\u03de\0\u03ff\0\143\0\u0420\0\u0441"+
    "\0\u0462\0\u0483\0\u04a4\0\u04c5\0\u04e6\0\u0507\0\u0528\0\u0549"+
    "\0\143\0\u056a\0\u058b\0\143\0\u05ac\0\u05cd\0\u05ee\0\u060f"+
    "\0\41\0\143\0\143\0\u0630\0\u0651\0\u0672\0\u0693\0\u06b4"+
    "\0\u06d5\0\143\0\u06f6\0\143\0\u0717\0\u0738\0\u0759\0\u077a"+
    "\0\143\0\u079b\0\143\0\143\0\u07bc\0\u07dd\0\u07fe\0\143";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[88];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\2\4\1\10"+
    "\1\11\1\12\1\4\1\13\1\14\1\4\1\15\1\4"+
    "\1\16\1\17\1\20\1\4\1\21\1\4\1\22\1\23"+
    "\1\17\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\42\0\1\3\40\0\3\33\1\0\14\33\2\0\4\33"+
    "\16\0\1\6\35\0\3\33\1\0\1\33\1\34\12\33"+
    "\2\0\4\33\13\0\3\33\1\0\14\33\2\0\1\33"+
    "\1\35\2\33\13\0\3\33\1\0\1\33\1\36\12\33"+
    "\2\0\4\33\13\0\3\33\1\0\6\33\1\37\3\33"+
    "\1\40\1\33\2\0\1\41\3\33\13\0\3\33\1\0"+
    "\10\33\1\42\3\33\2\0\4\33\13\0\3\33\1\0"+
    "\4\33\1\43\7\33\2\0\4\33\13\0\3\33\1\0"+
    "\14\33\2\0\1\33\1\44\2\33\34\0\1\45\50\0"+
    "\1\46\7\0\3\33\1\0\2\33\1\47\11\33\2\0"+
    "\4\33\13\0\3\33\1\0\5\33\1\50\6\33\2\0"+
    "\4\33\33\0\1\51\20\0\3\33\1\0\2\33\1\52"+
    "\11\33\2\0\4\33\13\0\3\33\1\0\12\33\1\53"+
    "\1\33\2\0\4\33\13\0\3\33\1\0\3\33\1\54"+
    "\1\55\7\33\2\0\4\33\13\0\3\33\1\0\7\33"+
    "\1\56\4\33\2\0\4\33\13\0\3\33\1\0\13\33"+
    "\1\57\2\0\4\33\13\0\3\33\1\0\14\33\2\0"+
    "\1\33\1\60\2\33\13\0\3\33\1\0\3\33\1\61"+
    "\3\33\1\62\4\33\2\0\4\33\13\0\3\33\1\0"+
    "\1\33\1\63\12\33\2\0\4\33\13\0\3\33\1\0"+
    "\1\33\1\64\12\33\2\0\4\33\13\0\3\33\1\0"+
    "\14\33\2\0\3\33\1\65\13\0\1\66\40\0\3\33"+
    "\1\0\3\33\1\67\10\33\2\0\4\33\13\0\3\33"+
    "\1\0\2\33\1\70\11\33\2\0\4\33\13\0\3\33"+
    "\1\0\4\33\1\71\7\33\2\0\4\33\13\0\3\33"+
    "\1\0\14\33\2\0\3\33\1\72\13\0\3\33\1\0"+
    "\10\33\1\73\3\33\2\0\4\33\13\0\3\33\1\0"+
    "\4\33\1\74\7\33\2\0\4\33\13\0\3\33\1\0"+
    "\7\33\1\75\4\33\2\0\4\33\13\0\3\33\1\0"+
    "\11\33\1\76\2\33\2\0\4\33\13\0\3\33\1\0"+
    "\7\33\1\77\4\33\2\0\4\33\13\0\3\33\1\0"+
    "\3\33\1\60\10\33\2\0\4\33\13\0\3\33\1\0"+
    "\5\33\1\100\6\33\2\0\4\33\13\0\1\66\26\0"+
    "\1\101\11\0\3\33\1\0\4\33\1\102\7\33\2\0"+
    "\4\33\13\0\3\33\1\0\10\33\1\103\3\33\2\0"+
    "\4\33\13\0\3\33\1\0\2\33\1\104\11\33\2\0"+
    "\4\33\13\0\3\33\1\0\5\33\1\105\6\33\2\0"+
    "\4\33\13\0\3\33\1\0\2\33\1\106\11\33\2\0"+
    "\4\33\13\0\3\33\1\0\10\33\1\107\3\33\2\0"+
    "\4\33\13\0\3\33\1\0\5\33\1\110\6\33\2\0"+
    "\4\33\13\0\3\33\1\0\14\33\2\0\2\33\1\111"+
    "\1\33\13\0\3\33\1\0\10\33\1\112\3\33\2\0"+
    "\4\33\13\0\3\33\1\0\12\33\1\113\1\33\2\0"+
    "\4\33\13\0\3\33\1\0\10\33\1\114\3\33\2\0"+
    "\4\33\13\0\3\33\1\0\6\33\1\115\5\33\2\0"+
    "\4\33\13\0\3\33\1\0\13\33\1\116\2\0\4\33"+
    "\13\0\3\33\1\0\5\33\1\117\6\33\2\0\4\33"+
    "\13\0\3\33\1\0\5\33\1\120\6\33\2\0\4\33"+
    "\13\0\3\33\1\0\2\33\1\121\11\33\2\0\4\33"+
    "\13\0\3\33\1\0\1\33\1\122\12\33\2\0\4\33"+
    "\13\0\3\33\1\0\10\33\1\123\3\33\2\0\4\33"+
    "\13\0\3\33\1\0\10\33\1\124\3\33\2\0\4\33"+
    "\13\0\3\33\1\0\5\33\1\125\6\33\2\0\4\33"+
    "\13\0\3\33\1\0\1\126\13\33\2\0\4\33\13\0"+
    "\3\33\1\0\2\33\1\127\11\33\2\0\4\33\13\0"+
    "\3\33\1\0\10\33\1\130\3\33\2\0\4\33\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2079];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\20\1\1\11\2\1\5\11\12\1\2\11"+
    "\2\1\1\0\14\1\1\0\12\1\1\11\27\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[88];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

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
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
    	return new Symbol(type, yyline, yycolumn, value);
    }    
    private Symbol symbol(int type){
    	return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 16: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 29: break;
        case 18: 
          { return new Symbol(sym.Int, yychar, yyline, yytext());
          }
        case 30: break;
        case 24: 
          { return new Symbol(sym.Restar, yychar, yyline, yytext());
          }
        case 31: break;
        case 22: 
          { return new Symbol(sym.Sumar, yychar, yyline, yytext());
          }
        case 32: break;
        case 23: 
          { return new Symbol(sym.Elevar, yychar, yyline, yytext());
          }
        case 33: break;
        case 1: 
          { return new Symbol(sym.Error, yychar, yyline, yytext());
          }
        case 34: break;
        case 21: 
          { return new Symbol(sym.Clase, yychar, yyline, yytext());
          }
        case 35: break;
        case 5: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 36: break;
        case 9: 
          { return new Symbol(sym.Asignar, yychar, yyline, yytext());
          }
        case 37: break;
        case 2: 
          { return new Symbol(sym.Numero, yychar, yyline, new Integer(yytext()));
          }
        case 38: break;
        case 6: 
          { return new Symbol(sym.Op_relacional, yychar, yyline, yytext());
          }
        case 39: break;
        case 25: 
          { return new Symbol(sym.Retorna, yychar, yyline, yytext());
          }
        case 40: break;
        case 11: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 41: break;
        case 19: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 42: break;
        case 17: 
          { return new Symbol(sym.Access, yychar, yyline, yytext());
          }
        case 43: break;
        case 12: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 44: break;
        case 3: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 45: break;
        case 27: 
          { return new Symbol(sym.Imprimir, yychar, yyline, yytext());
          }
        case 46: break;
        case 20: 
          { return new Symbol(sym.Op_booleano, yychar, yyline, yytext());
          }
        case 47: break;
        case 15: 
          { return new Symbol(sym.Variable, yychar, yyline, yytext());
          }
        case 48: break;
        case 14: 
          { return new Symbol(sym.PuntoComa, yychar, yyline, yytext());
          }
        case 49: break;
        case 8: 
          { return new Symbol(sym.CierraPar, yychar, yyline, yytext());
          }
        case 50: break;
        case 4: 
          { /*Ignore*/
          }
        case 51: break;
        case 10: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 52: break;
        case 13: 
          { return new Symbol(sym.Potencia, yychar, yyline, yytext());
          }
        case 53: break;
        case 26: 
          { return new Symbol(sym.Dividir, yychar, yyline, yytext());
          }
        case 54: break;
        case 28: 
          { return new Symbol(sym.Multiplicar, yychar, yyline, yytext());
          }
        case 55: break;
        case 7: 
          { return new Symbol(sym.AbrePar, yychar, yyline, yytext());
          }
        case 56: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}