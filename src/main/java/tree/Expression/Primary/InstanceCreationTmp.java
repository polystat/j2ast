package tree.Expression.Primary;

// Temporary class - won't appear in the tree

import tree.*;
import tree.CompoundNameAnnotated;
import tree.Type.TypeArguments;

// ClassOrInterfaceTypeToInstantiate
//    : AnnotatedCompoundName TypeArgumentsOpt
//    | AnnotatedCompoundName DIAMOND
//    ;
public class InstanceCreationTmp extends Entity
{
    public CompoundNameAnnotated compound;
    public TypeArguments targs;

    public InstanceCreationTmp(CompoundNameAnnotated cmp, TypeArguments targs)
    {
        this.compound = cmp;
        this.targs = targs;

        Entity.reportParsing("INSTANCE CREATION TMP");
    }
}
