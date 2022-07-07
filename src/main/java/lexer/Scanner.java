package lexer;

import java.nio.file.Files;
import java.nio.file.Paths;
import parser.JavaParser;
import tree.Entity;

/**
 * Used to parse source code into a stream of tokens.
 */
public class Scanner implements JavaParser.Lexer {

    private static final char charZero = '\0';
    private static final Token noToken = new Token(TokenCode.DUMMY);
    private char[] sourceText;

    // Machinery for reading bytes from the source ///////////////////////
    // private int currentLine = 0;
    // private int currentPos = 0;
    private int globalPos = -1;
    private char currentChar = charZero;
    private Token lastToken;
    private Token currentToken;

    public void read(String src) {
        sourceText = src.toCharArray();
    }

    // PUBLIC SCANNER INTERFACE /////////////////////////////

    public boolean readFile(String path) {
        try {
            String text = Files.readString(Paths.get(path));
            text = text.replace("\r\n", "\n").replace("\r", "n");
            sourceText = text.toCharArray();  //.getChars(StandardCharsets.UTF_8);
            return true;
        } catch (Exception exc) {
            System.err.println(exc.getMessage());
            return false;
        }
    }

    private char getChar() {
        if (currentChar == charZero) {
            globalPos++;
            if (globalPos >= sourceText.length) {
                return charZero;
            }
            currentChar = sourceText[globalPos];
        }
        return currentChar;
    }

    private void forgetChar() {
        currentChar = charZero;
    }

    public int yylex() {
        lastToken = get();

        if (Entity.debug) {
            System.out.print(lastToken.span.getBegin().getLine());
            System.out.print(" ");
            System.out.print(lastToken.code);
            if (lastToken.code == TokenCode.Identifier) {
                System.out.print(" " + lastToken.image);
            }
            System.out.println();
        }
        return lastToken.code.value();
    }

    /////////////////////////////////////////////////////////////


    // Detecting the current token //////////////////////////////

    public Token getLVal() {
        return lastToken;
    }

    int lineNum = 1;
    int posNum = 1;

    @Override
    public void yyerror(String msg) {
        System.out.print(lineNum);
        System.out.print(" ");
        System.out.println(msg);
    }

    public Token get() {
     // if ( currentToken == null ) currentToken = getToken();

        while (true) {
            currentToken = getToken();
            switch (currentToken.code) {
                case ShortComment:
                case LongComment:
                    continue;
                default:
                    return currentToken;
            }
        }
    }

    public void forget() {
        currentToken = noToken;
    }

    private Token getToken() {
        char ch;
        TokenCode code;
        String image;
        Token token;

     // if ( Entity.inBlock && Entity.unAnnotatedTypeTaken )
     // {
     //     Entity.unAnnotatedTypeTaken = false;
     //     return new Token(TokenCode.Phantom,"");
     // }

        while (true) {
            ch = getChar();
            if (ch == charZero) {
                Token end = new Token(TokenCode.EOS, "");
                end.setSpan(new Span(new Pos(lineNum,posNum),null));
                return end;
            }
            if (ch == ' ' || ch == '\t') {
             // currentPos++;
                forgetChar();
                continue;
            }
            if (ch == '\n') {
                lineNum++;
             // currentLine++;
             // currentPos = 0;
                forgetChar();
                continue;
            }
            if (ch == '\r') {
             // currentPos = 0;
                forgetChar();
                continue;
            }
            break;
        }

        switch (ch) {
            case '"':  // String literal
                forgetChar();
                StringBuilder str = new StringBuilder();
                while (true) {
                    ch = getChar();
                    if (ch == '"') {
                        forgetChar();
                        break;
                    }
                    str.append(ch);
                    forgetChar();
                }
                code = TokenCode.StringLiteral;
                image = str.toString();
                break;
            case ':':  //  :  ::
                forgetChar();
                ch = getChar();
                if (ch == ':') {
                    forgetChar();
                    code = TokenCode.DoubleColon;
                    image = "::";
                } else {
                    code = TokenCode.Colon;
                    image = ":";
                }
                break;

            case '.':   //  .  ...
                forgetChar();
                ch = getChar();
                if (ch == '.') {
                    forgetChar();
                    ch = getChar();
                    if (ch == '.') {
                        forgetChar();
                        code = TokenCode.Ellipsis;
                        image = "...";
                    } else {
                        code = TokenCode.ERROR;
                        image = "..";
                    }
                } else {
                    code = TokenCode.Dot;
                    image = ".";
                }
                break;

            // One-char tokens
            case '?':
                forgetChar();
                code = TokenCode.Question;
                image = "?";
                break;
            case ';':
                forgetChar();
                code = TokenCode.Semicolon;
                image = ";";
                break;
            case ',':
                forgetChar();
                code = TokenCode.Comma;
                image = ",";
                break;
            case '(':
                forgetChar();
                code = TokenCode.LeftParenth;
                image = "(";
                break;
            case ')':
                forgetChar();
                code = TokenCode.RightParenth;
                image = ")";
                break;
            case '[':
                forgetChar();
                code = TokenCode.LeftBracket;
                image = "[";
                break;
            case ']':
                forgetChar();
                code = TokenCode.RightBracket;
                image = "]";
                break;
            case '{':
                forgetChar();
                code = TokenCode.LeftBrace;
                image = "{";
                break;
            case '}':
                forgetChar();
                code = TokenCode.RightBrace;
                image = "}";
                break;
            case '@':
                forgetChar();
                code = TokenCode.At;
                image = "@";
                break;
            case '~':
                forgetChar();
                code = TokenCode.Tilde;
                image = "~";
                break;
            case '*':  //  *  *=
                forgetChar();
                ch = getChar();
                if (ch == '=') {
                    forgetChar();
                    code = TokenCode.StarAssign;
                    image = "*=";
                } else {
                    code = TokenCode.Star;
                    image = "*";
                }
                break;
            case '/':  //  /  /=  //  /*
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '=': {
                        forgetChar();
                        code = TokenCode.SlashAssign;
                        image = "/=";
                        break;
                    }
                    case '/': {
                        forgetChar();
                        code = TokenCode.ShortComment;
                        image = "//" + scanShortComment();
                        break;
                    }
                    case '*': {
                        forgetChar();
                        code = TokenCode.LongComment;
                        image = "/*" + scanLongComment();
                    }
                    default: {
                        code = TokenCode.Slash;
                        image = "/";
                        break;
                    }
                }
                break;
            case '%':  //  %  %=
                forgetChar();
                ch = getChar();
                if (ch == '=') {
                    forgetChar();
                    code = TokenCode.PercentAssign;
                    image = "%=";
                } else {
                    code = TokenCode.Percent;
                    image = "%";
                }
                break;
            case '+':  //  +  +=  ++
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '+': {
                        forgetChar();
                        code = TokenCode.PlusPlus;
                        image = "++";
                        break;
                    }
                    case '=': {
                        forgetChar();
                        code = TokenCode.PlusAssign;
                        image = "+=";
                        break;
                    }
                    default: {
                        code = TokenCode.Plus;
                        image = "+";
                        break;
                    }
                }
                break;
            case '-':  //  -  -=  --  ->
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '=': {
                        forgetChar();
                        code = TokenCode.MinusAssign;
                        image = "-=";
                        break;
                    }
                    case '-': {
                        forgetChar();
                        code = TokenCode.MinusMinus;
                        image = "--";
                        break;
                    }
                    case '>': {
                        forgetChar();
                        code = TokenCode.Arrow;
                        image = "->";
                        break;
                    }
                    default: {
                        code = TokenCode.Minus;
                        image = "-";
                        break;
                    }
                }
                break;
            case '=':  //  =  ==  ===
                forgetChar();
                ch = getChar();
                if (ch == '=') {
                    forgetChar();
                    ch = getChar();
                    if (ch == '=') {
                        forgetChar();
                        code = TokenCode.EqualDeep;
                        image = "===";
                    } else {
                        code = TokenCode.Equal;
                        image = "==";
                    }
                } else {
                    code = TokenCode.Assign;
                    image = "=";
                }
                break;
            case '<':  //  <  <=  <<  <<=
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '<': {
                        forgetChar();
                        ch = getChar();
                        if (ch == '=') {
                            forgetChar();
                            code = TokenCode.LeftShiftAssign;
                            image = "<<=";
                        } else {
                            code = TokenCode.LeftShift;
                            image = "<<";
                        }
                        break;
                    }
                    case '=': {
                        forgetChar();
                        code = TokenCode.LessEqual;
                        image = "<=";
                        break;
                    }
                    default: {
                        code = TokenCode.Less;
                        image = "<";
                        break;
                    }
                }
                break;
            case '>':  //  >  >=  >>  >>=  >>>  >>>=
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '=': {
                        forgetChar();
                        code = TokenCode.GreaterEqual;
                        image = ">=";
                        break;
                    }
                    case '>': {
                        forgetChar();
                        ch = getChar();
                        switch (ch) {
                            case '>': {
                                forgetChar();
                                ch = getChar();
                                if (ch == '=') {
                                    forgetChar();
                                    code = TokenCode.ArithmRightShiftAssign;
                                    image = ">>>=";
                                } else {
                                    code = TokenCode.ArithmRightShift;
                                    image = ">>>";
                                }
                                break;
                            }
                            case '=': {
                                forgetChar();
                                code = TokenCode.RightShiftAssign;
                                image = ">>=";
                                break;
                            }
                            default: {
                                code = TokenCode.RightShift;
                                image = ">>";
                                break;
                            }
                        }
                        break;
                    }
                    default: {
                        code = TokenCode.Greater;
                        image = ">";
                        break;
                    }
                }
                break;

            case '|':  //  |  ||  |=
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '|': {
                        forgetChar();
                        code = TokenCode.DoubleVertical;
                        image = "||";
                        break;
                    }
                    case '=': {
                        forgetChar();
                        code = TokenCode.VerticalAssign;
                        image = "|=";
                        break;
                    }
                    default: {
                        code = TokenCode.Vertical;
                        image = "|";
                        break;
                    }
                }
                break;

            case '&':  //  &  &&  &=
                forgetChar();
                ch = getChar();
                switch (ch) {
                    case '&': {
                        forgetChar();
                        code = TokenCode.DoubleAmpersand;
                        image = "&&";
                        break;
                    }
                    case '=': {
                        forgetChar();
                        code = TokenCode.AmpersandAssign;
                        image = "&=";
                        break;
                    }
                    default: {
                        code = TokenCode.Ampersand;
                        image = "&";
                        break;
                    }
                }
                break;
            case '^':  //  ^  ^=
                forgetChar();
                ch = getChar();
                if (ch == '=') {
                    forgetChar();
                    code = TokenCode.CaretAssign;
                    image = "^=";
                } else {
                    code = TokenCode.Caret;
                    image = "^";
                }
                break;
            case '!':  //  !  !=
                forgetChar();
                ch = getChar();
                if (ch == '=') {
                    forgetChar();
                    code = TokenCode.NonEqual;
                    image = "!=";
                } else {
                    code = TokenCode.Negation;
                    image = "!";
                }
                break;

            case '0': // integer
                String literal = "" + ch;
                forgetChar();
                ch = getChar();
                switch ( ch ) {
                    case 'x':
                    case 'X':
                        forgetChar();
                        literal += ch;
                        while (true) {
                            ch = getChar();
                            if (isHexadecimal(ch)) {
                                literal += ch;
                                forgetChar();
                            } else if (ch == '_') {
                                forgetChar();
                                continue;
                            } else
                                break;
                        }
                        break;

                    case 'o':
                    case 'O':
                        forgetChar();
                        literal += ch;
                        while (true) {
                            ch = getChar();
                            if (isOctal(ch)) {
                                literal += ch;
                                forgetChar();
                            } else if (ch == '_') {
                                forgetChar();
                                continue;
                            } else
                                break;
                        }
                        break;

                    case 'b':
                    case 'B':
                        forgetChar();
                        literal += ch;
                        while (true) {
                            ch = getChar();
                            if (isBinary(ch)) {
                                literal += ch;
                                forgetChar();
                            } else if (ch == '_') {
                                forgetChar();
                                continue;
                            } else
                                break;
                        }
                        break;

                    default:
                        while (true) {
                            if (Character.isDigit(ch)) {
                                literal = literal.concat("" + ch);
                                forgetChar();
                                ch = getChar();
                            } else if (ch == '_') {
                                forgetChar();
                                ch = getChar();
                                continue;
                            } else {
                                // forgetChar();
                                break;
                            }
                        }
                        break;
                }
                if ( Character.toUpperCase(ch) == 'L'  )
                {
                    literal += "" + ch;
                    forgetChar();
                }
                image = literal;
                code = TokenCode.IntegerLiteral;
                break;

            default:
                if (Character.isJavaIdentifierStart(ch)) {
                    String identifier = "" + ch;
                    while (true) {
                        forgetChar();
                        ch = getChar();
                        if (Character.isJavaIdentifierPart(ch)) {
                            identifier += ch;
                        } else {
                            // forgetChar();
                            break;
                        }
                    }
                    image = identifier;
                    code = detectKeyword(identifier);
                } else if (Character.isDigit(ch)) {
                    literal = "" + ch;
                    while (true) {
                        forgetChar();
                        ch = getChar();
                        if (Character.isDigit(ch)) {
                            literal = literal.concat("" + ch);
                        } else if ( ch == '_' ) {
                            continue;
                        } else {
                            // forgetChar();
                            break;
                        }
                    }
                    ch = getChar();
                    if (ch == '.') {
                        literal = literal.concat(".");
                        forgetChar();
                        ch = getChar();
                        while (true) {
                            if (Character.isDigit(ch)) {
                                literal = literal.concat("" + ch);
                                forgetChar();
                                ch = getChar();
                                continue;
                            } else if ( ch == '_' ) {
                                continue;
                            } else {
                                //forgetChar();
                                break;
                            }
                        }
                        code = TokenCode.FloatingLiteral;
                    } else {
                        code = TokenCode.IntegerLiteral;
                    }
                    image = literal;
                } else {
                    code = TokenCode.ERROR;
                    image = "" + ch;
                }
                break;
        }
        token = new Token(code, image);
        token.setSpan(new Span(new Pos(lineNum,posNum),null));
        return token;
    }

    private boolean isHexadecimal(char ch)
    {
        if ( Character.isDigit(ch) ) return true;
        char chU = Character.toUpperCase(ch);
        if ( chU >= 'A' && chU <= 'F' ) return true;
        return false;
    }

    private boolean isOctal(char ch)
    {
        return (ch>='0' && ch<='7');
    }

    private boolean isBinary(char ch)
    {
        return ch == '0' || ch == '1';
    }

    private String scanShortComment() {
        StringBuilder comment = new StringBuilder();
        while (true) {
            char ch = getChar();
            forgetChar();
            if (ch == '\n') {
                lineNum++;
                break;
            }
            comment.append(ch);
        }
        return comment.toString();
    }

    private String scanLongComment() {
        StringBuilder comment = new StringBuilder();
        while (true) {
            char ch = getChar();
            forgetChar();
            if (ch == '*') {
                forgetChar();
                ch = getChar();
                if (ch == '/') {
                    forgetChar();
                    break;
                } else {
                    comment.append("*").append(ch);
                }
            } else if (ch == '\n') {
                lineNum++;
                comment.append(ch);
            } else {
                comment.append(ch);
            }
        }
        return comment.toString();
    }

    private TokenCode detectKeyword(String identifier) {
        if (identifier.equals("abstract")) return TokenCode.Abstract;
        if (identifier.equals("assert")) return TokenCode.Assert;
        if (identifier.equals("boolean")) return TokenCode.Boolean;
        if (identifier.equals("break")) return TokenCode.Break;
        if (identifier.equals("byte")) return TokenCode.Byte;
        if (identifier.equals("catch")) return TokenCode.Catch;
        if (identifier.equals("case")) return TokenCode.Case;
        if (identifier.equals("char")) return TokenCode.Char;
        if (identifier.equals("class")) return TokenCode.Class;
//         if (identifier.equals("const")) return TokenCode.Const;   // not actually used
        if (identifier.equals("continue")) return TokenCode.Continue;
        if (identifier.equals("default")) return TokenCode.Default;
        if (identifier.equals("do")) return TokenCode.Do;
        if (identifier.equals("double")) return TokenCode.Double;
        if (identifier.equals("else")) return TokenCode.Else;
        if (identifier.equals("enum")) return TokenCode.Enum;
        if (identifier.equals("extends")) return TokenCode.Extends;
        if (identifier.equals("final")) return TokenCode.Final;
        if (identifier.equals("finally")) return TokenCode.Finally;
        if (identifier.equals("float")) return TokenCode.Float;
        if (identifier.equals("for")) return TokenCode.For;
//         if (identifier.equals("goto")) return TokenCode.Goto; // not actually used
        if (identifier.equals("if")) return TokenCode.If;
        if (identifier.equals("implements")) return TokenCode.Implements;
        if (identifier.equals("import")) return TokenCode.Import;
        if (identifier.equals("instanceof")) return TokenCode.Instanceof;
        if (identifier.equals("int")) return TokenCode.Int;
        if (identifier.equals("interface")) return TokenCode.Interface;
        if (identifier.equals("long")) return TokenCode.Long;
        if (identifier.equals("native")) return TokenCode.Native;
        if (identifier.equals("new")) return TokenCode.New;
        if (identifier.equals("package")) return TokenCode.Package;
        if (identifier.equals("private")) return TokenCode.Private;
        if (identifier.equals("protected")) return TokenCode.Protected;
        if (identifier.equals("public")) return TokenCode.Public;
        if (identifier.equals("return")) return TokenCode.Return;
        if (identifier.equals("short")) return TokenCode.Short;
        if (identifier.equals("static")) return TokenCode.Static;
        if (identifier.equals("strictfp")) return TokenCode.Strictfp;
        if (identifier.equals("super")) return TokenCode.Super;
        if (identifier.equals("synchronized")) return TokenCode.Synchronized;
        if (identifier.equals("switch")) return TokenCode.Switch;
        if (identifier.equals("this")) return TokenCode.This;
        if (identifier.equals("throw")) return TokenCode.Throw;
        if (identifier.equals("throws")) return TokenCode.Throws;
        if (identifier.equals("transient")) return TokenCode.Transient;
        if (identifier.equals("try")) return TokenCode.Try;
        if (identifier.equals("void")) return TokenCode.Void;
        if (identifier.equals("volatile")) return TokenCode.Volatile;
        if (identifier.equals("while")) return TokenCode.While;
        if (identifier.equals("true")) return TokenCode.True;
        if (identifier.equals("false")) return TokenCode.False;
        if (identifier.equals("null")) return TokenCode.Null;
        if (identifier.equals("var")) return TokenCode.Var;
        if (identifier.equals("yield")) return TokenCode.Yield;
        if (identifier.equals("record")) return TokenCode.Record;

        /*
                open,
                module,
                requires,
                transitive,
                exports,
                opens,
                to,
                uses,
                provides,
                with,

                Yield,
                Record,
        */

        return TokenCode.Identifier;
    }
}
