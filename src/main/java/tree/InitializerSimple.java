package tree;

import tree.Expression.Expression;

public class InitializerSimple extends Initializer
{
    // Structure
    public Expression expression;

    // Creation
    public InitializerSimple(Expression expr)
    {
        this.expression = expr;
        if (expr != null) {
            expr.parent = this;
        }
        Entity.reportParsing("INITIALIZER SIMPLE");
    }

    // Reporting
    public void report(int sh) {
        expression.report(sh);
    }

}
