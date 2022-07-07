package tree.Expression.Primary;

import tree.Declaration.Declarations;
import tree.Entity;
import tree.Expression.ArgumentList;
import tree.Type.*;
import tree.Type.TypeArguments;

// Primary
//    : ...
//    | ClassInstanceCreationExpression
//    | ...
//
// ClassInstanceCreationExpression
//    :                  UnqualifiedClassInstanceCreationExpression
//    | CompoundName DOT UnqualifiedClassInstanceCreationExpression
//    | Primary      DOT UnqualifiedClassInstanceCreationExpression
//    ;
//
// UnqualifiedClassInstanceCreationExpression
//    : NEW TypeArgumentsOpt ClassOrInterfaceTypeToInstantiate Arguments ClassBodyOpt
//    ;
//
// ClassOrInterfaceTypeToInstantiate
//    : AnnotatedCompoundName TypeArgumentsOpt
//    | AnnotatedCompoundName DIAMOND
//    ;
//
// AnnotatedCompoundName
//    :                           AnnotationSeqOpt /*AnnotationOpt*/ IDENTIFIER
//    | AnnotatedCompoundName DOT AnnotationSeqOpt /*AnnotationOpt*/ IDENTIFIER
//    ;
public class InstanceCreation extends Primary
{
    // Structure
    public TypeArguments targs;
//  public CompoundNameAnnotated compound;
//  public TypeArguments targs2;
    public Type ctorType;
    public ArgumentList args;
    public Declarations classBody;

    // Creation
    public InstanceCreation(TypeArguments targs1, Type ctorT /*InstanceCreationTmp tmp*/, ArgumentList args, Declarations body)
    {
        this.targs = targs1;
//      this.compound = tmp.compound;
//      this.targs2 = tmp.targs;
        this.ctorType = ctorT;
        this.args = args;
        this.classBody = body;

        Entity.reportParsing("INSTANCE CREATION");
    }

    // Reporting
    public void report(int sh)
    {
        if ( targs != null ) targs.report(sh);
//      if ( compound != null ) compound.report(sh);
//      if ( targs2 != null ) targs2.report(sh);
        if ( ctorType != null ) ctorType.report(sh);
        if ( args != null ) args.report(sh);
        if ( classBody != null ) classBody.report(sh);
    }

}
