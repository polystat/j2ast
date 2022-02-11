package tree.Expression;

import tree.Entity;
import tree.Type.TypeList;

// CastExpression
//    : TargetType UnaryExpression
//    | TargetType LambdaExpression
//    ;
public class Cast extends Expression {
    // Structure
    public TypeList types;
    public Expression expression;

    // Creation
    public Cast(TypeList types, Expression expr) {
        this.types = types;
        this.expression = expr;

        if (this.types != null) {
            this.types.parent = this;
        }
        if (this.expression != null) {
            this.expression.parent = this;
        }
    }

    // Reporting
    public void report(int sh) {
        doShift(sh);
        System.out.println("CAST");
        types.title("Target types:", sh + shift);
        types.report(sh + 2 * shift);
        expression.report(sh + shift);
    }

}
