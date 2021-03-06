package tree.Declaration;

import tree.Entity;
import tree.Type.Type;

// Intermediate class - won't appear in the AST

public class TypeAndDeclarators extends Declaration {
    // Structure
 // public Type type; -- in the base class
    public VariableDeclarators declarators;

    // Creation
    public TypeAndDeclarators(Type t, VariableDeclarators vds) {
        super(null, null, t);
        this.declarators = vds;
        if (vds != null) vds.parent = this;
//      if (debug) {
//          System.out.println("Type with declarator(s) taken");
//      }
        Entity.reportParsing("TYPE & DECLARATOR(S)");
    }

    // Reporting
    public void report(int sh)
    {
        if ( type != null ) type.report(sh);
        declarators.report(sh);
    }
}
