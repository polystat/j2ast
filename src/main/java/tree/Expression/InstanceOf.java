package tree.Expression;

import tree.Declaration.Declaration;
import tree.Entity;
import tree.Type.Type;

// InstanceofExpression
//    : RelationalExpression INSTANCEOF Type
//    | RelationalExpression INSTANCEOF Pattern
//    ;
public class InstanceOf extends Expression
{
    // Structure
    public Expression expression;
    // Either type OR declaration
    public Type type;
    public Declaration declaration;

    // Creation
    public InstanceOf(Expression expr, Type type)
    {
        this.expression = expr;
        this.type = type;
        this.declaration = null;

        if (this.expression != null) {
            this.expression.parent = this;
        }
        if (this.type != null) {
            this.type.parent = this;
        }
        Entity.reportParsing("INSTANCEOF");
    }

    public InstanceOf(Expression expr, Declaration decl)
    {
        this.expression = expr;
        this.type = null;
        this.declaration = decl;

        if (this.expression != null) {
            this.expression.parent = this;
        }
        if (this.declaration != null) {
            this.declaration.parent = this;
        }
        Entity.reportParsing("INSTANCEOF");
    }

    // Reporting
    public void report(int sh) {
        doShift(sh);
        System.out.println("INSTANCEOF");
        expression.report(sh + shift);
        if (type != null) {
            type.report(sh + shift);
        } else {
            declaration.report(sh + shift);
        }
    }

}
