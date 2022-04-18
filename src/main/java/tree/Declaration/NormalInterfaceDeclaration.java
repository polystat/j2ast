package tree.Declaration;

import lexer.Token;
import tree.Entity;
import tree.Type.TypeList;
import tree.Type.TypeParameters;

// NormalInterfaceDeclaration
//    : INTERFACE IDENTIFIER TypeParametersOpt InterfaceExtendsOpt InterfaceBody
//    ;
public class NormalInterfaceDeclaration extends InterfaceDeclaration
{
    // Structure
 // public String identifier;
    public TypeParameters typeParameters;
    public TypeList extendingInterfaces;
    public Declarations interfaceBody;

    // Creation
    public NormalInterfaceDeclaration(
            Token id,
            TypeParameters typePars,
            TypeList extTypes,
            Declarations body)
    {
        super(null, id.image);
        this.typeParameters = typePars;
        this.extendingInterfaces = extTypes;
        this.interfaceBody = body;

        if (this.typeParameters != null) {
            this.typeParameters.parent = this;
        }
        if (this.extendingInterfaces != null) {
            this.extendingInterfaces.parent = this;
        }
        if (this.interfaceBody != null) {
            this.interfaceBody.parent = this;
        }
        Entity.reportParsing("NORMAL INTERFACE DECLARATION");
    }

    // Reporting
    public void report(int sh)
    {
        doShift(sh);
        System.out.println("INTERFACE " + super.name);
        if (typeParameters != null) {
            typeParameters.report(sh + shift);
        }
        if (extendingInterfaces != null) {
            extendingInterfaces.report(sh + shift);
        }
        if (interfaceBody != null) {
            interfaceBody.report(sh + shift);
        }
    }

}
