package tree.Type;

import tree.Annotations;
import tree.Dim;
import tree.Dims;
import tree.Entity;

// UnannotatedType
//    : PrimitiveType
//    | CompoundName
//    | CompoundName TypeArguments
//    | UnannotatedType Dim        // ArrayType
//    ;
public class UnannotatedType extends Type
{
    // Structure
    public Dims dimensions;

    // Creation
    public UnannotatedType(Annotations anns)
    {
        super(anns);
        dimensions = new Dims();

        Entity.reportParsing("UNANNOTATED TYPE");
    }

    public UnannotatedType addDimension(Dim dim)
    {
        this.dimensions.add(dim);
        if (dim != null) {
            dim.parent = this;
        }
        Entity.reportParsing("TYPE WITH DIMENSION");
        return this;
    }

    public void setDimensions ( Dims dims )
    {
        this.dimensions = dims;
    }

    // Reporting
    public void report(int sh)
    {
        // empty
    }

}