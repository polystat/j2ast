package beautifier

import tree.AnnoParameterList
import tree.Annotations
import tree.Compilation.CompilationUnit
import tree.Compilation.SimpleCompilationUnit
import tree.Compilation.Package
import tree.Compilation.Module
import tree.Compilation.TopLevelComponent
import tree.Compilation.TopLevelComponents
import tree.Declaration.*
import tree.Dim
import tree.Dims
import tree.Entity
import tree.Expression.*
import tree.Expression.Primary.*
import tree.Initializer
import tree.InitializerArray
import tree.InitializerSimple
import tree.Modifiers
import tree.ResourceSpecification
import tree.StandardModifiers
import tree.Statement.*
import tree.Type.PrimitiveType
import tree.Type.Type
import tree.Type.TypeArgument
import tree.Type.TypeArguments
import tree.Type.TypeList
import tree.Type.TypeName
import tree.Type.TypeParameter
import tree.Type.TypeParameters
import tree.Type.UnannotatedType

fun startParentValidation(cu: CompilationUnit) {
    cu.validateParent()
}

fun Entity.validateParent() {
    println("Unvalidated entity: ${this.javaClass.simpleName}")
}

fun CompilationUnit.validateParent() {
    when (this) {
        is SimpleCompilationUnit -> this.validateParent()
        is Package -> this.validateParent()
        is Module -> this.validateParent()
    }
}

fun SimpleCompilationUnit.validateParent() {
    components?.parent = this
    imports?.parent = this

    imports?.validateParent()
    components?.validateParent()
}

fun Package.validateParent() {
    compoundName?.parent = this
    components?.parent = this
    imports?.parent = this

    components?.validateParent()
    imports?.validateParent()
}

fun Module.validateParent() {
    /*
    * Nothing here
    * */
}

fun TopLevelComponents.validateParent() {
    components?.map { it?.parent = this }
    components?.map { it?.validateParent() }
}

fun ImportDeclarations.validateParent() {
    imports?.map { it?.parent = this }
    imports?.map { it?.validateParent() }
}

fun TopLevelComponent.validateParent() {
    classDecl?.parent = this
    interfaceDecl?.parent = this

    classDecl?.validateParent()
    interfaceDecl?.validateParent()
}

fun ImportDeclaration.validateParent() {
    compoundName?.parent = this
}

fun Declarations.validateParent() {
    declarations?.map { it?.parent = this }
    declarations?.map { it?.validateParent() }
}

fun Declaration.validateParent() {
    modifiers?.parent = this
    type?.parent = this

    modifiers?.validateParent()
    type?.validateParent()

    when (this) {
        is ClassDeclaration -> this.validateParent()
        is InterfaceDeclaration -> this.validateParent()
        is VariableDeclaration -> this.validateParent()
        is ParameterDeclaration -> this.validateParent()
        is MethodDeclaration -> this.validateParent()
        is ClassInitializer -> this.validateParent()
        else -> (this as Entity).validateParent()
    }
}

fun ClassInitializer.validateParent() {
    block?.parent = this
    block?.validateParent()
}

fun MethodDeclaration.validateParent() {
    dims?.parent = this
    methodBody?.parent = this
    exceptions?.parent = this
    parameters?.parent = this
    typeParameters?.parent = this

    dims?.validateParent()
    methodBody?.validateParent()
    exceptions?.validateParent()
    parameters?.validateParent()
    typeParameters?.validateParent()

    if (this is ConstructorDeclaration) {
        this.validateParent()
    }
}

fun ConstructorDeclaration.validateParent() {
    invocation?.parent = this
    invocation?.validateParent()
}

fun ExplicitConstructorInvocation.validateParent() {
    arguments?.parent = this
    expression?.parent = this
    typeArguments?.parent = this

    arguments?.validateParent()
    expression?.validateParent()
    typeArguments?.validateParent()
}

fun ParameterDeclarations.validateParent() {
    parameters?.map { it?.parent = this }
    parameters?.map { it?.validateParent() }
}

fun ParameterDeclaration.validateParent() {
    ellAnnotations?.parent = this
    dims?.parent = this

    ellAnnotations?.validateParent()
    dims?.validateParent()

    when(this) {
        is ReceiverDeclaration -> this.validateParent()
        is CatchParameter -> this.validateParent()
        else -> (this as Entity).validateParent()
    }
}

fun ReceiverDeclaration.validateParent() {
    annotations?.parent = this
    annotations?.validateParent()
}

fun CatchParameter.validateParent() {
    catchTypes?.parent = this
    catchTypes?.validateParent()
}

fun VariableDeclaration.validateParent() {
    initializer?.parent = this
    dims?.parent = this

    initializer?.validateParent()
    dims?.validateParent()
}

fun Dims.validateParent() {
    dimensions?.map { it?.parent = this }
    dimensions?.map { it?.validateParent() }
}

fun Dim.validateParent() {
    annotations?.parent = this
    annotations?.validateParent()
}

fun Initializer.validateParent() {
    when (this) {
        is InitializerSimple -> this.validateParent()
        is InitializerArray -> this.validateParent()
        else -> (this as Entity).validateParent()
    }
}

fun InitializerSimple.validateParent() {
    expression?.parent = this
    expression?.validateParent()
}

fun InitializerArray.validateParent() {
    initializers?.map { it?.parent = this }
    initializers?.map { it?.validateParent() }
}

fun InterfaceDeclaration.validateParent() {
    when (this) {
        is NormalInterfaceDeclaration -> this.validateParent()
        else -> (this as Entity).validateParent()
    }
}

fun NormalInterfaceDeclaration.validateParent() {
    typeParameters?.parent = this
    extendingInterfaces?.parent = this
    interfaceBody?.parent = this

    typeParameters?.validateParent()
    extendingInterfaces?.validateParent()
    interfaceBody?.validateParent()
}

fun ClassDeclaration.validateParent() {
    when (this) {
        is NormalClassDeclaration -> this.validateParent()
        is EnumDeclaration -> this.validateParent()
        is RecordDeclaration -> this.validateParent()
    }
}

fun NormalClassDeclaration.validateParent() {
    body?.parent = this
    extendedType?.parent = this
    interfaces?.parent = this
    typeParameters?.parent = this

    body?.validateParent()
    extendedType?.validateParent()
    interfaces?.validateParent()
    typeParameters?.validateParent()
}

fun EnumDeclaration.validateParent() {
    body?.parent = this
    enumerators?.parent = this
    implemented?.parent = this

    body?.validateParent()
    enumerators?.validateParent()
    implemented?.validateParent()
}

fun RecordDeclaration.validateParent() {
    body?.parent = this
    recordComponents?.parent = this
    typeParameters?.parent = this

    body?.validateParent()
    recordComponents?.validateParent()
    typeParameters?.validateParent()
}

fun RecordComponents.validateParent() {
    recordComps?.map { it?.parent = this }
    recordComps?.map { it?.validateParent() }
}

fun RecordComponent.validateParent() {
    ellAnnotations?.parent = this
    ellAnnotations?.validateParent()
}

fun Enumerators.validateParent() {
    enumerators?.map { it?.parent = this }
    enumerators?.map { it?.validateParent() }
}

fun Enumerator.validateParent() {
    annotations?.parent = this
    arguments?.parent = this
    enumBody?.parent = this

    annotations?.validateParent()
    arguments?.validateParent()
    enumBody?.validateParent()
}

fun ArgumentList.validateParent() {
    arguments?.map { it?.parent = this }
    arguments?.map { it?.validateParent() }
}

fun Modifiers.validateParent() {
    annotations?.parent = this
    modifiers?.parent = this

    annotations?.validateParent()
    modifiers?.validateParent()
}

fun StandardModifiers.validateParent() {
    /*
    * Nothing here
    * */
}

fun TypeList.validateParent() {
    types?.map { it?.parent = this }
    types?.map { it?.validateParent() }
}

fun TypeParameters.validateParent() {
    typeParameters?.map { it?.parent = this }
    typeParameters?.map { it?.validateParent() }
}

fun TypeParameter.validateParent() {
    annotations?.parent = this
    extAnnotations?.parent = this
    extendingTypes?.parent = this

    annotations?.validateParent()
    extAnnotations?.validateParent()
    extendingTypes?.validateParent()
}

fun Type.validateParent() {
    annotations?.parent = this

    if (this is UnannotatedType) {
        this.validateParent()
    }
}

fun UnannotatedType.validateParent() {
    dimensions?.parent = this
    dimensions?.validateParent()

    when (this) {
        is PrimitiveType -> this.validateParent()
        is TypeName -> this.validateParent()
    }
}

fun PrimitiveType.validateParent() {
    /*
    * Nothing here
    * */
}

fun TypeName.validateParent() {
    compoundName?.parent = this
    typeArguments?.parent = this
    dimensions?.parent = this

    typeArguments?.validateParent()
    dimensions?.validateParent()
}

fun TypeArguments.validateParent() {
    arguments?.map { it?.parent = this }
    arguments?.map { it?.validateParent() }
}

fun TypeArgument.validateParent() {
    type?.parent = this
    annotations?.parent = this

    type?.validateParent()
    annotations?.validateParent()
}

fun Annotations.validateParent() {
    annotations?.map { it?.parent = this }
    annotations?.map { it?.validateParent() }
}

fun tree.Annotation.validateParent() {
    compoundName?.parent = this
    annoParameterList?.parent = this

    annoParameterList?.validateParent()
}

fun AnnoParameterList.validateParent() {
    /*
    * Nothing here
    * */
}

fun Expression.validateParent() {
    when(this) {
        is Primary -> this.validateParent()
        is UnaryPostfix -> this.validateParent()
        is Conditional -> this.validateParent()
        is UnaryPrefix -> this.validateParent()
        is Binary -> this.validateParent()
        is InstanceOf -> this.validateParent()
        is SwitchExpression -> this.validateParent()
        is SimpleReference -> this.validateParent()
        is Cast -> this.validateParent()
        is Lambda -> this.validateParent()
        else -> (this as Entity).validateParent()
    }
}

fun Lambda.validateParent() {
    block?.parent = this
    expression?.parent = this
    parameters?.parent = this

    block?.validateParent()
    expression?.validateParent()
    parameters?.validateParent()
}

fun Cast.validateParent() {
    types?.parent = this
    expression?.parent = this

    types?.validateParent()
    expression?.validateParent()
}

fun SimpleReference.validateParent() {
    compoundName?.parent = this
}

fun SwitchExpression.validateParent() {
    expression?.parent = this
    switchBlock?.parent = this

    expression?.validateParent()
    switchBlock?.validateParent()
}

fun SwitchBlock.validateParent() {
    block?.parent = this
    labels?.map { it?.parent = this }

    block?.validateParent()
    labels?.map { it?.validateParent() }
}

fun SwitchLabel.validateParent() {
    cases?.map { it?.parent = this }
    cases?.map { it?.validateParent() }
}

fun InstanceOf.validateParent() {
    type?.parent = this
    expression?.parent = this
    declaration?.parent = this

    type?.validateParent()
    expression?.validateParent()
    declaration?.validateParent()
}

fun Binary.validateParent() {
    left?.parent = this
    right?.parent = this

    left?.validateParent()
    right?.validateParent()
}

fun UnaryPrefix.validateParent() {
    operand?.parent = this
    operand?.validateParent()
}

fun Conditional.validateParent() {
    condition?.parent = this
    thenPart?.parent = this
    elsePart?.parent = this

    condition?.validateParent()
    thenPart?.validateParent()
    elsePart?.validateParent()
}

fun UnaryPostfix.validateParent() {
    operand?.parent = this
    operand?.validateParent()
}

fun Primary.validateParent() {
    when (this) {
        is InstanceCreation -> this.validateParent()
        is Literal -> this.validateParent()
        is MethodInvocation -> this.validateParent()
        is Parenthesized -> this.validateParent()
        is This -> this.validateParent()
        is ArrayCreation -> this.validateParent()
        is ArrayAccess -> this.validateParent()
        is FieldAccess -> this.validateParent()
        is InstanceCreationQualified -> this.validateParent()
        else -> (this as Entity).validateParent()
    }
}

fun InstanceCreationQualified.validateParent() {
    cmp?.parent = this
    creation?.parent = this
    primary?.parent = this

    creation?.validateParent()
    primary?.validateParent()
}

fun FieldAccess.validateParent() {
    expression?.parent = this
    expression?.validateParent()
}

fun ArrayAccess.validateParent() {
    expression?.parent = this
    size?.parent = this

    expression?.validateParent()
    size?.validateParent()
}

fun ArrayCreation.validateParent() {
    /*
    * Nothing here
    * */
}

fun ClassLiteral.validateParent() {
    dims?.parent = this
    type?.parent = this

    dims?.validateParent()
    type?.validateParent()
}

fun InstanceCreation.validateParent() {
    classBody?.parent = this
    ctorType?.parent = this
    args?.parent = this
    targs?.parent = this

    classBody?.validateParent()
    ctorType?.validateParent()
    args?.validateParent()
    targs?.validateParent()
}

fun Literal.validateParent() {
    if (this is ClassLiteral) {
        this.validateParent()
    }
}

fun MethodInvocation.validateParent() {
    qualifier?.parent = this
    arguments?.parent = this
    typeArguments?.parent = this

    qualifier?.validateParent()
    arguments?.validateParent()
    typeArguments?.validateParent()
}

fun Parenthesized.validateParent() {
    expression?.parent = this
    expression?.validateParent()
}

fun This.validateParent() {
    type?.parent = this
    type?.validateParent()
}

fun Statement.validateParent() {
    when (this) {
        is Switch -> this.validateParent()
        is Assert -> this.validateParent()
        is Do -> this.validateParent()
        is IfThenElse -> this.validateParent()
        is While -> this.validateParent()
        is Block -> this.validateParent()
        is Return -> this.validateParent()
        is Synchronized -> this.validateParent()
        is Throw -> this.validateParent()
        is BlockStatement -> this.validateParent()
        is Break -> this.validateParent()
        is StatementExpression -> this.validateParent()
        is Continue -> this.validateParent()
        is Yield -> this.validateParent()
        is Try -> this.validateParent()
        else -> (this as Entity).validateParent()
    }
}

fun Try.validateParent() {
    block?.parent = this
    catches?.parent = this
    resSpec?.parent = this
    finallyBlock?.parent = this

    block?.validateParent()
    catches?.validateParent()
    resSpec?.validateParent()
    finallyBlock?.validateParent()
}

fun ResourceSpecification.validateParent() {
    /*
    * Nothing here
    * */
}

fun CatchClauses.validateParent() {
    catchClauses?.map { it?.parent = this }
    catchClauses?.map { it?.validateParent() }
}

fun CatchClause.validateParent() {
    block?.parent = this
    catchParameter?.parent = this

    block?.validateParent()
    catchParameter?.validateParent()
}

fun Yield.validateParent() {
    expression?.parent = this
    expression?.validateParent()
}

fun Continue.validateParent() {
    /*
    * Nothing here
    * */
}

fun StatementExpression.validateParent() {
    expression?.parent = this
    expression?.validateParent()
}

fun Break.validateParent() {
    /*
    * Nothing here
    * */
}

fun Throw.validateParent() {
    expression?.parent = this
    expression?.validateParent()
}

fun Synchronized.validateParent() {
    expression?.parent = this
    block?.parent = this

    expression?.validateParent()
    block?.validateParent()
}

fun Return.validateParent() {
    expression?.parent = this
    expression?.validateParent()
}

fun Block.validateParent() {
    block?.parent = this
    block?.validateParent()
}

fun BlockStatements.validateParent() {
    blockStatements?.map { it?.parent = this }
    blockStatements?.map { it?.validateParent() }
}

fun BlockStatement.validateParent() {
    declaration?.parent = this
    expression?.parent = this
    statement?.parent = this

    declaration?.validateParent()
    expression?.validateParent()
    statement?.validateParent()
}

fun While.validateParent() {
    condition?.parent = this
    statement?.parent= this

    condition?.validateParent()
    statement?.validateParent()
}

fun IfThenElse.validateParent() {
    condition?.parent = this
    thenPart?.parent = this
    elsePart?.parent = this

    condition?.validateParent()
    thenPart?.validateParent()
    elsePart?.validateParent()
}

fun Do.validateParent() {
    condition?.parent = this
    statement?.parent = this

    condition?.validateParent()
    statement?.validateParent()
}

fun Assert.validateParent() {
    expression?.parent = this
    expression2?.parent = this

    expression?.validateParent()
    expression2?.validateParent()
}

fun Switch.validateParent() {
    expression?.parent = this
    blocks?.parent = this
    rules?.parent = this

    expression?.validateParent()
    blocks?.validateParent()
    rules?.validateParent()
}

fun SwitchBlocks.validateParent() {
    blocks?.map { it?.parent = this }
    blocks?.map { it?.validateParent() }
}

fun SwitchRules.validateParent() {
    rules?.map { it?.parent = this }
    rules?.map { it?.validateParent() }
}

fun SwitchRule.validateParent() {
    block?.parent = this
    expression?.parent = this
    throwStatement?.parent = this

    block?.validateParent()
    expression?.validateParent()
    throwStatement?.validateParent()
}
