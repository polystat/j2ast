package tree.Type;

import tree.CompoundName;
import tree.Entity;
import tree.*;

// UnannotatedType
//       : ...
//       | CompoundName
//       | CompoundName TypeArguments
//       | ...
//       ;
// TypeArguments
//       : LESS TypeArgumentList GREATER
//       ;
public class TypeName extends UnannotatedType
{
    // Structure
    public CompoundName compoundName;
    public TypeArguments typeArguments;

    // Creation
    public TypeName(CompoundName cn, TypeArguments targs)
    {
        super(null);
        this.compoundName = cn;
        this.typeArguments = targs;
     // super.dimensions = dims;

        if (this.compoundName != null) {
            this.compoundName.parent = this;
        }
        if (this.typeArguments != null) {
            this.typeArguments.parent = this;
        }

     // Entity.unAnnotatedTypeTaken = true;
//      if (debug) {
//          System.out.println("Type name accepted");
//      }
        String rep = "TYPE NAME";
        if ( super.dimensions != null && super.dimensions.dimensions.size() != 0 )
            rep += " WITH "+ super.dimensions.dimensions.size() + " DIMS";
        Entity.reportParsing(rep);
    }

    // Reporting
    public void report(int sh) {
        title("TYPE ",sh);
        Entity.doShift(sh);
        compoundName.report(0);
        System.out.println();
        if (super.annotations != null) {
            super.annotations.report(sh + shift);
        }

        if (typeArguments != null) {
            typeArguments.report(sh + shift);
        }

        if (super.dimensions != null && super.dimensions.dimensions.size() > 0) {
            super.dimensions.report(sh + shift);
        }
    }

}