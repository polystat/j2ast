package tree.Expression.Primary;

import tree.Entity;
import tree.Expression.Expression;

// ArrayAccess
//    : CompoundName LBRACKET Expression RBRACKET
//    | Primary      LBRACKET Expression RBRACKET
//    ;
public class ArrayAccess extends Primary
{
    // Structure
    public Expression expression;
    public Expression size;

    // Creation
    public ArrayAccess(Expression expr, Expression size)
    {
        this.expression = expr;
        this.size = size;

        if (this.expression != null) {
            this.expression.parent = this;
        }
        if (this.size != null) {
            this.size.parent = this;
        }
        Entity.reportParsing("ARRAY ACCESS");
    }

    // Reporting
    public void report(int sh) {
        doShift(sh);
        System.out.println("ARRAY ACCESS");
        expression.report(sh + shift);
        size.report(sh + shift);
    }

}
