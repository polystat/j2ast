package tree.Statement;

import java.util.ArrayList;
import tree.Entity;
import tree.Expression.Expression;

// Statement
//    : ...
//    | IfThenElseStatement
//    | ...
//    ;
//
// IfThenElseStatement
//    : IF LPAREN Expression RPAREN Statement ElsePartOpt
//    ;
//
// ElsePartOpt
//    :  // empty
//    | ELSE Statement
//    ;
public class IfThenElse extends Statement
{
    // Structure
    // public ArrayList<String> labels;
    public Expression condition;
    public Statement thenPart;
    public Statement elsePart;

    // Creation
    public IfThenElse(ArrayList<String> ls, Expression c, Statement t, Statement e)
    {
        super(ls);
        this.condition = c;
        this.thenPart = t;
        this.elsePart = e;

        if (this.condition != null) {
            this.condition.parent = this;
        }
        if (this.thenPart != null) {
            this.thenPart.parent = this;
        }
        if (this.elsePart != null) {
            this.elsePart.parent = this;
        }
        Entity.reportParsing("IF-THEN-ELSE");
    }

    // Reporting
    public void report(int sh) {
        super.report(sh);
        doShift(sh);
        System.out.println("IF");
        condition.report(sh + shift);
        // System.out.println();
        doShift(sh);
        System.out.println("THEN");
        thenPart.report(sh + shift);
        if (elsePart != null) {
            doShift(sh);
            System.out.println("ELSE");
            elsePart.report(sh + shift);
        }
    }

}
