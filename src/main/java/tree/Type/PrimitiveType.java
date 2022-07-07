package tree.Type;

import lexer.Token;
import lexer.TokenCode;
import tree.Entity;

// PrimitiveType
//             // NumericType -- IntegralType
//    : BYTE
//    | SHORT
//    | INT
//    | LONG
//    | CHAR
//             // NumericType -- FloatingPointType
//    | FLOAT
//    | DOUBLE
//    | BOOLEAN
//    ;
public class PrimitiveType extends UnannotatedType
{
    // Structure
    public TokenCode typeCode;

    // Creation
    public PrimitiveType(Token token) {
        super(null);
        this.typeCode = token.code;
    //  super.dimensions = dims;

        // Entity.unAnnotatedTypeTaken = true;
 //     if (debug) {
 //         System.out.println("Primitive type accepted");
 //     }
        String rep = "PRIMITIVE TYPE " + typeCode.toString();
//      if ( dims != null ) rep += "WITH " + super.dimensions.dimensions.size() + " DIMS";
        Entity.reportParsing(rep);
    }

    // Reporting
    public void report(int sh) {
        title("TYPE " + typeCode.toString(), sh);
        if (super.annotations != null) {
            super.annotations.report(sh + shift);
        }
        if (super.dimensions != null && super.dimensions.dimensions.size() > 0) {
            super.dimensions.report(sh + shift);
        }
    }
}