package tree.Declaration;

import tree.Entity;
import tree.Modifiers;

public class InterfaceDeclaration extends Declaration
{
    // No structure

    // Creation
    public InterfaceDeclaration(Modifiers m, String n)
    {
        super(m, n, null);
        Entity.reportParsing("INTERFACE DECLARATION");

    }

    // No report

    // No generation
}
