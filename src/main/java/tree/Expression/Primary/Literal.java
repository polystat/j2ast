package tree.Expression.Primary;

import lexer.Token;
import lexer.TokenCode;
import tree.Entity;

// Primary
//    : Literal
//    | ...
//    | NULL
//    | ...
//
// Literal
//    : INTEGER_LITERAL
//    | FLOATING_POINT_LITERAL
//    | TRUE                      // BOOLEAN_LITERAL
//    | FALSE                     // BOOLEAN_LITERAL
//    | CHARACTER_LITERAL
//    | STRING_LITERAL
////  | TextBlock   // ???
//    | NULL   // NullLiteral
//    ;
public class Literal extends Primary
{
    // Structure
    public TokenCode code;
    public Object value;

    // Creation
    public Literal(Token token) {
        this.code = token.code;
        this.value = token.image; //.value;

        Entity.reportParsing("LITERAL");
    }

    // Reporting
    public void report(int sh) {
        title("LITERAL " + value, sh);
    }

}
