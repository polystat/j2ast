package tree;

import tree.Expression.Expression;

// Dim
//    : AnnotationSeq LBRACKET RBRACKET
//    |               LBRACKET RBRACKET
//    ;
public class Dim extends Entity
{
    // Structure
    public Annotations annotations;
    public Expression expression;

    // Creation
    public Dim(Annotations anns, Expression expr)
    {
        this.annotations = anns;
        if (this.annotations != null) this.annotations.parent = this;
        this.expression = expr;
        if ( this.expression != null ) this.expression.parent = this;

        String rep = "DIMENSION";
        if ( this.expression != null ) rep += " WITH EXPR";
        Entity.reportParsing(rep);
    }

    // Reporting
    public void report(int sh) {
        if ( annotations != null ) annotations.report(sh);
        System.out.print("[");
        if ( expression != null ) expression.report(sh);
        System.out.print("]");
    }
}
