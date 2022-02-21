/* A Bison parser, made by GNU Bison 3.7.4.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

   Copyright (C) 2007-2015, 2018-2020 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* DO NOT RELY ON FEATURES THAT ARE NOT DOCUMENTED in the manual,
   especially those whose name start with YY_ or yy_.  They are
   private implementation details that can be changed or removed.  */

package parser;



import java.text.MessageFormat;
/* "%code imports" blocks.  */
/* "src/main/resources/Java_16_Grammar.y":166  */
 import lexer.*; 
/* "src/main/resources/Java_16_Grammar.y":167  */
 import tree.*; 
/* "src/main/resources/Java_16_Grammar.y":168  */
 import tree.Compilation.*; 
/* "src/main/resources/Java_16_Grammar.y":169  */
 import tree.Declaration.*; 
/* "src/main/resources/Java_16_Grammar.y":170  */
 import tree.Expression.*; 
/* "src/main/resources/Java_16_Grammar.y":171  */
 import tree.Expression.Primary.*; 
/* "src/main/resources/Java_16_Grammar.y":172  */
 import tree.Statement.*; 
/* "src/main/resources/Java_16_Grammar.y":173  */
 import tree.Type.*; 
/* "src/main/resources/Java_16_Grammar.y":174  */
 import java.util.*; 
/* "src/main/resources/Java_16_Grammar.y":175  */
 @SuppressWarnings("PMD") 

/* "src/main/java/parser/JavaParser.java":65  */

/**
 * A Bison parser, automatically generated from <tt>src/main/resources/Java_16_Grammar.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
public class JavaParser
{
  /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "3.7.4";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";



  /**
   * True if verbose error messages are enabled.
   */
  private boolean yyErrorVerbose = true;

  /**
   * Whether verbose error messages are enabled.
   */
  public final boolean getErrorVerbose() { return yyErrorVerbose; }

  /**
   * Set the verbosity of error messages.
   * @param verbose True to request verbose error messages.
   */
  public final void setErrorVerbose(boolean verbose)
  { yyErrorVerbose = verbose; }




  public enum SymbolKind
  {
    S_YYEOF(0),                    /* "end of file"  */
    S_YYerror(1),                  /* error  */
    S_YYUNDEF(2),                  /* "invalid token"  */
    S_LPAREN(3),                   /* LPAREN  */
    S_RPAREN(4),                   /* RPAREN  */
    S_LBRACE(5),                   /* LBRACE  */
    S_RBRACE(6),                   /* RBRACE  */
    S_LBRACKET(7),                 /* LBRACKET  */
    S_RBRACKET(8),                 /* RBRACKET  */
    S_COMMA(9),                    /* COMMA  */
    S_DOT(10),                     /* DOT  */
    S_SEMICOLON(11),               /* SEMICOLON  */
    S_COLON(12),                   /* COLON  */
    S_DBL_COLON(13),               /* DBL_COLON  */
    S_STAR(14),                    /* STAR  */
    S_SLASH(15),                   /* SLASH  */
    S_PERCENT(16),                 /* PERCENT  */
    S_AMPERSAND(17),               /* AMPERSAND  */
    S_AT(18),                      /* AT  */
    S_LESS(19),                    /* LESS  */
    S_GREATER(20),                 /* GREATER  */
    S_VERTICAL(21),                /* VERTICAL  */
    S_PLUS(22),                    /* PLUS  */
    S_MINUS(23),                   /* MINUS  */
    S_ARROW(24),                   /* ARROW  */
    S_DIAMOND(25),                 /* DIAMOND  */
    S_QUESTION(26),                /* QUESTION  */
    S_CARET(27),                   /* CARET  */
    S_EQUAL(28),                   /* EQUAL  */
    S_TILDE(29),                   /* TILDE  */
    S_EXCLAMATION(30),             /* EXCLAMATION  */
    S_ELLIPSIS(31),                /* ELLIPSIS  */
    S_LESS_EQUAL(32),              /* LESS_EQUAL  */
    S_GREATER_EQUAL(33),           /* GREATER_EQUAL  */
    S_STAR_EQUAL(34),              /* STAR_EQUAL  */
    S_SLASH_EQUAL(35),             /* SLASH_EQUAL  */
    S_PERCENT_EQUAL(36),           /* PERCENT_EQUAL  */
    S_PLUS_EQUAL(37),              /* PLUS_EQUAL  */
    S_MINUS_EQUAL(38),             /* MINUS_EQUAL  */
    S_LESS_LESS_EQUAL(39),         /* LESS_LESS_EQUAL  */
    S_GR_GR_EQUAL(40),             /* GR_GR_EQUAL  */
    S_GR_GR_GR_EQUAL(41),          /* GR_GR_GR_EQUAL  */
    S_AMP_EQUAL(42),               /* AMP_EQUAL  */
    S_CARET_EQUAL(43),             /* CARET_EQUAL  */
    S_VERTICAL_EQUAL(44),          /* VERTICAL_EQUAL  */
    S_DBL_PLUS(45),                /* DBL_PLUS  */
    S_DBL_MINUS(46),               /* DBL_MINUS  */
    S_DBL_VERTICAL(47),            /* DBL_VERTICAL  */
    S_DBL_AMPERSAND(48),           /* DBL_AMPERSAND  */
    S_DBL_EQUAL(49),               /* DBL_EQUAL  */
    S_TRIPL_EQUAL(50),             /* TRIPL_EQUAL  */
    S_NON_EQUAL(51),               /* NON_EQUAL  */
    S_DBL_LESS(52),                /* DBL_LESS  */
    S_DBL_GREATER(53),             /* DBL_GREATER  */
    S_TRIPL_GREATER(54),           /* TRIPL_GREATER  */
    S_IDENTIFIER(55),              /* IDENTIFIER  */
    S_INTEGER_LITERAL(56),         /* INTEGER_LITERAL  */
    S_FLOATING_POINT_LITERAL(57),  /* FLOATING_POINT_LITERAL  */
    S_CHARACTER_LITERAL(58),       /* CHARACTER_LITERAL  */
    S_STRING_LITERAL(59),          /* STRING_LITERAL  */
    S_ABSTRACT(60),                /* ABSTRACT  */
    S_ASSERT(61),                  /* ASSERT  */
    S_BOOLEAN(62),                 /* BOOLEAN  */
    S_BREAK(63),                   /* BREAK  */
    S_BYTE(64),                    /* BYTE  */
    S_CASE(65),                    /* CASE  */
    S_CATCH(66),                   /* CATCH  */
    S_CHAR(67),                    /* CHAR  */
    S_CLASS(68),                   /* CLASS  */
    S_CONTINUE(69),                /* CONTINUE  */
    S_DEFAULT(70),                 /* DEFAULT  */
    S_DO(71),                      /* DO  */
    S_DOUBLE(72),                  /* DOUBLE  */
    S_ELSE(73),                    /* ELSE  */
    S_ENUM(74),                    /* ENUM  */
    S_EXTENDS(75),                 /* EXTENDS  */
    S_FALSE(76),                   /* FALSE  */
    S_FINAL(77),                   /* FINAL  */
    S_FINALLY(78),                 /* FINALLY  */
    S_FLOAT(79),                   /* FLOAT  */
    S_FOR(80),                     /* FOR  */
    S_IF(81),                      /* IF  */
    S_IMPLEMENTS(82),              /* IMPLEMENTS  */
    S_IMPORT(83),                  /* IMPORT  */
    S_INSTANCEOF(84),              /* INSTANCEOF  */
    S_INT(85),                     /* INT  */
    S_INTERFACE(86),               /* INTERFACE  */
    S_LONG(87),                    /* LONG  */
    S_MODULE(88),                  /* MODULE  */
    S_NATIVE(89),                  /* NATIVE  */
    S_NEW(90),                     /* NEW  */
    S_NULL(91),                    /* NULL  */
    S_OPEN(92),                    /* OPEN  */
    S_PACKAGE(93),                 /* PACKAGE  */
    S_PRIVATE(94),                 /* PRIVATE  */
    S_PROTECTED(95),               /* PROTECTED  */
    S_PUBLIC(96),                  /* PUBLIC  */
    S_RECORD(97),                  /* RECORD  */
    S_RETURN(98),                  /* RETURN  */
    S_SHORT(99),                   /* SHORT  */
    S_STATIC(100),                 /* STATIC  */
    S_STRICTFP(101),               /* STRICTFP  */
    S_SUPER(102),                  /* SUPER  */
    S_SWITCH(103),                 /* SWITCH  */
    S_SYNCHRONIZED(104),           /* SYNCHRONIZED  */
    S_THIS(105),                   /* THIS  */
    S_THROW(106),                  /* THROW  */
    S_THROWS(107),                 /* THROWS  */
    S_TRANSIENT(108),              /* TRANSIENT  */
    S_TRANSITIVE(109),             /* TRANSITIVE  */
    S_TRUE(110),                   /* TRUE  */
    S_TRY(111),                    /* TRY  */
    S_VAR(112),                    /* VAR  */
    S_VOID(113),                   /* VOID  */
    S_VOLATILE(114),               /* VOLATILE  */
    S_WHILE(115),                  /* WHILE  */
    S_YIELD(116),                  /* YIELD  */
    S_SHORT_COMMENT(117),          /* SHORT_COMMENT  */
    S_LONG_COMMENT(118),           /* LONG_COMMENT  */
    S_EOS(119),                    /* EOS  */
    S_YYACCEPT(120),               /* $accept  */
    S_Literal(121),                /* Literal  */
    S_CompoundName(122),           /* CompoundName  */
    S_ModifierSeqOpt(123),         /* ModifierSeqOpt  */
    S_ModifierSeq(124),            /* ModifierSeq  */
    S_StandardModifierSeq(125),    /* StandardModifierSeq  */
    S_StandardModifier(126),       /* StandardModifier  */
    S_CompilationUnit(127),        /* CompilationUnit  */
    S_Package(128),                /* Package  */
    S_ImportDeclarationSeqOpt(129), /* ImportDeclarationSeqOpt  */
    S_ImportDeclarationSeq(130),   /* ImportDeclarationSeq  */
    S_ImportDeclaration(131),      /* ImportDeclaration  */
    S_TopLevelComponentSeqOpt(132), /* TopLevelComponentSeqOpt  */
    S_TopLevelComponentSeq(133),   /* TopLevelComponentSeq  */
    S_TopLevelComponent(134),      /* TopLevelComponent  */
    S_Type(135),                   /* Type  */
    S_UnannotatedType(136),        /* UnannotatedType  */
    S_PrimitiveType(137),          /* PrimitiveType  */
    S_ClassDeclaration(138),       /* ClassDeclaration  */
    S_NormalClassDeclaration(139), /* NormalClassDeclaration  */
    S_TypeParametersOpt(140),      /* TypeParametersOpt  */
    S_TypeParameters(141),         /* TypeParameters  */
    S_TypeParameterList(142),      /* TypeParameterList  */
    S_TypeParameter(143),          /* TypeParameter  */
    S_TypeParameterTail(144),      /* TypeParameterTail  */
    S_ClassExtendsOpt(145),        /* ClassExtendsOpt  */
    S_ClassImplementsOpt(146),     /* ClassImplementsOpt  */
    S_ClassTypeList1(147),         /* ClassTypeList1  */
    S_ClassTypeList2(148),         /* ClassTypeList2  */
    S_ClassBodyOpt(149),           /* ClassBodyOpt  */
    S_ClassBody(150),              /* ClassBody  */
    S_ClassBodyDeclarationSeq(151), /* ClassBodyDeclarationSeq  */
    S_ClassBodyDeclaration(152),   /* ClassBodyDeclaration  */
    S_PureBodyDeclaration(153),    /* PureBodyDeclaration  */
    S_ConstructorDeclaration(154), /* ConstructorDeclaration  */
    S_ConstructorDeclarator(155),  /* ConstructorDeclarator  */
    S_ConstructorBody(156),        /* ConstructorBody  */
    S_ExplicitConstructorInvocation(157), /* ExplicitConstructorInvocation  */
    S_EnumDeclaration(158),        /* EnumDeclaration  */
    S_EnumBody(159),               /* EnumBody  */
    S_EnumConstantListOpt(160),    /* EnumConstantListOpt  */
    S_EnumConstantList(161),       /* EnumConstantList  */
    S_EnumConstant(162),           /* EnumConstant  */
    S_EnumBodyDeclarationsOpt(163), /* EnumBodyDeclarationsOpt  */
    S_RecordDeclaration(164),      /* RecordDeclaration  */
    S_RecordHeader(165),           /* RecordHeader  */
    S_RecordComponentListOpt(166), /* RecordComponentListOpt  */
    S_RecordComponent(167),        /* RecordComponent  */
    S_RecordBody(168),             /* RecordBody  */
    S_RecordBodyDeclarationSeq(169), /* RecordBodyDeclarationSeq  */
    S_RecordBodyDeclaration(170),  /* RecordBodyDeclaration  */
    S_FieldDeclaration(171),       /* FieldDeclaration  */
    S_VariableDeclaratorList(172), /* VariableDeclaratorList  */
    S_VariableDeclarator(173),     /* VariableDeclarator  */
    S_ArrayInitializer(174),       /* ArrayInitializer  */
    S_VariableInitializerListOpt(175), /* VariableInitializerListOpt  */
    S_VariableInitializerList(176), /* VariableInitializerList  */
    S_VariableInitializer(177),    /* VariableInitializer  */
    S_MethodDeclaration(178),      /* MethodDeclaration  */
    S_MethodHeader(179),           /* MethodHeader  */
    S_MethodDeclarator(180),       /* MethodDeclarator  */
    S_FormalParameterList(181),    /* FormalParameterList  */
    S_FormalParameter(182),        /* FormalParameter  */
    S_FormalParameterTail(183),    /* FormalParameterTail  */
    S_ThrowsOpt(184),              /* ThrowsOpt  */
    S_MethodBody(185),             /* MethodBody  */
    S_DimsOpt(186),                /* DimsOpt  */
    S_Dims(187),                   /* Dims  */
    S_Dim(188),                    /* Dim  */
    S_InterfaceDeclaration(189),   /* InterfaceDeclaration  */
    S_NormalInterfaceDeclaration(190), /* NormalInterfaceDeclaration  */
    S_InterfaceExtendsOpt(191),    /* InterfaceExtendsOpt  */
    S_InterfaceExtends(192),       /* InterfaceExtends  */
    S_InterfaceBody(193),          /* InterfaceBody  */
    S_InterfaceMemberDeclarationSeq(194), /* InterfaceMemberDeclarationSeq  */
    S_InterfaceMemberDeclaration(195), /* InterfaceMemberDeclaration  */
    S_ConstantDeclaration(196),    /* ConstantDeclaration  */
    S_InterfaceMethodDeclaration(197), /* InterfaceMethodDeclaration  */
    S_AnnotationInterfaceDeclaration(198), /* AnnotationInterfaceDeclaration  */
    S_AnnotationInterfaceBody(199), /* AnnotationInterfaceBody  */
    S_AnnotationInterfaceMemberDeclarationSeq(200), /* AnnotationInterfaceMemberDeclarationSeq  */
    S_AnnotationInterfaceMemberDeclaration(201), /* AnnotationInterfaceMemberDeclaration  */
    S_AnnotationInterfaceElementDeclaration(202), /* AnnotationInterfaceElementDeclaration  */
    S_DefaultValueOpt(203),        /* DefaultValueOpt  */
    S_Block(204),                  /* Block  */
    S_BlockStatementSeq(205),      /* BlockStatementSeq  */
    S_BlockStatement(206),         /* BlockStatement  */
    S_LocalVariableDeclaration(207), /* LocalVariableDeclaration  */
    S_Statement(208),              /* Statement  */
    S_SimpleStatement(209),        /* SimpleStatement  */
    S_LabeledStatement(210),       /* LabeledStatement  */
    S_StatementExpression(211),    /* StatementExpression  */
    S_IfThenElseStatement(212),    /* IfThenElseStatement  */
    S_ElsePartOpt(213),            /* ElsePartOpt  */
    S_SwitchBlock(214),            /* SwitchBlock  */
    S_SwitchRuleSeq(215),          /* SwitchRuleSeq  */
    S_SwitchRule(216),             /* SwitchRule  */
    S_SwitchBlockStatementGroupSeq(217), /* SwitchBlockStatementGroupSeq  */
    S_SwitchBlockStatementGroup(218), /* SwitchBlockStatementGroup  */
    S_SwitchLabelSeq(219),         /* SwitchLabelSeq  */
    S_SwitchLabel(220),            /* SwitchLabel  */
    S_CaseExpressionList(221),     /* CaseExpressionList  */
    S_WhileStatement(222),         /* WhileStatement  */
    S_ForStatement(223),           /* ForStatement  */
    S_BasicForStatement(224),      /* BasicForStatement  */
    S_ForInitOpt(225),             /* ForInitOpt  */
    S_ExpressionOpt(226),          /* ExpressionOpt  */
    S_StatementExpressionList(227), /* StatementExpressionList  */
    S_StatementExpressionListOpt(228), /* StatementExpressionListOpt  */
    S_EnhancedForStatement(229),   /* EnhancedForStatement  */
    S_CatchesOpt(230),             /* CatchesOpt  */
    S_Catches(231),                /* Catches  */
    S_CatchClause(232),            /* CatchClause  */
    S_CatchFormalParameter(233),   /* CatchFormalParameter  */
    S_CatchType(234),              /* CatchType  */
    S_FinallyOpt(235),             /* FinallyOpt  */
    S_Finally(236),                /* Finally  */
    S_ResourceSpecification(237),  /* ResourceSpecification  */
    S_ResourceSeq(238),            /* ResourceSeq  */
    S_Resource(239),               /* Resource  */
    S_Pattern(240),                /* Pattern  */
    S_Primary(241),                /* Primary  */
    S_ClassInstanceCreationExpression(242), /* ClassInstanceCreationExpression  */
    S_UnqualifiedClassInstanceCreationExpression(243), /* UnqualifiedClassInstanceCreationExpression  */
    S_ClassOrInterfaceTypeToInstantiate(244), /* ClassOrInterfaceTypeToInstantiate  */
    S_AnnotatedCompoundName(245),  /* AnnotatedCompoundName  */
    S_TypeArgumentsOpt(246),       /* TypeArgumentsOpt  */
    S_TypeArguments(247),          /* TypeArguments  */
    S_TypeArgumentList(248),       /* TypeArgumentList  */
    S_TypeArgument(249),           /* TypeArgument  */
    S_FieldAccess(250),            /* FieldAccess  */
    S_ArrayAccess(251),            /* ArrayAccess  */
    S_MethodInvocation(252),       /* MethodInvocation  */
    S_Arguments(253),              /* Arguments  */
    S_ArgumentList(254),           /* ArgumentList  */
    S_MethodReference(255),        /* MethodReference  */
    S_ArrayCreationExpression(256), /* ArrayCreationExpression  */
    S_DimExprs(257),               /* DimExprs  */
    S_DimExpr(258),                /* DimExpr  */
    S_Expression(259),             /* Expression  */
    S_LambdaExpression(260),       /* LambdaExpression  */
    S_LambdaParameters(261),       /* LambdaParameters  */
    S_LambdaParameterList(262),    /* LambdaParameterList  */
    S_LambdaParameter(263),        /* LambdaParameter  */
    S_AssignmentExpression(264),   /* AssignmentExpression  */
    S_Assignment(265),             /* Assignment  */
    S_LeftHandSide(266),           /* LeftHandSide  */
    S_AssignmentOperator(267),     /* AssignmentOperator  */
    S_ConditionalExpression(268),  /* ConditionalExpression  */
    S_ConditionalOrTail(269),      /* ConditionalOrTail  */
    S_ConditionalOrExpression(270), /* ConditionalOrExpression  */
    S_ConditionalAndExpression(271), /* ConditionalAndExpression  */
    S_InclusiveOrExpression(272),  /* InclusiveOrExpression  */
    S_ExclusiveOrExpression(273),  /* ExclusiveOrExpression  */
    S_AndExpression(274),          /* AndExpression  */
    S_EqualityExpression(275),     /* EqualityExpression  */
    S_RelationalExpression(276),   /* RelationalExpression  */
    S_InstanceofExpression(277),   /* InstanceofExpression  */
    S_ShiftExpression(278),        /* ShiftExpression  */
    S_AdditiveExpression(279),     /* AdditiveExpression  */
    S_MultiplicativeExpression(280), /* MultiplicativeExpression  */
    S_UnaryExpression(281),        /* UnaryExpression  */
    S_PreIncrementExpression(282), /* PreIncrementExpression  */
    S_PreDecrementExpression(283), /* PreDecrementExpression  */
    S_UnaryExpressionNotPlusMinus(284), /* UnaryExpressionNotPlusMinus  */
    S_PostfixExpression(285),      /* PostfixExpression  */
    S_PostIncrementExpression(286), /* PostIncrementExpression  */
    S_PostDecrementExpression(287), /* PostDecrementExpression  */
    S_SwitchExpression(288),       /* SwitchExpression  */
    S_AnnotationSeqOpt(289),       /* AnnotationSeqOpt  */
    S_AnnotationSeq(290),          /* AnnotationSeq  */
    S_Annotation(291),             /* Annotation  */
    S_AnnoParameterList(292),      /* AnnoParameterList  */
    S_ElementValue(293),           /* ElementValue  */
    S_ElementValueListOpt(294);    /* ElementValueListOpt  */


    private final int yycode_;

    SymbolKind (int n) {
      this.yycode_ = n;
    }

    private static final SymbolKind[] values_ = {
      SymbolKind.S_YYEOF,
      SymbolKind.S_YYerror,
      SymbolKind.S_YYUNDEF,
      SymbolKind.S_LPAREN,
      SymbolKind.S_RPAREN,
      SymbolKind.S_LBRACE,
      SymbolKind.S_RBRACE,
      SymbolKind.S_LBRACKET,
      SymbolKind.S_RBRACKET,
      SymbolKind.S_COMMA,
      SymbolKind.S_DOT,
      SymbolKind.S_SEMICOLON,
      SymbolKind.S_COLON,
      SymbolKind.S_DBL_COLON,
      SymbolKind.S_STAR,
      SymbolKind.S_SLASH,
      SymbolKind.S_PERCENT,
      SymbolKind.S_AMPERSAND,
      SymbolKind.S_AT,
      SymbolKind.S_LESS,
      SymbolKind.S_GREATER,
      SymbolKind.S_VERTICAL,
      SymbolKind.S_PLUS,
      SymbolKind.S_MINUS,
      SymbolKind.S_ARROW,
      SymbolKind.S_DIAMOND,
      SymbolKind.S_QUESTION,
      SymbolKind.S_CARET,
      SymbolKind.S_EQUAL,
      SymbolKind.S_TILDE,
      SymbolKind.S_EXCLAMATION,
      SymbolKind.S_ELLIPSIS,
      SymbolKind.S_LESS_EQUAL,
      SymbolKind.S_GREATER_EQUAL,
      SymbolKind.S_STAR_EQUAL,
      SymbolKind.S_SLASH_EQUAL,
      SymbolKind.S_PERCENT_EQUAL,
      SymbolKind.S_PLUS_EQUAL,
      SymbolKind.S_MINUS_EQUAL,
      SymbolKind.S_LESS_LESS_EQUAL,
      SymbolKind.S_GR_GR_EQUAL,
      SymbolKind.S_GR_GR_GR_EQUAL,
      SymbolKind.S_AMP_EQUAL,
      SymbolKind.S_CARET_EQUAL,
      SymbolKind.S_VERTICAL_EQUAL,
      SymbolKind.S_DBL_PLUS,
      SymbolKind.S_DBL_MINUS,
      SymbolKind.S_DBL_VERTICAL,
      SymbolKind.S_DBL_AMPERSAND,
      SymbolKind.S_DBL_EQUAL,
      SymbolKind.S_TRIPL_EQUAL,
      SymbolKind.S_NON_EQUAL,
      SymbolKind.S_DBL_LESS,
      SymbolKind.S_DBL_GREATER,
      SymbolKind.S_TRIPL_GREATER,
      SymbolKind.S_IDENTIFIER,
      SymbolKind.S_INTEGER_LITERAL,
      SymbolKind.S_FLOATING_POINT_LITERAL,
      SymbolKind.S_CHARACTER_LITERAL,
      SymbolKind.S_STRING_LITERAL,
      SymbolKind.S_ABSTRACT,
      SymbolKind.S_ASSERT,
      SymbolKind.S_BOOLEAN,
      SymbolKind.S_BREAK,
      SymbolKind.S_BYTE,
      SymbolKind.S_CASE,
      SymbolKind.S_CATCH,
      SymbolKind.S_CHAR,
      SymbolKind.S_CLASS,
      SymbolKind.S_CONTINUE,
      SymbolKind.S_DEFAULT,
      SymbolKind.S_DO,
      SymbolKind.S_DOUBLE,
      SymbolKind.S_ELSE,
      SymbolKind.S_ENUM,
      SymbolKind.S_EXTENDS,
      SymbolKind.S_FALSE,
      SymbolKind.S_FINAL,
      SymbolKind.S_FINALLY,
      SymbolKind.S_FLOAT,
      SymbolKind.S_FOR,
      SymbolKind.S_IF,
      SymbolKind.S_IMPLEMENTS,
      SymbolKind.S_IMPORT,
      SymbolKind.S_INSTANCEOF,
      SymbolKind.S_INT,
      SymbolKind.S_INTERFACE,
      SymbolKind.S_LONG,
      SymbolKind.S_MODULE,
      SymbolKind.S_NATIVE,
      SymbolKind.S_NEW,
      SymbolKind.S_NULL,
      SymbolKind.S_OPEN,
      SymbolKind.S_PACKAGE,
      SymbolKind.S_PRIVATE,
      SymbolKind.S_PROTECTED,
      SymbolKind.S_PUBLIC,
      SymbolKind.S_RECORD,
      SymbolKind.S_RETURN,
      SymbolKind.S_SHORT,
      SymbolKind.S_STATIC,
      SymbolKind.S_STRICTFP,
      SymbolKind.S_SUPER,
      SymbolKind.S_SWITCH,
      SymbolKind.S_SYNCHRONIZED,
      SymbolKind.S_THIS,
      SymbolKind.S_THROW,
      SymbolKind.S_THROWS,
      SymbolKind.S_TRANSIENT,
      SymbolKind.S_TRANSITIVE,
      SymbolKind.S_TRUE,
      SymbolKind.S_TRY,
      SymbolKind.S_VAR,
      SymbolKind.S_VOID,
      SymbolKind.S_VOLATILE,
      SymbolKind.S_WHILE,
      SymbolKind.S_YIELD,
      SymbolKind.S_SHORT_COMMENT,
      SymbolKind.S_LONG_COMMENT,
      SymbolKind.S_EOS,
      SymbolKind.S_YYACCEPT,
      SymbolKind.S_Literal,
      SymbolKind.S_CompoundName,
      SymbolKind.S_ModifierSeqOpt,
      SymbolKind.S_ModifierSeq,
      SymbolKind.S_StandardModifierSeq,
      SymbolKind.S_StandardModifier,
      SymbolKind.S_CompilationUnit,
      SymbolKind.S_Package,
      SymbolKind.S_ImportDeclarationSeqOpt,
      SymbolKind.S_ImportDeclarationSeq,
      SymbolKind.S_ImportDeclaration,
      SymbolKind.S_TopLevelComponentSeqOpt,
      SymbolKind.S_TopLevelComponentSeq,
      SymbolKind.S_TopLevelComponent,
      SymbolKind.S_Type,
      SymbolKind.S_UnannotatedType,
      SymbolKind.S_PrimitiveType,
      SymbolKind.S_ClassDeclaration,
      SymbolKind.S_NormalClassDeclaration,
      SymbolKind.S_TypeParametersOpt,
      SymbolKind.S_TypeParameters,
      SymbolKind.S_TypeParameterList,
      SymbolKind.S_TypeParameter,
      SymbolKind.S_TypeParameterTail,
      SymbolKind.S_ClassExtendsOpt,
      SymbolKind.S_ClassImplementsOpt,
      SymbolKind.S_ClassTypeList1,
      SymbolKind.S_ClassTypeList2,
      SymbolKind.S_ClassBodyOpt,
      SymbolKind.S_ClassBody,
      SymbolKind.S_ClassBodyDeclarationSeq,
      SymbolKind.S_ClassBodyDeclaration,
      SymbolKind.S_PureBodyDeclaration,
      SymbolKind.S_ConstructorDeclaration,
      SymbolKind.S_ConstructorDeclarator,
      SymbolKind.S_ConstructorBody,
      SymbolKind.S_ExplicitConstructorInvocation,
      SymbolKind.S_EnumDeclaration,
      SymbolKind.S_EnumBody,
      SymbolKind.S_EnumConstantListOpt,
      SymbolKind.S_EnumConstantList,
      SymbolKind.S_EnumConstant,
      SymbolKind.S_EnumBodyDeclarationsOpt,
      SymbolKind.S_RecordDeclaration,
      SymbolKind.S_RecordHeader,
      SymbolKind.S_RecordComponentListOpt,
      SymbolKind.S_RecordComponent,
      SymbolKind.S_RecordBody,
      SymbolKind.S_RecordBodyDeclarationSeq,
      SymbolKind.S_RecordBodyDeclaration,
      SymbolKind.S_FieldDeclaration,
      SymbolKind.S_VariableDeclaratorList,
      SymbolKind.S_VariableDeclarator,
      SymbolKind.S_ArrayInitializer,
      SymbolKind.S_VariableInitializerListOpt,
      SymbolKind.S_VariableInitializerList,
      SymbolKind.S_VariableInitializer,
      SymbolKind.S_MethodDeclaration,
      SymbolKind.S_MethodHeader,
      SymbolKind.S_MethodDeclarator,
      SymbolKind.S_FormalParameterList,
      SymbolKind.S_FormalParameter,
      SymbolKind.S_FormalParameterTail,
      SymbolKind.S_ThrowsOpt,
      SymbolKind.S_MethodBody,
      SymbolKind.S_DimsOpt,
      SymbolKind.S_Dims,
      SymbolKind.S_Dim,
      SymbolKind.S_InterfaceDeclaration,
      SymbolKind.S_NormalInterfaceDeclaration,
      SymbolKind.S_InterfaceExtendsOpt,
      SymbolKind.S_InterfaceExtends,
      SymbolKind.S_InterfaceBody,
      SymbolKind.S_InterfaceMemberDeclarationSeq,
      SymbolKind.S_InterfaceMemberDeclaration,
      SymbolKind.S_ConstantDeclaration,
      SymbolKind.S_InterfaceMethodDeclaration,
      SymbolKind.S_AnnotationInterfaceDeclaration,
      SymbolKind.S_AnnotationInterfaceBody,
      SymbolKind.S_AnnotationInterfaceMemberDeclarationSeq,
      SymbolKind.S_AnnotationInterfaceMemberDeclaration,
      SymbolKind.S_AnnotationInterfaceElementDeclaration,
      SymbolKind.S_DefaultValueOpt,
      SymbolKind.S_Block,
      SymbolKind.S_BlockStatementSeq,
      SymbolKind.S_BlockStatement,
      SymbolKind.S_LocalVariableDeclaration,
      SymbolKind.S_Statement,
      SymbolKind.S_SimpleStatement,
      SymbolKind.S_LabeledStatement,
      SymbolKind.S_StatementExpression,
      SymbolKind.S_IfThenElseStatement,
      SymbolKind.S_ElsePartOpt,
      SymbolKind.S_SwitchBlock,
      SymbolKind.S_SwitchRuleSeq,
      SymbolKind.S_SwitchRule,
      SymbolKind.S_SwitchBlockStatementGroupSeq,
      SymbolKind.S_SwitchBlockStatementGroup,
      SymbolKind.S_SwitchLabelSeq,
      SymbolKind.S_SwitchLabel,
      SymbolKind.S_CaseExpressionList,
      SymbolKind.S_WhileStatement,
      SymbolKind.S_ForStatement,
      SymbolKind.S_BasicForStatement,
      SymbolKind.S_ForInitOpt,
      SymbolKind.S_ExpressionOpt,
      SymbolKind.S_StatementExpressionList,
      SymbolKind.S_StatementExpressionListOpt,
      SymbolKind.S_EnhancedForStatement,
      SymbolKind.S_CatchesOpt,
      SymbolKind.S_Catches,
      SymbolKind.S_CatchClause,
      SymbolKind.S_CatchFormalParameter,
      SymbolKind.S_CatchType,
      SymbolKind.S_FinallyOpt,
      SymbolKind.S_Finally,
      SymbolKind.S_ResourceSpecification,
      SymbolKind.S_ResourceSeq,
      SymbolKind.S_Resource,
      SymbolKind.S_Pattern,
      SymbolKind.S_Primary,
      SymbolKind.S_ClassInstanceCreationExpression,
      SymbolKind.S_UnqualifiedClassInstanceCreationExpression,
      SymbolKind.S_ClassOrInterfaceTypeToInstantiate,
      SymbolKind.S_AnnotatedCompoundName,
      SymbolKind.S_TypeArgumentsOpt,
      SymbolKind.S_TypeArguments,
      SymbolKind.S_TypeArgumentList,
      SymbolKind.S_TypeArgument,
      SymbolKind.S_FieldAccess,
      SymbolKind.S_ArrayAccess,
      SymbolKind.S_MethodInvocation,
      SymbolKind.S_Arguments,
      SymbolKind.S_ArgumentList,
      SymbolKind.S_MethodReference,
      SymbolKind.S_ArrayCreationExpression,
      SymbolKind.S_DimExprs,
      SymbolKind.S_DimExpr,
      SymbolKind.S_Expression,
      SymbolKind.S_LambdaExpression,
      SymbolKind.S_LambdaParameters,
      SymbolKind.S_LambdaParameterList,
      SymbolKind.S_LambdaParameter,
      SymbolKind.S_AssignmentExpression,
      SymbolKind.S_Assignment,
      SymbolKind.S_LeftHandSide,
      SymbolKind.S_AssignmentOperator,
      SymbolKind.S_ConditionalExpression,
      SymbolKind.S_ConditionalOrTail,
      SymbolKind.S_ConditionalOrExpression,
      SymbolKind.S_ConditionalAndExpression,
      SymbolKind.S_InclusiveOrExpression,
      SymbolKind.S_ExclusiveOrExpression,
      SymbolKind.S_AndExpression,
      SymbolKind.S_EqualityExpression,
      SymbolKind.S_RelationalExpression,
      SymbolKind.S_InstanceofExpression,
      SymbolKind.S_ShiftExpression,
      SymbolKind.S_AdditiveExpression,
      SymbolKind.S_MultiplicativeExpression,
      SymbolKind.S_UnaryExpression,
      SymbolKind.S_PreIncrementExpression,
      SymbolKind.S_PreDecrementExpression,
      SymbolKind.S_UnaryExpressionNotPlusMinus,
      SymbolKind.S_PostfixExpression,
      SymbolKind.S_PostIncrementExpression,
      SymbolKind.S_PostDecrementExpression,
      SymbolKind.S_SwitchExpression,
      SymbolKind.S_AnnotationSeqOpt,
      SymbolKind.S_AnnotationSeq,
      SymbolKind.S_Annotation,
      SymbolKind.S_AnnoParameterList,
      SymbolKind.S_ElementValue,
      SymbolKind.S_ElementValueListOpt
    };

    static final SymbolKind get(int code) {
      return values_[code];
    }

    public final int getCode() {
      return this.yycode_;
    }

    /* YYNAMES_[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
       First, the terminals, then, starting at \a YYNTOKENS_, nonterminals.  */
    private static final String[] yynames_ = yynames_init();
  private static final String[] yynames_init()
  {
    return new String[]
    {
  "end of file", "error", "invalid token", "LPAREN", "RPAREN", "LBRACE",
  "RBRACE", "LBRACKET", "RBRACKET", "COMMA", "DOT", "SEMICOLON", "COLON",
  "DBL_COLON", "STAR", "SLASH", "PERCENT", "AMPERSAND", "AT", "LESS",
  "GREATER", "VERTICAL", "PLUS", "MINUS", "ARROW", "DIAMOND", "QUESTION",
  "CARET", "EQUAL", "TILDE", "EXCLAMATION", "ELLIPSIS", "LESS_EQUAL",
  "GREATER_EQUAL", "STAR_EQUAL", "SLASH_EQUAL", "PERCENT_EQUAL",
  "PLUS_EQUAL", "MINUS_EQUAL", "LESS_LESS_EQUAL", "GR_GR_EQUAL",
  "GR_GR_GR_EQUAL", "AMP_EQUAL", "CARET_EQUAL", "VERTICAL_EQUAL",
  "DBL_PLUS", "DBL_MINUS", "DBL_VERTICAL", "DBL_AMPERSAND", "DBL_EQUAL",
  "TRIPL_EQUAL", "NON_EQUAL", "DBL_LESS", "DBL_GREATER", "TRIPL_GREATER",
  "IDENTIFIER", "INTEGER_LITERAL", "FLOATING_POINT_LITERAL",
  "CHARACTER_LITERAL", "STRING_LITERAL", "ABSTRACT", "ASSERT", "BOOLEAN",
  "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONTINUE", "DEFAULT",
  "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY",
  "FLOAT", "FOR", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT",
  "INTERFACE", "LONG", "MODULE", "NATIVE", "NEW", "NULL", "OPEN",
  "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RECORD", "RETURN", "SHORT",
  "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW",
  "THROWS", "TRANSIENT", "TRANSITIVE", "TRUE", "TRY", "VAR", "VOID",
  "VOLATILE", "WHILE", "YIELD", "SHORT_COMMENT", "LONG_COMMENT", "EOS",
  "$accept", "Literal", "CompoundName", "ModifierSeqOpt", "ModifierSeq",
  "StandardModifierSeq", "StandardModifier", "CompilationUnit", "Package",
  "ImportDeclarationSeqOpt", "ImportDeclarationSeq", "ImportDeclaration",
  "TopLevelComponentSeqOpt", "TopLevelComponentSeq", "TopLevelComponent",
  "Type", "UnannotatedType", "PrimitiveType", "ClassDeclaration",
  "NormalClassDeclaration", "TypeParametersOpt", "TypeParameters",
  "TypeParameterList", "TypeParameter", "TypeParameterTail",
  "ClassExtendsOpt", "ClassImplementsOpt", "ClassTypeList1",
  "ClassTypeList2", "ClassBodyOpt", "ClassBody", "ClassBodyDeclarationSeq",
  "ClassBodyDeclaration", "PureBodyDeclaration", "ConstructorDeclaration",
  "ConstructorDeclarator", "ConstructorBody",
  "ExplicitConstructorInvocation", "EnumDeclaration", "EnumBody",
  "EnumConstantListOpt", "EnumConstantList", "EnumConstant",
  "EnumBodyDeclarationsOpt", "RecordDeclaration", "RecordHeader",
  "RecordComponentListOpt", "RecordComponent", "RecordBody",
  "RecordBodyDeclarationSeq", "RecordBodyDeclaration", "FieldDeclaration",
  "VariableDeclaratorList", "VariableDeclarator", "ArrayInitializer",
  "VariableInitializerListOpt", "VariableInitializerList",
  "VariableInitializer", "MethodDeclaration", "MethodHeader",
  "MethodDeclarator", "FormalParameterList", "FormalParameter",
  "FormalParameterTail", "ThrowsOpt", "MethodBody", "DimsOpt", "Dims",
  "Dim", "InterfaceDeclaration", "NormalInterfaceDeclaration",
  "InterfaceExtendsOpt", "InterfaceExtends", "InterfaceBody",
  "InterfaceMemberDeclarationSeq", "InterfaceMemberDeclaration",
  "ConstantDeclaration", "InterfaceMethodDeclaration",
  "AnnotationInterfaceDeclaration", "AnnotationInterfaceBody",
  "AnnotationInterfaceMemberDeclarationSeq",
  "AnnotationInterfaceMemberDeclaration",
  "AnnotationInterfaceElementDeclaration", "DefaultValueOpt", "Block",
  "BlockStatementSeq", "BlockStatement", "LocalVariableDeclaration",
  "Statement", "SimpleStatement", "LabeledStatement",
  "StatementExpression", "IfThenElseStatement", "ElsePartOpt",
  "SwitchBlock", "SwitchRuleSeq", "SwitchRule",
  "SwitchBlockStatementGroupSeq", "SwitchBlockStatementGroup",
  "SwitchLabelSeq", "SwitchLabel", "CaseExpressionList", "WhileStatement",
  "ForStatement", "BasicForStatement", "ForInitOpt", "ExpressionOpt",
  "StatementExpressionList", "StatementExpressionListOpt",
  "EnhancedForStatement", "CatchesOpt", "Catches", "CatchClause",
  "CatchFormalParameter", "CatchType", "FinallyOpt", "Finally",
  "ResourceSpecification", "ResourceSeq", "Resource", "Pattern", "Primary",
  "ClassInstanceCreationExpression",
  "UnqualifiedClassInstanceCreationExpression",
  "ClassOrInterfaceTypeToInstantiate", "AnnotatedCompoundName",
  "TypeArgumentsOpt", "TypeArguments", "TypeArgumentList", "TypeArgument",
  "FieldAccess", "ArrayAccess", "MethodInvocation", "Arguments",
  "ArgumentList", "MethodReference", "ArrayCreationExpression", "DimExprs",
  "DimExpr", "Expression", "LambdaExpression", "LambdaParameters",
  "LambdaParameterList", "LambdaParameter", "AssignmentExpression",
  "Assignment", "LeftHandSide", "AssignmentOperator",
  "ConditionalExpression", "ConditionalOrTail", "ConditionalOrExpression",
  "ConditionalAndExpression", "InclusiveOrExpression",
  "ExclusiveOrExpression", "AndExpression", "EqualityExpression",
  "RelationalExpression", "InstanceofExpression", "ShiftExpression",
  "AdditiveExpression", "MultiplicativeExpression", "UnaryExpression",
  "PreIncrementExpression", "PreDecrementExpression",
  "UnaryExpressionNotPlusMinus", "PostfixExpression",
  "PostIncrementExpression", "PostDecrementExpression", "SwitchExpression",
  "AnnotationSeqOpt", "AnnotationSeq", "Annotation", "AnnoParameterList",
  "ElementValue", "ElementValueListOpt", null
    };
  }

    /* The user-facing name of this symbol.  */
    public final String getName() {
      return yynames_[yycode_];
    }
  };


  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>JavaParser</tt>.
   */
  public interface Lexer {
    /* Token kinds.  */
    /** Token "end of file", to be returned by the scanner.  */
    static final int YYEOF = 0;
    /** Token error, to be returned by the scanner.  */
    static final int YYerror = 256;
    /** Token "invalid token", to be returned by the scanner.  */
    static final int YYUNDEF = 257;
    /** Token LPAREN, to be returned by the scanner.  */
    static final int LPAREN = 258;
    /** Token RPAREN, to be returned by the scanner.  */
    static final int RPAREN = 259;
    /** Token LBRACE, to be returned by the scanner.  */
    static final int LBRACE = 260;
    /** Token RBRACE, to be returned by the scanner.  */
    static final int RBRACE = 261;
    /** Token LBRACKET, to be returned by the scanner.  */
    static final int LBRACKET = 262;
    /** Token RBRACKET, to be returned by the scanner.  */
    static final int RBRACKET = 263;
    /** Token COMMA, to be returned by the scanner.  */
    static final int COMMA = 264;
    /** Token DOT, to be returned by the scanner.  */
    static final int DOT = 265;
    /** Token SEMICOLON, to be returned by the scanner.  */
    static final int SEMICOLON = 266;
    /** Token COLON, to be returned by the scanner.  */
    static final int COLON = 267;
    /** Token DBL_COLON, to be returned by the scanner.  */
    static final int DBL_COLON = 268;
    /** Token STAR, to be returned by the scanner.  */
    static final int STAR = 269;
    /** Token SLASH, to be returned by the scanner.  */
    static final int SLASH = 270;
    /** Token PERCENT, to be returned by the scanner.  */
    static final int PERCENT = 271;
    /** Token AMPERSAND, to be returned by the scanner.  */
    static final int AMPERSAND = 272;
    /** Token AT, to be returned by the scanner.  */
    static final int AT = 273;
    /** Token LESS, to be returned by the scanner.  */
    static final int LESS = 274;
    /** Token GREATER, to be returned by the scanner.  */
    static final int GREATER = 275;
    /** Token VERTICAL, to be returned by the scanner.  */
    static final int VERTICAL = 276;
    /** Token PLUS, to be returned by the scanner.  */
    static final int PLUS = 277;
    /** Token MINUS, to be returned by the scanner.  */
    static final int MINUS = 278;
    /** Token ARROW, to be returned by the scanner.  */
    static final int ARROW = 279;
    /** Token DIAMOND, to be returned by the scanner.  */
    static final int DIAMOND = 280;
    /** Token QUESTION, to be returned by the scanner.  */
    static final int QUESTION = 281;
    /** Token CARET, to be returned by the scanner.  */
    static final int CARET = 282;
    /** Token EQUAL, to be returned by the scanner.  */
    static final int EQUAL = 283;
    /** Token TILDE, to be returned by the scanner.  */
    static final int TILDE = 284;
    /** Token EXCLAMATION, to be returned by the scanner.  */
    static final int EXCLAMATION = 285;
    /** Token ELLIPSIS, to be returned by the scanner.  */
    static final int ELLIPSIS = 286;
    /** Token LESS_EQUAL, to be returned by the scanner.  */
    static final int LESS_EQUAL = 287;
    /** Token GREATER_EQUAL, to be returned by the scanner.  */
    static final int GREATER_EQUAL = 288;
    /** Token STAR_EQUAL, to be returned by the scanner.  */
    static final int STAR_EQUAL = 289;
    /** Token SLASH_EQUAL, to be returned by the scanner.  */
    static final int SLASH_EQUAL = 290;
    /** Token PERCENT_EQUAL, to be returned by the scanner.  */
    static final int PERCENT_EQUAL = 291;
    /** Token PLUS_EQUAL, to be returned by the scanner.  */
    static final int PLUS_EQUAL = 292;
    /** Token MINUS_EQUAL, to be returned by the scanner.  */
    static final int MINUS_EQUAL = 293;
    /** Token LESS_LESS_EQUAL, to be returned by the scanner.  */
    static final int LESS_LESS_EQUAL = 294;
    /** Token GR_GR_EQUAL, to be returned by the scanner.  */
    static final int GR_GR_EQUAL = 295;
    /** Token GR_GR_GR_EQUAL, to be returned by the scanner.  */
    static final int GR_GR_GR_EQUAL = 296;
    /** Token AMP_EQUAL, to be returned by the scanner.  */
    static final int AMP_EQUAL = 297;
    /** Token CARET_EQUAL, to be returned by the scanner.  */
    static final int CARET_EQUAL = 298;
    /** Token VERTICAL_EQUAL, to be returned by the scanner.  */
    static final int VERTICAL_EQUAL = 299;
    /** Token DBL_PLUS, to be returned by the scanner.  */
    static final int DBL_PLUS = 300;
    /** Token DBL_MINUS, to be returned by the scanner.  */
    static final int DBL_MINUS = 301;
    /** Token DBL_VERTICAL, to be returned by the scanner.  */
    static final int DBL_VERTICAL = 302;
    /** Token DBL_AMPERSAND, to be returned by the scanner.  */
    static final int DBL_AMPERSAND = 303;
    /** Token DBL_EQUAL, to be returned by the scanner.  */
    static final int DBL_EQUAL = 304;
    /** Token TRIPL_EQUAL, to be returned by the scanner.  */
    static final int TRIPL_EQUAL = 305;
    /** Token NON_EQUAL, to be returned by the scanner.  */
    static final int NON_EQUAL = 306;
    /** Token DBL_LESS, to be returned by the scanner.  */
    static final int DBL_LESS = 307;
    /** Token DBL_GREATER, to be returned by the scanner.  */
    static final int DBL_GREATER = 308;
    /** Token TRIPL_GREATER, to be returned by the scanner.  */
    static final int TRIPL_GREATER = 309;
    /** Token IDENTIFIER, to be returned by the scanner.  */
    static final int IDENTIFIER = 310;
    /** Token INTEGER_LITERAL, to be returned by the scanner.  */
    static final int INTEGER_LITERAL = 311;
    /** Token FLOATING_POINT_LITERAL, to be returned by the scanner.  */
    static final int FLOATING_POINT_LITERAL = 312;
    /** Token CHARACTER_LITERAL, to be returned by the scanner.  */
    static final int CHARACTER_LITERAL = 313;
    /** Token STRING_LITERAL, to be returned by the scanner.  */
    static final int STRING_LITERAL = 314;
    /** Token ABSTRACT, to be returned by the scanner.  */
    static final int ABSTRACT = 315;
    /** Token ASSERT, to be returned by the scanner.  */
    static final int ASSERT = 316;
    /** Token BOOLEAN, to be returned by the scanner.  */
    static final int BOOLEAN = 317;
    /** Token BREAK, to be returned by the scanner.  */
    static final int BREAK = 318;
    /** Token BYTE, to be returned by the scanner.  */
    static final int BYTE = 319;
    /** Token CASE, to be returned by the scanner.  */
    static final int CASE = 320;
    /** Token CATCH, to be returned by the scanner.  */
    static final int CATCH = 321;
    /** Token CHAR, to be returned by the scanner.  */
    static final int CHAR = 322;
    /** Token CLASS, to be returned by the scanner.  */
    static final int CLASS = 323;
    /** Token CONTINUE, to be returned by the scanner.  */
    static final int CONTINUE = 324;
    /** Token DEFAULT, to be returned by the scanner.  */
    static final int DEFAULT = 325;
    /** Token DO, to be returned by the scanner.  */
    static final int DO = 326;
    /** Token DOUBLE, to be returned by the scanner.  */
    static final int DOUBLE = 327;
    /** Token ELSE, to be returned by the scanner.  */
    static final int ELSE = 328;
    /** Token ENUM, to be returned by the scanner.  */
    static final int ENUM = 329;
    /** Token EXTENDS, to be returned by the scanner.  */
    static final int EXTENDS = 330;
    /** Token FALSE, to be returned by the scanner.  */
    static final int FALSE = 331;
    /** Token FINAL, to be returned by the scanner.  */
    static final int FINAL = 332;
    /** Token FINALLY, to be returned by the scanner.  */
    static final int FINALLY = 333;
    /** Token FLOAT, to be returned by the scanner.  */
    static final int FLOAT = 334;
    /** Token FOR, to be returned by the scanner.  */
    static final int FOR = 335;
    /** Token IF, to be returned by the scanner.  */
    static final int IF = 336;
    /** Token IMPLEMENTS, to be returned by the scanner.  */
    static final int IMPLEMENTS = 337;
    /** Token IMPORT, to be returned by the scanner.  */
    static final int IMPORT = 338;
    /** Token INSTANCEOF, to be returned by the scanner.  */
    static final int INSTANCEOF = 339;
    /** Token INT, to be returned by the scanner.  */
    static final int INT = 340;
    /** Token INTERFACE, to be returned by the scanner.  */
    static final int INTERFACE = 341;
    /** Token LONG, to be returned by the scanner.  */
    static final int LONG = 342;
    /** Token MODULE, to be returned by the scanner.  */
    static final int MODULE = 343;
    /** Token NATIVE, to be returned by the scanner.  */
    static final int NATIVE = 344;
    /** Token NEW, to be returned by the scanner.  */
    static final int NEW = 345;
    /** Token NULL, to be returned by the scanner.  */
    static final int NULL = 346;
    /** Token OPEN, to be returned by the scanner.  */
    static final int OPEN = 347;
    /** Token PACKAGE, to be returned by the scanner.  */
    static final int PACKAGE = 348;
    /** Token PRIVATE, to be returned by the scanner.  */
    static final int PRIVATE = 349;
    /** Token PROTECTED, to be returned by the scanner.  */
    static final int PROTECTED = 350;
    /** Token PUBLIC, to be returned by the scanner.  */
    static final int PUBLIC = 351;
    /** Token RECORD, to be returned by the scanner.  */
    static final int RECORD = 352;
    /** Token RETURN, to be returned by the scanner.  */
    static final int RETURN = 353;
    /** Token SHORT, to be returned by the scanner.  */
    static final int SHORT = 354;
    /** Token STATIC, to be returned by the scanner.  */
    static final int STATIC = 355;
    /** Token STRICTFP, to be returned by the scanner.  */
    static final int STRICTFP = 356;
    /** Token SUPER, to be returned by the scanner.  */
    static final int SUPER = 357;
    /** Token SWITCH, to be returned by the scanner.  */
    static final int SWITCH = 358;
    /** Token SYNCHRONIZED, to be returned by the scanner.  */
    static final int SYNCHRONIZED = 359;
    /** Token THIS, to be returned by the scanner.  */
    static final int THIS = 360;
    /** Token THROW, to be returned by the scanner.  */
    static final int THROW = 361;
    /** Token THROWS, to be returned by the scanner.  */
    static final int THROWS = 362;
    /** Token TRANSIENT, to be returned by the scanner.  */
    static final int TRANSIENT = 363;
    /** Token TRANSITIVE, to be returned by the scanner.  */
    static final int TRANSITIVE = 364;
    /** Token TRUE, to be returned by the scanner.  */
    static final int TRUE = 365;
    /** Token TRY, to be returned by the scanner.  */
    static final int TRY = 366;
    /** Token VAR, to be returned by the scanner.  */
    static final int VAR = 367;
    /** Token VOID, to be returned by the scanner.  */
    static final int VOID = 368;
    /** Token VOLATILE, to be returned by the scanner.  */
    static final int VOLATILE = 369;
    /** Token WHILE, to be returned by the scanner.  */
    static final int WHILE = 370;
    /** Token YIELD, to be returned by the scanner.  */
    static final int YIELD = 371;
    /** Token SHORT_COMMENT, to be returned by the scanner.  */
    static final int SHORT_COMMENT = 372;
    /** Token LONG_COMMENT, to be returned by the scanner.  */
    static final int LONG_COMMENT = 373;
    /** Token EOS, to be returned by the scanner.  */
    static final int EOS = 374;

    /** Deprecated, use YYEOF instead.  */
    public static final int EOF = YYEOF;


    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    Entity getLVal();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token.
     */
    int yylex() throws java.io.IOException;

    /**
     * Emit an errorin a user-defined way.
     *
     *
     * @param msg The string for the error message.
     */
     void yyerror(String msg);


  }


  /**
   * The object doing lexical analysis for us.
   */
  private Lexer yylexer;





  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public JavaParser (Lexer yylexer)
  {

    this.yylexer = yylexer;

  }



  private int yynerrs = 0;

  /**
   * The number of syntax errors so far.
   */
  public final int getNumberOfErrors () { return yynerrs; }

  /**
   * Print an error message via the lexer.
   *
   * @param msg The error message.
   */
  public final void yyerror(String msg) {
      yylexer.yyerror(msg);
  }



  private final class YYStack {
    private int[] stateStack = new int[16];
    private Entity[] valueStack = new Entity[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Entity value) {
      height++;
      if (size == height)
        {
          int[] newStateStack = new int[size * 2];
          System.arraycopy (stateStack, 0, newStateStack, 0, height);
          stateStack = newStateStack;

          Entity[] newValueStack = new Entity[size * 2];
          System.arraycopy (valueStack, 0, newValueStack, 0, height);
          valueStack = newValueStack;

          size *= 2;
        }

      stateStack[height] = state;
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (0 < num) {
        java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Entity valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out) {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
          out.print (' ');
          out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).
   */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).
   */
  public static final int YYABORT = 1;



  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.
   */
  public static final int YYERROR = 2;

  /**
   * Internal return codes that are not supported for user semantic
   * actions.
   */
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;


  private int yyerrstatus_ = 0;


  /**
   * Whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.
   */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  /** Compute post-reduction state.
   * @param yystate   the current state
   * @param yysym     the nonterminal to push on the stack
   */
  private int yyLRGotoState (int yystate, int yysym)
  {
    int yyr = yypgoto_[yysym - YYNTOKENS_] + yystate;
    if (0 <= yyr && yyr <= YYLAST_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - YYNTOKENS_];
  }

  private int yyaction(int yyn, YYStack yystack, int yylen)
  {
    /* If YYLEN is nonzero, implement the default value of the action:
       '$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    Entity yyval = (0 < yylen) ? yystack.valueAt(yylen - 1) : yystack.valueAt(0);

    switch (yyn)
      {
          case 2: /* Literal: INTEGER_LITERAL  */
  if (yyn == 2)
    /* "src/main/resources/Java_16_Grammar.y":295  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 3: /* Literal: FLOATING_POINT_LITERAL  */
  if (yyn == 3)
    /* "src/main/resources/Java_16_Grammar.y":296  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 4: /* Literal: TRUE  */
  if (yyn == 4)
    /* "src/main/resources/Java_16_Grammar.y":297  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 5: /* Literal: FALSE  */
  if (yyn == 5)
    /* "src/main/resources/Java_16_Grammar.y":298  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 6: /* Literal: CHARACTER_LITERAL  */
  if (yyn == 6)
    /* "src/main/resources/Java_16_Grammar.y":299  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 7: /* Literal: STRING_LITERAL  */
  if (yyn == 7)
    /* "src/main/resources/Java_16_Grammar.y":300  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 8: /* Literal: NULL  */
  if (yyn == 8)
    /* "src/main/resources/Java_16_Grammar.y":302  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 9: /* CompoundName: IDENTIFIER  */
  if (yyn == 9)
    /* "src/main/resources/Java_16_Grammar.y":308  */
                                  { yyval = new CompoundName(((Token)(yystack.valueAt (0))).image); };
  break;


  case 10: /* CompoundName: CompoundName DOT IDENTIFIER  */
  if (yyn == 10)
    /* "src/main/resources/Java_16_Grammar.y":309  */
                                  { yyval = ((CompoundName)(yystack.valueAt (2))).add(((Token)(yystack.valueAt (0))).image); };
  break;


  case 11: /* ModifierSeqOpt: %empty  */
  if (yyn == 11)
    /* "src/main/resources/Java_16_Grammar.y":313  */
                   { yyval = null; };
  break;


  case 12: /* ModifierSeqOpt: ModifierSeq  */
  if (yyn == 12)
    /* "src/main/resources/Java_16_Grammar.y":314  */
                   { yyval = ((Modifiers)(yystack.valueAt (0))); };
  break;


  case 13: /* ModifierSeq: StandardModifierSeq  */
  if (yyn == 13)
    /* "src/main/resources/Java_16_Grammar.y":318  */
                                        { yyval = new Modifiers(null,((StandardModifiers)(yystack.valueAt (0)))); };
  break;


  case 14: /* ModifierSeq: AnnotationSeq StandardModifierSeq  */
  if (yyn == 14)
    /* "src/main/resources/Java_16_Grammar.y":319  */
                                        { yyval = new Modifiers(((Annotations)(yystack.valueAt (1))),((StandardModifiers)(yystack.valueAt (0)))); };
  break;


  case 15: /* StandardModifierSeq: StandardModifier  */
  if (yyn == 15)
    /* "src/main/resources/Java_16_Grammar.y":323  */
                                           { yyval = new StandardModifiers(((Token)(yystack.valueAt (0)))); };
  break;


  case 16: /* StandardModifierSeq: StandardModifierSeq StandardModifier  */
  if (yyn == 16)
    /* "src/main/resources/Java_16_Grammar.y":324  */
                                           { yyval = ((StandardModifiers)(yystack.valueAt (1))).add(((Token)(yystack.valueAt (0)))); };
  break;


  case 17: /* StandardModifier: DEFAULT  */
  if (yyn == 17)
    /* "src/main/resources/Java_16_Grammar.y":329  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 18: /* StandardModifier: FINAL  */
  if (yyn == 18)
    /* "src/main/resources/Java_16_Grammar.y":330  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 19: /* StandardModifier: PUBLIC  */
  if (yyn == 19)
    /* "src/main/resources/Java_16_Grammar.y":331  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 20: /* StandardModifier: PROTECTED  */
  if (yyn == 20)
    /* "src/main/resources/Java_16_Grammar.y":332  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 21: /* StandardModifier: PRIVATE  */
  if (yyn == 21)
    /* "src/main/resources/Java_16_Grammar.y":333  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 22: /* StandardModifier: ABSTRACT  */
  if (yyn == 22)
    /* "src/main/resources/Java_16_Grammar.y":334  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 23: /* StandardModifier: STATIC  */
  if (yyn == 23)
    /* "src/main/resources/Java_16_Grammar.y":335  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 24: /* StandardModifier: STRICTFP  */
  if (yyn == 24)
    /* "src/main/resources/Java_16_Grammar.y":336  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 25: /* StandardModifier: SYNCHRONIZED  */
  if (yyn == 25)
    /* "src/main/resources/Java_16_Grammar.y":337  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 26: /* StandardModifier: TRANSIENT  */
  if (yyn == 26)
    /* "src/main/resources/Java_16_Grammar.y":338  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 27: /* StandardModifier: VOLATILE  */
  if (yyn == 27)
    /* "src/main/resources/Java_16_Grammar.y":339  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 28: /* StandardModifier: OPEN  */
  if (yyn == 28)
    /* "src/main/resources/Java_16_Grammar.y":340  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 29: /* CompilationUnit: %empty  */
  if (yyn == 29)
    /* "src/main/resources/Java_16_Grammar.y":346  */
                                                    { yyval = null; };
  break;


  case 30: /* CompilationUnit: Package  */
  if (yyn == 30)
    /* "src/main/resources/Java_16_Grammar.y":347  */
                                                    { yyval = ((tree.Compilation.CompilationUnit)(yystack.valueAt (0))); ast = ((tree.Compilation.CompilationUnit)(yystack.valueAt (0))); };
  break;


  case 31: /* CompilationUnit: ImportDeclarationSeqOpt TopLevelComponentSeq  */
  if (yyn == 31)
    /* "src/main/resources/Java_16_Grammar.y":349  */
                                                    { ast = new SimpleCompilationUnit(((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 32: /* Package: PACKAGE CompoundName SEMICOLON ImportDeclarationSeqOpt TopLevelComponentSeqOpt  */
  if (yyn == 32)
    /* "src/main/resources/Java_16_Grammar.y":354  */
                                                    { yyval = new tree.Compilation.Package(((CompoundName)(yystack.valueAt (3))),((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 33: /* ImportDeclarationSeqOpt: %empty  */
  if (yyn == 33)
    /* "src/main/resources/Java_16_Grammar.y":364  */
                                                 { yyval = null; };
  break;


  case 34: /* ImportDeclarationSeqOpt: ImportDeclarationSeq  */
  if (yyn == 34)
    /* "src/main/resources/Java_16_Grammar.y":365  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (0))); };
  break;


  case 35: /* ImportDeclarationSeq: ImportDeclaration  */
  if (yyn == 35)
    /* "src/main/resources/Java_16_Grammar.y":369  */
                                                 { yyval = new ImportDeclarations(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 36: /* ImportDeclarationSeq: ImportDeclarationSeqOpt ImportDeclaration  */
  if (yyn == 36)
    /* "src/main/resources/Java_16_Grammar.y":370  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))).add(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 37: /* ImportDeclaration: IMPORT CompoundName SEMICOLON  */
  if (yyn == 37)
    /* "src/main/resources/Java_16_Grammar.y":374  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 38: /* ImportDeclaration: IMPORT STATIC CompoundName SEMICOLON  */
  if (yyn == 38)
    /* "src/main/resources/Java_16_Grammar.y":375  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 39: /* ImportDeclaration: IMPORT CompoundName DOT STAR SEMICOLON  */
  if (yyn == 39)
    /* "src/main/resources/Java_16_Grammar.y":376  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 40: /* ImportDeclaration: IMPORT STATIC CompoundName DOT STAR SEMICOLON  */
  if (yyn == 40)
    /* "src/main/resources/Java_16_Grammar.y":377  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 41: /* TopLevelComponentSeqOpt: %empty  */
  if (yyn == 41)
    /* "src/main/resources/Java_16_Grammar.y":381  */
                            { yyval = null; };
  break;


  case 42: /* TopLevelComponentSeqOpt: TopLevelComponentSeq  */
  if (yyn == 42)
    /* "src/main/resources/Java_16_Grammar.y":382  */
                            { yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (0))); };
  break;


  case 43: /* TopLevelComponentSeq: ModifierSeqOpt TopLevelComponent  */
  if (yyn == 43)
    /* "src/main/resources/Java_16_Grammar.y":386  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = new TopLevelComponents(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 44: /* TopLevelComponentSeq: TopLevelComponentSeq ModifierSeqOpt TopLevelComponent  */
  if (yyn == 44)
    /* "src/main/resources/Java_16_Grammar.y":387  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (2))).add(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 45: /* TopLevelComponent: ClassDeclaration  */
  if (yyn == 45)
    /* "src/main/resources/Java_16_Grammar.y":391  */
                           { classes.put(((ClassDeclaration)(yystack.valueAt (0))).name,((ClassDeclaration)(yystack.valueAt (0)))); yyval = new TopLevelComponent(((ClassDeclaration)(yystack.valueAt (0)))); };
  break;


  case 46: /* TopLevelComponent: InterfaceDeclaration  */
  if (yyn == 46)
    /* "src/main/resources/Java_16_Grammar.y":392  */
                           { classes.put(((InterfaceDeclaration)(yystack.valueAt (0))).name,((InterfaceDeclaration)(yystack.valueAt (0)))); yyval = new TopLevelComponent(((InterfaceDeclaration)(yystack.valueAt (0)))); };
  break;


  case 47: /* Type: UnannotatedType  */
  if (yyn == 47)
    /* "src/main/resources/Java_16_Grammar.y":439  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))); };
  break;


  case 48: /* Type: AnnotationSeq UnannotatedType  */
  if (yyn == 48)
    /* "src/main/resources/Java_16_Grammar.y":440  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))).addAnnotations(((Annotations)(yystack.valueAt (1)))); };
  break;


  case 49: /* UnannotatedType: PrimitiveType  */
  if (yyn == 49)
    /* "src/main/resources/Java_16_Grammar.y":444  */
                                 { yyval = new PrimitiveType(((Token)(yystack.valueAt (0)))); };
  break;


  case 50: /* UnannotatedType: CompoundName  */
  if (yyn == 50)
    /* "src/main/resources/Java_16_Grammar.y":446  */
                                 { yyval = new TypeName(((CompoundName)(yystack.valueAt (0))),null); };
  break;


  case 51: /* UnannotatedType: CompoundName TypeArguments  */
  if (yyn == 51)
    /* "src/main/resources/Java_16_Grammar.y":447  */
                                 { yyval = new TypeName(((CompoundName)(yystack.valueAt (1))),((tree.Type.TypeArguments)(yystack.valueAt (0)))); };
  break;


  case 52: /* UnannotatedType: UnannotatedType Dim  */
  if (yyn == 52)
    /* "src/main/resources/Java_16_Grammar.y":449  */
                                     { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (1))).addDimension(((Dim)(yystack.valueAt (0)))); };
  break;


  case 53: /* PrimitiveType: BYTE  */
  if (yyn == 53)
    /* "src/main/resources/Java_16_Grammar.y":458  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 54: /* PrimitiveType: SHORT  */
  if (yyn == 54)
    /* "src/main/resources/Java_16_Grammar.y":459  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 55: /* PrimitiveType: INT  */
  if (yyn == 55)
    /* "src/main/resources/Java_16_Grammar.y":460  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 56: /* PrimitiveType: LONG  */
  if (yyn == 56)
    /* "src/main/resources/Java_16_Grammar.y":461  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 57: /* PrimitiveType: CHAR  */
  if (yyn == 57)
    /* "src/main/resources/Java_16_Grammar.y":462  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 58: /* PrimitiveType: FLOAT  */
  if (yyn == 58)
    /* "src/main/resources/Java_16_Grammar.y":464  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 59: /* PrimitiveType: DOUBLE  */
  if (yyn == 59)
    /* "src/main/resources/Java_16_Grammar.y":465  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 60: /* PrimitiveType: BOOLEAN  */
  if (yyn == 60)
    /* "src/main/resources/Java_16_Grammar.y":466  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 61: /* ClassDeclaration: NormalClassDeclaration  */
  if (yyn == 61)
    /* "src/main/resources/Java_16_Grammar.y":487  */
                               { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 62: /* ClassDeclaration: EnumDeclaration  */
  if (yyn == 62)
    /* "src/main/resources/Java_16_Grammar.y":488  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 63: /* ClassDeclaration: RecordDeclaration  */
  if (yyn == 63)
    /* "src/main/resources/Java_16_Grammar.y":489  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 64: /* NormalClassDeclaration: ModifierSeqOpt CLASS IDENTIFIER TypeParametersOpt ClassExtendsOpt ClassImplementsOpt ClassBody  */
  if (yyn == 64)
    /* "src/main/resources/Java_16_Grammar.y":494  */
                              { yyval = new NormalClassDeclaration(((Token)(yystack.valueAt (4))),((TypeParameters)(yystack.valueAt (3))),((tree.Type.Type)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 65: /* TypeParametersOpt: %empty  */
  if (yyn == 65)
    /* "src/main/resources/Java_16_Grammar.y":498  */
                       { yyval = null; };
  break;


  case 66: /* TypeParametersOpt: TypeParameters  */
  if (yyn == 66)
    /* "src/main/resources/Java_16_Grammar.y":499  */
                       { yyval = ((TypeParameters)(yystack.valueAt (0))); };
  break;


  case 67: /* TypeParameters: LESS TypeParameterList GREATER  */
  if (yyn == 67)
    /* "src/main/resources/Java_16_Grammar.y":503  */
                                      { yyval = ((TypeParameters)(yystack.valueAt (1))); };
  break;


  case 68: /* TypeParameterList: TypeParameter  */
  if (yyn == 68)
    /* "src/main/resources/Java_16_Grammar.y":507  */
                                            { yyval = new TypeParameters(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 69: /* TypeParameterList: TypeParameterList COMMA TypeParameter  */
  if (yyn == 69)
    /* "src/main/resources/Java_16_Grammar.y":508  */
                                            { yyval = ((TypeParameters)(yystack.valueAt (2))).add(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 70: /* TypeParameter: AnnotationSeq TypeParameterTail  */
  if (yyn == 70)
    /* "src/main/resources/Java_16_Grammar.y":518  */
                                      { yyval = new TypeParameter(((Annotations)(yystack.valueAt (1))),((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 71: /* TypeParameter: TypeParameterTail  */
  if (yyn == 71)
    /* "src/main/resources/Java_16_Grammar.y":519  */
                                      { yyval = new TypeParameter(null,((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 72: /* TypeParameterTail: IDENTIFIER  */
  if (yyn == 72)
    /* "src/main/resources/Java_16_Grammar.y":523  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (0))),null); };
  break;


  case 73: /* TypeParameterTail: IDENTIFIER EXTENDS AnnotationSeqOpt IDENTIFIER  */
  if (yyn == 73)
    /* "src/main/resources/Java_16_Grammar.y":524  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (3))),((Annotations)(yystack.valueAt (1))),((Token)(yystack.valueAt (0)))); };
  break;


  case 74: /* TypeParameterTail: IDENTIFIER EXTENDS ClassTypeList2  */
  if (yyn == 74)
    /* "src/main/resources/Java_16_Grammar.y":525  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 75: /* ClassExtendsOpt: %empty  */
  if (yyn == 75)
    /* "src/main/resources/Java_16_Grammar.y":529  */
                    { yyval = null; };
  break;


  case 76: /* ClassExtendsOpt: EXTENDS Type  */
  if (yyn == 76)
    /* "src/main/resources/Java_16_Grammar.y":530  */
                    { yyval = ((tree.Type.Type)(yystack.valueAt (0))); };
  break;


  case 77: /* ClassImplementsOpt: %empty  */
  if (yyn == 77)
    /* "src/main/resources/Java_16_Grammar.y":534  */
                                 { yyval = null; };
  break;


  case 78: /* ClassImplementsOpt: IMPLEMENTS ClassTypeList1  */
  if (yyn == 78)
    /* "src/main/resources/Java_16_Grammar.y":535  */
                                 { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 79: /* ClassTypeList1: Type  */
  if (yyn == 79)
    /* "src/main/resources/Java_16_Grammar.y":539  */
                                { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 80: /* ClassTypeList1: ClassTypeList1 COMMA Type  */
  if (yyn == 80)
    /* "src/main/resources/Java_16_Grammar.y":540  */
                                { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 81: /* ClassTypeList2: Type  */
  if (yyn == 81)
    /* "src/main/resources/Java_16_Grammar.y":544  */
                                    { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 82: /* ClassTypeList2: ClassTypeList2 AMPERSAND Type  */
  if (yyn == 82)
    /* "src/main/resources/Java_16_Grammar.y":545  */
                                    { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 83: /* ClassBodyOpt: %empty  */
  if (yyn == 83)
    /* "src/main/resources/Java_16_Grammar.y":549  */
                    { yyval = null; };
  break;


  case 84: /* ClassBodyOpt: ClassBody  */
  if (yyn == 84)
    /* "src/main/resources/Java_16_Grammar.y":550  */
                    { yyval = ((Declarations)(yystack.valueAt (0))); };
  break;


  case 85: /* ClassBody: LBRACE RBRACE  */
  if (yyn == 85)
    /* "src/main/resources/Java_16_Grammar.y":554  */
                                             { yyval = null; };
  break;


  case 86: /* ClassBody: LBRACE ClassBodyDeclarationSeq RBRACE  */
  if (yyn == 86)
    /* "src/main/resources/Java_16_Grammar.y":555  */
                                                 { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 87: /* ClassBodyDeclarationSeq: ClassBodyDeclaration  */
  if (yyn == 87)
    /* "src/main/resources/Java_16_Grammar.y":559  */
                                                   { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 88: /* ClassBodyDeclarationSeq: ClassBodyDeclarationSeq ClassBodyDeclaration  */
  if (yyn == 88)
    /* "src/main/resources/Java_16_Grammar.y":560  */
                                                   { yyval = ((Declarations)(yystack.valueAt (1))).add(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 89: /* ClassBodyDeclaration: ModifierSeqOpt PureBodyDeclaration  */
  if (yyn == 89)
    /* "src/main/resources/Java_16_Grammar.y":564  */
                                         { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); };
  break;


  case 90: /* ClassBodyDeclaration: Block  */
  if (yyn == 90)
    /* "src/main/resources/Java_16_Grammar.y":565  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),false); };
  break;


  case 91: /* ClassBodyDeclaration: STATIC Block  */
  if (yyn == 91)
    /* "src/main/resources/Java_16_Grammar.y":566  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),true); };
  break;


  case 92: /* ClassBodyDeclaration: SEMICOLON  */
  if (yyn == 92)
    /* "src/main/resources/Java_16_Grammar.y":567  */
                      { yyval = null; };
  break;


  case 93: /* PureBodyDeclaration: FieldDeclaration  */
  if (yyn == 93)
    /* "src/main/resources/Java_16_Grammar.y":571  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 94: /* PureBodyDeclaration: MethodDeclaration  */
  if (yyn == 94)
    /* "src/main/resources/Java_16_Grammar.y":572  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 95: /* PureBodyDeclaration: ClassDeclaration  */
  if (yyn == 95)
    /* "src/main/resources/Java_16_Grammar.y":573  */
                               { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 96: /* PureBodyDeclaration: InterfaceDeclaration  */
  if (yyn == 96)
    /* "src/main/resources/Java_16_Grammar.y":574  */
                               { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 97: /* PureBodyDeclaration: ConstructorDeclaration  */
  if (yyn == 97)
    /* "src/main/resources/Java_16_Grammar.y":575  */
                               { yyval = ((ConstructorDeclaration)(yystack.valueAt (0))); };
  break;


  case 98: /* ConstructorDeclaration: ConstructorDeclarator ThrowsOpt ConstructorBody  */
  if (yyn == 98)
    /* "src/main/resources/Java_16_Grammar.y":582  */
                            { yyval = new ConstructorDeclaration(null,((ConstructorDeclarator)(yystack.valueAt (2))).typeParameters,((ConstructorDeclarator)(yystack.valueAt (2))).formalParameters,
                                                              ((tree.Type.TypeList)(yystack.valueAt (1))),((ConstructorBody)(yystack.valueAt (0))).invocation,((ConstructorBody)(yystack.valueAt (0))).block); };
  break;


  case 99: /* ConstructorDeclarator: TypeParametersOpt IDENTIFIER LPAREN FormalParameterList RPAREN  */
  if (yyn == 99)
    /* "src/main/resources/Java_16_Grammar.y":588  */
                                      { yyval = new ConstructorDeclarator(((TypeParameters)(yystack.valueAt (4))),((ParameterDeclarations)(yystack.valueAt (1)))); };
  break;


  case 100: /* ConstructorBody: LBRACE RBRACE  */
  if (yyn == 100)
    /* "src/main/resources/Java_16_Grammar.y":592  */
                                                                    { yyval = new ConstructorBody(null,null); };
  break;


  case 101: /* ConstructorBody: LBRACE ExplicitConstructorInvocation RBRACE  */
  if (yyn == 101)
    /* "src/main/resources/Java_16_Grammar.y":593  */
                                                                    { yyval = new ConstructorBody(((ExplicitConstructorInvocation)(yystack.valueAt (1))),null); };
  break;


  case 102: /* ConstructorBody: LBRACE BlockStatementSeq RBRACE  */
  if (yyn == 102)
    /* "src/main/resources/Java_16_Grammar.y":594  */
                                                                    { yyval = new ConstructorBody(null,new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1))))); };
  break;


  case 103: /* ConstructorBody: LBRACE ExplicitConstructorInvocation BlockStatementSeq RBRACE  */
  if (yyn == 103)
    /* "src/main/resources/Java_16_Grammar.y":595  */
                                                                    { yyval = new ConstructorBody(((ExplicitConstructorInvocation)(yystack.valueAt (2))),new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1))))); };
  break;


  case 104: /* ExplicitConstructorInvocation: TypeArgumentsOpt THIS Arguments SEMICOLON  */
  if (yyn == 104)
    /* "src/main/resources/Java_16_Grammar.y":599  */
                                                                  { yyval = new ExplicitConstructorInvocation(null,((tree.Type.TypeArguments)(yystack.valueAt (3))),false,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 105: /* ExplicitConstructorInvocation: TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 105)
    /* "src/main/resources/Java_16_Grammar.y":600  */
                                                                  { yyval = new ExplicitConstructorInvocation(null,((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 106: /* ExplicitConstructorInvocation: CompoundName DOT TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 106)
    /* "src/main/resources/Java_16_Grammar.y":601  */
                                                                  { Expression expr = new SimpleReference(((CompoundName)(yystack.valueAt (5))));
                                                                    yyval = new ExplicitConstructorInvocation(expr,((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 107: /* ExplicitConstructorInvocation: Primary DOT TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 107)
    /* "src/main/resources/Java_16_Grammar.y":603  */
                                                                  { yyval = new ExplicitConstructorInvocation(((tree.Expression.Expression)(yystack.valueAt (5))),((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 108: /* EnumDeclaration: ENUM IDENTIFIER ClassImplementsOpt EnumBody  */
  if (yyn == 108)
    /* "src/main/resources/Java_16_Grammar.y":609  */
                                                                     { yyval = new EnumDeclaration(((Token)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((EnumBody)(yystack.valueAt (0)))); };
  break;


  case 109: /* EnumBody: LBRACE EnumConstantListOpt EnumBodyDeclarationsOpt RBRACE  */
  if (yyn == 109)
    /* "src/main/resources/Java_16_Grammar.y":613  */
                                                                      { yyval = new EnumBody(((Enumerators)(yystack.valueAt (2))),((Declarations)(yystack.valueAt (1)))); };
  break;


  case 110: /* EnumBody: LBRACE EnumConstantListOpt COMMA EnumBodyDeclarationsOpt RBRACE  */
  if (yyn == 110)
    /* "src/main/resources/Java_16_Grammar.y":614  */
                                                                      { yyval = new EnumBody(((Enumerators)(yystack.valueAt (3))),((Declarations)(yystack.valueAt (1)))); };
  break;


  case 111: /* EnumConstantListOpt: %empty  */
  if (yyn == 111)
    /* "src/main/resources/Java_16_Grammar.y":618  */
                         { yyval = null; };
  break;


  case 112: /* EnumConstantListOpt: EnumConstantList  */
  if (yyn == 112)
    /* "src/main/resources/Java_16_Grammar.y":619  */
                         { yyval = ((Enumerators)(yystack.valueAt (0))); };
  break;


  case 113: /* EnumConstantList: EnumConstant  */
  if (yyn == 113)
    /* "src/main/resources/Java_16_Grammar.y":623  */
                                          { yyval = new Enumerators(((Enumerator)(yystack.valueAt (0)))); };
  break;


  case 114: /* EnumConstantList: EnumConstantList COMMA EnumConstant  */
  if (yyn == 114)
    /* "src/main/resources/Java_16_Grammar.y":624  */
                                          { yyval = ((Enumerators)(yystack.valueAt (2))).add(((Enumerator)(yystack.valueAt (0)))); };
  break;


  case 115: /* EnumConstant: AnnotationSeqOpt IDENTIFIER  */
  if (yyn == 115)
    /* "src/main/resources/Java_16_Grammar.y":628  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (1))),((Token)(yystack.valueAt (0))),null,null); };
  break;


  case 116: /* EnumConstant: AnnotationSeqOpt IDENTIFIER Arguments  */
  if (yyn == 116)
    /* "src/main/resources/Java_16_Grammar.y":629  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0))),null); };
  break;


  case 117: /* EnumConstant: AnnotationSeqOpt IDENTIFIER Arguments ClassBody  */
  if (yyn == 117)
    /* "src/main/resources/Java_16_Grammar.y":630  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (3))),((Token)(yystack.valueAt (2))),((tree.Expression.ArgumentList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 118: /* EnumBodyDeclarationsOpt: %empty  */
  if (yyn == 118)
    /* "src/main/resources/Java_16_Grammar.y":634  */
                                        { yyval = null; };
  break;


  case 119: /* EnumBodyDeclarationsOpt: SEMICOLON  */
  if (yyn == 119)
    /* "src/main/resources/Java_16_Grammar.y":635  */
                                        { yyval = null; };
  break;


  case 120: /* EnumBodyDeclarationsOpt: SEMICOLON ClassBodyDeclarationSeq  */
  if (yyn == 120)
    /* "src/main/resources/Java_16_Grammar.y":636  */
                                        { yyval = ((Declarations)(yystack.valueAt (0))); };
  break;


  case 121: /* RecordDeclaration: RECORD IDENTIFIER TypeParametersOpt RecordHeader ClassImplementsOpt RecordBody  */
  if (yyn == 121)
    /* "src/main/resources/Java_16_Grammar.y":642  */
                                                                                                        { yyval = null; };
  break;


  case 134: /* FieldDeclaration: UnannotatedType VariableDeclaratorList SEMICOLON  */
  if (yyn == 134)
    /* "src/main/resources/Java_16_Grammar.y":679  */
                                                  { yyval = new TypeAndDeclarators(((tree.Type.UnannotatedType)(yystack.valueAt (2))),((VariableDeclarators)(yystack.valueAt (1)))); };
  break;


  case 135: /* VariableDeclaratorList: VariableDeclarator  */
  if (yyn == 135)
    /* "src/main/resources/Java_16_Grammar.y":683  */
                                                      { yyval = new VariableDeclarators(((VariableDeclarator)(yystack.valueAt (0)))); };
  break;


  case 136: /* VariableDeclaratorList: VariableDeclaratorList COMMA VariableDeclarator  */
  if (yyn == 136)
    /* "src/main/resources/Java_16_Grammar.y":684  */
                                                      { yyval = ((VariableDeclarators)(yystack.valueAt (2))).add(((VariableDeclarator)(yystack.valueAt (0)))); };
  break;


  case 137: /* VariableDeclarator: IDENTIFIER  */
  if (yyn == 137)
    /* "src/main/resources/Java_16_Grammar.y":688  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (0))),null,null); };
  break;


  case 138: /* VariableDeclarator: IDENTIFIER EQUAL Expression  */
  if (yyn == 138)
    /* "src/main/resources/Java_16_Grammar.y":689  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (2))),null,new InitializerSimple(((tree.Expression.Expression)(yystack.valueAt (0))))); };
  break;


  case 139: /* VariableDeclarator: IDENTIFIER Dims  */
  if (yyn == 139)
    /* "src/main/resources/Java_16_Grammar.y":690  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0))),null); };
  break;


  case 140: /* VariableDeclarator: IDENTIFIER Dims EQUAL ArrayInitializer  */
  if (yyn == 140)
    /* "src/main/resources/Java_16_Grammar.y":691  */
                                              { yyval = new VariableDeclarator(((Token)(yystack.valueAt (3))),((Dims)(yystack.valueAt (2))),((InitializerArray)(yystack.valueAt (0)))); };
  break;


  case 141: /* ArrayInitializer: LBRACE VariableInitializerListOpt RBRACE  */
  if (yyn == 141)
    /* "src/main/resources/Java_16_Grammar.y":695  */
                                                     { yyval = ((InitializerArray)(yystack.valueAt (1))); };
  break;


  case 142: /* ArrayInitializer: LBRACE VariableInitializerListOpt COMMA RBRACE  */
  if (yyn == 142)
    /* "src/main/resources/Java_16_Grammar.y":696  */
                                                     { yyval = ((InitializerArray)(yystack.valueAt (2))); };
  break;


  case 143: /* VariableInitializerListOpt: %empty  */
  if (yyn == 143)
    /* "src/main/resources/Java_16_Grammar.y":700  */
                                { yyval = null; };
  break;


  case 144: /* VariableInitializerListOpt: VariableInitializerList  */
  if (yyn == 144)
    /* "src/main/resources/Java_16_Grammar.y":701  */
                                { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 145: /* VariableInitializerList: VariableInitializer  */
  if (yyn == 145)
    /* "src/main/resources/Java_16_Grammar.y":705  */
                                                        { yyval = new InitializerArray(((InitializerSimple)(yystack.valueAt (0)))); };
  break;


  case 146: /* VariableInitializerList: VariableInitializerList COMMA VariableInitializer  */
  if (yyn == 146)
    /* "src/main/resources/Java_16_Grammar.y":706  */
                                                        { yyval = ((InitializerArray)(yystack.valueAt (2))).add(((InitializerSimple)(yystack.valueAt (0)))); };
  break;


  case 147: /* VariableInitializer: Expression  */
  if (yyn == 147)
    /* "src/main/resources/Java_16_Grammar.y":710  */
                        { yyval = new InitializerSimple(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 148: /* VariableInitializer: ArrayInitializer  */
  if (yyn == 148)
    /* "src/main/resources/Java_16_Grammar.y":711  */
                        { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 149: /* MethodDeclaration: MethodHeader MethodBody  */
  if (yyn == 149)
    /* "src/main/resources/Java_16_Grammar.y":717  */
                              { yyval = new MethodDeclaration(((MethodHeader)(yystack.valueAt (1))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 150: /* MethodHeader: TypeParameters Type MethodDeclarator ThrowsOpt  */
  if (yyn == 150)
    /* "src/main/resources/Java_16_Grammar.y":727  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),((tree.Type.Type)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 151: /* MethodHeader: TypeParameters AnnotationSeq VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 151)
    /* "src/main/resources/Java_16_Grammar.y":728  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (4))),null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 152: /* MethodHeader: TypeParameters UnannotatedType MethodDeclarator ThrowsOpt  */
  if (yyn == 152)
    /* "src/main/resources/Java_16_Grammar.y":729  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),((tree.Type.UnannotatedType)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 153: /* MethodHeader: TypeParameters VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 153)
    /* "src/main/resources/Java_16_Grammar.y":730  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 154: /* MethodHeader: UnannotatedType MethodDeclarator ThrowsOpt  */
  if (yyn == 154)
    /* "src/main/resources/Java_16_Grammar.y":731  */
                                                                              { yyval = new MethodHeader(null,((tree.Type.UnannotatedType)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 155: /* MethodHeader: VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 155)
    /* "src/main/resources/Java_16_Grammar.y":732  */
                                                                              { yyval = new MethodHeader(null,null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 156: /* MethodDeclarator: IDENTIFIER LPAREN RPAREN DimsOpt  */
  if (yyn == 156)
    /* "src/main/resources/Java_16_Grammar.y":741  */
                                                                                { yyval = new MethodDeclarator(((Token)(yystack.valueAt (3))),null,((Dims)(yystack.valueAt (0)))); };
  break;


  case 157: /* MethodDeclarator: IDENTIFIER LPAREN FormalParameterList RPAREN DimsOpt  */
  if (yyn == 157)
    /* "src/main/resources/Java_16_Grammar.y":742  */
                                                                                { yyval = new MethodDeclarator(((Token)(yystack.valueAt (4))),((ParameterDeclarations)(yystack.valueAt (2))),((Dims)(yystack.valueAt (0)))); };
  break;


  case 158: /* FormalParameterList: FormalParameter  */
  if (yyn == 158)
    /* "src/main/resources/Java_16_Grammar.y":756  */
                                                { yyval = new ParameterDeclarations(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 159: /* FormalParameterList: FormalParameterList COMMA FormalParameter  */
  if (yyn == 159)
    /* "src/main/resources/Java_16_Grammar.y":757  */
                                                { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(((ParameterDeclaration)(yystack.valueAt (0))));};
  break;


  case 160: /* FormalParameter: ModifierSeq UnannotatedType FormalParameterTail  */
  if (yyn == 160)
    /* "src/main/resources/Java_16_Grammar.y":761  */
                                                      { yyval = ParameterDeclaration.create(((Modifiers)(yystack.valueAt (2))),((tree.Type.UnannotatedType)(yystack.valueAt (1))),((ParameterTail)(yystack.valueAt (0)))); };
  break;


  case 161: /* FormalParameter: UnannotatedType FormalParameterTail  */
  if (yyn == 161)
    /* "src/main/resources/Java_16_Grammar.y":762  */
                                                      { yyval = ParameterDeclaration.create(null,((tree.Type.UnannotatedType)(yystack.valueAt (1))),((ParameterTail)(yystack.valueAt (0)))); };
  break;


  case 162: /* FormalParameterTail: IDENTIFIER DimsOpt  */
  if (yyn == 162)
    /* "src/main/resources/Java_16_Grammar.y":766  */
                                                   { yyval = new ParameterTail(null,((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0))),false,false); };
  break;


  case 163: /* FormalParameterTail: AnnotationSeqOpt ELLIPSIS IDENTIFIER  */
  if (yyn == 163)
    /* "src/main/resources/Java_16_Grammar.y":767  */
                                                   { yyval = new ParameterTail(((Annotations)(yystack.valueAt (2))),((Token)(yystack.valueAt (0))),null,true,false); };
  break;


  case 164: /* FormalParameterTail: THIS  */
  if (yyn == 164)
    /* "src/main/resources/Java_16_Grammar.y":768  */
                                                   { yyval = new ParameterTail(null,null,null,false,true); };
  break;


  case 165: /* FormalParameterTail: IDENTIFIER DOT THIS  */
  if (yyn == 165)
    /* "src/main/resources/Java_16_Grammar.y":769  */
                                                   { yyval = new ParameterTail(null,((Token)(yystack.valueAt (2))),null,false,true); };
  break;


  case 166: /* ThrowsOpt: %empty  */
  if (yyn == 166)
    /* "src/main/resources/Java_16_Grammar.y":781  */
                             { yyval = null; };
  break;


  case 167: /* ThrowsOpt: THROWS ClassTypeList1  */
  if (yyn == 167)
    /* "src/main/resources/Java_16_Grammar.y":782  */
                             { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 168: /* MethodBody: Block  */
  if (yyn == 168)
    /* "src/main/resources/Java_16_Grammar.y":786  */
                   { yyval = ((tree.Statement.Block)(yystack.valueAt (0))); };
  break;


  case 169: /* MethodBody: SEMICOLON  */
  if (yyn == 169)
    /* "src/main/resources/Java_16_Grammar.y":787  */
                   { yyval = null; };
  break;


  case 170: /* DimsOpt: %empty  */
  if (yyn == 170)
    /* "src/main/resources/Java_16_Grammar.y":793  */
                 { yyval = null; };
  break;


  case 171: /* DimsOpt: Dims  */
  if (yyn == 171)
    /* "src/main/resources/Java_16_Grammar.y":794  */
                 { yyval = ((Dims)(yystack.valueAt (0))); };
  break;


  case 172: /* Dims: Dim  */
  if (yyn == 172)
    /* "src/main/resources/Java_16_Grammar.y":798  */
                { yyval = new Dims(((Dim)(yystack.valueAt (0)))); };
  break;


  case 173: /* Dims: Dims Dim  */
  if (yyn == 173)
    /* "src/main/resources/Java_16_Grammar.y":799  */
                { yyval = ((Dims)(yystack.valueAt (1))).add(((Dim)(yystack.valueAt (0)))); };
  break;


  case 174: /* Dim: AnnotationSeq LBRACKET RBRACKET  */
  if (yyn == 174)
    /* "src/main/resources/Java_16_Grammar.y":803  */
                                      { yyval = new Dim(((Annotations)(yystack.valueAt (2)))); };
  break;


  case 175: /* Dim: LBRACKET RBRACKET  */
  if (yyn == 175)
    /* "src/main/resources/Java_16_Grammar.y":804  */
                                      { yyval = new Dim(null); };
  break;


  case 176: /* InterfaceDeclaration: NormalInterfaceDeclaration  */
  if (yyn == 176)
    /* "src/main/resources/Java_16_Grammar.y":810  */
                                      { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 177: /* InterfaceDeclaration: AnnotationInterfaceDeclaration  */
  if (yyn == 177)
    /* "src/main/resources/Java_16_Grammar.y":811  */
                                      { yyval = null; };
  break;


  case 178: /* NormalInterfaceDeclaration: INTERFACE IDENTIFIER TypeParametersOpt InterfaceExtendsOpt InterfaceBody  */
  if (yyn == 178)
    /* "src/main/resources/Java_16_Grammar.y":816  */
                                         { yyval = new NormalInterfaceDeclaration(((Token)(yystack.valueAt (3))),((TypeParameters)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 179: /* InterfaceExtendsOpt: %empty  */
  if (yyn == 179)
    /* "src/main/resources/Java_16_Grammar.y":820  */
                        { yyval = null; };
  break;


  case 180: /* InterfaceExtendsOpt: InterfaceExtends  */
  if (yyn == 180)
    /* "src/main/resources/Java_16_Grammar.y":821  */
                        { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 181: /* InterfaceExtends: EXTENDS Type  */
  if (yyn == 181)
    /* "src/main/resources/Java_16_Grammar.y":825  */
                                   { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 182: /* InterfaceExtends: InterfaceExtends COMMA Type  */
  if (yyn == 182)
    /* "src/main/resources/Java_16_Grammar.y":826  */
                                   { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 183: /* InterfaceBody: LBRACE RBRACE  */
  if (yyn == 183)
    /* "src/main/resources/Java_16_Grammar.y":830  */
                                                  { yyval = null; };
  break;


  case 184: /* InterfaceBody: LBRACE InterfaceMemberDeclarationSeq RBRACE  */
  if (yyn == 184)
    /* "src/main/resources/Java_16_Grammar.y":831  */
                                                  { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 185: /* InterfaceMemberDeclarationSeq: ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 185)
    /* "src/main/resources/Java_16_Grammar.y":835  */
                                                                              { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 186: /* InterfaceMemberDeclarationSeq: InterfaceMemberDeclarationSeq ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 186)
    /* "src/main/resources/Java_16_Grammar.y":836  */
                                                                              { yyval = ((Declarations)(yystack.valueAt (2))).add(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 187: /* InterfaceMemberDeclaration: ConstantDeclaration  */
  if (yyn == 187)
    /* "src/main/resources/Java_16_Grammar.y":840  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 188: /* InterfaceMemberDeclaration: InterfaceMethodDeclaration  */
  if (yyn == 188)
    /* "src/main/resources/Java_16_Grammar.y":841  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 189: /* InterfaceMemberDeclaration: ClassDeclaration  */
  if (yyn == 189)
    /* "src/main/resources/Java_16_Grammar.y":842  */
                                  { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 190: /* InterfaceMemberDeclaration: InterfaceDeclaration  */
  if (yyn == 190)
    /* "src/main/resources/Java_16_Grammar.y":843  */
                                  { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 191: /* ConstantDeclaration: Type VariableDeclaratorList SEMICOLON  */
  if (yyn == 191)
    /* "src/main/resources/Java_16_Grammar.y":847  */
                                            { yyval = new TypeAndDeclarators(((tree.Type.Type)(yystack.valueAt (2))),((VariableDeclarators)(yystack.valueAt (1)))); };
  break;


  case 192: /* InterfaceMethodDeclaration: MethodHeader MethodBody  */
  if (yyn == 192)
    /* "src/main/resources/Java_16_Grammar.y":851  */
                              { yyval = null; };
  break;


  case 193: /* AnnotationInterfaceDeclaration: AT INTERFACE IDENTIFIER AnnotationInterfaceBody  */
  if (yyn == 193)
    /* "src/main/resources/Java_16_Grammar.y":855  */
                                                      { yyval = null; };
  break;


  case 205: /* Block: LBRACE RBRACE  */
  if (yyn == 205)
    /* "src/main/resources/Java_16_Grammar.y":888  */
                                        { yyval = null; };
  break;


  case 206: /* Block: LBRACE BlockStatementSeq RBRACE  */
  if (yyn == 206)
    /* "src/main/resources/Java_16_Grammar.y":889  */
                                        { yyval = new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1)))); };
  break;


  case 207: /* BlockStatementSeq: BlockStatement  */
  if (yyn == 207)
    /* "src/main/resources/Java_16_Grammar.y":893  */
                                           { yyval = new BlockStatements(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 208: /* BlockStatementSeq: BlockStatementSeq BlockStatement  */
  if (yyn == 208)
    /* "src/main/resources/Java_16_Grammar.y":894  */
                                       { yyval = ((tree.Statement.BlockStatements)(yystack.valueAt (1))).add(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 209: /* BlockStatement: ModifierSeqOpt ClassDeclaration  */
  if (yyn == 209)
    /* "src/main/resources/Java_16_Grammar.y":910  */
                                                { yyval = new BlockStatement(((ClassDeclaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 210: /* BlockStatement: ModifierSeqOpt NormalInterfaceDeclaration  */
  if (yyn == 210)
    /* "src/main/resources/Java_16_Grammar.y":911  */
                                                { yyval = new BlockStatement(((InterfaceDeclaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 211: /* BlockStatement: ModifierSeq LocalVariableDeclaration SEMICOLON  */
  if (yyn == 211)
    /* "src/main/resources/Java_16_Grammar.y":913  */
                                                { yyval = new BlockStatement(((tree.Declaration.Declaration)(yystack.valueAt (1))).addModifiers(((Modifiers)(yystack.valueAt (2))))); };
  break;


  case 212: /* BlockStatement: LocalVariableDeclaration SEMICOLON  */
  if (yyn == 212)
    /* "src/main/resources/Java_16_Grammar.y":915  */
                                                { yyval = new BlockStatement(((tree.Declaration.Declaration)(yystack.valueAt (1)))); };
  break;


  case 213: /* BlockStatement: Statement  */
  if (yyn == 213)
    /* "src/main/resources/Java_16_Grammar.y":916  */
                                                { yyval = new BlockStatement(((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 214: /* LocalVariableDeclaration: UnannotatedType VariableDeclaratorList  */
  if (yyn == 214)
    /* "src/main/resources/Java_16_Grammar.y":920  */
                                             { yyval = new TypeAndDeclarators(((tree.Type.UnannotatedType)(yystack.valueAt (1))),((VariableDeclarators)(yystack.valueAt (0)))); };
  break;


  case 215: /* LocalVariableDeclaration: VAR VariableDeclaratorList  */
  if (yyn == 215)
    /* "src/main/resources/Java_16_Grammar.y":921  */
                                             { yyval = new TypeAndDeclarators(null,((VariableDeclarators)(yystack.valueAt (0)))); };
  break;


  case 216: /* Statement: SimpleStatement  */
  if (yyn == 216)
    /* "src/main/resources/Java_16_Grammar.y":925  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 217: /* Statement: LabeledStatement  */
  if (yyn == 217)
    /* "src/main/resources/Java_16_Grammar.y":926  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 218: /* Statement: IfThenElseStatement  */
  if (yyn == 218)
    /* "src/main/resources/Java_16_Grammar.y":927  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 219: /* Statement: WhileStatement  */
  if (yyn == 219)
    /* "src/main/resources/Java_16_Grammar.y":928  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 220: /* Statement: ForStatement  */
  if (yyn == 220)
    /* "src/main/resources/Java_16_Grammar.y":929  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 221: /* SimpleStatement: Block  */
  if (yyn == 221)
    /* "src/main/resources/Java_16_Grammar.y":933  */
                                        { yyval = ((tree.Statement.Block)(yystack.valueAt (0))); };
  break;


  case 222: /* SimpleStatement: SEMICOLON  */
  if (yyn == 222)
    /* "src/main/resources/Java_16_Grammar.y":934  */
                                            { yyval = null; };
  break;


  case 223: /* SimpleStatement: StatementExpression SEMICOLON  */
  if (yyn == 223)
    /* "src/main/resources/Java_16_Grammar.y":935  */
                                        { yyval = ((StatementExpression)(yystack.valueAt (1))); };
  break;


  case 224: /* SimpleStatement: ASSERT Expression SEMICOLON  */
  if (yyn == 224)
    /* "src/main/resources/Java_16_Grammar.y":937  */
                                                   { yyval = new Assert(null,((tree.Expression.Expression)(yystack.valueAt (1))),null); };
  break;


  case 225: /* SimpleStatement: ASSERT Expression COLON Expression SEMICOLON  */
  if (yyn == 225)
    /* "src/main/resources/Java_16_Grammar.y":938  */
                                                   { yyval = new Assert(null,((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 226: /* SimpleStatement: SWITCH LPAREN Expression RPAREN SwitchBlock  */
  if (yyn == 226)
    /* "src/main/resources/Java_16_Grammar.y":940  */
                                                   { yyval = null; };
  break;


  case 227: /* SimpleStatement: DO Statement WHILE LPAREN Expression RPAREN SEMICOLON  */
  if (yyn == 227)
    /* "src/main/resources/Java_16_Grammar.y":941  */
                                                            { yyval = new Do(null,((tree.Statement.Statement)(yystack.valueAt (5))),((tree.Expression.Expression)(yystack.valueAt (2)))); };
  break;


  case 228: /* SimpleStatement: BREAK SEMICOLON  */
  if (yyn == 228)
    /* "src/main/resources/Java_16_Grammar.y":943  */
                                  { yyval = new Break(null,null); };
  break;


  case 229: /* SimpleStatement: BREAK IDENTIFIER SEMICOLON  */
  if (yyn == 229)
    /* "src/main/resources/Java_16_Grammar.y":944  */
                                  { yyval = new Break(null,((Token)(yystack.valueAt (1)))); };
  break;


  case 230: /* SimpleStatement: CONTINUE SEMICOLON  */
  if (yyn == 230)
    /* "src/main/resources/Java_16_Grammar.y":946  */
                                      { yyval = new Continue(null,null); };
  break;


  case 231: /* SimpleStatement: CONTINUE IDENTIFIER SEMICOLON  */
  if (yyn == 231)
    /* "src/main/resources/Java_16_Grammar.y":947  */
                                      { yyval = new Continue(null,((Token)(yystack.valueAt (1)))); };
  break;


  case 232: /* SimpleStatement: RETURN SEMICOLON  */
  if (yyn == 232)
    /* "src/main/resources/Java_16_Grammar.y":949  */
                                      { yyval = new Return(null,null); };
  break;


  case 233: /* SimpleStatement: RETURN Expression SEMICOLON  */
  if (yyn == 233)
    /* "src/main/resources/Java_16_Grammar.y":950  */
                                      { yyval = new Return(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 234: /* SimpleStatement: SYNCHRONIZED LPAREN Expression RPAREN Block  */
  if (yyn == 234)
    /* "src/main/resources/Java_16_Grammar.y":952  */
                                                   { yyval = new Synchronized(null,((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 235: /* SimpleStatement: THROW Expression SEMICOLON  */
  if (yyn == 235)
    /* "src/main/resources/Java_16_Grammar.y":954  */
                                  { yyval = new Throw(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 236: /* SimpleStatement: YIELD Expression SEMICOLON  */
  if (yyn == 236)
    /* "src/main/resources/Java_16_Grammar.y":955  */
                                  { yyval = new Yield(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 237: /* SimpleStatement: TRY Block Catches  */
  if (yyn == 237)
    /* "src/main/resources/Java_16_Grammar.y":958  */
                                   { yyval = null; };
  break;


  case 238: /* SimpleStatement: TRY Block Catches Finally  */
  if (yyn == 238)
    /* "src/main/resources/Java_16_Grammar.y":959  */
                                   { yyval = null; };
  break;


  case 239: /* SimpleStatement: TRY Block Finally  */
  if (yyn == 239)
    /* "src/main/resources/Java_16_Grammar.y":960  */
                                   { yyval = null; };
  break;


  case 240: /* SimpleStatement: TRY ResourceSpecification Block CatchesOpt FinallyOpt  */
  if (yyn == 240)
    /* "src/main/resources/Java_16_Grammar.y":962  */
                                   { yyval = null; };
  break;


  case 241: /* SimpleStatement: error SEMICOLON  */
  if (yyn == 241)
    /* "src/main/resources/Java_16_Grammar.y":963  */
                                   { yyval = null; };
  break;


  case 242: /* LabeledStatement: IDENTIFIER COLON Statement  */
  if (yyn == 242)
    /* "src/main/resources/Java_16_Grammar.y":967  */
                                 { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))).addLabel(((Token)(yystack.valueAt (2)))); };
  break;


  case 243: /* StatementExpression: Assignment  */
  if (yyn == 243)
    /* "src/main/resources/Java_16_Grammar.y":971  */
                                   { yyval = new StatementExpression(null,((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 244: /* StatementExpression: PreIncrementExpression  */
  if (yyn == 244)
    /* "src/main/resources/Java_16_Grammar.y":972  */
                                   { yyval = new StatementExpression(null,((UnaryPrefix)(yystack.valueAt (0)))); };
  break;


  case 245: /* StatementExpression: PreDecrementExpression  */
  if (yyn == 245)
    /* "src/main/resources/Java_16_Grammar.y":973  */
                                   { yyval = new StatementExpression(null,((UnaryPrefix)(yystack.valueAt (0)))); };
  break;


  case 246: /* StatementExpression: PostIncrementExpression  */
  if (yyn == 246)
    /* "src/main/resources/Java_16_Grammar.y":974  */
                                   { yyval = new StatementExpression(null,((UnaryPostfix)(yystack.valueAt (0)))); };
  break;


  case 247: /* StatementExpression: PostDecrementExpression  */
  if (yyn == 247)
    /* "src/main/resources/Java_16_Grammar.y":975  */
                                   { yyval = new StatementExpression(null,((UnaryPostfix)(yystack.valueAt (0)))); };
  break;


  case 248: /* StatementExpression: MethodInvocation  */
  if (yyn == 248)
    /* "src/main/resources/Java_16_Grammar.y":976  */
                                   { yyval = new StatementExpression(null,((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 249: /* StatementExpression: ClassInstanceCreationExpression  */
  if (yyn == 249)
    /* "src/main/resources/Java_16_Grammar.y":977  */
                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 250: /* IfThenElseStatement: IF LPAREN Expression RPAREN Statement ElsePartOpt  */
  if (yyn == 250)
    /* "src/main/resources/Java_16_Grammar.y":981  */
                                                        { yyval = new IfThenElse(null,((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Statement.Statement)(yystack.valueAt (1))),((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 251: /* ElsePartOpt: %empty  */
  if (yyn == 251)
    /* "src/main/resources/Java_16_Grammar.y":985  */
                      { yyval = null; };
  break;


  case 252: /* ElsePartOpt: ELSE Statement  */
  if (yyn == 252)
    /* "src/main/resources/Java_16_Grammar.y":986  */
                      { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 253: /* SwitchBlock: LBRACE RBRACE  */
  if (yyn == 253)
    /* "src/main/resources/Java_16_Grammar.y":990  */
                                                                { yyval = null; };
  break;


  case 254: /* SwitchBlock: LBRACE SwitchRuleSeq RBRACE  */
  if (yyn == 254)
    /* "src/main/resources/Java_16_Grammar.y":991  */
                                                                { yyval = null; };
  break;


  case 255: /* SwitchBlock: LBRACE SwitchBlockStatementGroupSeq RBRACE  */
  if (yyn == 255)
    /* "src/main/resources/Java_16_Grammar.y":992  */
                                                                { yyval = null; };
  break;


  case 256: /* SwitchRuleSeq: SwitchRule  */
  if (yyn == 256)
    /* "src/main/resources/Java_16_Grammar.y":999  */
                               { yyval = new SwitchRules(((SwitchRule)(yystack.valueAt (0)))); };
  break;


  case 257: /* SwitchRuleSeq: SwitchRuleSeq SwitchRule  */
  if (yyn == 257)
    /* "src/main/resources/Java_16_Grammar.y":1000  */
                               { yyval = ((SwitchRules)(yystack.valueAt (1))).add(((SwitchRule)(yystack.valueAt (0)))); };
  break;


  case 258: /* SwitchRule: SwitchLabel ARROW Expression SEMICOLON  */
  if (yyn == 258)
    /* "src/main/resources/Java_16_Grammar.y":1004  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 259: /* SwitchRule: SwitchLabel ARROW Block  */
  if (yyn == 259)
    /* "src/main/resources/Java_16_Grammar.y":1005  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 260: /* SwitchRule: SwitchLabel ARROW THROW Expression SEMICOLON  */
  if (yyn == 260)
    /* "src/main/resources/Java_16_Grammar.y":1006  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (4))),new Throw(null,((tree.Expression.Expression)(yystack.valueAt (1))))); };
  break;


  case 264: /* SwitchLabelSeq: SwitchLabel COLON  */
  if (yyn == 264)
    /* "src/main/resources/Java_16_Grammar.y":1020  */
                                       { yyval = new SwitchLabels(((SwitchLabel)(yystack.valueAt (1)))); };
  break;


  case 265: /* SwitchLabelSeq: SwitchLabelSeq SwitchLabel COLON  */
  if (yyn == 265)
    /* "src/main/resources/Java_16_Grammar.y":1021  */
                                       { yyval = ((SwitchLabels)(yystack.valueAt (2))).add(((SwitchLabel)(yystack.valueAt (1)))); };
  break;


  case 266: /* SwitchLabel: CASE CaseExpressionList  */
  if (yyn == 266)
    /* "src/main/resources/Java_16_Grammar.y":1025  */
                               { yyval = ((SwitchLabel)(yystack.valueAt (0))); };
  break;


  case 267: /* SwitchLabel: DEFAULT  */
  if (yyn == 267)
    /* "src/main/resources/Java_16_Grammar.y":1026  */
                                   { yyval = null; };
  break;


  case 268: /* CaseExpressionList: AssignmentExpression  */
  if (yyn == 268)
    /* "src/main/resources/Java_16_Grammar.y":1030  */
                                                    { yyval = new SwitchLabel(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 269: /* CaseExpressionList: CaseExpressionList COMMA AssignmentExpression  */
  if (yyn == 269)
    /* "src/main/resources/Java_16_Grammar.y":1031  */
                                                    { yyval = ((SwitchLabel)(yystack.valueAt (2))).add(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 270: /* WhileStatement: WHILE LPAREN Expression RPAREN Statement  */
  if (yyn == 270)
    /* "src/main/resources/Java_16_Grammar.y":1038  */
                                                { yyval = new While(null,((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 271: /* ForStatement: BasicForStatement  */
  if (yyn == 271)
    /* "src/main/resources/Java_16_Grammar.y":1042  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 272: /* ForStatement: EnhancedForStatement  */
  if (yyn == 272)
    /* "src/main/resources/Java_16_Grammar.y":1043  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 273: /* BasicForStatement: FOR LPAREN ForInitOpt SEMICOLON ExpressionOpt SEMICOLON StatementExpressionListOpt RPAREN Statement  */
  if (yyn == 273)
    /* "src/main/resources/Java_16_Grammar.y":1048  */
                          { yyval = null; };
  break;


  case 277: /* ExpressionOpt: %empty  */
  if (yyn == 277)
    /* "src/main/resources/Java_16_Grammar.y":1058  */
                  { yyval = null; };
  break;


  case 278: /* ExpressionOpt: Expression  */
  if (yyn == 278)
    /* "src/main/resources/Java_16_Grammar.y":1059  */
                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 279: /* StatementExpressionList: StatementExpression  */
  if (yyn == 279)
    /* "src/main/resources/Java_16_Grammar.y":1066  */
                                                        { yyval = ((StatementExpression)(yystack.valueAt (0))); };
  break;


  case 280: /* StatementExpressionList: StatementExpressionList COMMA StatementExpression  */
  if (yyn == 280)
    /* "src/main/resources/Java_16_Grammar.y":1067  */
                                                        { yyval = ((StatementExpressions)(yystack.valueAt (2))).add(((StatementExpression)(yystack.valueAt (0)))); };
  break;


  case 281: /* StatementExpressionListOpt: %empty  */
  if (yyn == 281)
    /* "src/main/resources/Java_16_Grammar.y":1071  */
                               { yyval = null; };
  break;


  case 282: /* StatementExpressionListOpt: StatementExpressionList  */
  if (yyn == 282)
    /* "src/main/resources/Java_16_Grammar.y":1072  */
                               { yyval = ((StatementExpressions)(yystack.valueAt (0))); };
  break;


  case 283: /* EnhancedForStatement: FOR LPAREN LocalVariableDeclaration COLON Expression RPAREN Statement  */
  if (yyn == 283)
    /* "src/main/resources/Java_16_Grammar.y":1076  */
                                                                            { yyval = null; };
  break;


  case 284: /* CatchesOpt: %empty  */
  if (yyn == 284)
    /* "src/main/resources/Java_16_Grammar.y":1080  */
               { yyval = null; };
  break;


  case 285: /* CatchesOpt: Catches  */
  if (yyn == 285)
    /* "src/main/resources/Java_16_Grammar.y":1081  */
               { yyval = ((CatchClauses)(yystack.valueAt (0))); };
  break;


  case 286: /* Catches: CatchClause  */
  if (yyn == 286)
    /* "src/main/resources/Java_16_Grammar.y":1085  */
                            { yyval = new CatchClauses(((CatchClause)(yystack.valueAt (0)))); };
  break;


  case 287: /* Catches: Catches CatchClause  */
  if (yyn == 287)
    /* "src/main/resources/Java_16_Grammar.y":1086  */
                            { yyval = ((CatchClauses)(yystack.valueAt (1))).add(((CatchClause)(yystack.valueAt (0)))); };
  break;


  case 288: /* CatchClause: CATCH LPAREN CatchFormalParameter RPAREN Block  */
  if (yyn == 288)
    /* "src/main/resources/Java_16_Grammar.y":1090  */
                                                     { yyval = new CatchClause(((CatchParameter)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 289: /* CatchFormalParameter: ModifierSeqOpt CatchType IDENTIFIER DimsOpt  */
  if (yyn == 289)
    /* "src/main/resources/Java_16_Grammar.y":1094  */
                                                  { yyval = new CatchParameter(((Modifiers)(yystack.valueAt (3))),((tree.Type.TypeList)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0)))); };
  break;


  case 290: /* CatchType: Type  */
  if (yyn == 290)
    /* "src/main/resources/Java_16_Grammar.y":1098  */
                              { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 291: /* CatchType: CatchType VERTICAL Type  */
  if (yyn == 291)
    /* "src/main/resources/Java_16_Grammar.y":1099  */
                              { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 302: /* Primary: Literal  */
  if (yyn == 302)
    /* "src/main/resources/Java_16_Grammar.y":1136  */
                                        { yyval = new Literal(((Token)(yystack.valueAt (0)))); };
  break;


  case 303: /* Primary: Type DimsOpt DOT CLASS  */
  if (yyn == 303)
    /* "src/main/resources/Java_16_Grammar.y":1137  */
                                        { yyval = new ClassLiteral(((tree.Type.Type)(yystack.valueAt (3))),((Dims)(yystack.valueAt (2)))); };
  break;


  case 304: /* Primary: VOID DimsOpt DOT CLASS  */
  if (yyn == 304)
    /* "src/main/resources/Java_16_Grammar.y":1138  */
                                        { yyval = new ClassLiteral(null,((Dims)(yystack.valueAt (2)))); };
  break;


  case 305: /* Primary: THIS  */
  if (yyn == 305)
    /* "src/main/resources/Java_16_Grammar.y":1139  */
                                        { yyval = new This(null); };
  break;


  case 306: /* Primary: Type DOT THIS  */
  if (yyn == 306)
    /* "src/main/resources/Java_16_Grammar.y":1140  */
                                        { yyval = new This(((tree.Type.Type)(yystack.valueAt (2)))); };
  break;


  case 307: /* Primary: LPAREN Expression RPAREN  */
  if (yyn == 307)
    /* "src/main/resources/Java_16_Grammar.y":1141  */
                                        { yyval = new Parenthesized(((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 308: /* Primary: ClassInstanceCreationExpression  */
  if (yyn == 308)
    /* "src/main/resources/Java_16_Grammar.y":1142  */
                                        { yyval = null; };
  break;


  case 309: /* Primary: FieldAccess  */
  if (yyn == 309)
    /* "src/main/resources/Java_16_Grammar.y":1143  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 310: /* Primary: ArrayAccess  */
  if (yyn == 310)
    /* "src/main/resources/Java_16_Grammar.y":1144  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 311: /* Primary: MethodInvocation  */
  if (yyn == 311)
    /* "src/main/resources/Java_16_Grammar.y":1145  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 312: /* Primary: MethodReference  */
  if (yyn == 312)
    /* "src/main/resources/Java_16_Grammar.y":1146  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 313: /* Primary: ArrayCreationExpression  */
  if (yyn == 313)
    /* "src/main/resources/Java_16_Grammar.y":1147  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 314: /* ClassInstanceCreationExpression: UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 314)
    /* "src/main/resources/Java_16_Grammar.y":1157  */
                                                                  { yyval = null; };
  break;


  case 315: /* ClassInstanceCreationExpression: CompoundName DOT UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 315)
    /* "src/main/resources/Java_16_Grammar.y":1158  */
                                                                  { yyval = null; };
  break;


  case 316: /* ClassInstanceCreationExpression: Primary DOT UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 316)
    /* "src/main/resources/Java_16_Grammar.y":1159  */
                                                                  { yyval = null; };
  break;


  case 322: /* TypeArgumentsOpt: %empty  */
  if (yyn == 322)
    /* "src/main/resources/Java_16_Grammar.y":1177  */
                      { yyval = null; };
  break;


  case 323: /* TypeArgumentsOpt: TypeArguments  */
  if (yyn == 323)
    /* "src/main/resources/Java_16_Grammar.y":1178  */
                      { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (0))); };
  break;


  case 324: /* TypeArguments: LESS TypeArgumentList GREATER  */
  if (yyn == 324)
    /* "src/main/resources/Java_16_Grammar.y":1182  */
                                     { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (1))); };
  break;


  case 325: /* TypeArgumentList: TypeArgument  */
  if (yyn == 325)
    /* "src/main/resources/Java_16_Grammar.y":1186  */
                                           { yyval = new TypeArguments(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 326: /* TypeArgumentList: TypeArgumentList COMMA TypeArgument  */
  if (yyn == 326)
    /* "src/main/resources/Java_16_Grammar.y":1187  */
                                           { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (2))).add(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 327: /* TypeArgument: Type  */
  if (yyn == 327)
    /* "src/main/resources/Java_16_Grammar.y":1191  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),0,null); };
  break;


  case 328: /* TypeArgument: QUESTION  */
  if (yyn == 328)
    /* "src/main/resources/Java_16_Grammar.y":1192  */
                                               { yyval = new TypeArgument(null,1,null); };
  break;


  case 329: /* TypeArgument: QUESTION EXTENDS Type  */
  if (yyn == 329)
    /* "src/main/resources/Java_16_Grammar.y":1193  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),1,null); };
  break;


  case 330: /* TypeArgument: QUESTION SUPER Type  */
  if (yyn == 330)
    /* "src/main/resources/Java_16_Grammar.y":1194  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,null); };
  break;


  case 331: /* TypeArgument: AnnotationSeq QUESTION  */
  if (yyn == 331)
    /* "src/main/resources/Java_16_Grammar.y":1195  */
                                               { yyval = new TypeArgument(null,1,((Annotations)(yystack.valueAt (1)))); };
  break;


  case 332: /* TypeArgument: AnnotationSeq QUESTION EXTENDS Type  */
  if (yyn == 332)
    /* "src/main/resources/Java_16_Grammar.y":1196  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 333: /* TypeArgument: AnnotationSeq QUESTION SUPER Type  */
  if (yyn == 333)
    /* "src/main/resources/Java_16_Grammar.y":1197  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),3,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 334: /* FieldAccess: Primary DOT IDENTIFIER  */
  if (yyn == 334)
    /* "src/main/resources/Java_16_Grammar.y":1207  */
                                             { yyval = new FieldAccess(((tree.Expression.Expression)(yystack.valueAt (2))),  false,((Token)(yystack.valueAt (0)))); };
  break;


  case 335: /* FieldAccess: SUPER DOT IDENTIFIER  */
  if (yyn == 335)
    /* "src/main/resources/Java_16_Grammar.y":1208  */
                                             { yyval = new FieldAccess(null,true, ((Token)(yystack.valueAt (0)))); };
  break;


  case 336: /* FieldAccess: CompoundName DOT SUPER DOT IDENTIFIER  */
  if (yyn == 336)
    /* "src/main/resources/Java_16_Grammar.y":1209  */
                                             { yyval = new FieldAccess(new SimpleReference(((CompoundName)(yystack.valueAt (4)))),true,((Token)(yystack.valueAt (0)))); };
  break;


  case 337: /* ArrayAccess: CompoundName LBRACKET Expression RBRACKET  */
  if (yyn == 337)
    /* "src/main/resources/Java_16_Grammar.y":1213  */
                                                 { yyval = new ArrayAccess(new SimpleReference(((CompoundName)(yystack.valueAt (3)))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 338: /* ArrayAccess: Primary LBRACKET Expression RBRACKET  */
  if (yyn == 338)
    /* "src/main/resources/Java_16_Grammar.y":1214  */
                                                 { yyval = new ArrayAccess(((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 339: /* MethodInvocation: CompoundName Arguments  */
  if (yyn == 339)
    /* "src/main/resources/Java_16_Grammar.y":1218  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (1))));
                                                                         yyval = new MethodInvocation(ref,false,null,null,((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 340: /* MethodInvocation: CompoundName DOT TypeArguments IDENTIFIER Arguments  */
  if (yyn == 340)
    /* "src/main/resources/Java_16_Grammar.y":1220  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (4))));
                                                                         yyval = new MethodInvocation(ref,false,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 341: /* MethodInvocation: Primary DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 341)
    /* "src/main/resources/Java_16_Grammar.y":1222  */
                                                                       { yyval = new MethodInvocation(((tree.Expression.Expression)(yystack.valueAt (4))),false,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 342: /* MethodInvocation: SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 342)
    /* "src/main/resources/Java_16_Grammar.y":1223  */
                                                                       { yyval = new MethodInvocation(null,true,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 343: /* MethodInvocation: CompoundName DOT SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 343)
    /* "src/main/resources/Java_16_Grammar.y":1224  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (6))));
                                                                         yyval = new MethodInvocation(ref,true,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 344: /* Arguments: LPAREN RPAREN  */
  if (yyn == 344)
    /* "src/main/resources/Java_16_Grammar.y":1229  */
                                 { yyval = null; };
  break;


  case 345: /* Arguments: LPAREN ArgumentList RPAREN  */
  if (yyn == 345)
    /* "src/main/resources/Java_16_Grammar.y":1230  */
                                 { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (1))); };
  break;


  case 346: /* ArgumentList: Expression  */
  if (yyn == 346)
    /* "src/main/resources/Java_16_Grammar.y":1239  */
                                    { yyval = new ArgumentList(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 347: /* ArgumentList: ArgumentList COMMA Expression  */
  if (yyn == 347)
    /* "src/main/resources/Java_16_Grammar.y":1240  */
                                    { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (2))).add(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 348: /* MethodReference: Primary DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 348)
    /* "src/main/resources/Java_16_Grammar.y":1245  */
                                                           { yyval = null; };
  break;


  case 349: /* MethodReference: Type DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 349)
    /* "src/main/resources/Java_16_Grammar.y":1246  */
                                                           { yyval = null; };
  break;


  case 350: /* MethodReference: SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 350)
    /* "src/main/resources/Java_16_Grammar.y":1247  */
                                                           { yyval = null; };
  break;


  case 351: /* MethodReference: Type DOT SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 351)
    /* "src/main/resources/Java_16_Grammar.y":1248  */
                                                           { yyval = null; };
  break;


  case 352: /* MethodReference: Type DBL_COLON TypeArgumentsOpt NEW  */
  if (yyn == 352)
    /* "src/main/resources/Java_16_Grammar.y":1249  */
                                                           { yyval = null; };
  break;


  case 353: /* ArrayCreationExpression: NEW Type DimExprs DimsOpt  */
  if (yyn == 353)
    /* "src/main/resources/Java_16_Grammar.y":1253  */
                                       { yyval = null; };
  break;


  case 354: /* ArrayCreationExpression: NEW Type Dims ArrayInitializer  */
  if (yyn == 354)
    /* "src/main/resources/Java_16_Grammar.y":1254  */
                                       { yyval = null; };
  break;


  case 359: /* Expression: LambdaExpression  */
  if (yyn == 359)
    /* "src/main/resources/Java_16_Grammar.y":1270  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 360: /* Expression: AssignmentExpression  */
  if (yyn == 360)
    /* "src/main/resources/Java_16_Grammar.y":1271  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 361: /* LambdaExpression: IDENTIFIER ARROW Expression  */
  if (yyn == 361)
    /* "src/main/resources/Java_16_Grammar.y":1276  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 362: /* LambdaExpression: IDENTIFIER ARROW Block  */
  if (yyn == 362)
    /* "src/main/resources/Java_16_Grammar.y":1278  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 363: /* LambdaExpression: LambdaParameters ARROW Expression  */
  if (yyn == 363)
    /* "src/main/resources/Java_16_Grammar.y":1279  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 364: /* LambdaExpression: LambdaParameters ARROW Block  */
  if (yyn == 364)
    /* "src/main/resources/Java_16_Grammar.y":1280  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 365: /* LambdaParameters: LPAREN RPAREN  */
  if (yyn == 365)
    /* "src/main/resources/Java_16_Grammar.y":1289  */
                                           { yyval = null; };
  break;


  case 366: /* LambdaParameters: LPAREN LambdaParameterList RPAREN  */
  if (yyn == 366)
    /* "src/main/resources/Java_16_Grammar.y":1292  */
                                           { yyval = ((ParameterDeclarations)(yystack.valueAt (1))); };
  break;


  case 367: /* LambdaParameterList: LambdaParameter  */
  if (yyn == 367)
    /* "src/main/resources/Java_16_Grammar.y":1296  */
                                                { yyval = new ParameterDeclarations(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 368: /* LambdaParameterList: LambdaParameterList COMMA LambdaParameter  */
  if (yyn == 368)
    /* "src/main/resources/Java_16_Grammar.y":1297  */
                                                { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 369: /* LambdaParameter: ModifierSeqOpt UnannotatedType IDENTIFIER DimsOpt  */
  if (yyn == 369)
    /* "src/main/resources/Java_16_Grammar.y":1312  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),((tree.Type.UnannotatedType)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 370: /* LambdaParameter: ModifierSeqOpt VAR IDENTIFIER DimsOpt  */
  if (yyn == 370)
    /* "src/main/resources/Java_16_Grammar.y":1313  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),null,((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 371: /* LambdaParameter: ModifierSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER  */
  if (yyn == 371)
    /* "src/main/resources/Java_16_Grammar.y":1315  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (4))),((tree.Type.UnannotatedType)(yystack.valueAt (3))),((Token)(yystack.valueAt (0))).image,((Annotations)(yystack.valueAt (2))),true,null); };
  break;


  case 372: /* AssignmentExpression: ConditionalExpression  */
  if (yyn == 372)
    /* "src/main/resources/Java_16_Grammar.y":1324  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 373: /* AssignmentExpression: Assignment  */
  if (yyn == 373)
    /* "src/main/resources/Java_16_Grammar.y":1325  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 374: /* Assignment: LeftHandSide AssignmentOperator Expression  */
  if (yyn == 374)
    /* "src/main/resources/Java_16_Grammar.y":1329  */
                                                 { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 375: /* LeftHandSide: CompoundName  */
  if (yyn == 375)
    /* "src/main/resources/Java_16_Grammar.y":1333  */
                   { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 376: /* LeftHandSide: FieldAccess  */
  if (yyn == 376)
    /* "src/main/resources/Java_16_Grammar.y":1334  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 377: /* LeftHandSide: ArrayAccess  */
  if (yyn == 377)
    /* "src/main/resources/Java_16_Grammar.y":1335  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 378: /* AssignmentOperator: EQUAL  */
  if (yyn == 378)
    /* "src/main/resources/Java_16_Grammar.y":1339  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 379: /* AssignmentOperator: STAR_EQUAL  */
  if (yyn == 379)
    /* "src/main/resources/Java_16_Grammar.y":1340  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 380: /* AssignmentOperator: SLASH_EQUAL  */
  if (yyn == 380)
    /* "src/main/resources/Java_16_Grammar.y":1341  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 381: /* AssignmentOperator: PERCENT_EQUAL  */
  if (yyn == 381)
    /* "src/main/resources/Java_16_Grammar.y":1342  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 382: /* AssignmentOperator: PLUS_EQUAL  */
  if (yyn == 382)
    /* "src/main/resources/Java_16_Grammar.y":1343  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 383: /* AssignmentOperator: MINUS_EQUAL  */
  if (yyn == 383)
    /* "src/main/resources/Java_16_Grammar.y":1344  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 384: /* AssignmentOperator: LESS_LESS_EQUAL  */
  if (yyn == 384)
    /* "src/main/resources/Java_16_Grammar.y":1345  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 385: /* AssignmentOperator: GR_GR_EQUAL  */
  if (yyn == 385)
    /* "src/main/resources/Java_16_Grammar.y":1346  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 386: /* AssignmentOperator: GR_GR_GR_EQUAL  */
  if (yyn == 386)
    /* "src/main/resources/Java_16_Grammar.y":1347  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 387: /* AssignmentOperator: AMP_EQUAL  */
  if (yyn == 387)
    /* "src/main/resources/Java_16_Grammar.y":1348  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 388: /* AssignmentOperator: CARET_EQUAL  */
  if (yyn == 388)
    /* "src/main/resources/Java_16_Grammar.y":1349  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 389: /* AssignmentOperator: VERTICAL_EQUAL  */
  if (yyn == 389)
    /* "src/main/resources/Java_16_Grammar.y":1350  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 390: /* ConditionalExpression: ConditionalOrExpression ConditionalOrTail  */
  if (yyn == 390)
    /* "src/main/resources/Java_16_Grammar.y":1354  */
                                                { if ( ((tree.Expression.Binary)(yystack.valueAt (0))) == null ) yyval = ((tree.Expression.Expression)(yystack.valueAt (1)));
                                                  else              yyval = new Conditional(((tree.Expression.Expression)(yystack.valueAt (1))),((tree.Expression.Binary)(yystack.valueAt (0))).left,((tree.Expression.Binary)(yystack.valueAt (0))).right); };
  break;


  case 391: /* ConditionalOrTail: %empty  */
  if (yyn == 391)
    /* "src/main/resources/Java_16_Grammar.y":1359  */
                                                       { yyval = null; };
  break;


  case 392: /* ConditionalOrTail: QUESTION Expression COLON ConditionalExpression  */
  if (yyn == 392)
    /* "src/main/resources/Java_16_Grammar.y":1360  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 393: /* ConditionalOrTail: QUESTION Expression COLON LambdaExpression  */
  if (yyn == 393)
    /* "src/main/resources/Java_16_Grammar.y":1361  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 394: /* ConditionalOrExpression: ConditionalAndExpression  */
  if (yyn == 394)
    /* "src/main/resources/Java_16_Grammar.y":1365  */
                                                                    { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 395: /* ConditionalOrExpression: ConditionalOrExpression DBL_VERTICAL ConditionalAndExpression  */
  if (yyn == 395)
    /* "src/main/resources/Java_16_Grammar.y":1366  */
                                                                    { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 396: /* ConditionalAndExpression: InclusiveOrExpression  */
  if (yyn == 396)
    /* "src/main/resources/Java_16_Grammar.y":1370  */
                                                                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 397: /* ConditionalAndExpression: ConditionalAndExpression DBL_AMPERSAND InclusiveOrExpression  */
  if (yyn == 397)
    /* "src/main/resources/Java_16_Grammar.y":1371  */
                                                                   { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 398: /* InclusiveOrExpression: ExclusiveOrExpression  */
  if (yyn == 398)
    /* "src/main/resources/Java_16_Grammar.y":1375  */
                                                           { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 399: /* InclusiveOrExpression: InclusiveOrExpression VERTICAL ExclusiveOrExpression  */
  if (yyn == 399)
    /* "src/main/resources/Java_16_Grammar.y":1376  */
                                                           { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 400: /* ExclusiveOrExpression: AndExpression  */
  if (yyn == 400)
    /* "src/main/resources/Java_16_Grammar.y":1380  */
                                                { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 401: /* ExclusiveOrExpression: ExclusiveOrExpression CARET AndExpression  */
  if (yyn == 401)
    /* "src/main/resources/Java_16_Grammar.y":1381  */
                                                { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 402: /* AndExpression: EqualityExpression  */
  if (yyn == 402)
    /* "src/main/resources/Java_16_Grammar.y":1385  */
                                                 { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 403: /* AndExpression: AndExpression AMPERSAND EqualityExpression  */
  if (yyn == 403)
    /* "src/main/resources/Java_16_Grammar.y":1386  */
                                                 { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 404: /* EqualityExpression: RelationalExpression  */
  if (yyn == 404)
    /* "src/main/resources/Java_16_Grammar.y":1390  */
                                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 405: /* EqualityExpression: EqualityExpression DBL_EQUAL RelationalExpression  */
  if (yyn == 405)
    /* "src/main/resources/Java_16_Grammar.y":1391  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 406: /* EqualityExpression: EqualityExpression NON_EQUAL RelationalExpression  */
  if (yyn == 406)
    /* "src/main/resources/Java_16_Grammar.y":1392  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 407: /* RelationalExpression: ShiftExpression  */
  if (yyn == 407)
    /* "src/main/resources/Java_16_Grammar.y":1396  */
                                                         { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 408: /* RelationalExpression: RelationalExpression LESS ShiftExpression  */
  if (yyn == 408)
    /* "src/main/resources/Java_16_Grammar.y":1397  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 409: /* RelationalExpression: RelationalExpression GREATER ShiftExpression  */
  if (yyn == 409)
    /* "src/main/resources/Java_16_Grammar.y":1398  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 410: /* RelationalExpression: RelationalExpression LESS_EQUAL ShiftExpression  */
  if (yyn == 410)
    /* "src/main/resources/Java_16_Grammar.y":1399  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 411: /* RelationalExpression: RelationalExpression GREATER_EQUAL ShiftExpression  */
  if (yyn == 411)
    /* "src/main/resources/Java_16_Grammar.y":1400  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 412: /* RelationalExpression: InstanceofExpression  */
  if (yyn == 412)
    /* "src/main/resources/Java_16_Grammar.y":1401  */
                                                         { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 413: /* InstanceofExpression: RelationalExpression INSTANCEOF Type  */
  if (yyn == 413)
    /* "src/main/resources/Java_16_Grammar.y":1405  */
                                               { yyval = new InstanceOf(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 414: /* InstanceofExpression: RelationalExpression INSTANCEOF Pattern  */
  if (yyn == 414)
    /* "src/main/resources/Java_16_Grammar.y":1406  */
                                               { yyval = new InstanceOf(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 415: /* ShiftExpression: AdditiveExpression  */
  if (yyn == 415)
    /* "src/main/resources/Java_16_Grammar.y":1410  */
                                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 416: /* ShiftExpression: ShiftExpression DBL_LESS AdditiveExpression  */
  if (yyn == 416)
    /* "src/main/resources/Java_16_Grammar.y":1411  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 417: /* ShiftExpression: ShiftExpression DBL_GREATER AdditiveExpression  */
  if (yyn == 417)
    /* "src/main/resources/Java_16_Grammar.y":1412  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 418: /* ShiftExpression: ShiftExpression TRIPL_GREATER AdditiveExpression  */
  if (yyn == 418)
    /* "src/main/resources/Java_16_Grammar.y":1413  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 419: /* AdditiveExpression: MultiplicativeExpression  */
  if (yyn == 419)
    /* "src/main/resources/Java_16_Grammar.y":1417  */
                                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 420: /* AdditiveExpression: AdditiveExpression PLUS MultiplicativeExpression  */
  if (yyn == 420)
    /* "src/main/resources/Java_16_Grammar.y":1418  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 421: /* AdditiveExpression: AdditiveExpression MINUS MultiplicativeExpression  */
  if (yyn == 421)
    /* "src/main/resources/Java_16_Grammar.y":1419  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 422: /* MultiplicativeExpression: UnaryExpression  */
  if (yyn == 422)
    /* "src/main/resources/Java_16_Grammar.y":1423  */
                                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 423: /* MultiplicativeExpression: MultiplicativeExpression STAR UnaryExpression  */
  if (yyn == 423)
    /* "src/main/resources/Java_16_Grammar.y":1424  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 424: /* MultiplicativeExpression: MultiplicativeExpression SLASH UnaryExpression  */
  if (yyn == 424)
    /* "src/main/resources/Java_16_Grammar.y":1425  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 425: /* MultiplicativeExpression: MultiplicativeExpression PERCENT UnaryExpression  */
  if (yyn == 425)
    /* "src/main/resources/Java_16_Grammar.y":1426  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 426: /* UnaryExpression: PreIncrementExpression  */
  if (yyn == 426)
    /* "src/main/resources/Java_16_Grammar.y":1430  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 427: /* UnaryExpression: PreDecrementExpression  */
  if (yyn == 427)
    /* "src/main/resources/Java_16_Grammar.y":1431  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 428: /* UnaryExpression: PLUS UnaryExpression  */
  if (yyn == 428)
    /* "src/main/resources/Java_16_Grammar.y":1432  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 429: /* UnaryExpression: MINUS UnaryExpression  */
  if (yyn == 429)
    /* "src/main/resources/Java_16_Grammar.y":1433  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 430: /* UnaryExpression: UnaryExpressionNotPlusMinus  */
  if (yyn == 430)
    /* "src/main/resources/Java_16_Grammar.y":1434  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 431: /* PreIncrementExpression: DBL_PLUS UnaryExpression  */
  if (yyn == 431)
    /* "src/main/resources/Java_16_Grammar.y":1438  */
                               { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 432: /* PreDecrementExpression: DBL_MINUS UnaryExpression  */
  if (yyn == 432)
    /* "src/main/resources/Java_16_Grammar.y":1442  */
                                 { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 434: /* UnaryExpressionNotPlusMinus: TILDE UnaryExpression  */
  if (yyn == 434)
    /* "src/main/resources/Java_16_Grammar.y":1447  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 435: /* UnaryExpressionNotPlusMinus: EXCLAMATION UnaryExpression  */
  if (yyn == 435)
    /* "src/main/resources/Java_16_Grammar.y":1448  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 436: /* UnaryExpressionNotPlusMinus: SwitchExpression  */
  if (yyn == 436)
    /* "src/main/resources/Java_16_Grammar.y":1450  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 437: /* PostfixExpression: Primary  */
  if (yyn == 437)
    /* "src/main/resources/Java_16_Grammar.y":1454  */
                               { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 438: /* PostfixExpression: CompoundName  */
  if (yyn == 438)
    /* "src/main/resources/Java_16_Grammar.y":1455  */
                               { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 439: /* PostfixExpression: PostIncrementExpression  */
  if (yyn == 439)
    /* "src/main/resources/Java_16_Grammar.y":1456  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 440: /* PostfixExpression: PostDecrementExpression  */
  if (yyn == 440)
    /* "src/main/resources/Java_16_Grammar.y":1457  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 441: /* PostIncrementExpression: PostfixExpression DBL_PLUS  */
  if (yyn == 441)
    /* "src/main/resources/Java_16_Grammar.y":1461  */
                                 { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 442: /* PostDecrementExpression: PostfixExpression DBL_MINUS  */
  if (yyn == 442)
    /* "src/main/resources/Java_16_Grammar.y":1465  */
                                  { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 443: /* SwitchExpression: SWITCH LPAREN Expression RPAREN SwitchBlock  */
  if (yyn == 443)
    /* "src/main/resources/Java_16_Grammar.y":1483  */
                                                  { yyval = new SwitchExpression(((tree.Expression.Expression)(yystack.valueAt (2))),((SwitchBlock)(yystack.valueAt (0)))); };
  break;


  case 444: /* AnnotationSeqOpt: %empty  */
  if (yyn == 444)
    /* "src/main/resources/Java_16_Grammar.y":1495  */
                       { yyval = null; };
  break;


  case 445: /* AnnotationSeqOpt: AnnotationSeq  */
  if (yyn == 445)
    /* "src/main/resources/Java_16_Grammar.y":1496  */
                       { yyval = ((Annotations)(yystack.valueAt (0))); };
  break;


  case 446: /* AnnotationSeq: Annotation  */
  if (yyn == 446)
    /* "src/main/resources/Java_16_Grammar.y":1500  */
                                { yyval = new Annotations(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 447: /* AnnotationSeq: AnnotationSeq Annotation  */
  if (yyn == 447)
    /* "src/main/resources/Java_16_Grammar.y":1501  */
                                { yyval = ((Annotations)(yystack.valueAt (1))).add(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 448: /* Annotation: AT CompoundName  */
  if (yyn == 448)
    /* "src/main/resources/Java_16_Grammar.y":1505  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (0))),(AnnoParameterList)null); };
  break;


  case 449: /* Annotation: AT CompoundName LPAREN RPAREN  */
  if (yyn == 449)
    /* "src/main/resources/Java_16_Grammar.y":1506  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (2))),(AnnoParameterList)null); };
  break;


  case 450: /* Annotation: AT CompoundName LPAREN AnnoParameterList RPAREN  */
  if (yyn == 450)
    /* "src/main/resources/Java_16_Grammar.y":1507  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),/*$4*/ (AnnoParameterList)null); };
  break;


  case 451: /* Annotation: AT CompoundName LPAREN ElementValue RPAREN  */
  if (yyn == 451)
    /* "src/main/resources/Java_16_Grammar.y":1508  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),(AnnoElementValue)null); };
  break;


  case 452: /* AnnoParameterList: IDENTIFIER EQUAL ElementValue  */
  if (yyn == 452)
    /* "src/main/resources/Java_16_Grammar.y":1512  */
                                                            { yyval = null; };
  break;


  case 453: /* AnnoParameterList: AnnoParameterList COMMA IDENTIFIER EQUAL ElementValue  */
  if (yyn == 453)
    /* "src/main/resources/Java_16_Grammar.y":1513  */
                                                            { yyval = null; };
  break;


  case 454: /* ElementValue: ConditionalExpression  */
  if (yyn == 454)
    /* "src/main/resources/Java_16_Grammar.y":1517  */
                                                 { yyval = null; };
  break;


  case 455: /* ElementValue: LBRACE ElementValueListOpt RBRACE  */
  if (yyn == 455)
    /* "src/main/resources/Java_16_Grammar.y":1518  */
                                                 { yyval = null; };
  break;


  case 456: /* ElementValue: LBRACE COMMA RBRACE  */
  if (yyn == 456)
    /* "src/main/resources/Java_16_Grammar.y":1519  */
                                                 { yyval = null; };
  break;


  case 457: /* ElementValue: Annotation  */
  if (yyn == 457)
    /* "src/main/resources/Java_16_Grammar.y":1520  */
                                                 { yyval = null; };
  break;



/* "src/main/java/parser/JavaParser.java":4111  */

        default: break;
      }

    yystack.pop(yylen);
    yylen = 0;
    /* Shift the result of the reduction.  */
    int yystate = yyLRGotoState(yystack.stateAt(0), yyr1_[yyn]);
    yystack.push(yystate, yyval);
    return YYNEWSTATE;
  }




  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse() throws java.io.IOException

  {


    /* Lookahead token kind.  */
    int yychar = YYEMPTY_;
    /* Lookahead symbol kind.  */
    SymbolKind yytoken = null;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;
    YYStack yystack = new YYStack ();
    int label = YYNEWSTATE;



    /* Semantic value of the lookahead.  */
    Entity yylval = null;

    yyerrstatus_ = 0;
    yynerrs = 0;

    /* Initialize the stack.  */
    yystack.push (yystate, yylval);



    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
           pushed when we come here.  */
      case YYNEWSTATE:

        /* Accept?  */
        if (yystate == YYFINAL_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyPactValueIsDefault (yyn))
          {
            label = YYDEFAULT;
            break;
          }

        /* Read a lookahead token.  */
        if (yychar == YYEMPTY_)
          {

            yychar = yylexer.yylex ();
            yylval = yylexer.getLVal();

          }

        /* Convert token to internal form.  */
        yytoken = yytranslate_ (yychar);

        if (yytoken == SymbolKind.S_YYerror)
          {
            // The scanner already issued an error message, process directly
            // to error recovery.  But do not keep the error token as
            // lookahead, it is too special and may lead us to an endless
            // loop in error recovery. */
            yychar = Lexer.YYUNDEF;
            yytoken = SymbolKind.S_YYUNDEF;
            label = YYERRLAB1;
          }
        else
          {
            /* If the proper action on seeing token YYTOKEN is to reduce or to
               detect an error, take that action.  */
            yyn += yytoken.getCode();
            if (yyn < 0 || YYLAST_ < yyn || yycheck_[yyn] != yytoken.getCode())
              label = YYDEFAULT;

            /* <= 0 means reduce or error.  */
            else if ((yyn = yytable_[yyn]) <= 0)
              {
                if (yyTableValueIsError (yyn))
                  label = YYERRLAB;
                else
                  {
                    yyn = -yyn;
                    label = YYREDUCE;
                  }
              }

            else
              {
                /* Shift the lookahead token.  */
                /* Discard the token being shifted.  */
                yychar = YYEMPTY_;

                /* Count tokens shifted since error; after three, turn off error
                   status.  */
                if (yyerrstatus_ > 0)
                  --yyerrstatus_;

                yystate = yyn;
                yystack.push (yystate, yylval);
                label = YYNEWSTATE;
              }
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction(yyn, yystack, yylen);
        yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs;
            if (yychar == YYEMPTY_)
              yytoken = null;
            yyreportSyntaxError (new Context (yystack, yytoken));
          }

        if (yyerrstatus_ == 3)
          {
            /* If just tried and failed to reuse lookahead token after an
               error, discard it.  */

            if (yychar <= Lexer.YYEOF)
              {
                /* Return failure if at end of input.  */
                if (yychar == Lexer.YYEOF)
                  return false;
              }
            else
              yychar = YYEMPTY_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `-------------------------------------------------*/
      case YYERROR:
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;       /* Each real token shifted decrements this.  */

        // Pop stack until we find a state that shifts the error token.
        for (;;)
          {
            yyn = yypact_[yystate];
            if (!yyPactValueIsDefault (yyn))
              {
                yyn += SymbolKind.S_YYerror.getCode();
                if (0 <= yyn && yyn <= YYLAST_
                    && yycheck_[yyn] == SymbolKind.S_YYerror.getCode())
                  {
                    yyn = yytable_[yyn];
                    if (0 < yyn)
                      break;
                  }
              }

            /* Pop the current state because it cannot handle the
             * error token.  */
            if (yystack.height == 0)
              return false;


            yystack.pop ();
            yystate = yystack.stateAt (0);
          }

        if (label == YYABORT)
          /* Leave the switch.  */
          break;



        /* Shift the error token.  */

        yystate = yyn;
        yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
}




  /**
   * Information needed to get the list of expected tokens and to forge
   * a syntax error diagnostic.
   */
  public static final class Context
  {
    Context (YYStack stack, SymbolKind token)
    {
      yystack = stack;
      yytoken = token;
    }

    private YYStack yystack;


    /**
     * The symbol kind of the lookahead token.
     */
    public final SymbolKind getToken ()
    {
      return yytoken;
    }

    private SymbolKind yytoken;
    static final int NTOKENS = JavaParser.YYNTOKENS_;

    /**
     * Put in YYARG at most YYARGN of the expected tokens given the
     * current YYCTX, and return the number of tokens stored in YYARG.  If
     * YYARG is null, return the number of expected tokens (guaranteed to
     * be less than YYNTOKENS).
     */
    int getExpectedTokens (SymbolKind yyarg[], int yyargn)
    {
      return getExpectedTokens (yyarg, 0, yyargn);
    }

    int getExpectedTokens (SymbolKind yyarg[], int yyoffset, int yyargn)
    {
      int yycount = yyoffset;
      int yyn = yypact_[this.yystack.stateAt (0)];
      if (!yyPactValueIsDefault (yyn))
        {
          /* Start YYX at -YYN if negative to avoid negative
             indexes in YYCHECK.  In other words, skip the first
             -YYN actions for this state because they are default
             actions.  */
          int yyxbegin = yyn < 0 ? -yyn : 0;
          /* Stay within bounds of both yycheck and yytname.  */
          int yychecklim = YYLAST_ - yyn + 1;
          int yyxend = yychecklim < NTOKENS ? yychecklim : NTOKENS;
          for (int yyx = yyxbegin; yyx < yyxend; ++yyx)
            if (yycheck_[yyx + yyn] == yyx && yyx != SymbolKind.S_YYerror.getCode()
                && !yyTableValueIsError(yytable_[yyx + yyn]))
              {
                if (yyarg == null)
                  yycount += 1;
                else if (yycount == yyargn)
                  return 0; // FIXME: this is incorrect.
                else
                  yyarg[yycount++] = SymbolKind.get(yyx);
              }
        }
      if (yyarg != null && yycount == yyoffset && yyoffset < yyargn)
        yyarg[yycount] = null;
      return yycount - yyoffset;
    }
  }


  private int yysyntaxErrorArguments (Context yyctx, SymbolKind[] yyarg, int yyargn)
  {
    /* There are many possibilities here to consider:
       - If this state is a consistent state with a default action,
         then the only way this function was invoked is if the
         default action is an error action.  In that case, don't
         check for expected tokens because there are none.
       - The only way there can be no lookahead present (in tok) is
         if this state is a consistent state with a default action.
         Thus, detecting the absence of a lookahead is sufficient to
         determine that there is no unexpected or expected token to
         report.  In that case, just report a simple "syntax error".
       - Don't assume there isn't a lookahead just because this
         state is a consistent state with a default action.  There
         might have been a previous inconsistent state, consistent
         state with a non-default action, or user semantic action
         that manipulated yychar.  (However, yychar is currently out
         of scope during semantic actions.)
       - Of course, the expected token list depends on states to
         have correct lookahead information, and it depends on the
         parser not to perform extra reductions after fetching a
         lookahead from the scanner and before detecting a syntax
         error.  Thus, state merging (from LALR or IELR) and default
         reductions corrupt the expected token list.  However, the
         list is correct for canonical LR with one exception: it
         will still contain any token that will not be accepted due
         to an error action in a later state.
    */
    int yycount = 0;
    if (yyctx.getToken() != null)
      {
        if (yyarg != null)
          yyarg[yycount] = yyctx.getToken();
        yycount += 1;
        yycount += yyctx.getExpectedTokens(yyarg, 1, yyargn);
      }
    return yycount;
  }


  /**
   * Build and emit a "syntax error" message in a user-defined way.
   *
   * @param ctx  The context of the error.
   */
  private void yyreportSyntaxError(Context yyctx) {
      if (yyErrorVerbose) {
          final int argmax = 5;
          SymbolKind[] yyarg = new SymbolKind[argmax];
          int yycount = yysyntaxErrorArguments(yyctx, yyarg, argmax);
          String[] yystr = new String[yycount];
          for (int yyi = 0; yyi < yycount; ++yyi) {
              yystr[yyi] = yyarg[yyi].getName();
          }
          String yyformat;
          switch (yycount) {
              default:
              case 0: yyformat = "syntax error"; break;
              case 1: yyformat = "syntax error, unexpected {0}"; break;
              case 2: yyformat = "syntax error, unexpected {0}, expecting {1}"; break;
              case 3: yyformat = "syntax error, unexpected {0}, expecting {1} or {2}"; break;
              case 4: yyformat = "syntax error, unexpected {0}, expecting {1} or {2} or {3}"; break;
              case 5: yyformat = "syntax error, unexpected {0}, expecting {1} or {2} or {3} or {4}"; break;
          }
          yyerror(new MessageFormat(yyformat).format(yystr));
      } else {
          yyerror("syntax error");
      }
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yyPactValueIsDefault (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code>
   * value indicates a syntax error.
   * @param yyvalue the value to check
   */
  private static boolean yyTableValueIsError (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  private static final short yypact_ninf_ = -620;
  private static final short yytable_ninf_ = -458;

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short[] yypact_ = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
    {
      26,   -18,    17,   142,  -620,  4079,  -620,  -620,  -620,    17,
     452,   525,  -620,    17,  -620,  -620,  -620,  -620,  -620,  -620,
    -620,  -620,  -620,  -620,  -620,  -620,   777,  -620,  4380,  -620,
    -620,   806,  4321,  -620,   551,    33,  -620,   132,   150,   155,
      76,   211,   217,   225,   184,  -620,  -620,  -620,  -620,  -620,
    -620,  -620,  -620,  -620,   777,  4380,  -620,    55,  -620,   308,
    -620,   483,  2790,   312,   289,   364,   364,   334,  -620,   384,
    -620,  -620,  1266,  3450,  -620,  2856,  3516,  3516,  3516,  3516,
    3516,  3516,   375,  -620,  -620,  -620,  -620,  -620,  -620,  -620,
    -620,  -620,  -620,  -620,  -620,  4364,  -620,  -620,   436,   427,
    -620,  -620,   311,  -620,   387,   448,   311,  -620,   492,  -620,
    -620,  -620,  -620,  -620,  -620,  -620,  -620,   135,   430,   472,
     477,   481,   197,   218,  -620,   465,   542,   541,  -620,  -620,
    -620,  -620,   526,  -620,  -620,  -620,  1833,   486,   295,   538,
     562,  1833,   569,    67,   501,  -620,   585,   364,  -620,  2678,
     522,  4479,   338,   891,   578,  -620,   566,  -620,  -620,  1001,
    -620,   586,  -620,   485,  -620,  -620,  -620,  -620,  -620,  -620,
    2988,  2642,   266,   380,   576,  -620,    41,   577,  3450,   590,
     599,   311,  -620,   386,  3054,  3450,    12,  -620,  -620,   426,
     577,   600,  -620,  3450,     9,   577,  3450,  3516,  -620,  3516,
    3516,  3516,  3516,  3516,  3516,  3516,  3516,  3516,  3516,  1511,
    3516,  3516,  3516,  3516,  3516,  3516,  3516,  3516,  -620,  -620,
     311,  -620,   556,  -620,  1104,  -620,  -620,   605,    97,  -620,
     545,   422,  -620,  -620,    67,  1833,   610,   608,   307,   289,
     546,  -620,  1083,   333,  -620,  4300,  3120,  -620,  3120,  -620,
    -620,  -620,  -620,  -620,  -620,  -620,  -620,  -620,  -620,  -620,
    -620,  3450,  -620,  -620,  2988,  -620,    66,  -620,   431,  -620,
    4392,  3186,   409,   380,  -620,   447,   619,   284,   572,   576,
    -620,   582,   583,   625,  -620,   563,  -620,   624,  -620,   424,
    -620,   631,   577,   623,  -620,   589,   628,  -620,    -9,   587,
     638,  -620,  -620,   592,   595,   639,   430,   472,   477,   481,
     197,   218,   218,   465,   465,   465,   465,   601,  -620,   240,
    -620,  -620,   542,   542,   542,   541,   541,  -620,  -620,  -620,
     626,  -620,  4257,  4030,  1833,   332,   648,  -620,   603,  1833,
      67,  -620,  -620,  -620,  4051,  -620,  1833,   441,  -620,  1946,
     654,  1833,   289,   606,   242,  -620,  4321,  1878,  -620,  -620,
    -620,  -620,  -620,  -620,  1833,  1833,  2642,  -620,   118,   652,
    3252,  -620,  -620,  -620,  3318,   658,   576,  -620,  -620,  -620,
     619,  -620,   659,  -620,  -620,  -620,  3450,  -620,   105,   619,
     577,  -620,  -620,  -620,  -620,   619,  -620,  3450,   236,   656,
    -620,   656,  2988,   601,   250,  -620,  -620,  -620,  -620,  -620,
    -620,  4257,  -620,   657,  1382,   661,   576,   619,  -620,   660,
     616,  1833,  -620,  -620,  4145,  4090,  -620,  -620,   576,   252,
    3839,  -620,  -620,   658,   311,   311,   642,   386,  -620,   665,
    -620,  -620,   666,  3450,    34,    52,  2574,   676,   677,  3384,
     679,   680,  3450,   471,   683,  3450,  2729,  1715,  -620,  1994,
    -620,   678,  -620,  -620,  -620,   682,  -620,  -620,  -620,  -620,
    -620,   398,   464,  -620,  -620,  -620,   526,   535,   555,  -620,
    -620,  -620,  1833,  1833,  -620,  -620,   494,   685,  -620,  -620,
     687,  3878,  -620,  -620,   643,  -620,    38,  -620,  -620,  -620,
     644,  -620,   646,  -620,  -620,  -620,  3450,   282,   601,  -620,
     475,   700,  -620,   698,  -620,   701,  4145,  3931,  -620,  -620,
    -620,  -620,   658,  1833,  -620,   650,   260,  -620,  2529,    57,
    -620,  -620,  -620,  -620,  -620,  4145,  -620,  -620,   681,  -620,
    4202,  -620,  3970,  -620,  -620,  -620,  -620,   653,  -620,  2574,
     574,  -620,   702,  -620,   708,   680,   594,  3578,  3450,  -620,
     712,  3450,  3450,   713,  3762,   108,   701,  3450,   714,  -620,
    -620,   240,   716,  -620,  -620,  -620,  -620,  -620,  -620,  -620,
     722,  3252,  -620,  -620,  3991,  -620,  -620,  3516,  -620,   106,
    -620,   110,  -620,  2110,   241,   619,  -620,  -620,   724,  -620,
    -620,   728,  -620,  -620,   275,  -620,   684,  2529,  -620,  -620,
     627,  -620,  -620,    57,  -620,  -620,  -620,  -620,   730,   627,
     627,   650,   650,   260,  2631,  -620,  -620,  -620,  -620,   686,
     731,  -620,  -620,  -620,  -620,  -620,  3450,  -620,  -620,   732,
     725,  -620,   727,   734,   740,  -620,   743,   744,  -620,   415,
    -620,   324,  -620,   492,   357,   746,   701,   108,  -620,  -620,
     694,   748,  -620,  -620,  -620,  -620,  -620,   737,  -620,  -620,
    -620,   729,  -620,  -620,   738,   749,  1646,   750,  -620,  2922,
    -620,  -620,   311,   280,   543,   762,  1833,   731,  -620,  3818,
    -620,  -620,   627,   627,   627,   650,  -620,  1762,  -620,   755,
    3450,  3450,  3450,  3640,  2574,   659,   701,  -620,  3702,  4321,
    -620,  -620,  -620,   689,   694,  2574,  3516,  -620,  3450,  -620,
     759,   703,  -620,  4300,   605,  -620,   311,  1946,    83,   460,
    -620,  -620,  -620,  -620,   627,  -620,   434,  2226,  2342,   519,
     428,  -620,   770,   774,   769,  -620,  -620,   711,  -620,  -620,
    -620,  -620,  1833,   781,  -620,  -620,  -620,  -620,   775,  -620,
    2988,   776,   468,  -620,    83,   401,  -620,  -620,   757,   311,
    4300,  -620,    12,  -620,  2458,  -620,     9,   619,   619,   778,
    2574,  3640,  2574,  -620,  -620,   128,   701,  -620,  -620,  -620,
    -620,  -620,   692,  -620,   735,  -620,  -620,   690,   589,  -620,
      -5,   787,   788,  -620,  -620,   734,   796,  -620,  1833,   311,
    -620,  -620,  -620,   619,   619,  -620,  -620,  2574,  -620,  -620,
     790,   793,  -620,  -620,  -620
    };
  }

/* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
   Performed when YYTABLE does not specify something else to do.  Zero
   means the default is an error.  */
  private static final short[] yydefact_ = yydefact_init();
  private static final short[] yydefact_init()
  {
    return new short[]
    {
      33,     0,     0,     0,    30,    11,    34,    35,     9,     0,
       0,     0,     1,     0,    22,    17,    18,    28,    21,    20,
      19,    23,    24,    25,    26,    27,    11,    12,    13,    15,
      36,    11,     0,   446,     0,     0,    37,     0,    33,   448,
       0,     0,     0,     0,     0,    43,    45,    61,    62,    63,
      46,   176,   177,    16,    11,    14,   447,     0,    38,     0,
      10,    11,     0,     0,    77,    65,    65,     0,    44,     0,
      39,    32,    11,     0,   449,   458,     0,     0,     0,     0,
       0,     0,     9,     2,     3,     6,     7,    60,    53,    57,
      59,     5,    58,    55,    56,     0,     8,    54,     0,     0,
     305,     4,   170,   302,   438,     0,    47,    49,   437,   308,
     314,   309,   310,   311,   312,   313,   454,   391,   394,   396,
     398,   400,   402,   404,   412,   407,   415,   419,   422,   426,
     427,   430,   433,   439,   440,   436,     0,   446,     0,     0,
       0,     0,     0,     0,   179,    66,     0,    65,    40,    11,
       9,   438,   309,   310,     0,   359,     0,   360,   373,     0,
     372,     0,   459,     0,   428,   429,   434,   435,   431,   432,
       0,     0,    50,     0,   444,   323,     0,   322,     0,     0,
       0,   171,   172,     0,     0,     0,     0,    51,   339,     0,
     322,     0,    52,     0,     0,   322,     0,     0,   390,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,   441,   442,
      48,   450,     0,   451,    11,   193,    79,    78,   111,   108,
      72,     0,    68,    71,     0,     0,     0,   180,   444,    77,
      75,   365,     0,     0,   367,     0,     0,   307,     0,   378,
     379,   380,   381,   382,   383,   384,   385,   386,   387,   388,
     389,     0,   456,   455,     0,   452,   328,   327,     0,   325,
       0,     0,     0,   170,   355,     0,     0,   322,     0,   445,
     335,     0,     0,     0,   175,     0,   173,     0,   344,     0,
     346,     0,   322,     0,   315,     0,     0,   306,     0,     0,
       0,   334,   316,     0,     0,     0,   395,   397,   399,   401,
     403,   405,   406,   408,   409,   410,   411,     0,   413,    47,
     301,   414,   416,   417,   418,   420,   421,   423,   424,   425,
       0,   194,    11,    11,     0,   118,   112,   113,     0,     0,
       0,    67,    70,   181,    11,   178,     0,     0,   124,     0,
       0,     0,    77,     0,   444,   366,    11,     0,   362,   361,
     364,   363,   374,   460,     0,     0,     0,   324,   331,     0,
     143,   354,   353,   356,     0,    83,   444,   319,   318,   320,
       0,   350,     0,   304,   174,   345,     0,   337,     0,     0,
     322,   349,   352,   303,   338,     0,   348,     0,   137,   215,
     135,   214,     0,     0,     0,   200,   201,   199,   196,   198,
     195,    11,    80,   118,    11,     0,   444,   115,    81,    74,
       0,     0,    69,   183,    11,    11,   182,   122,   444,   444,
      11,   121,    76,     0,   170,   170,     0,   445,   368,     0,
     205,   222,     9,     0,     0,     0,     0,     0,     0,     0,
       0,    25,     0,     0,     0,     0,    11,    12,   221,     0,
     207,     0,   213,   216,   217,     0,   218,   219,   220,   271,
     272,   308,   311,   243,   244,   245,     0,   246,   247,   329,
     330,   326,     0,     0,   357,   148,     0,   144,   145,   147,
       0,    11,   317,    84,     0,   342,     0,   443,   347,   336,
       0,   340,     0,   341,   393,   392,     0,   139,     0,   453,
       0,     0,   197,     0,    92,    23,    11,    11,    87,    90,
     109,   114,   116,     0,    73,     0,     0,   189,     0,     0,
     190,   185,   187,   188,   184,    11,   125,   126,     0,   128,
      11,   132,    11,   130,    64,   370,   369,     0,   241,     0,
       0,   228,     0,   230,     0,     0,     0,   274,     0,   232,
       0,     0,     0,     0,     0,     0,     0,     0,     0,   209,
     210,     0,     0,   206,   208,   212,   223,   332,   333,   141,
       0,     0,   358,    85,    11,   321,   253,     0,   267,     0,
     256,     0,   261,     0,     0,     0,   351,   138,     0,   136,
     191,     0,   110,    91,     0,    95,     0,     0,    89,    97,
     166,    93,    94,     0,    96,    88,   117,    82,     0,   166,
     166,     0,     0,     0,     0,   169,   192,   168,   186,     0,
       9,   129,   131,   371,   242,   224,     0,   229,   231,     0,
     276,   279,     0,   275,     0,   233,     0,     0,   235,    50,
     299,     0,   297,     0,   309,     0,     0,   237,   286,   239,
     284,     0,   236,   211,   142,   146,    86,   266,   268,   254,
     257,     0,   255,   262,     0,    17,     0,     0,   264,     0,
     343,   140,   170,   137,     0,     0,     0,     0,   149,     0,
     155,   154,   166,   166,   166,     0,   127,     0,   133,     0,
       0,     0,   277,     0,     0,     0,     0,   295,     0,    11,
     294,   287,   238,   292,   285,     0,     0,   265,     0,   259,
       0,   203,   134,     0,   167,    98,   170,     0,   444,     0,
     158,   153,   150,   152,   166,   100,   375,     0,     0,   437,
       0,   225,     0,     0,     0,   278,   280,   251,   226,   234,
     296,   298,     0,     0,   240,   293,   270,   269,     0,   258,
       0,     0,     0,   156,   444,   170,   164,   161,     0,   170,
       0,   151,     0,   101,     0,   102,   322,     0,     0,     0,
       0,   281,     0,   250,   290,     0,     0,   260,   204,   202,
      99,   160,     0,   162,     0,   157,   159,     0,   323,   103,
       0,     0,     0,   227,   283,   282,     0,   252,     0,   170,
     288,   165,   163,     0,     0,   105,   104,     0,   291,   289,
       0,     0,   273,   106,   107
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final short[] yypgoto_ = yypgoto_init();
  private static final short[] yypgoto_init()
  {
    return new short[]
    {
    -620,  -620,    -1,    82,  -353,   -13,   129,  -620,  -620,   771,
    -620,    31,  -620,   747,   756,   -12,   812,  -620,  -239,  -620,
      -8,  -384,  -620,   473,   581,  -620,  -218,   125,  -620,  -620,
    -392,   327,  -417,  -620,  -620,  -620,   143,  -620,  -620,  -620,
    -620,  -620,   406,   416,  -620,  -620,  -620,   403,  -620,  -620,
     290,  -620,  -312,   325,  -266,  -620,  -620,   253,  -620,  -474,
    -477,   112,    68,    72,  -515,   226,   -78,  -163,   -83,  -261,
     385,  -620,  -620,  -620,  -620,   309,  -399,  -620,  -620,  -620,
    -620,   432,  -620,  -620,   239,  -564,  -450,  -195,  -431,  -620,
    -620,  -539,  -620,  -620,   137,  -620,   256,  -620,   255,  -620,
    -364,  -620,  -620,  -620,  -620,  -620,  -620,    74,  -620,  -620,
    -620,   188,  -619,  -620,  -620,  -620,  -592,  -620,  -620,   141,
    -620,  -542,    79,  -183,  -620,  -620,  -160,  -102,  -620,   496,
     862,   901,   540,  -269,  -620,  -620,  -620,  -620,   591,   579,
     461,  -620,  -620,   509,  -563,   634,  -620,  -620,   -42,  -620,
    -620,   670,   669,   675,   688,   697,   399,  -620,   343,   358,
     394,   -25,   726,   742,  -620,   850,   854,   904,  -620,  -115,
     286,    11,  -620,   -43,  -620
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final short[] yydefgoto_ = yydefgoto_init();
  private static final short[] yydefgoto_init()
  {
    return new short[]
    {
      -1,   103,   151,    44,    27,    28,    29,     3,     4,     5,
       6,     7,    71,    31,    45,   105,   106,   107,    46,    47,
     606,   145,   231,   232,   233,   352,   142,   227,   419,   492,
     493,   517,   518,   608,   609,   610,   698,   737,    48,   229,
     335,   336,   337,   415,    49,   239,   347,   348,   431,   542,
     543,   611,   401,   400,   485,   486,   487,   488,   612,   529,
     620,   729,   730,   767,   687,   626,   180,   181,   182,    50,
      51,   236,   237,   345,   425,   531,   407,   533,    52,   225,
     333,   408,   409,   761,   458,   459,   460,   461,   462,   463,
     464,   465,   466,   783,   497,   589,   590,   591,   592,   593,
     594,   667,   467,   468,   469,   642,   744,   643,   806,   470,
     713,   657,   658,   753,   785,   754,   659,   566,   651,   652,
     321,   108,   109,   110,   276,   277,   174,   175,   268,   269,
     152,   153,   113,   188,   289,   114,   115,   273,   274,   154,
     155,   156,   243,   244,   157,   158,   159,   261,   160,   198,
     117,   118,   119,   120,   121,   122,   123,   124,   125,   126,
     127,   128,   129,   130,   131,   132,   133,   134,   135,   338,
     136,    33,   138,   139,   163
    };
  }

/* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule whose
   number is the opposite.  If YYTABLE_NINF, syntax error.  */
  private static final short[] yytable_ = yytable_init();
  private static final short[] yytable_init()
  {
    return new short[]
    {
      10,    11,   187,   294,   457,   399,   371,   375,    34,   574,
     272,   302,    39,   541,   320,   556,   281,   282,   641,    55,
     116,   350,   653,   192,   668,   532,   -29,   191,   171,   676,
     298,   171,   162,   116,   303,   304,    30,     8,   711,    39,
     528,   544,   613,    56,   586,   551,   391,    59,   619,   187,
     395,   164,   165,   166,   167,   168,   169,   144,   146,   278,
     171,   104,   357,   553,   301,   712,   613,    60,   625,    69,
     187,   406,     8,   137,   104,   104,   104,   104,   104,   104,
     104,   392,     9,   173,   295,    13,   137,    26,    60,   552,
     179,   510,    30,   405,   172,   711,   280,   814,   286,   292,
     615,    13,   292,   587,   690,   691,   457,   554,   588,     1,
      60,   495,   669,    54,   293,    13,   672,   378,   634,     2,
     501,   755,   230,   349,   171,   541,   503,   265,   116,   226,
     616,     8,   607,   738,   433,   172,   532,   192,   765,   240,
     172,   364,    12,    26,   692,   693,   694,    56,   522,   808,
     406,   528,  -444,   757,    54,   739,   607,    53,    62,   267,
     499,   196,    63,   530,   746,    37,   653,   615,   365,   104,
     172,   587,   405,   774,   655,   587,   588,   731,   732,   733,
     588,   137,   197,   809,    53,   527,   656,    60,   766,   286,
     327,   328,   329,   482,    56,   372,   104,   318,   104,   104,
     104,   104,   104,   104,   104,   104,   104,   104,   172,   104,
     104,   104,   104,   104,   104,   104,   104,   569,   734,   771,
     483,   363,   116,   343,   420,   671,   574,   674,   500,   677,
     502,   242,    55,     1,   172,   507,   192,   205,   206,   436,
     457,   172,   641,   179,   172,    56,   203,   179,   204,   179,
     207,   208,    67,   678,    13,   614,    56,   179,    13,   179,
      13,   494,   572,   104,   506,   679,    64,   179,    13,   172,
      13,   192,    65,   747,   530,   137,    37,   605,    13,   614,
      66,    56,   179,   689,   756,   171,    56,   179,   574,   179,
      56,    32,   684,    13,   376,   398,   527,   435,    13,   221,
      13,   605,   209,   171,   222,   511,   332,   537,   506,   377,
     598,  -123,    32,   349,   538,   618,  -123,    32,   179,    70,
     403,   192,   412,   457,   574,    13,   680,   418,   707,    13,
     683,   172,   681,   172,   426,   708,   727,   355,   172,   432,
      32,   413,   356,   414,   457,   172,   192,    32,   172,   804,
     172,   807,   479,   480,   267,   505,   545,   546,    32,   509,
     116,  -300,   640,   172,   172,   172,  -376,   140,  -300,   650,
     727,   141,  -376,  -376,  -376,  -376,  -376,  -376,  -376,  -376,
    -376,  -376,  -376,   143,   457,   457,   822,   271,   183,   147,
     184,   183,   183,   287,   185,   148,   104,   186,    13,   403,
     -50,   104,  -249,   170,    13,   -50,   171,  -249,   179,  -249,
     172,   792,   403,   137,   370,   411,   179,   727,   184,    13,
     172,   457,   185,   172,   286,   186,   424,    13,   385,   234,
     178,   340,    56,   386,   171,   245,   471,   184,   242,   456,
     366,   185,   341,   192,   772,   427,   176,   -50,    56,   177,
     428,   367,   -50,   171,   374,   179,   172,   270,   189,   275,
     279,   190,    35,    36,   769,    13,    13,   183,  -248,   770,
     577,   578,   790,  -248,   564,  -248,   357,   770,   199,  -438,
    -438,   172,   172,   -41,   508,   358,   600,   360,   192,   -50,
    -457,   263,  -457,   200,   264,  -457,   516,  -457,   202,   193,
     579,    13,   194,   580,   201,   195,   183,   535,   801,   802,
      32,   617,   540,   650,   279,   172,   622,   210,   211,   212,
     507,   192,   172,   403,   279,   471,   193,   172,   296,   776,
     777,   297,   195,   778,   172,    37,    38,   740,   471,   172,
     192,   456,   223,    14,   820,   821,   246,   187,   313,   314,
     315,   316,   508,    15,   722,   215,   216,   217,   183,   275,
      16,    57,    58,   649,   213,   214,     1,   224,   322,   323,
     324,   218,   219,   516,   228,    17,   235,    18,    19,    20,
    -439,  -439,   247,    21,    22,   635,   636,    23,   238,   294,
     248,    24,   262,   302,    13,   622,   171,    25,   284,   516,
    -440,  -440,   311,   312,   721,   183,   172,   325,   326,   285,
     299,   330,   797,   768,   334,   344,   800,   346,   245,    32,
     339,   351,   184,   172,   540,   421,   234,   379,   471,   382,
      32,   383,   384,   388,   187,    56,   471,   380,   381,   387,
     437,   390,    32,   245,   389,   192,   394,   395,   763,   768,
     396,   397,   270,   519,   402,   393,   398,   416,   417,   430,
     484,   434,   279,   491,   496,   508,   516,   520,   414,   519,
     798,   524,   471,   547,   226,   456,   548,   523,   549,   557,
     558,   192,   561,   562,   183,   172,   567,   793,   172,   575,
     183,   795,   565,   576,   581,   582,   736,   245,   585,   595,
      32,   596,   279,   601,   602,   618,   357,   649,   633,   639,
     245,    32,   629,   637,   279,   437,    32,   788,   116,   638,
     183,   183,   172,   645,   648,   662,   172,   663,   664,   370,
     519,   819,   682,   689,   686,   700,   697,   701,   702,   685,
     784,   696,    32,   703,   704,   245,   716,   705,   706,   709,
     678,   172,   715,   679,   603,   471,   519,   283,   456,   104,
     655,  -267,   717,   290,   291,   723,   741,   656,   627,   172,
     759,   137,   300,   760,   779,   305,   471,    32,   780,   456,
     781,   519,   471,   471,   782,   786,   787,   789,   794,   803,
     812,   752,   813,   183,   471,    40,   818,   811,   815,   816,
     817,   823,    32,    32,   824,   660,   -31,   172,    72,    61,
      68,   724,   183,   422,   624,   342,   471,   471,   584,   456,
     456,   245,   521,   519,    13,   359,    32,   361,    32,   513,
     725,   536,   632,   599,   665,   762,   791,    14,   796,   688,
     362,   570,   748,   512,   628,   670,   673,    15,   714,   751,
     369,    41,   627,   471,    16,   805,   456,   183,   504,   471,
     471,   471,   481,    42,   373,   438,    14,   306,   307,    17,
      32,    18,    19,    20,    43,   308,    15,    21,    22,   245,
       0,    23,     0,    16,     0,    24,     0,     0,     0,   309,
     183,    25,     0,   624,     0,   710,   471,   472,    17,   310,
      18,    19,    20,     0,     0,     0,    21,    22,     0,   183,
      23,     0,     0,     0,    24,     0,     0,     0,   719,  -377,
      25,     0,     0,     0,   111,  -377,  -377,  -377,  -377,  -377,
    -377,  -377,  -377,  -377,  -377,  -377,     0,   111,   111,   111,
     111,   111,   111,   111,     0,   749,     0,     0,   220,   489,
       0,     0,     0,   490,     0,     0,     0,     0,     0,     0,
       0,     0,   245,   112,     0,   498,     0,     0,   183,   183,
       0,     0,     0,     0,     0,    32,   112,   112,   112,   112,
     112,   112,   112,   245,     0,     0,   472,     0,     0,     0,
       0,   473,     0,     0,     0,    32,     0,     0,     0,   472,
       0,     0,     0,     0,     0,     0,     0,     0,     0,    32,
       0,     0,   183,     0,   437,     0,     0,     0,     0,     0,
       0,   319,   550,   245,   245,   810,     0,     0,   560,   249,
       0,   563,   111,     0,   568,   250,   251,   252,   253,   254,
     255,   256,   257,   258,   259,   260,     0,     0,     0,     0,
     437,   183,     0,     0,   354,   183,    32,   220,     0,   111,
     245,   111,   111,   111,   111,   111,   111,   111,   111,   111,
     111,   112,   111,   111,   111,   111,   111,   111,   111,   111,
     473,     0,   220,   474,     0,   597,     0,     0,     0,   472,
       0,     0,     0,   473,     0,   183,     0,   472,   112,   475,
     112,   112,   112,   112,   112,   112,   112,   112,   112,   112,
     331,   112,   112,   112,   112,   112,   112,   112,   112,     0,
       0,     0,    13,     0,     0,     0,   111,     0,     0,     0,
       0,     0,     0,   472,     0,     0,     0,   644,     8,     0,
     646,   647,     0,     0,   404,    87,   661,    88,     0,     0,
      89,     0,     0,     0,     0,    90,     0,     0,     0,     0,
     489,   429,    92,     0,    14,   112,     0,     0,    93,   319,
      94,     0,   474,     0,    15,     0,     0,     0,     0,     0,
       0,    16,    97,   473,     0,   474,     0,     0,   475,     0,
       0,   473,     0,     0,     0,   353,    17,     0,    18,    19,
      20,   475,     0,     0,    21,    22,     0,   476,    23,     0,
       0,   477,    24,     0,     0,   699,   472,     0,    25,     0,
       0,     0,     0,   404,     0,     0,     0,   473,     0,     0,
       0,     0,     0,   220,     0,     0,   526,   472,     0,     0,
       0,     0,     0,   472,   472,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,   472,     0,     0,   720,   111,
       0,   478,     0,     0,   111,     0,   -42,     0,     0,   571,
       0,   319,     0,     0,     0,   474,     0,   472,   472,   742,
     743,   745,     0,   474,    13,     0,     0,     0,     0,     0,
       0,   475,     0,     0,     0,     0,   476,   758,   112,   475,
     477,     0,     0,   112,     0,     0,     0,     0,     0,   476,
     473,     0,     0,   477,   472,     0,     0,     0,     0,   474,
     472,   472,   472,     0,     0,     0,    14,     0,   604,     0,
       0,   473,     0,     0,     0,   475,    15,   473,   473,     0,
     623,     0,     0,    16,     0,     0,     0,   526,     0,   473,
     478,     0,   604,     0,     0,     0,     0,   472,    17,     0,
      18,    19,    20,   478,     0,     0,    21,    22,     0,   319,
      23,   473,   473,     0,    24,     0,   319,     0,     0,     0,
      25,     0,     0,     0,     0,     0,     0,   357,  -119,     0,
       0,     0,     0,   514,     0,     0,     0,     0,     0,   476,
      13,     0,   474,   477,     0,   319,     0,   476,   473,     0,
       0,   477,     0,     0,   473,   473,   473,     0,   475,   623,
       0,     0,     0,   474,     0,     0,   654,     0,     0,   474,
     474,     0,     0,     0,     0,     0,   220,     0,     0,   475,
       0,   474,    14,   476,     0,   475,   475,   477,     0,     0,
       0,   473,    15,   478,     0,     0,     0,   475,     0,    16,
       0,   478,     0,   474,   474,   112,     0,     0,     0,     0,
       0,     0,     0,     0,    17,     0,    18,    19,    20,   475,
     475,     0,   515,    22,     0,     0,    23,     0,   319,     0,
      24,     0,     0,     0,     0,     0,    25,   478,     0,     0,
     474,   728,     0,     0,     0,     0,   474,   474,   474,   319,
       0,     0,     0,     0,     0,     0,   475,     0,     0,     0,
     319,     0,   475,   475,   475,     0,   476,     0,     0,    13,
     477,     0,     0,     0,     0,   728,     0,     0,     0,   764,
       0,     0,     0,   474,     0,     0,     0,   476,     0,   319,
     319,   477,     0,   476,   476,     0,     0,   477,   477,   475,
       0,     0,     0,     0,     0,   476,     8,     0,     0,   477,
     654,     0,     0,    87,     0,    88,     0,     0,    89,     0,
     478,     0,   728,    90,     0,     0,   319,   476,   476,     0,
      92,   477,   477,     0,     0,     0,    93,     0,    94,     0,
       0,   478,     0,     0,     0,     0,     0,   478,   478,   112,
      97,     0,     0,     0,     0,     0,     0,     0,     0,   478,
       0,     0,   111,   317,   476,     0,     0,     0,   477,     0,
     476,   476,   476,     0,   477,   477,   477,     0,     0,     0,
       0,   478,   478,     0,     0,     0,     0,   439,     0,    73,
       0,   357,  -263,     0,     0,     0,     0,   441,     0,     0,
       0,   112,     0,     0,    13,     0,     0,   476,     0,     0,
       0,   477,     0,     0,     0,     0,     0,     0,   478,     0,
       0,     0,     0,     0,   478,   478,   478,     0,     0,     0,
       0,    80,    81,     0,     0,     0,     0,     0,     0,     0,
       0,   442,    83,    84,    85,    86,    14,   443,    87,   444,
      88,  -263,     0,    89,   -11,   445,    15,   446,    90,     0,
     -11,   478,    91,    16,     0,    92,   447,   448,     0,     0,
       0,    93,   -11,    94,     0,     0,    95,    96,    17,     0,
      18,    19,    20,   -11,   449,    97,    21,    22,    98,   450,
     451,   100,   452,     0,    24,     0,   101,   453,   317,   102,
      25,   454,   455,   439,     0,    73,     0,   357,   735,     0,
       8,     0,     0,   441,     0,     0,     0,    87,     0,    88,
      13,   171,    89,     0,     0,     0,     0,    90,     0,     0,
       0,     0,     0,     0,    92,     0,     0,     0,     0,     0,
      93,     0,    94,     0,     0,     0,     0,    80,    81,     0,
       0,     0,     0,     0,    97,     0,     0,   442,    83,    84,
      85,    86,    14,   443,    87,   444,    88,   317,     0,    89,
     -11,   445,    15,   446,    90,     0,   -11,     0,    91,    16,
       0,    92,   447,   448,     0,     0,     0,    93,   -11,    94,
       0,    13,    95,    96,    17,     0,    18,    19,    20,   -11,
     449,    97,    21,    22,    98,   450,   451,   100,   452,     0,
      24,     0,   101,   453,   317,   102,    25,   454,   455,   439,
       0,    73,     0,   357,   440,     0,     0,     0,     8,   441,
       0,     0,     0,     0,     0,    87,    13,    88,     0,     0,
      89,     0,     0,     0,     0,    90,     0,     0,     0,     0,
       0,     0,    92,     0,     0,     0,     0,     0,    93,     0,
      94,     0,     0,    80,    81,     0,     0,     0,     0,     0,
       0,     0,    97,   442,    83,    84,    85,    86,    14,   443,
      87,   444,    88,     0,     0,    89,   -11,   445,    15,   446,
      90,     0,   -11,     0,    91,    16,     0,    92,   447,   448,
       0,     0,     0,    93,   -11,    94,     0,     0,    95,    96,
      17,     0,    18,    19,    20,   -11,   449,    97,    21,    22,
      98,   450,   451,   100,   452,     0,    24,     0,   101,   453,
     317,   102,    25,   454,   455,   439,     0,    73,     0,   357,
     573,     8,     0,     0,     0,   441,     0,     0,    87,     0,
      88,     0,    13,    89,     0,     0,     0,     0,    90,     0,
       0,     0,     0,     0,     0,    92,     0,     0,     0,     0,
       0,    93,     0,    94,     0,     0,     0,     0,     0,    80,
      81,     0,     0,     0,     0,    97,     0,     0,     0,   442,
      83,    84,    85,    86,    14,   443,    87,   444,    88,     0,
       0,    89,   -11,   445,    15,   446,    90,     0,   -11,     0,
      91,    16,     0,    92,   447,   448,     0,     0,     0,    93,
     -11,    94,     0,     0,    95,    96,    17,     0,    18,    19,
      20,   -11,   449,    97,    21,    22,    98,   450,   451,   100,
     452,     0,    24,     0,   101,   453,   317,   102,    25,   454,
     455,   439,     0,    73,     0,   357,     0,     0,     0,     0,
       0,   441,     0,     0,     0,     0,     0,     0,    13,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,    80,    81,     0,     0,     0,
       0,     0,     0,     0,     0,   442,    83,    84,    85,    86,
      14,   443,    87,   444,    88,   587,     0,    89,   -11,   445,
     675,   446,    90,     0,   -11,     0,    91,    16,     0,    92,
     447,   448,     0,     0,     0,    93,   -11,    94,     0,     0,
      95,    96,    17,     0,    18,    19,    20,   -11,   449,    97,
      21,    22,    98,   450,   451,   100,   452,     0,    24,     0,
     101,   453,   317,   102,    25,   454,   455,   439,     0,    73,
       0,   357,   773,     0,     0,     0,     0,   441,     0,     0,
       0,     0,     0,     0,    13,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,    80,    81,     0,     0,     0,     0,     0,     0,     0,
       0,   442,    83,    84,    85,    86,    14,   443,    87,   444,
      88,     0,     0,    89,   -11,   445,    15,   446,    90,     0,
     -11,     0,    91,    16,     0,    92,   447,   448,     0,     0,
       0,    93,   -11,    94,     0,     0,    95,    96,    17,     0,
      18,    19,    20,   -11,   449,    97,    21,    22,    98,   450,
     451,   100,   452,     0,    24,     0,   101,   453,   317,   102,
      25,   454,   455,   439,     0,    73,     0,   357,   775,     0,
       0,     0,     0,   441,     0,     0,     0,     0,     0,     0,
      13,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    80,    81,     0,
       0,     0,     0,     0,     0,     0,     0,   442,    83,    84,
      85,    86,    14,   443,    87,   444,    88,     0,     0,    89,
     -11,   445,    15,   446,    90,     0,   -11,     0,    91,    16,
       0,    92,   447,   448,     0,     0,     0,    93,   -11,    94,
       0,     0,    95,    96,    17,     0,    18,    19,    20,   -11,
     449,    97,    21,    22,    98,   450,   451,   100,   452,     0,
      24,     0,   101,   453,   317,   102,    25,   454,   455,   439,
       0,    73,     0,   357,   799,     0,     0,     0,     0,   441,
       0,     0,     0,     0,     0,     0,    13,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,    80,    81,     0,     0,     0,     0,     0,
       0,     0,     0,   442,    83,    84,    85,    86,    14,   443,
      87,   444,    88,     0,     0,    89,   -11,   445,    15,   446,
      90,     0,   -11,     0,    91,    16,     0,    92,   447,   448,
       0,     0,     0,    93,   -11,    94,     0,    13,    95,    96,
      17,     0,    18,    19,    20,   -11,   449,    97,    21,    22,
      98,   450,   451,   100,   452,     0,    24,     0,   101,   453,
     317,   102,    25,   454,   455,   439,     0,    73,     0,   357,
       0,     0,     0,     0,     8,   441,     0,     0,     0,     0,
       0,    87,    13,    88,     0,     0,    89,     0,     0,     0,
       0,    90,     0,     0,     0,     0,     0,     0,    92,     0,
       0,     0,     0,     0,    93,     0,    94,     0,     0,    80,
      81,     0,     0,     0,     0,     0,     0,     0,    97,   442,
      83,    84,    85,    86,     0,   443,    87,   444,    88,     0,
       0,    89,   621,   445,     0,   446,    90,     0,     0,    13,
      91,     0,     0,    92,   447,   448,     0,     0,     0,    93,
      13,    94,     0,     0,    95,    96,     0,     0,   266,     0,
       0,     0,   449,    97,     0,     0,    98,   450,   555,   100,
     452,   149,   241,     0,   101,   453,     8,   102,     0,   454,
     455,     0,     0,    87,     0,    88,    13,     8,    89,     0,
      76,    77,     0,    90,    87,     0,    88,    78,    79,    89,
      92,     0,     0,     0,    90,     0,    93,     0,    94,     0,
       0,    92,     0,    80,    81,     0,     0,    93,     0,    94,
      97,     0,     0,   150,    83,    84,    85,    86,    14,     0,
      87,    97,    88,     0,   695,    89,     0,    13,    15,     0,
      90,     0,     0,     0,    91,    16,     0,    92,     0,     0,
       0,     0,     0,    93,     0,    94,     0,     0,    95,    96,
      17,     0,    18,    19,    20,     0,     0,    97,    21,    22,
      98,    99,    23,   100,     0,     0,    24,     0,   101,    14,
       0,   102,    25,    73,    74,    75,     0,     0,     0,    15,
       0,     0,     0,    41,     0,     0,    16,     0,    13,     0,
       0,     0,    76,    77,     0,    42,     0,     0,     0,    78,
      79,    17,     0,    18,    19,    20,    43,     0,     0,    21,
      22,     0,     0,    23,     0,    80,    81,    24,     0,     0,
       0,     0,     0,    25,     0,    82,    83,    84,    85,    86,
       0,     0,    87,     0,    88,     0,     0,    89,     0,    73,
       0,    75,    90,     0,     0,   161,    91,     0,     0,    92,
       0,     0,     0,     0,    13,    93,     0,    94,    76,    77,
      95,    96,     0,     0,     0,    78,    79,     0,     0,    97,
       0,     0,    98,    99,     0,   100,     0,     0,     0,     0,
     101,    80,    81,   102,     0,     0,     0,     0,     0,     0,
       0,     8,    83,    84,    85,    86,     0,     0,    87,     0,
      88,     0,     0,    89,     0,   149,     0,   357,    90,     0,
       0,     0,    91,     0,     0,    92,     0,     0,     0,     0,
      13,    93,     0,    94,    76,    77,    95,    96,     0,     0,
       0,    78,    79,     0,     0,    97,     0,     0,    98,    99,
       0,   100,     0,     0,     0,     0,   101,    80,    81,   102,
       0,     0,     0,     0,     0,     0,     0,   150,    83,    84,
      85,    86,     0,     0,    87,     0,    88,     0,     0,    89,
       0,    73,     0,    75,    90,     0,     0,     0,    91,     0,
       0,    92,     0,     0,     0,     0,    13,    93,     0,    94,
      76,    77,    95,    96,     0,     0,     0,    78,    79,     0,
       0,    97,     0,     0,    98,    99,     0,   100,   718,     0,
       0,     0,   101,    80,    81,   102,     0,     0,     0,     0,
       0,     0,     0,     8,    83,    84,    85,    86,     0,     0,
      87,     0,    88,     0,     0,    89,     0,   149,   288,     0,
      90,     0,     0,     0,    91,     0,     0,    92,     0,     0,
       0,     0,    13,    93,     0,    94,    76,    77,    95,    96,
       0,     0,     0,    78,    79,     0,     0,    97,     0,     0,
      98,    99,     0,   100,     0,     0,     0,     0,   101,    80,
      81,   102,     0,     0,     0,     0,     0,     0,     0,   150,
      83,    84,    85,    86,     0,     0,    87,     0,    88,     0,
       0,    89,     0,   149,     0,   357,    90,     0,     0,     0,
      91,     0,     0,    92,     0,     0,     0,     0,    13,    93,
       0,    94,    76,    77,    95,    96,     0,     0,     0,    78,
      79,     0,     0,    97,     0,     0,    98,    99,     0,   100,
       0,     0,     0,     0,   101,    80,    81,   102,     0,     0,
       0,     0,     0,     0,     0,   150,    83,    84,    85,    86,
       0,     0,    87,     0,    88,     0,     0,    89,     0,   149,
       0,     0,    90,     0,   284,     0,    91,     0,     0,    92,
       0,     0,     0,     0,    13,    93,     0,    94,    76,    77,
      95,    96,     0,     0,     0,    78,    79,     0,     0,    97,
       0,     0,    98,    99,     0,   100,     0,     0,     0,     0,
     101,    80,    81,   102,     0,     0,     0,     0,     0,     0,
       0,   150,    83,    84,    85,    86,     0,     0,    87,     0,
      88,     0,     0,    89,     0,   149,     0,   370,    90,     0,
       0,     0,    91,     0,     0,    92,     0,     0,     0,     0,
      13,    93,     0,    94,    76,    77,    95,    96,     0,     0,
       0,    78,    79,     0,     0,    97,     0,     0,    98,    99,
       0,   100,     0,     0,     0,     0,   101,    80,    81,   102,
       0,     0,     0,     0,     0,     0,     0,   150,    83,    84,
      85,    86,     0,     0,    87,     0,    88,     0,     0,    89,
       0,   149,     0,     0,    90,     0,   384,     0,    91,     0,
       0,    92,     0,     0,     0,     0,    13,    93,     0,    94,
      76,    77,    95,    96,     0,     0,     0,    78,    79,     0,
       0,    97,     0,     0,    98,    99,     0,   100,     0,     0,
       0,     0,   101,    80,    81,   102,     0,     0,     0,     0,
       0,     0,     0,   150,    83,    84,    85,    86,     0,     0,
      87,     0,    88,     0,     0,    89,     0,   149,     0,     0,
      90,     0,     0,     0,    91,   559,     0,    92,     0,     0,
       0,     0,    13,    93,     0,    94,    76,    77,    95,    96,
       0,     0,     0,    78,    79,     0,     0,    97,     0,     0,
      98,    99,     0,   100,     0,     0,     0,     0,   101,    80,
      81,   102,     0,     0,     0,     0,     0,     0,     0,   150,
      83,    84,    85,    86,     0,     0,    87,     0,    88,     0,
       0,    89,     0,   149,     0,     0,    90,     0,     0,     0,
      91,     0,     0,    92,     0,     0,     0,     0,    13,    93,
       0,    94,    76,    77,    95,    96,     0,     0,     0,    78,
      79,     0,     0,    97,     0,     0,    98,    99,     0,   100,
       0,     0,     0,     0,   101,    80,    81,   102,     0,     0,
       0,     0,     0,     0,     0,   150,    83,    84,    85,    86,
       0,     0,    87,     0,    88,     0,     0,    89,     0,    73,
       0,     0,    90,     0,     0,     0,    91,     0,     0,    92,
       0,     0,     0,     0,    13,    93,     0,    94,    76,    77,
      95,    96,     0,     0,     0,    78,    79,     0,     0,    97,
       0,     0,    98,    99,     0,   100,     0,     0,     0,     0,
     101,    80,    81,   102,     0,     0,     0,     0,     0,     0,
       0,     8,    83,    84,    85,    86,     0,     0,    87,     0,
      88,    73,     0,    89,     0,     0,     0,     0,    90,     0,
       0,     0,    91,     0,     0,    92,    13,     0,     0,     0,
       0,    93,     0,    94,     0,     0,    95,    96,     0,     0,
       0,     0,     0,     0,     0,    97,     0,     0,    98,    99,
       0,   100,     0,    80,    81,     0,   101,     0,     0,   102,
       0,     0,     0,     8,    83,    84,    85,    86,     0,     0,
      87,     0,    88,    73,     0,    89,     0,     0,     0,     0,
      90,     0,     0,     0,    91,     0,     0,    92,    13,     0,
       0,     0,     0,    93,     0,    94,     0,     0,    95,    96,
       0,     0,     0,     0,     0,     0,     0,    97,     0,     0,
      98,     0,     0,   100,     0,    80,    81,     0,   101,     0,
     317,   102,     0,     0,     0,     8,    83,    84,    85,    86,
       0,     0,    87,     0,    88,    73,   750,    89,     0,     0,
       0,     0,    90,     0,     0,     0,    91,     0,     0,    92,
      13,     0,     0,     0,     0,    93,     0,    94,     0,     0,
      95,    96,     0,     0,     0,     0,     0,     0,     0,    97,
       0,     0,    98,     0,     0,   100,     0,     0,     0,     0,
     101,     0,     0,   102,     0,     0,     0,     8,    83,    84,
      85,    86,     0,     0,    87,    73,    88,     0,     0,    89,
       0,     0,     0,     0,    90,     0,     0,     0,    91,     0,
      13,    92,     0,     0,     0,     0,     0,    93,     0,    94,
       0,     0,    95,    96,     0,     0,     0,     0,     0,     0,
       0,    97,     0,     0,    98,     0,     0,   100,     0,     0,
       0,     0,   101,     0,   317,   102,     0,     8,    83,    84,
      85,    86,   726,     0,    87,     0,    88,     0,     0,    89,
       0,     0,     0,     0,    90,     0,    13,     0,    91,     0,
       0,    92,     0,     0,   357,   539,     0,    93,     0,    94,
     514,     0,    95,    96,     0,     0,     0,    13,     0,     0,
       0,    97,     0,     0,    98,     0,     0,   100,     0,     0,
       0,     0,   101,     8,   317,   102,     0,     0,    14,     0,
      87,     0,    88,   357,   583,    89,     0,     0,    15,   514,
      90,     0,     0,     0,     0,    16,    13,    92,     0,    14,
       0,     0,     0,    93,     0,    94,     0,     0,     0,    15,
      17,     0,    18,    19,    20,     0,    16,    97,    21,    22,
       0,     0,    23,     0,     0,     0,    24,     0,     0,     0,
       0,    17,    25,    18,    19,    20,   357,  -120,    14,   515,
      22,     0,   514,    23,     0,     0,     0,    24,    15,    13,
       0,     0,     0,    25,     0,    16,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
      17,     0,    18,    19,    20,   357,   631,     0,   515,    22,
       0,   514,    23,     0,     0,     0,    24,     0,    13,     0,
       0,    14,    25,     0,     0,     0,   357,   666,     0,     0,
       0,    15,   514,     0,     0,     0,     0,     0,    16,    13,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,    17,     0,    18,    19,    20,     0,     0,
      14,   515,    22,     0,     0,    23,   410,     0,     0,    24,
      15,     0,     0,     0,     0,    25,     0,    16,    13,     0,
       0,    14,     0,     0,     0,     0,     0,   423,     0,     0,
       0,    15,    17,     0,    18,    19,    20,     0,    16,    13,
     515,    22,     0,     0,    23,     0,     0,     0,    24,     0,
       0,     0,     0,    17,    25,    18,    19,    20,     0,     0,
      14,   515,    22,     0,     0,    23,   534,    13,     0,    24,
      15,     0,     0,     0,     0,    25,     0,    16,    13,     0,
       0,    14,     0,     0,     0,     0,     0,     0,     0,     0,
       0,    15,    17,     0,    18,    19,    20,     0,    16,     0,
      21,    22,     0,     0,    23,     0,     0,     0,    24,    14,
       0,     0,     0,    17,    25,    18,    19,    20,     0,    15,
      14,    21,    22,     0,     0,    23,    16,     0,     0,    24,
      15,     0,     1,    40,   143,    25,     0,    16,     0,     0,
       0,    17,     0,    18,    19,    20,     0,     0,     0,    21,
      22,     0,    17,    23,    18,    19,    20,    24,     0,     0,
      21,    22,     0,    25,    23,     0,     0,     0,    24,     0,
       8,     0,     0,     0,    25,    14,     0,    87,     0,    88,
       0,     0,    89,     0,     0,    15,     0,    90,     0,    41,
      40,   143,    16,     0,    92,     0,     0,     0,     0,     0,
      93,    42,    94,     0,     0,     0,     0,    17,     0,    18,
      19,    20,    43,     0,    97,    21,    22,     0,     0,    23,
       0,     0,     0,    24,     0,     0,     0,   630,   525,    25,
       0,     0,    14,     0,    87,     0,    88,     0,     0,    89,
       0,     0,    15,     0,    90,    40,    41,     0,     0,    16,
       0,    92,     0,     0,     0,     0,     0,    93,    42,    94,
       0,     0,     0,     0,    17,     0,    18,    19,    20,    43,
       0,    97,    21,    22,     0,     0,    23,     0,     0,     0,
      24,     0,     8,     0,     0,   525,    25,    14,    13,    87,
       0,    88,     0,     0,    89,     0,     0,    15,     0,    90,
       0,    41,     0,     0,    16,     0,    92,     0,     0,    13,
       0,     0,    93,    42,    94,     0,     0,     0,     0,    17,
       0,    18,    19,    20,    43,     8,    97,    21,    22,     0,
      14,    23,    87,     0,    88,    24,     0,    89,     0,     0,
      15,    25,    90,     0,     0,     0,     0,    16,     0,    92,
       0,    14,    13,   171,     0,    93,     0,    94,     0,     0,
       0,    15,    17,     0,    18,    19,    20,     0,    16,    97,
      21,    22,     0,     0,    23,     0,     0,     0,    24,     0,
      13,     0,     0,    17,    25,    18,    19,    20,   368,     8,
       0,    21,    22,     0,     0,    23,    87,     0,    88,    24,
       0,    89,     0,     0,     0,    25,    90,     0,     0,     0,
      14,     0,     0,    92,     0,     0,     0,     8,     0,    93,
      15,    94,     0,     0,    87,     0,    88,    16,     0,    89,
       0,     0,     0,    97,    90,     0,     0,     0,     0,     0,
       0,    92,    17,     0,    18,    19,    20,    93,     0,    94,
      21,    22,   184,     0,    23,     0,   185,     0,    24,   186,
       0,    97,   -50,     0,    25,     0,     0,   -50,   171,     0,
       0,     0,     0,     0,     0,     0,     0,  -375,     0,     0,
       0,     0,     0,  -375,  -375,  -375,  -375,  -375,  -375,  -375,
    -375,  -375,  -375,  -375,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,   -50
    };
  }

private static final short[] yycheck_ = yycheck_init();
  private static final short[] yycheck_init()
  {
    return new short[]
    {
       1,     2,   104,   186,   357,   317,   272,   276,     9,   459,
     173,   194,    13,   430,   209,   446,   176,   177,   557,    32,
      62,   239,   564,   106,   587,   424,     0,   105,    19,   593,
     190,    19,    75,    75,   194,   195,     5,    55,   657,    40,
     424,   433,   516,    32,     6,    11,    55,    14,   525,   151,
      55,    76,    77,    78,    79,    80,    81,    65,    66,   174,
      19,    62,     5,    11,    55,   657,   540,    55,    11,    14,
     172,   332,    55,    62,    75,    76,    77,    78,    79,    80,
      81,    90,   100,    95,   186,    18,    75,     5,    55,    55,
       7,   403,    61,   332,    95,   714,    55,   102,   181,    90,
     517,    18,    90,    65,   619,   620,   459,    55,    70,    83,
      55,   380,     6,    31,   102,    18,     6,   277,   549,    93,
     389,   713,    55,   238,    19,   542,   395,   170,   170,   141,
     522,    55,   516,   697,   352,   136,   535,   220,    55,   147,
     141,    75,     0,    61,   621,   622,   623,   136,   417,    21,
     411,   535,    55,   716,    72,   697,   540,    28,     3,   171,
      55,    26,    86,   424,   703,    10,   708,   584,   102,   170,
     171,    65,   411,   737,    66,    65,    70,   692,   693,   694,
      70,   170,    47,    55,    55,   424,    78,    55,   105,   272,
     215,   216,   217,    75,   183,   273,   197,   209,   199,   200,
     201,   202,   203,   204,   205,   206,   207,   208,   209,   210,
     211,   212,   213,   214,   215,   216,   217,   456,   695,   734,
     102,   264,   264,   235,   339,   589,   676,   591,   388,   593,
     390,   149,   245,    83,   235,   398,   319,    19,    20,   354,
     593,   242,   781,     7,   245,   234,    49,     7,    51,     7,
      32,    33,    68,    12,    18,   516,   245,     7,    18,     7,
      18,   376,   457,   264,    28,    24,    55,     7,    18,   270,
      18,   354,    55,   704,   535,   264,    10,   516,    18,   540,
      55,   270,     7,     3,   715,    19,   275,     7,   738,     7,
     279,     5,   604,    18,    10,    55,   535,    55,    18,     4,
      18,   540,    84,    19,     9,    55,   224,    55,    28,    25,
      28,     4,    26,   428,   429,    55,     9,    31,     7,    11,
     332,   404,   334,   676,   774,    18,   595,   339,     4,    18,
      55,   332,   598,   334,   346,    11,   689,     4,   339,   351,
      54,     9,     9,    11,   697,   346,   429,    61,   349,   780,
     351,   782,   364,   365,   366,   397,   434,   435,    72,   402,
     402,     4,   557,   364,   365,   366,    28,    55,    11,   564,
     723,    82,    34,    35,    36,    37,    38,    39,    40,    41,
      42,    43,    44,    19,   737,   738,   817,     7,   102,    55,
       3,   105,   106,     7,     7,    11,   397,    10,    18,   411,
      13,   402,     4,    28,    18,    18,    19,     9,     7,    11,
     411,    10,   424,   402,     5,   333,     7,   770,     3,    18,
     421,   774,     7,   424,   507,    10,   344,    18,     4,   143,
       3,     9,   421,     9,    19,   149,   357,     3,   356,   357,
       9,     7,    20,   526,    10,     4,    10,    13,   437,    13,
       9,    20,    18,    19,     7,     7,   457,   171,    10,   173,
     174,    13,    10,    11,     4,    18,    18,   181,     4,     9,
     482,   483,     4,     9,     3,    11,     5,     9,    48,    45,
      46,   482,   483,     0,     9,   246,    11,   248,   571,    55,
       4,     6,     6,    21,     9,     9,   414,    11,    17,     7,
       6,    18,    10,     9,    27,    13,   220,   425,   777,   778,
     224,   523,   430,   708,   228,   516,   528,    52,    53,    54,
     683,   604,   523,   535,   238,   446,     7,   528,   102,    10,
     102,   105,    13,   105,   535,    10,    11,   697,   459,   540,
     623,   459,     4,    60,   813,   814,    24,   649,   205,   206,
     207,   208,     9,    70,    11,    14,    15,    16,   272,   273,
      77,    10,    11,   564,    22,    23,    83,     5,   210,   211,
     212,    45,    46,   491,     5,    92,    75,    94,    95,    96,
      45,    46,     4,   100,   101,    11,    12,   104,     3,   772,
      24,   108,     6,   776,    18,   607,    19,   114,     8,   517,
      45,    46,   203,   204,   682,   319,   607,   213,   214,    10,
      10,    55,   772,   728,     9,     5,   776,     9,   332,   333,
      75,    75,     3,   624,   542,   339,   340,    55,   549,     4,
     344,    68,     8,    10,   736,   624,   557,    55,    55,     8,
     354,    13,   356,   357,    55,   728,     8,    55,   726,   764,
      55,    12,   366,   414,    28,    68,    55,     9,    55,     5,
       8,    55,   376,     5,     5,     9,   584,     6,    11,   430,
     772,    55,   593,    31,   686,   593,    11,    17,    12,     3,
       3,   764,     3,     3,   398,   686,     3,   765,   689,    11,
     404,   769,   453,    11,     9,     8,   697,   411,    55,    55,
     414,    55,   416,     3,     6,    55,     5,   708,    55,   115,
     424,   425,    31,    11,   428,   429,   430,   760,   760,    11,
     434,   435,   723,    11,    11,    11,   727,    11,     6,     5,
     491,   809,     4,     3,   107,     3,     5,    12,    11,    55,
     752,    55,   456,     9,     4,   459,     9,     4,     4,     3,
      12,   752,     4,    24,   515,   676,   517,   178,   676,   760,
      66,    12,    12,   184,   185,     3,    11,    78,   529,   770,
      11,   760,   193,    70,     4,   196,   697,   491,     4,   697,
      11,   542,   703,   704,    73,     4,    11,    11,    31,    11,
      55,   709,   102,   507,   715,    18,   808,   105,    11,    11,
       4,    11,   516,   517,    11,   566,     0,   808,    61,    38,
      54,   686,   526,   340,   528,   234,   737,   738,   491,   737,
     738,   535,   416,   584,    18,   246,   540,   248,   542,   413,
     687,   428,   542,   508,   581,   723,   764,    60,   770,   613,
     261,   456,   705,   411,   535,   589,   591,    70,   660,   708,
     271,    74,   613,   774,    77,   781,   774,   571,   397,   780,
     781,   782,   366,    86,   273,   356,    60,   197,   199,    92,
     584,    94,    95,    96,    97,   200,    70,   100,   101,   593,
      -1,   104,    -1,    77,    -1,   108,    -1,    -1,    -1,   201,
     604,   114,    -1,   607,    -1,   656,   817,   357,    92,   202,
      94,    95,    96,    -1,    -1,    -1,   100,   101,    -1,   623,
     104,    -1,    -1,    -1,   108,    -1,    -1,    -1,   679,    28,
     114,    -1,    -1,    -1,    62,    34,    35,    36,    37,    38,
      39,    40,    41,    42,    43,    44,    -1,    75,    76,    77,
      78,    79,    80,    81,    -1,   706,    -1,    -1,   136,   370,
      -1,    -1,    -1,   374,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,   676,    62,    -1,   386,    -1,    -1,   682,   683,
      -1,    -1,    -1,    -1,    -1,   689,    75,    76,    77,    78,
      79,    80,    81,   697,    -1,    -1,   446,    -1,    -1,    -1,
      -1,   357,    -1,    -1,    -1,   709,    -1,    -1,    -1,   459,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,   723,
      -1,    -1,   726,    -1,   728,    -1,    -1,    -1,    -1,    -1,
      -1,   209,   443,   737,   738,   786,    -1,    -1,   449,    28,
      -1,   452,   170,    -1,   455,    34,    35,    36,    37,    38,
      39,    40,    41,    42,    43,    44,    -1,    -1,    -1,    -1,
     764,   765,    -1,    -1,   242,   769,   770,   245,    -1,   197,
     774,   199,   200,   201,   202,   203,   204,   205,   206,   207,
     208,   170,   210,   211,   212,   213,   214,   215,   216,   217,
     446,    -1,   270,   357,    -1,   506,    -1,    -1,    -1,   549,
      -1,    -1,    -1,   459,    -1,   809,    -1,   557,   197,   357,
     199,   200,   201,   202,   203,   204,   205,   206,   207,   208,
       6,   210,   211,   212,   213,   214,   215,   216,   217,    -1,
      -1,    -1,    18,    -1,    -1,    -1,   264,    -1,    -1,    -1,
      -1,    -1,    -1,   593,    -1,    -1,    -1,   558,    55,    -1,
     561,   562,    -1,    -1,   332,    62,   567,    64,    -1,    -1,
      67,    -1,    -1,    -1,    -1,    72,    -1,    -1,    -1,    -1,
     581,   349,    79,    -1,    60,   264,    -1,    -1,    85,   357,
      87,    -1,   446,    -1,    70,    -1,    -1,    -1,    -1,    -1,
      -1,    77,    99,   549,    -1,   459,    -1,    -1,   446,    -1,
      -1,   557,    -1,    -1,    -1,   112,    92,    -1,    94,    95,
      96,   459,    -1,    -1,   100,   101,    -1,   357,   104,    -1,
      -1,   357,   108,    -1,    -1,   636,   676,    -1,   114,    -1,
      -1,    -1,    -1,   411,    -1,    -1,    -1,   593,    -1,    -1,
      -1,    -1,    -1,   421,    -1,    -1,   424,   697,    -1,    -1,
      -1,    -1,    -1,   703,   704,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,   715,    -1,    -1,   679,   397,
      -1,   357,    -1,    -1,   402,    -1,     0,    -1,    -1,   457,
      -1,   459,    -1,    -1,    -1,   549,    -1,   737,   738,   700,
     701,   702,    -1,   557,    18,    -1,    -1,    -1,    -1,    -1,
      -1,   549,    -1,    -1,    -1,    -1,   446,   718,   397,   557,
     446,    -1,    -1,   402,    -1,    -1,    -1,    -1,    -1,   459,
     676,    -1,    -1,   459,   774,    -1,    -1,    -1,    -1,   593,
     780,   781,   782,    -1,    -1,    -1,    60,    -1,   516,    -1,
      -1,   697,    -1,    -1,    -1,   593,    70,   703,   704,    -1,
     528,    -1,    -1,    77,    -1,    -1,    -1,   535,    -1,   715,
     446,    -1,   540,    -1,    -1,    -1,    -1,   817,    92,    -1,
      94,    95,    96,   459,    -1,    -1,   100,   101,    -1,   557,
     104,   737,   738,    -1,   108,    -1,   564,    -1,    -1,    -1,
     114,    -1,    -1,    -1,    -1,    -1,    -1,     5,     6,    -1,
      -1,    -1,    -1,    11,    -1,    -1,    -1,    -1,    -1,   549,
      18,    -1,   676,   549,    -1,   593,    -1,   557,   774,    -1,
      -1,   557,    -1,    -1,   780,   781,   782,    -1,   676,   607,
      -1,    -1,    -1,   697,    -1,    -1,   564,    -1,    -1,   703,
     704,    -1,    -1,    -1,    -1,    -1,   624,    -1,    -1,   697,
      -1,   715,    60,   593,    -1,   703,   704,   593,    -1,    -1,
      -1,   817,    70,   549,    -1,    -1,    -1,   715,    -1,    77,
      -1,   557,    -1,   737,   738,   564,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    92,    -1,    94,    95,    96,   737,
     738,    -1,   100,   101,    -1,    -1,   104,    -1,   676,    -1,
     108,    -1,    -1,    -1,    -1,    -1,   114,   593,    -1,    -1,
     774,   689,    -1,    -1,    -1,    -1,   780,   781,   782,   697,
      -1,    -1,    -1,    -1,    -1,    -1,   774,    -1,    -1,    -1,
     708,    -1,   780,   781,   782,    -1,   676,    -1,    -1,    18,
     676,    -1,    -1,    -1,    -1,   723,    -1,    -1,    -1,   727,
      -1,    -1,    -1,   817,    -1,    -1,    -1,   697,    -1,   737,
     738,   697,    -1,   703,   704,    -1,    -1,   703,   704,   817,
      -1,    -1,    -1,    -1,    -1,   715,    55,    -1,    -1,   715,
     708,    -1,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,
     676,    -1,   770,    72,    -1,    -1,   774,   737,   738,    -1,
      79,   737,   738,    -1,    -1,    -1,    85,    -1,    87,    -1,
      -1,   697,    -1,    -1,    -1,    -1,    -1,   703,   704,   708,
      99,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,   715,
      -1,    -1,   760,   112,   774,    -1,    -1,    -1,   774,    -1,
     780,   781,   782,    -1,   780,   781,   782,    -1,    -1,    -1,
      -1,   737,   738,    -1,    -1,    -1,    -1,     1,    -1,     3,
      -1,     5,     6,    -1,    -1,    -1,    -1,    11,    -1,    -1,
      -1,   760,    -1,    -1,    18,    -1,    -1,   817,    -1,    -1,
      -1,   817,    -1,    -1,    -1,    -1,    -1,    -1,   774,    -1,
      -1,    -1,    -1,    -1,   780,   781,   782,    -1,    -1,    -1,
      -1,    45,    46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    55,    56,    57,    58,    59,    60,    61,    62,    63,
      64,    65,    -1,    67,    68,    69,    70,    71,    72,    -1,
      74,   817,    76,    77,    -1,    79,    80,    81,    -1,    -1,
      -1,    85,    86,    87,    -1,    -1,    90,    91,    92,    -1,
      94,    95,    96,    97,    98,    99,   100,   101,   102,   103,
     104,   105,   106,    -1,   108,    -1,   110,   111,   112,   113,
     114,   115,   116,     1,    -1,     3,    -1,     5,     6,    -1,
      55,    -1,    -1,    11,    -1,    -1,    -1,    62,    -1,    64,
      18,    19,    67,    -1,    -1,    -1,    -1,    72,    -1,    -1,
      -1,    -1,    -1,    -1,    79,    -1,    -1,    -1,    -1,    -1,
      85,    -1,    87,    -1,    -1,    -1,    -1,    45,    46,    -1,
      -1,    -1,    -1,    -1,    99,    -1,    -1,    55,    56,    57,
      58,    59,    60,    61,    62,    63,    64,   112,    -1,    67,
      68,    69,    70,    71,    72,    -1,    74,    -1,    76,    77,
      -1,    79,    80,    81,    -1,    -1,    -1,    85,    86,    87,
      -1,    18,    90,    91,    92,    -1,    94,    95,    96,    97,
      98,    99,   100,   101,   102,   103,   104,   105,   106,    -1,
     108,    -1,   110,   111,   112,   113,   114,   115,   116,     1,
      -1,     3,    -1,     5,     6,    -1,    -1,    -1,    55,    11,
      -1,    -1,    -1,    -1,    -1,    62,    18,    64,    -1,    -1,
      67,    -1,    -1,    -1,    -1,    72,    -1,    -1,    -1,    -1,
      -1,    -1,    79,    -1,    -1,    -1,    -1,    -1,    85,    -1,
      87,    -1,    -1,    45,    46,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    99,    55,    56,    57,    58,    59,    60,    61,
      62,    63,    64,    -1,    -1,    67,    68,    69,    70,    71,
      72,    -1,    74,    -1,    76,    77,    -1,    79,    80,    81,
      -1,    -1,    -1,    85,    86,    87,    -1,    -1,    90,    91,
      92,    -1,    94,    95,    96,    97,    98,    99,   100,   101,
     102,   103,   104,   105,   106,    -1,   108,    -1,   110,   111,
     112,   113,   114,   115,   116,     1,    -1,     3,    -1,     5,
       6,    55,    -1,    -1,    -1,    11,    -1,    -1,    62,    -1,
      64,    -1,    18,    67,    -1,    -1,    -1,    -1,    72,    -1,
      -1,    -1,    -1,    -1,    -1,    79,    -1,    -1,    -1,    -1,
      -1,    85,    -1,    87,    -1,    -1,    -1,    -1,    -1,    45,
      46,    -1,    -1,    -1,    -1,    99,    -1,    -1,    -1,    55,
      56,    57,    58,    59,    60,    61,    62,    63,    64,    -1,
      -1,    67,    68,    69,    70,    71,    72,    -1,    74,    -1,
      76,    77,    -1,    79,    80,    81,    -1,    -1,    -1,    85,
      86,    87,    -1,    -1,    90,    91,    92,    -1,    94,    95,
      96,    97,    98,    99,   100,   101,   102,   103,   104,   105,
     106,    -1,   108,    -1,   110,   111,   112,   113,   114,   115,
     116,     1,    -1,     3,    -1,     5,    -1,    -1,    -1,    -1,
      -1,    11,    -1,    -1,    -1,    -1,    -1,    -1,    18,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    45,    46,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,
      60,    61,    62,    63,    64,    65,    -1,    67,    68,    69,
      70,    71,    72,    -1,    74,    -1,    76,    77,    -1,    79,
      80,    81,    -1,    -1,    -1,    85,    86,    87,    -1,    -1,
      90,    91,    92,    -1,    94,    95,    96,    97,    98,    99,
     100,   101,   102,   103,   104,   105,   106,    -1,   108,    -1,
     110,   111,   112,   113,   114,   115,   116,     1,    -1,     3,
      -1,     5,     6,    -1,    -1,    -1,    -1,    11,    -1,    -1,
      -1,    -1,    -1,    -1,    18,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    45,    46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    55,    56,    57,    58,    59,    60,    61,    62,    63,
      64,    -1,    -1,    67,    68,    69,    70,    71,    72,    -1,
      74,    -1,    76,    77,    -1,    79,    80,    81,    -1,    -1,
      -1,    85,    86,    87,    -1,    -1,    90,    91,    92,    -1,
      94,    95,    96,    97,    98,    99,   100,   101,   102,   103,
     104,   105,   106,    -1,   108,    -1,   110,   111,   112,   113,
     114,   115,   116,     1,    -1,     3,    -1,     5,     6,    -1,
      -1,    -1,    -1,    11,    -1,    -1,    -1,    -1,    -1,    -1,
      18,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,    46,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,
      58,    59,    60,    61,    62,    63,    64,    -1,    -1,    67,
      68,    69,    70,    71,    72,    -1,    74,    -1,    76,    77,
      -1,    79,    80,    81,    -1,    -1,    -1,    85,    86,    87,
      -1,    -1,    90,    91,    92,    -1,    94,    95,    96,    97,
      98,    99,   100,   101,   102,   103,   104,   105,   106,    -1,
     108,    -1,   110,   111,   112,   113,   114,   115,   116,     1,
      -1,     3,    -1,     5,     6,    -1,    -1,    -1,    -1,    11,
      -1,    -1,    -1,    -1,    -1,    -1,    18,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    45,    46,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    55,    56,    57,    58,    59,    60,    61,
      62,    63,    64,    -1,    -1,    67,    68,    69,    70,    71,
      72,    -1,    74,    -1,    76,    77,    -1,    79,    80,    81,
      -1,    -1,    -1,    85,    86,    87,    -1,    18,    90,    91,
      92,    -1,    94,    95,    96,    97,    98,    99,   100,   101,
     102,   103,   104,   105,   106,    -1,   108,    -1,   110,   111,
     112,   113,   114,   115,   116,     1,    -1,     3,    -1,     5,
      -1,    -1,    -1,    -1,    55,    11,    -1,    -1,    -1,    -1,
      -1,    62,    18,    64,    -1,    -1,    67,    -1,    -1,    -1,
      -1,    72,    -1,    -1,    -1,    -1,    -1,    -1,    79,    -1,
      -1,    -1,    -1,    -1,    85,    -1,    87,    -1,    -1,    45,
      46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    99,    55,
      56,    57,    58,    59,    -1,    61,    62,    63,    64,    -1,
      -1,    67,   113,    69,    -1,    71,    72,    -1,    -1,    18,
      76,    -1,    -1,    79,    80,    81,    -1,    -1,    -1,    85,
      18,    87,    -1,    -1,    90,    91,    -1,    -1,    26,    -1,
      -1,    -1,    98,    99,    -1,    -1,   102,   103,   104,   105,
     106,     3,     4,    -1,   110,   111,    55,   113,    -1,   115,
     116,    -1,    -1,    62,    -1,    64,    18,    55,    67,    -1,
      22,    23,    -1,    72,    62,    -1,    64,    29,    30,    67,
      79,    -1,    -1,    -1,    72,    -1,    85,    -1,    87,    -1,
      -1,    79,    -1,    45,    46,    -1,    -1,    85,    -1,    87,
      99,    -1,    -1,    55,    56,    57,    58,    59,    60,    -1,
      62,    99,    64,    -1,   113,    67,    -1,    18,    70,    -1,
      72,    -1,    -1,    -1,    76,    77,    -1,    79,    -1,    -1,
      -1,    -1,    -1,    85,    -1,    87,    -1,    -1,    90,    91,
      92,    -1,    94,    95,    96,    -1,    -1,    99,   100,   101,
     102,   103,   104,   105,    -1,    -1,   108,    -1,   110,    60,
      -1,   113,   114,     3,     4,     5,    -1,    -1,    -1,    70,
      -1,    -1,    -1,    74,    -1,    -1,    77,    -1,    18,    -1,
      -1,    -1,    22,    23,    -1,    86,    -1,    -1,    -1,    29,
      30,    92,    -1,    94,    95,    96,    97,    -1,    -1,   100,
     101,    -1,    -1,   104,    -1,    45,    46,   108,    -1,    -1,
      -1,    -1,    -1,   114,    -1,    55,    56,    57,    58,    59,
      -1,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,     3,
      -1,     5,    72,    -1,    -1,     9,    76,    -1,    -1,    79,
      -1,    -1,    -1,    -1,    18,    85,    -1,    87,    22,    23,
      90,    91,    -1,    -1,    -1,    29,    30,    -1,    -1,    99,
      -1,    -1,   102,   103,    -1,   105,    -1,    -1,    -1,    -1,
     110,    45,    46,   113,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    55,    56,    57,    58,    59,    -1,    -1,    62,    -1,
      64,    -1,    -1,    67,    -1,     3,    -1,     5,    72,    -1,
      -1,    -1,    76,    -1,    -1,    79,    -1,    -1,    -1,    -1,
      18,    85,    -1,    87,    22,    23,    90,    91,    -1,    -1,
      -1,    29,    30,    -1,    -1,    99,    -1,    -1,   102,   103,
      -1,   105,    -1,    -1,    -1,    -1,   110,    45,    46,   113,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,
      58,    59,    -1,    -1,    62,    -1,    64,    -1,    -1,    67,
      -1,     3,    -1,     5,    72,    -1,    -1,    -1,    76,    -1,
      -1,    79,    -1,    -1,    -1,    -1,    18,    85,    -1,    87,
      22,    23,    90,    91,    -1,    -1,    -1,    29,    30,    -1,
      -1,    99,    -1,    -1,   102,   103,    -1,   105,   106,    -1,
      -1,    -1,   110,    45,    46,   113,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    55,    56,    57,    58,    59,    -1,    -1,
      62,    -1,    64,    -1,    -1,    67,    -1,     3,     4,    -1,
      72,    -1,    -1,    -1,    76,    -1,    -1,    79,    -1,    -1,
      -1,    -1,    18,    85,    -1,    87,    22,    23,    90,    91,
      -1,    -1,    -1,    29,    30,    -1,    -1,    99,    -1,    -1,
     102,   103,    -1,   105,    -1,    -1,    -1,    -1,   110,    45,
      46,   113,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,
      56,    57,    58,    59,    -1,    -1,    62,    -1,    64,    -1,
      -1,    67,    -1,     3,    -1,     5,    72,    -1,    -1,    -1,
      76,    -1,    -1,    79,    -1,    -1,    -1,    -1,    18,    85,
      -1,    87,    22,    23,    90,    91,    -1,    -1,    -1,    29,
      30,    -1,    -1,    99,    -1,    -1,   102,   103,    -1,   105,
      -1,    -1,    -1,    -1,   110,    45,    46,   113,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,
      -1,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,     3,
      -1,    -1,    72,    -1,     8,    -1,    76,    -1,    -1,    79,
      -1,    -1,    -1,    -1,    18,    85,    -1,    87,    22,    23,
      90,    91,    -1,    -1,    -1,    29,    30,    -1,    -1,    99,
      -1,    -1,   102,   103,    -1,   105,    -1,    -1,    -1,    -1,
     110,    45,    46,   113,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    55,    56,    57,    58,    59,    -1,    -1,    62,    -1,
      64,    -1,    -1,    67,    -1,     3,    -1,     5,    72,    -1,
      -1,    -1,    76,    -1,    -1,    79,    -1,    -1,    -1,    -1,
      18,    85,    -1,    87,    22,    23,    90,    91,    -1,    -1,
      -1,    29,    30,    -1,    -1,    99,    -1,    -1,   102,   103,
      -1,   105,    -1,    -1,    -1,    -1,   110,    45,    46,   113,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,
      58,    59,    -1,    -1,    62,    -1,    64,    -1,    -1,    67,
      -1,     3,    -1,    -1,    72,    -1,     8,    -1,    76,    -1,
      -1,    79,    -1,    -1,    -1,    -1,    18,    85,    -1,    87,
      22,    23,    90,    91,    -1,    -1,    -1,    29,    30,    -1,
      -1,    99,    -1,    -1,   102,   103,    -1,   105,    -1,    -1,
      -1,    -1,   110,    45,    46,   113,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    55,    56,    57,    58,    59,    -1,    -1,
      62,    -1,    64,    -1,    -1,    67,    -1,     3,    -1,    -1,
      72,    -1,    -1,    -1,    76,    11,    -1,    79,    -1,    -1,
      -1,    -1,    18,    85,    -1,    87,    22,    23,    90,    91,
      -1,    -1,    -1,    29,    30,    -1,    -1,    99,    -1,    -1,
     102,   103,    -1,   105,    -1,    -1,    -1,    -1,   110,    45,
      46,   113,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,
      56,    57,    58,    59,    -1,    -1,    62,    -1,    64,    -1,
      -1,    67,    -1,     3,    -1,    -1,    72,    -1,    -1,    -1,
      76,    -1,    -1,    79,    -1,    -1,    -1,    -1,    18,    85,
      -1,    87,    22,    23,    90,    91,    -1,    -1,    -1,    29,
      30,    -1,    -1,    99,    -1,    -1,   102,   103,    -1,   105,
      -1,    -1,    -1,    -1,   110,    45,    46,   113,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,
      -1,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,     3,
      -1,    -1,    72,    -1,    -1,    -1,    76,    -1,    -1,    79,
      -1,    -1,    -1,    -1,    18,    85,    -1,    87,    22,    23,
      90,    91,    -1,    -1,    -1,    29,    30,    -1,    -1,    99,
      -1,    -1,   102,   103,    -1,   105,    -1,    -1,    -1,    -1,
     110,    45,    46,   113,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    55,    56,    57,    58,    59,    -1,    -1,    62,    -1,
      64,     3,    -1,    67,    -1,    -1,    -1,    -1,    72,    -1,
      -1,    -1,    76,    -1,    -1,    79,    18,    -1,    -1,    -1,
      -1,    85,    -1,    87,    -1,    -1,    90,    91,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    99,    -1,    -1,   102,   103,
      -1,   105,    -1,    45,    46,    -1,   110,    -1,    -1,   113,
      -1,    -1,    -1,    55,    56,    57,    58,    59,    -1,    -1,
      62,    -1,    64,     3,    -1,    67,    -1,    -1,    -1,    -1,
      72,    -1,    -1,    -1,    76,    -1,    -1,    79,    18,    -1,
      -1,    -1,    -1,    85,    -1,    87,    -1,    -1,    90,    91,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    99,    -1,    -1,
     102,    -1,    -1,   105,    -1,    45,    46,    -1,   110,    -1,
     112,   113,    -1,    -1,    -1,    55,    56,    57,    58,    59,
      -1,    -1,    62,    -1,    64,     3,     4,    67,    -1,    -1,
      -1,    -1,    72,    -1,    -1,    -1,    76,    -1,    -1,    79,
      18,    -1,    -1,    -1,    -1,    85,    -1,    87,    -1,    -1,
      90,    91,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    99,
      -1,    -1,   102,    -1,    -1,   105,    -1,    -1,    -1,    -1,
     110,    -1,    -1,   113,    -1,    -1,    -1,    55,    56,    57,
      58,    59,    -1,    -1,    62,     3,    64,    -1,    -1,    67,
      -1,    -1,    -1,    -1,    72,    -1,    -1,    -1,    76,    -1,
      18,    79,    -1,    -1,    -1,    -1,    -1,    85,    -1,    87,
      -1,    -1,    90,    91,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    99,    -1,    -1,   102,    -1,    -1,   105,    -1,    -1,
      -1,    -1,   110,    -1,   112,   113,    -1,    55,    56,    57,
      58,    59,     4,    -1,    62,    -1,    64,    -1,    -1,    67,
      -1,    -1,    -1,    -1,    72,    -1,    18,    -1,    76,    -1,
      -1,    79,    -1,    -1,     5,     6,    -1,    85,    -1,    87,
      11,    -1,    90,    91,    -1,    -1,    -1,    18,    -1,    -1,
      -1,    99,    -1,    -1,   102,    -1,    -1,   105,    -1,    -1,
      -1,    -1,   110,    55,   112,   113,    -1,    -1,    60,    -1,
      62,    -1,    64,     5,     6,    67,    -1,    -1,    70,    11,
      72,    -1,    -1,    -1,    -1,    77,    18,    79,    -1,    60,
      -1,    -1,    -1,    85,    -1,    87,    -1,    -1,    -1,    70,
      92,    -1,    94,    95,    96,    -1,    77,    99,   100,   101,
      -1,    -1,   104,    -1,    -1,    -1,   108,    -1,    -1,    -1,
      -1,    92,   114,    94,    95,    96,     5,     6,    60,   100,
     101,    -1,    11,   104,    -1,    -1,    -1,   108,    70,    18,
      -1,    -1,    -1,   114,    -1,    77,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      92,    -1,    94,    95,    96,     5,     6,    -1,   100,   101,
      -1,    11,   104,    -1,    -1,    -1,   108,    -1,    18,    -1,
      -1,    60,   114,    -1,    -1,    -1,     5,     6,    -1,    -1,
      -1,    70,    11,    -1,    -1,    -1,    -1,    -1,    77,    18,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    92,    -1,    94,    95,    96,    -1,    -1,
      60,   100,   101,    -1,    -1,   104,     6,    -1,    -1,   108,
      70,    -1,    -1,    -1,    -1,   114,    -1,    77,    18,    -1,
      -1,    60,    -1,    -1,    -1,    -1,    -1,     6,    -1,    -1,
      -1,    70,    92,    -1,    94,    95,    96,    -1,    77,    18,
     100,   101,    -1,    -1,   104,    -1,    -1,    -1,   108,    -1,
      -1,    -1,    -1,    92,   114,    94,    95,    96,    -1,    -1,
      60,   100,   101,    -1,    -1,   104,     6,    18,    -1,   108,
      70,    -1,    -1,    -1,    -1,   114,    -1,    77,    18,    -1,
      -1,    60,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    70,    92,    -1,    94,    95,    96,    -1,    77,    -1,
     100,   101,    -1,    -1,   104,    -1,    -1,    -1,   108,    60,
      -1,    -1,    -1,    92,   114,    94,    95,    96,    -1,    70,
      60,   100,   101,    -1,    -1,   104,    77,    -1,    -1,   108,
      70,    -1,    83,    18,    19,   114,    -1,    77,    -1,    -1,
      -1,    92,    -1,    94,    95,    96,    -1,    -1,    -1,   100,
     101,    -1,    92,   104,    94,    95,    96,   108,    -1,    -1,
     100,   101,    -1,   114,   104,    -1,    -1,    -1,   108,    -1,
      55,    -1,    -1,    -1,   114,    60,    -1,    62,    -1,    64,
      -1,    -1,    67,    -1,    -1,    70,    -1,    72,    -1,    74,
      18,    19,    77,    -1,    79,    -1,    -1,    -1,    -1,    -1,
      85,    86,    87,    -1,    -1,    -1,    -1,    92,    -1,    94,
      95,    96,    97,    -1,    99,   100,   101,    -1,    -1,   104,
      -1,    -1,    -1,   108,    -1,    -1,    -1,    55,   113,   114,
      -1,    -1,    60,    -1,    62,    -1,    64,    -1,    -1,    67,
      -1,    -1,    70,    -1,    72,    18,    74,    -1,    -1,    77,
      -1,    79,    -1,    -1,    -1,    -1,    -1,    85,    86,    87,
      -1,    -1,    -1,    -1,    92,    -1,    94,    95,    96,    97,
      -1,    99,   100,   101,    -1,    -1,   104,    -1,    -1,    -1,
     108,    -1,    55,    -1,    -1,   113,   114,    60,    18,    62,
      -1,    64,    -1,    -1,    67,    -1,    -1,    70,    -1,    72,
      -1,    74,    -1,    -1,    77,    -1,    79,    -1,    -1,    18,
      -1,    -1,    85,    86,    87,    -1,    -1,    -1,    -1,    92,
      -1,    94,    95,    96,    97,    55,    99,   100,   101,    -1,
      60,   104,    62,    -1,    64,   108,    -1,    67,    -1,    -1,
      70,   114,    72,    -1,    -1,    -1,    -1,    77,    -1,    79,
      -1,    60,    18,    19,    -1,    85,    -1,    87,    -1,    -1,
      -1,    70,    92,    -1,    94,    95,    96,    -1,    77,    99,
     100,   101,    -1,    -1,   104,    -1,    -1,    -1,   108,    -1,
      18,    -1,    -1,    92,   114,    94,    95,    96,    26,    55,
      -1,   100,   101,    -1,    -1,   104,    62,    -1,    64,   108,
      -1,    67,    -1,    -1,    -1,   114,    72,    -1,    -1,    -1,
      60,    -1,    -1,    79,    -1,    -1,    -1,    55,    -1,    85,
      70,    87,    -1,    -1,    62,    -1,    64,    77,    -1,    67,
      -1,    -1,    -1,    99,    72,    -1,    -1,    -1,    -1,    -1,
      -1,    79,    92,    -1,    94,    95,    96,    85,    -1,    87,
     100,   101,     3,    -1,   104,    -1,     7,    -1,   108,    10,
      -1,    99,    13,    -1,   114,    -1,    -1,    18,    19,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    28,    -1,    -1,
      -1,    -1,    -1,    34,    35,    36,    37,    38,    39,    40,
      41,    42,    43,    44,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    55
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final short[] yystos_ = yystos_init();
  private static final short[] yystos_init()
  {
    return new short[]
    {
       0,    83,    93,   127,   128,   129,   130,   131,    55,   100,
     122,   122,     0,    18,    60,    70,    77,    92,    94,    95,
      96,   100,   101,   104,   108,   114,   123,   124,   125,   126,
     131,   133,   290,   291,   122,    10,    11,    10,    11,   122,
      18,    74,    86,    97,   123,   134,   138,   139,   158,   164,
     189,   190,   198,   126,   123,   125,   291,    10,    11,    14,
      55,   129,     3,    86,    55,    55,    55,    68,   134,    14,
      11,   132,   133,     3,     4,     5,    22,    23,    29,    30,
      45,    46,    55,    56,    57,    58,    59,    62,    64,    67,
      72,    76,    79,    85,    87,    90,    91,    99,   102,   103,
     105,   110,   113,   121,   122,   135,   136,   137,   241,   242,
     243,   250,   251,   252,   255,   256,   268,   270,   271,   272,
     273,   274,   275,   276,   277,   278,   279,   280,   281,   282,
     283,   284,   285,   286,   287,   288,   290,   291,   292,   293,
      55,    82,   146,    19,   140,   141,   140,    55,    11,     3,
      55,   122,   250,   251,   259,   260,   261,   264,   265,   266,
     268,     9,   293,   294,   281,   281,   281,   281,   281,   281,
      28,    19,   122,   135,   246,   247,    10,    13,     3,     7,
     186,   187,   188,   290,     3,     7,    10,   247,   253,    10,
      13,   186,   188,     7,    10,    13,    26,    47,   269,    48,
      21,    27,    17,    49,    51,    19,    20,    32,    33,    84,
      52,    53,    54,    22,    23,    14,    15,    16,    45,    46,
     136,     4,     9,     4,     5,   199,   135,   147,     5,   159,
      55,   142,   143,   144,   290,    75,   191,   192,     3,   165,
     140,     4,   123,   262,   263,   290,    24,     4,    24,    28,
      34,    35,    36,    37,    38,    39,    40,    41,    42,    43,
      44,   267,     6,     6,     9,   293,    26,   135,   248,   249,
     290,     7,   187,   257,   258,   290,   244,   245,   289,   290,
      55,   246,   246,   259,     8,    10,   188,     7,     4,   254,
     259,   259,    90,   102,   243,   247,   102,   105,   246,    10,
     259,    55,   243,   246,   246,   259,   271,   272,   273,   274,
     275,   276,   276,   278,   278,   278,   278,   112,   135,   136,
     207,   240,   279,   279,   279,   280,   280,   281,   281,   281,
      55,     6,   123,   200,     9,   160,   161,   162,   289,    75,
       9,    20,   144,   135,     5,   193,     9,   166,   167,   289,
     146,    75,   145,   112,   136,     4,     9,     5,   204,   259,
     204,   259,   259,   293,    75,   102,     9,    20,    26,   259,
       5,   174,   186,   258,     7,   253,    10,    25,   246,    55,
      55,    55,     4,    68,     8,     4,     9,     8,    10,    55,
      13,    55,    90,    68,     8,    55,    55,    12,    55,   172,
     173,   172,    28,   135,   136,   138,   189,   196,   201,   202,
       6,   123,   135,     9,    11,   163,     9,    55,   135,   148,
     289,   290,   143,     6,   123,   194,   135,     4,     9,   136,
       5,   168,   135,   146,    55,    55,   289,   290,   263,     1,
       6,    11,    55,    61,    63,    69,    71,    80,    81,    98,
     103,   104,   106,   111,   115,   116,   123,   124,   204,   205,
     206,   207,   208,   209,   210,   211,   212,   222,   223,   224,
     229,   242,   252,   265,   282,   283,   285,   286,   287,   135,
     135,   249,    75,   102,     8,   174,   175,   176,   177,   259,
     259,     5,   149,   150,   289,   253,     5,   214,   259,    55,
     246,   253,   246,   253,   260,   268,    28,   187,     9,   293,
     172,    55,   201,   163,    11,   100,   123,   151,   152,   204,
       6,   162,   253,    17,    55,   113,   136,   138,   141,   179,
     189,   195,   196,   197,     6,   123,   167,    55,   289,     6,
     123,   152,   169,   170,   150,   186,   186,    31,    11,    12,
     259,    11,    55,    11,    55,   104,   208,     3,     3,    11,
     259,     3,     3,   259,     3,   204,   237,     3,   259,   138,
     190,   136,   207,     6,   206,    11,    11,   135,   135,     6,
       9,     9,     8,     6,   151,    55,     6,    65,    70,   215,
     216,   217,   218,   219,   220,    55,    55,   259,    28,   173,
      11,     3,     6,   204,   136,   138,   140,   141,   153,   154,
     155,   171,   178,   179,   189,   152,   150,   135,    55,   180,
     180,   113,   135,   136,   290,    11,   185,   204,   195,    31,
      55,     6,   170,    55,   208,    11,    12,    11,    11,   115,
     207,   211,   225,   227,   259,    11,   259,   259,    11,   122,
     207,   238,   239,   241,   250,    66,    78,   231,   232,   236,
     204,   259,    11,    11,     6,   177,     6,   221,   264,     6,
     216,   220,     6,   218,   220,    70,   205,   220,    12,    24,
     253,   174,     4,    55,   172,    55,   107,   184,   185,     3,
     184,   184,   180,   180,   180,   113,    55,     5,   156,   259,
       3,    12,    11,     9,     4,     4,     4,     4,    11,     3,
     204,   232,   236,   230,   231,     4,     9,    12,   106,   204,
     259,   186,    11,     3,   147,   156,     4,   124,   136,   181,
     182,   184,   184,   184,   180,     6,   122,   157,   205,   241,
     246,    11,   259,   259,   226,   259,   211,   208,   214,   204,
       4,   239,   123,   233,   235,   236,   208,   264,   259,    11,
      70,   203,   181,   186,   136,    55,   105,   183,   289,     4,
       9,   184,    10,     6,   205,     6,    10,   102,   105,     4,
       4,    11,    73,   213,   135,   234,     4,    11,   293,    11,
       4,   183,    10,   186,    31,   186,   182,   246,   247,     6,
     246,   253,   253,    11,   208,   227,   228,   208,    21,    55,
     204,   105,    55,   102,   102,    11,    11,     4,   135,   186,
     253,   253,   208,    11,    11
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final short[] yyr1_ = yyr1_init();
  private static final short[] yyr1_init()
  {
    return new short[]
    {
       0,   120,   121,   121,   121,   121,   121,   121,   121,   122,
     122,   123,   123,   124,   124,   125,   125,   126,   126,   126,
     126,   126,   126,   126,   126,   126,   126,   126,   126,   127,
     127,   127,   128,   129,   129,   130,   130,   131,   131,   131,
     131,   132,   132,   133,   133,   134,   134,   135,   135,   136,
     136,   136,   136,   137,   137,   137,   137,   137,   137,   137,
     137,   138,   138,   138,   139,   140,   140,   141,   142,   142,
     143,   143,   144,   144,   144,   145,   145,   146,   146,   147,
     147,   148,   148,   149,   149,   150,   150,   151,   151,   152,
     152,   152,   152,   153,   153,   153,   153,   153,   154,   155,
     156,   156,   156,   156,   157,   157,   157,   157,   158,   159,
     159,   160,   160,   161,   161,   162,   162,   162,   163,   163,
     163,   164,   165,   166,   166,   166,   167,   167,   168,   168,
     169,   169,   170,   170,   171,   172,   172,   173,   173,   173,
     173,   174,   174,   175,   175,   176,   176,   177,   177,   178,
     179,   179,   179,   179,   179,   179,   180,   180,   181,   181,
     182,   182,   183,   183,   183,   183,   184,   184,   185,   185,
     186,   186,   187,   187,   188,   188,   189,   189,   190,   191,
     191,   192,   192,   193,   193,   194,   194,   195,   195,   195,
     195,   196,   197,   198,   199,   199,   200,   200,   201,   201,
     201,   201,   202,   203,   203,   204,   204,   205,   205,   206,
     206,   206,   206,   206,   207,   207,   208,   208,   208,   208,
     208,   209,   209,   209,   209,   209,   209,   209,   209,   209,
     209,   209,   209,   209,   209,   209,   209,   209,   209,   209,
     209,   209,   210,   211,   211,   211,   211,   211,   211,   211,
     212,   213,   213,   214,   214,   214,   215,   215,   216,   216,
     216,   217,   217,   218,   219,   219,   220,   220,   221,   221,
     222,   223,   223,   224,   225,   225,   225,   226,   226,   227,
     227,   228,   228,   229,   230,   230,   231,   231,   232,   233,
     234,   234,   235,   235,   236,   237,   237,   238,   238,   239,
     239,   240,   241,   241,   241,   241,   241,   241,   241,   241,
     241,   241,   241,   241,   242,   242,   242,   243,   244,   244,
     245,   245,   246,   246,   247,   248,   248,   249,   249,   249,
     249,   249,   249,   249,   250,   250,   250,   251,   251,   252,
     252,   252,   252,   252,   253,   253,   254,   254,   255,   255,
     255,   255,   255,   256,   256,   257,   257,   258,   258,   259,
     259,   260,   260,   260,   260,   261,   261,   262,   262,   263,
     263,   263,   264,   264,   265,   266,   266,   266,   267,   267,
     267,   267,   267,   267,   267,   267,   267,   267,   267,   267,
     268,   269,   269,   269,   270,   270,   271,   271,   272,   272,
     273,   273,   274,   274,   275,   275,   275,   276,   276,   276,
     276,   276,   276,   277,   277,   278,   278,   278,   278,   279,
     279,   279,   280,   280,   280,   280,   281,   281,   281,   281,
     281,   282,   283,   284,   284,   284,   284,   285,   285,   285,
     285,   286,   287,   288,   289,   289,   290,   290,   291,   291,
     291,   291,   292,   292,   293,   293,   293,   293,   294,   294,
     294
    };
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte[] yyr2_ = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     1,     1,     1,     1,     1,     1,     1,     1,
       3,     0,     1,     1,     2,     1,     2,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     0,
       1,     2,     5,     0,     1,     1,     2,     3,     4,     5,
       6,     0,     1,     2,     3,     1,     1,     1,     2,     1,
       1,     2,     2,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     7,     0,     1,     3,     1,     3,
       2,     1,     1,     4,     3,     0,     2,     0,     2,     1,
       3,     1,     3,     0,     1,     2,     3,     1,     2,     2,
       1,     2,     1,     1,     1,     1,     1,     1,     3,     5,
       2,     3,     3,     4,     4,     4,     6,     6,     4,     4,
       5,     0,     1,     1,     3,     2,     3,     4,     0,     1,
       2,     6,     3,     0,     1,     3,     3,     5,     2,     3,
       1,     2,     1,     3,     3,     1,     3,     1,     3,     2,
       4,     3,     4,     0,     1,     1,     3,     1,     1,     2,
       4,     5,     4,     4,     3,     3,     4,     5,     1,     3,
       3,     2,     2,     3,     1,     3,     0,     2,     1,     1,
       0,     1,     1,     2,     3,     2,     1,     1,     5,     0,
       1,     2,     3,     2,     3,     2,     3,     1,     1,     1,
       1,     3,     2,     4,     2,     3,     2,     3,     1,     1,
       1,     1,     7,     0,     2,     2,     3,     1,     2,     2,
       2,     3,     2,     1,     2,     2,     1,     1,     1,     1,
       1,     1,     1,     2,     3,     5,     5,     7,     2,     3,
       2,     3,     2,     3,     5,     3,     3,     3,     4,     3,
       5,     2,     3,     1,     1,     1,     1,     1,     1,     1,
       6,     0,     2,     2,     3,     3,     1,     2,     4,     3,
       5,     1,     2,     2,     2,     3,     2,     1,     1,     3,
       5,     1,     1,     9,     0,     1,     1,     0,     1,     1,
       3,     0,     1,     7,     0,     1,     1,     2,     5,     4,
       1,     3,     0,     1,     2,     3,     4,     1,     3,     1,
       1,     1,     1,     4,     4,     1,     3,     3,     1,     1,
       1,     1,     1,     1,     1,     3,     3,     5,     2,     2,
       2,     4,     0,     1,     3,     1,     3,     1,     1,     3,
       3,     2,     4,     4,     3,     3,     5,     4,     4,     2,
       5,     5,     5,     7,     2,     3,     1,     3,     4,     4,
       4,     6,     4,     4,     4,     1,     2,     3,     4,     1,
       1,     3,     3,     3,     3,     2,     3,     1,     3,     4,
       4,     5,     1,     1,     3,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       2,     0,     4,     4,     1,     3,     1,     3,     1,     3,
       1,     3,     1,     3,     1,     3,     3,     1,     3,     3,
       3,     3,     1,     3,     3,     1,     3,     3,     3,     1,
       3,     3,     1,     3,     3,     3,     1,     1,     2,     2,
       1,     2,     2,     1,     2,     2,     1,     1,     1,     1,
       1,     2,     2,     5,     0,     1,     1,     2,     2,     4,
       5,     5,     3,     5,     1,     3,     3,     1,     0,     1,
       3
    };
  }




  /* YYTRANSLATE_(TOKEN-NUM) -- Symbol number corresponding to TOKEN-NUM
     as returned by yylex, with out-of-bounds checking.  */
  private static final SymbolKind yytranslate_(int t)
  {
    // Last valid token kind.
    int code_max = 374;
    if (t <= 0)
      return SymbolKind.S_YYEOF;
    else if (t <= code_max)
      return SymbolKind.get(yytranslate_table_[t]);
    else
      return SymbolKind.S_YYUNDEF;
  }
  private static final byte[] yytranslate_table_ = yytranslate_table_init();
  private static final byte[] yytranslate_table_init()
  {
    return new byte[]
    {
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60,    61,    62,    63,    64,
      65,    66,    67,    68,    69,    70,    71,    72,    73,    74,
      75,    76,    77,    78,    79,    80,    81,    82,    83,    84,
      85,    86,    87,    88,    89,    90,    91,    92,    93,    94,
      95,    96,    97,    98,    99,   100,   101,   102,   103,   104,
     105,   106,   107,   108,   109,   110,   111,   112,   113,   114,
     115,   116,   117,   118,   119
    };
  }


  private static final int YYLAST_ = 4534;
  private static final int YYEMPTY_ = -2;
  private static final int YYFINAL_ = 12;
  private static final int YYNTOKENS_ = 120;

/* Unqualified %code blocks.  */
/* "src/main/resources/Java_16_Grammar.y":177  */

    public CompilationUnit ast;
    public HashMap<String,Declaration> classes = new HashMap<String,Declaration>();

/* "src/main/java/parser/JavaParser.java":5975  */

}
/* "src/main/resources/Java_16_Grammar.y":1529  */


