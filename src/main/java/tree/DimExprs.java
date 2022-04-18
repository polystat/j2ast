package tree;

import java.util.ArrayList;

public class DimExprs extends Entity
{
    // Structure
    public ArrayList<DimExpr> dimensions;

    // Creation
    public DimExprs(DimExpr de)
    {
        this.dimensions = new ArrayList<>();
        this.dimensions.add(de);
        if ( de != null ) de.parent = this;
    }
    public DimExprs add(DimExpr de)
    {
        this.dimensions.add(de);
        if ( de != null ) de.parent = this;
        return this;
    }

    // Reporting

    public void report(int sh)
    {
        for (DimExpr de : dimensions) {
            de.report(sh);
        }
    }
}
