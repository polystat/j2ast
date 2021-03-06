package tree.Expression;

import tree.Entity;

// ConditionalExpression
//    : ConditionalOrExpression ConditionalOrTail
//    ;
//
// ConditionalOrTail
//    : %empty
//    | QUESTION Expression COLON ConditionalExpression
//    | QUESTION Expression COLON LambdaExpression
//    ;
public class Conditional extends Expression
{
    // Structure
    public Expression condition;
    public Expression thenPart;
    public Expression elsePart;

    // Creation
    public Conditional(Expression c, Expression t, Expression e) {
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
        Entity.reportParsing("CONDITIONAL");
    }

    // Reporting
    public void report(int sh) {
        doShift(sh);
        System.out.println("CONDITIONAL");
        condition.report(sh + shift);
        thenPart.report(sh + shift);
        elsePart.report(sh + shift);
    }

}
