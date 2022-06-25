package tree.Expression.Primary;

import tree.Entity;
import tree.InitializerArray;
import tree.Type.Type;

// ArrayCreationExpression
//    : NEW Type DimExprs DimsOpt        { $$ = null; } // not implemented yet
//    | NEW Type Dims ArrayInitializer   { $$ = null; } // not implemented yet
//    ;
//
// DimExprs
//    :          DimExpr
//    | DimExprs DimExpr
//    ;
//
// DimExpr
//    :               LBRACKET Expression RBRACKET
//    | AnnotationSeq LBRACKET Expression RBRACKET
//    ;
public class ArrayCreation extends Primary
{
    // Structure
    Type type;
//  DimExprs dimExprs;
//  Dims dims;
    InitializerArray initializer;

    // Creation
    public ArrayCreation(Type t, InitializerArray init)
    {
        this.type = t;
//      this.dimExprs = de;
//      this.dims = ds;
        this.initializer = init;

        if ( this.type != null ) this.type.parent = this;
//      if ( this.dimExprs != null ) this.dimExprs.parent = this;
//      if ( this.dims != null ) this.dims.parent = this;
        if ( this.initializer != null ) this.initializer.parent = this;

        Entity.reportParsing("ARRAY CREATION");
    }

    public void report(int sh)
    {
        title("ARRAY CREATION",sh);
        if ( type != null) type.report(sh+Entity.shift);
        if ( initializer != null ) initializer.report(sh+Entity.shift);
    }

}
