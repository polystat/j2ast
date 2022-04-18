package tree.Expression.Primary;

import tree.CompoundName;
import tree.Entity;

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
public class InstanceCreationQualified extends Primary
{
    // Structure
    public CompoundName cmp;
    public Primary primary;

    public InstanceCreation creation;

    // Creation
    public InstanceCreationQualified(CompoundName cmp, InstanceCreation creation)
    {
        this.cmp = cmp;
        this.primary = null;
        this.creation = creation;

        Entity.reportParsing("INSTANCE CREATION QUALIFIED");
    }

    public InstanceCreationQualified(Primary primary, InstanceCreation creation)
    {
        this.cmp = null;
        this.primary = primary;
        this.creation = creation;

        Entity.reportParsing("INSTANCE CREATION QUALIFIED");
    }

    // Reporting
    public void report(int sh)
    {
        this.title("NEW: Instance Creation",sh);
        if ( cmp != null )
            cmp.report(sh+Entity.shift);
        else if ( primary != null )
            primary.report(sh+Entity.shift);

        creation.report(sh+Entity.shift);
    }
}
