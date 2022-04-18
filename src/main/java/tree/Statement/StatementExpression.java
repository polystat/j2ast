package tree.Statement;

import java.util.ArrayList;

import tree.Entity;
import tree.Expression.Expression;

// StatementExpression
//    : Assignment
//    | PreIncrementExpression
//    | PreDecrementExpression
//    | PostIncrementExpression
//    | PostDecrementExpression
//    | MethodInvocation
//    | ClassInstanceCreationExpression
//    ;
public class StatementExpression extends Statement
{
    // Structure
    public Expression expression;

    // Creation
    public StatementExpression(ArrayList<String> ls, Expression expr)
    {
        super(ls);
        this.expression = expr;

        if (this.expression != null) {
            this.expression.parent = this;
        }
        Entity.reportParsing("STATEMENT EXPRESSION");
    }

    // Reporting
    public void report(int sh) {
        super.report(sh);  // printing labels, if any
        expression.report(sh);
    }

}
