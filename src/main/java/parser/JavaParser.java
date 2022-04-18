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
    S_SimpleInitOpt(174),          /* SimpleInitOpt  */
    S_ArrayInitOpt(175),           /* ArrayInitOpt  */
    S_ArrayInitializer(176),       /* ArrayInitializer  */
    S_VariableInitializerListOpt(177), /* VariableInitializerListOpt  */
    S_VariableInitializerList(178), /* VariableInitializerList  */
    S_VariableInitializer(179),    /* VariableInitializer  */
    S_MethodDeclaration(180),      /* MethodDeclaration  */
    S_MethodHeader(181),           /* MethodHeader  */
    S_MethodDeclarator(182),       /* MethodDeclarator  */
    S_FormalParameterList(183),    /* FormalParameterList  */
    S_FormalParameter(184),        /* FormalParameter  */
    S_FormalParameterTail(185),    /* FormalParameterTail  */
    S_ThrowsOpt(186),              /* ThrowsOpt  */
    S_MethodBody(187),             /* MethodBody  */
    S_DimsOpt(188),                /* DimsOpt  */
    S_Dims(189),                   /* Dims  */
    S_Dim(190),                    /* Dim  */
    S_InterfaceDeclaration(191),   /* InterfaceDeclaration  */
    S_NormalInterfaceDeclaration(192), /* NormalInterfaceDeclaration  */
    S_InterfaceExtendsOpt(193),    /* InterfaceExtendsOpt  */
    S_InterfaceExtends(194),       /* InterfaceExtends  */
    S_InterfaceBody(195),          /* InterfaceBody  */
    S_InterfaceMemberDeclarationSeq(196), /* InterfaceMemberDeclarationSeq  */
    S_InterfaceMemberDeclaration(197), /* InterfaceMemberDeclaration  */
    S_ConstantDeclaration(198),    /* ConstantDeclaration  */
    S_InterfaceMethodDeclaration(199), /* InterfaceMethodDeclaration  */
    S_AnnotationInterfaceDeclaration(200), /* AnnotationInterfaceDeclaration  */
    S_AnnotationInterfaceBody(201), /* AnnotationInterfaceBody  */
    S_AnnotationInterfaceMemberDeclarationSeq(202), /* AnnotationInterfaceMemberDeclarationSeq  */
    S_AnnotationInterfaceMemberDeclaration(203), /* AnnotationInterfaceMemberDeclaration  */
    S_AnnotationInterfaceElementDeclaration(204), /* AnnotationInterfaceElementDeclaration  */
    S_DefaultValueOpt(205),        /* DefaultValueOpt  */
    S_Block(206),                  /* Block  */
    S_BlockStatementSeq(207),      /* BlockStatementSeq  */
    S_BlockStatement(208),         /* BlockStatement  */
    S_LocalVariableDeclaration(209), /* LocalVariableDeclaration  */
    S_Statement(210),              /* Statement  */
    S_SimpleStatement(211),        /* SimpleStatement  */
    S_LabeledStatement(212),       /* LabeledStatement  */
    S_StatementExpression(213),    /* StatementExpression  */
    S_IfThenElseStatement(214),    /* IfThenElseStatement  */
    S_ElsePartOpt(215),            /* ElsePartOpt  */
    S_SwitchBlock(216),            /* SwitchBlock  */
    S_SwitchRuleSeq(217),          /* SwitchRuleSeq  */
    S_SwitchRule(218),             /* SwitchRule  */
    S_SwitchBlockStatementGroupSeq(219), /* SwitchBlockStatementGroupSeq  */
    S_SwitchBlockStatementGroup(220), /* SwitchBlockStatementGroup  */
    S_SwitchLabelSeq(221),         /* SwitchLabelSeq  */
    S_SwitchLabel(222),            /* SwitchLabel  */
    S_CaseExpressionList(223),     /* CaseExpressionList  */
    S_WhileStatement(224),         /* WhileStatement  */
    S_ForStatement(225),           /* ForStatement  */
    S_BasicForStatement(226),      /* BasicForStatement  */
    S_ForInitOpt(227),             /* ForInitOpt  */
    S_ExpressionOpt(228),          /* ExpressionOpt  */
    S_StatementExpressionList(229), /* StatementExpressionList  */
    S_StatementExpressionListOpt(230), /* StatementExpressionListOpt  */
    S_EnhancedForStatement(231),   /* EnhancedForStatement  */
    S_CatchesOpt(232),             /* CatchesOpt  */
    S_Catches(233),                /* Catches  */
    S_CatchClause(234),            /* CatchClause  */
    S_CatchFormalParameter(235),   /* CatchFormalParameter  */
    S_CatchType(236),              /* CatchType  */
    S_FinallyOpt(237),             /* FinallyOpt  */
    S_Finally(238),                /* Finally  */
    S_ResourceSpecification(239),  /* ResourceSpecification  */
    S_ResourceSeq(240),            /* ResourceSeq  */
    S_Resource(241),               /* Resource  */
    S_Pattern(242),                /* Pattern  */
    S_Primary(243),                /* Primary  */
    S_ClassInstanceCreationExpression(244), /* ClassInstanceCreationExpression  */
    S_UnqualifiedClassInstanceCreationExpression(245), /* UnqualifiedClassInstanceCreationExpression  */
    S_ClassOrInterfaceTypeToInstantiate(246), /* ClassOrInterfaceTypeToInstantiate  */
    S_TypeArgumentsOpt(247),       /* TypeArgumentsOpt  */
    S_TypeArguments(248),          /* TypeArguments  */
    S_TypeArgumentList(249),       /* TypeArgumentList  */
    S_TypeArgument(250),           /* TypeArgument  */
    S_FieldAccess(251),            /* FieldAccess  */
    S_ArrayAccess(252),            /* ArrayAccess  */
    S_MethodInvocation(253),       /* MethodInvocation  */
    S_Arguments(254),              /* Arguments  */
    S_ArgumentList(255),           /* ArgumentList  */
    S_MethodReference(256),        /* MethodReference  */
    S_ArrayCreationExpression(257), /* ArrayCreationExpression  */
    S_ArrayInitializerOpt(258),    /* ArrayInitializerOpt  */
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
      SymbolKind.S_SimpleInitOpt,
      SymbolKind.S_ArrayInitOpt,
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
      SymbolKind.S_ArrayInitializerOpt,
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
  "VariableDeclaratorList", "VariableDeclarator", "SimpleInitOpt",
  "ArrayInitOpt", "ArrayInitializer", "VariableInitializerListOpt",
  "VariableInitializerList", "VariableInitializer", "MethodDeclaration",
  "MethodHeader", "MethodDeclarator", "FormalParameterList",
  "FormalParameter", "FormalParameterTail", "ThrowsOpt", "MethodBody",
  "DimsOpt", "Dims", "Dim", "InterfaceDeclaration",
  "NormalInterfaceDeclaration", "InterfaceExtendsOpt", "InterfaceExtends",
  "InterfaceBody", "InterfaceMemberDeclarationSeq",
  "InterfaceMemberDeclaration", "ConstantDeclaration",
  "InterfaceMethodDeclaration", "AnnotationInterfaceDeclaration",
  "AnnotationInterfaceBody", "AnnotationInterfaceMemberDeclarationSeq",
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
  "ClassOrInterfaceTypeToInstantiate", "TypeArgumentsOpt", "TypeArguments",
  "TypeArgumentList", "TypeArgument", "FieldAccess", "ArrayAccess",
  "MethodInvocation", "Arguments", "ArgumentList", "MethodReference",
  "ArrayCreationExpression", "ArrayInitializerOpt", "Expression",
  "LambdaExpression", "LambdaParameters", "LambdaParameterList",
  "LambdaParameter", "AssignmentExpression", "Assignment", "LeftHandSide",
  "AssignmentOperator", "ConditionalExpression", "ConditionalOrTail",
  "ConditionalOrExpression", "ConditionalAndExpression",
  "InclusiveOrExpression", "ExclusiveOrExpression", "AndExpression",
  "EqualityExpression", "RelationalExpression", "InstanceofExpression",
  "ShiftExpression", "AdditiveExpression", "MultiplicativeExpression",
  "UnaryExpression", "PreIncrementExpression", "PreDecrementExpression",
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
    /* "src/main/resources/Java_16_Grammar.y":306  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 3: /* Literal: FLOATING_POINT_LITERAL  */
  if (yyn == 3)
    /* "src/main/resources/Java_16_Grammar.y":307  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 4: /* Literal: TRUE  */
  if (yyn == 4)
    /* "src/main/resources/Java_16_Grammar.y":308  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 5: /* Literal: FALSE  */
  if (yyn == 5)
    /* "src/main/resources/Java_16_Grammar.y":309  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 6: /* Literal: CHARACTER_LITERAL  */
  if (yyn == 6)
    /* "src/main/resources/Java_16_Grammar.y":310  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 7: /* Literal: STRING_LITERAL  */
  if (yyn == 7)
    /* "src/main/resources/Java_16_Grammar.y":311  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 8: /* Literal: NULL  */
  if (yyn == 8)
    /* "src/main/resources/Java_16_Grammar.y":313  */
                              { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 9: /* CompoundName: IDENTIFIER  */
  if (yyn == 9)
    /* "src/main/resources/Java_16_Grammar.y":319  */
                                  { yyval = new CompoundName(((Token)(yystack.valueAt (0))).image); };
  break;


  case 10: /* CompoundName: CompoundName DOT IDENTIFIER  */
  if (yyn == 10)
    /* "src/main/resources/Java_16_Grammar.y":320  */
                                  { yyval = ((CompoundName)(yystack.valueAt (2))).add(((Token)(yystack.valueAt (0))).image); };
  break;


  case 11: /* ModifierSeqOpt: %empty  */
  if (yyn == 11)
    /* "src/main/resources/Java_16_Grammar.y":324  */
                   { yyval = null; };
  break;


  case 12: /* ModifierSeqOpt: ModifierSeq  */
  if (yyn == 12)
    /* "src/main/resources/Java_16_Grammar.y":325  */
                   { yyval = ((Modifiers)(yystack.valueAt (0))); };
  break;


  case 13: /* ModifierSeq: StandardModifierSeq  */
  if (yyn == 13)
    /* "src/main/resources/Java_16_Grammar.y":329  */
                                        { yyval = new Modifiers(null,((StandardModifiers)(yystack.valueAt (0)))); };
  break;


  case 14: /* ModifierSeq: AnnotationSeq StandardModifierSeq  */
  if (yyn == 14)
    /* "src/main/resources/Java_16_Grammar.y":330  */
                                        { yyval = new Modifiers(((Annotations)(yystack.valueAt (1))),((StandardModifiers)(yystack.valueAt (0)))); };
  break;


  case 15: /* StandardModifierSeq: StandardModifier  */
  if (yyn == 15)
    /* "src/main/resources/Java_16_Grammar.y":334  */
                                           { yyval = new StandardModifiers(((Token)(yystack.valueAt (0)))); };
  break;


  case 16: /* StandardModifierSeq: StandardModifierSeq StandardModifier  */
  if (yyn == 16)
    /* "src/main/resources/Java_16_Grammar.y":335  */
                                           { yyval = ((StandardModifiers)(yystack.valueAt (1))).add(((Token)(yystack.valueAt (0)))); };
  break;


  case 17: /* StandardModifier: DEFAULT  */
  if (yyn == 17)
    /* "src/main/resources/Java_16_Grammar.y":340  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 18: /* StandardModifier: FINAL  */
  if (yyn == 18)
    /* "src/main/resources/Java_16_Grammar.y":341  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 19: /* StandardModifier: PUBLIC  */
  if (yyn == 19)
    /* "src/main/resources/Java_16_Grammar.y":342  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 20: /* StandardModifier: PROTECTED  */
  if (yyn == 20)
    /* "src/main/resources/Java_16_Grammar.y":343  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 21: /* StandardModifier: PRIVATE  */
  if (yyn == 21)
    /* "src/main/resources/Java_16_Grammar.y":344  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 22: /* StandardModifier: ABSTRACT  */
  if (yyn == 22)
    /* "src/main/resources/Java_16_Grammar.y":345  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 23: /* StandardModifier: STATIC  */
  if (yyn == 23)
    /* "src/main/resources/Java_16_Grammar.y":346  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 24: /* StandardModifier: STRICTFP  */
  if (yyn == 24)
    /* "src/main/resources/Java_16_Grammar.y":347  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 25: /* StandardModifier: SYNCHRONIZED  */
  if (yyn == 25)
    /* "src/main/resources/Java_16_Grammar.y":348  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 26: /* StandardModifier: TRANSIENT  */
  if (yyn == 26)
    /* "src/main/resources/Java_16_Grammar.y":349  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 27: /* StandardModifier: VOLATILE  */
  if (yyn == 27)
    /* "src/main/resources/Java_16_Grammar.y":350  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 28: /* StandardModifier: OPEN  */
  if (yyn == 28)
    /* "src/main/resources/Java_16_Grammar.y":351  */
                    { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 29: /* CompilationUnit: %empty  */
  if (yyn == 29)
    /* "src/main/resources/Java_16_Grammar.y":357  */
                                                    { yyval = null; };
  break;


  case 30: /* CompilationUnit: Package  */
  if (yyn == 30)
    /* "src/main/resources/Java_16_Grammar.y":358  */
                                                    { yyval = ((tree.Compilation.CompilationUnit)(yystack.valueAt (0))); ast = ((tree.Compilation.CompilationUnit)(yystack.valueAt (0))); };
  break;


  case 31: /* CompilationUnit: ImportDeclarationSeqOpt TopLevelComponentSeq  */
  if (yyn == 31)
    /* "src/main/resources/Java_16_Grammar.y":360  */
                                                    { ast = new SimpleCompilationUnit(((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 32: /* Package: PACKAGE CompoundName SEMICOLON ImportDeclarationSeqOpt TopLevelComponentSeqOpt  */
  if (yyn == 32)
    /* "src/main/resources/Java_16_Grammar.y":365  */
                                                    { yyval = new tree.Compilation.Package(((CompoundName)(yystack.valueAt (3))),((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))),((tree.Compilation.TopLevelComponents)(yystack.valueAt (0)))); };
  break;


  case 33: /* ImportDeclarationSeqOpt: %empty  */
  if (yyn == 33)
    /* "src/main/resources/Java_16_Grammar.y":375  */
                                                 { yyval = null; };
  break;


  case 34: /* ImportDeclarationSeqOpt: ImportDeclarationSeq  */
  if (yyn == 34)
    /* "src/main/resources/Java_16_Grammar.y":376  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (0))); };
  break;


  case 35: /* ImportDeclarationSeq: ImportDeclaration  */
  if (yyn == 35)
    /* "src/main/resources/Java_16_Grammar.y":380  */
                                                 { yyval = new ImportDeclarations(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 36: /* ImportDeclarationSeq: ImportDeclarationSeqOpt ImportDeclaration  */
  if (yyn == 36)
    /* "src/main/resources/Java_16_Grammar.y":381  */
                                                 { yyval = ((tree.Declaration.ImportDeclarations)(yystack.valueAt (1))).add(((tree.Declaration.ImportDeclaration)(yystack.valueAt (0)))); };
  break;


  case 37: /* ImportDeclaration: IMPORT CompoundName SEMICOLON  */
  if (yyn == 37)
    /* "src/main/resources/Java_16_Grammar.y":385  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 38: /* ImportDeclaration: IMPORT STATIC CompoundName SEMICOLON  */
  if (yyn == 38)
    /* "src/main/resources/Java_16_Grammar.y":386  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (1))),false); };
  break;


  case 39: /* ImportDeclaration: IMPORT CompoundName DOT STAR SEMICOLON  */
  if (yyn == 39)
    /* "src/main/resources/Java_16_Grammar.y":387  */
                                                     { yyval = new ImportDeclaration(false,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 40: /* ImportDeclaration: IMPORT STATIC CompoundName DOT STAR SEMICOLON  */
  if (yyn == 40)
    /* "src/main/resources/Java_16_Grammar.y":388  */
                                                     { yyval = new ImportDeclaration(true,((CompoundName)(yystack.valueAt (3))),true); };
  break;


  case 41: /* TopLevelComponentSeqOpt: %empty  */
  if (yyn == 41)
    /* "src/main/resources/Java_16_Grammar.y":392  */
                            { yyval = null; };
  break;


  case 42: /* TopLevelComponentSeqOpt: TopLevelComponentSeq  */
  if (yyn == 42)
    /* "src/main/resources/Java_16_Grammar.y":393  */
                            { yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (0))); };
  break;


  case 43: /* TopLevelComponentSeq: ModifierSeqOpt TopLevelComponent  */
  if (yyn == 43)
    /* "src/main/resources/Java_16_Grammar.y":397  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = new TopLevelComponents(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 44: /* TopLevelComponentSeq: TopLevelComponentSeq ModifierSeqOpt TopLevelComponent  */
  if (yyn == 44)
    /* "src/main/resources/Java_16_Grammar.y":398  */
                                                            { ((tree.Compilation.TopLevelComponent)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); yyval = ((tree.Compilation.TopLevelComponents)(yystack.valueAt (2))).add(((tree.Compilation.TopLevelComponent)(yystack.valueAt (0)))); };
  break;


  case 45: /* TopLevelComponent: ClassDeclaration  */
  if (yyn == 45)
    /* "src/main/resources/Java_16_Grammar.y":402  */
                           { classes.put(((ClassDeclaration)(yystack.valueAt (0))).name,((ClassDeclaration)(yystack.valueAt (0)))); yyval = new TopLevelComponent(((ClassDeclaration)(yystack.valueAt (0)))); };
  break;


  case 46: /* TopLevelComponent: InterfaceDeclaration  */
  if (yyn == 46)
    /* "src/main/resources/Java_16_Grammar.y":403  */
                           { classes.put(((InterfaceDeclaration)(yystack.valueAt (0))).name,((InterfaceDeclaration)(yystack.valueAt (0)))); yyval = new TopLevelComponent(((InterfaceDeclaration)(yystack.valueAt (0)))); };
  break;


  case 47: /* Type: UnannotatedType  */
  if (yyn == 47)
    /* "src/main/resources/Java_16_Grammar.y":450  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))); };
  break;


  case 48: /* Type: AnnotationSeq UnannotatedType  */
  if (yyn == 48)
    /* "src/main/resources/Java_16_Grammar.y":451  */
                                    { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (0))).addAnnotations(((Annotations)(yystack.valueAt (1)))); };
  break;


  case 49: /* UnannotatedType: PrimitiveType  */
  if (yyn == 49)
    /* "src/main/resources/Java_16_Grammar.y":455  */
                                  { yyval = new PrimitiveType(((Token)(yystack.valueAt (0)))); };
  break;


  case 50: /* UnannotatedType: CompoundName  */
  if (yyn == 50)
    /* "src/main/resources/Java_16_Grammar.y":457  */
                                  { yyval = new TypeName(((CompoundName)(yystack.valueAt (0))),null); };
  break;


  case 51: /* UnannotatedType: CompoundName TypeArguments  */
  if (yyn == 51)
    /* "src/main/resources/Java_16_Grammar.y":458  */
                                  { yyval = new TypeName(((CompoundName)(yystack.valueAt (1))),((tree.Type.TypeArguments)(yystack.valueAt (0)))); };
  break;


  case 52: /* UnannotatedType: UnannotatedType Dim  */
  if (yyn == 52)
    /* "src/main/resources/Java_16_Grammar.y":460  */
                                  { yyval = ((tree.Type.UnannotatedType)(yystack.valueAt (1))).addDimension(((Dim)(yystack.valueAt (0)))); };
  break;


  case 53: /* PrimitiveType: BYTE  */
  if (yyn == 53)
    /* "src/main/resources/Java_16_Grammar.y":469  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 54: /* PrimitiveType: SHORT  */
  if (yyn == 54)
    /* "src/main/resources/Java_16_Grammar.y":470  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 55: /* PrimitiveType: INT  */
  if (yyn == 55)
    /* "src/main/resources/Java_16_Grammar.y":471  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 56: /* PrimitiveType: LONG  */
  if (yyn == 56)
    /* "src/main/resources/Java_16_Grammar.y":472  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 57: /* PrimitiveType: CHAR  */
  if (yyn == 57)
    /* "src/main/resources/Java_16_Grammar.y":473  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 58: /* PrimitiveType: FLOAT  */
  if (yyn == 58)
    /* "src/main/resources/Java_16_Grammar.y":475  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 59: /* PrimitiveType: DOUBLE  */
  if (yyn == 59)
    /* "src/main/resources/Java_16_Grammar.y":476  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 60: /* PrimitiveType: BOOLEAN  */
  if (yyn == 60)
    /* "src/main/resources/Java_16_Grammar.y":477  */
                 { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 61: /* ClassDeclaration: NormalClassDeclaration  */
  if (yyn == 61)
    /* "src/main/resources/Java_16_Grammar.y":498  */
                               { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 62: /* ClassDeclaration: EnumDeclaration  */
  if (yyn == 62)
    /* "src/main/resources/Java_16_Grammar.y":499  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 63: /* ClassDeclaration: RecordDeclaration  */
  if (yyn == 63)
    /* "src/main/resources/Java_16_Grammar.y":500  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 64: /* NormalClassDeclaration: ModifierSeqOpt CLASS IDENTIFIER TypeParametersOpt ClassExtendsOpt ClassImplementsOpt ClassBody  */
  if (yyn == 64)
    /* "src/main/resources/Java_16_Grammar.y":505  */
                              { yyval = new NormalClassDeclaration(((Token)(yystack.valueAt (4))),((TypeParameters)(yystack.valueAt (3))),((tree.Type.Type)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 65: /* TypeParametersOpt: %empty  */
  if (yyn == 65)
    /* "src/main/resources/Java_16_Grammar.y":509  */
                       { yyval = null; };
  break;


  case 66: /* TypeParametersOpt: TypeParameters  */
  if (yyn == 66)
    /* "src/main/resources/Java_16_Grammar.y":510  */
                       { yyval = ((TypeParameters)(yystack.valueAt (0))); };
  break;


  case 67: /* TypeParameters: LESS TypeParameterList GREATER  */
  if (yyn == 67)
    /* "src/main/resources/Java_16_Grammar.y":514  */
                                      { yyval = ((TypeParameters)(yystack.valueAt (1))); };
  break;


  case 68: /* TypeParameterList: TypeParameter  */
  if (yyn == 68)
    /* "src/main/resources/Java_16_Grammar.y":518  */
                                            { yyval = new TypeParameters(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 69: /* TypeParameterList: TypeParameterList COMMA TypeParameter  */
  if (yyn == 69)
    /* "src/main/resources/Java_16_Grammar.y":519  */
                                            { yyval = ((TypeParameters)(yystack.valueAt (2))).add(((TypeParameter)(yystack.valueAt (0)))); };
  break;


  case 70: /* TypeParameter: AnnotationSeq TypeParameterTail  */
  if (yyn == 70)
    /* "src/main/resources/Java_16_Grammar.y":529  */
                                      { yyval = new TypeParameter(((Annotations)(yystack.valueAt (1))),((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 71: /* TypeParameter: TypeParameterTail  */
  if (yyn == 71)
    /* "src/main/resources/Java_16_Grammar.y":530  */
                                      { yyval = new TypeParameter(null,((TypeParameterTail)(yystack.valueAt (0)))); };
  break;


  case 72: /* TypeParameterTail: IDENTIFIER  */
  if (yyn == 72)
    /* "src/main/resources/Java_16_Grammar.y":534  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (0))),null); };
  break;


  case 73: /* TypeParameterTail: IDENTIFIER EXTENDS AnnotationSeqOpt IDENTIFIER  */
  if (yyn == 73)
    /* "src/main/resources/Java_16_Grammar.y":535  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (3))),((Annotations)(yystack.valueAt (1))),((Token)(yystack.valueAt (0)))); };
  break;


  case 74: /* TypeParameterTail: IDENTIFIER EXTENDS ClassTypeList2  */
  if (yyn == 74)
    /* "src/main/resources/Java_16_Grammar.y":536  */
                                                      { yyval = new TypeParameterTail(((Token)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 75: /* ClassExtendsOpt: %empty  */
  if (yyn == 75)
    /* "src/main/resources/Java_16_Grammar.y":540  */
                    { yyval = null; };
  break;


  case 76: /* ClassExtendsOpt: EXTENDS Type  */
  if (yyn == 76)
    /* "src/main/resources/Java_16_Grammar.y":541  */
                    { yyval = ((tree.Type.Type)(yystack.valueAt (0))); };
  break;


  case 77: /* ClassImplementsOpt: %empty  */
  if (yyn == 77)
    /* "src/main/resources/Java_16_Grammar.y":545  */
                                 { yyval = null; };
  break;


  case 78: /* ClassImplementsOpt: IMPLEMENTS ClassTypeList1  */
  if (yyn == 78)
    /* "src/main/resources/Java_16_Grammar.y":546  */
                                 { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 79: /* ClassTypeList1: Type  */
  if (yyn == 79)
    /* "src/main/resources/Java_16_Grammar.y":550  */
                                { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 80: /* ClassTypeList1: ClassTypeList1 COMMA Type  */
  if (yyn == 80)
    /* "src/main/resources/Java_16_Grammar.y":551  */
                                { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 81: /* ClassTypeList2: Type  */
  if (yyn == 81)
    /* "src/main/resources/Java_16_Grammar.y":555  */
                                    { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 82: /* ClassTypeList2: ClassTypeList2 AMPERSAND Type  */
  if (yyn == 82)
    /* "src/main/resources/Java_16_Grammar.y":556  */
                                    { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 83: /* ClassBodyOpt: %empty  */
  if (yyn == 83)
    /* "src/main/resources/Java_16_Grammar.y":560  */
                    { yyval = null; };
  break;


  case 84: /* ClassBodyOpt: ClassBody  */
  if (yyn == 84)
    /* "src/main/resources/Java_16_Grammar.y":561  */
                    { yyval = ((Declarations)(yystack.valueAt (0))); };
  break;


  case 85: /* ClassBody: LBRACE RBRACE  */
  if (yyn == 85)
    /* "src/main/resources/Java_16_Grammar.y":565  */
                                             { yyval = null; };
  break;


  case 86: /* ClassBody: LBRACE ClassBodyDeclarationSeq RBRACE  */
  if (yyn == 86)
    /* "src/main/resources/Java_16_Grammar.y":566  */
                                                 { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 87: /* ClassBodyDeclarationSeq: ClassBodyDeclaration  */
  if (yyn == 87)
    /* "src/main/resources/Java_16_Grammar.y":570  */
                                                   { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 88: /* ClassBodyDeclarationSeq: ClassBodyDeclarationSeq ClassBodyDeclaration  */
  if (yyn == 88)
    /* "src/main/resources/Java_16_Grammar.y":571  */
                                                   { yyval = ((Declarations)(yystack.valueAt (1))).add(((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 89: /* ClassBodyDeclaration: ModifierSeqOpt PureBodyDeclaration  */
  if (yyn == 89)
    /* "src/main/resources/Java_16_Grammar.y":575  */
                                         { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1)))); };
  break;


  case 90: /* ClassBodyDeclaration: Block  */
  if (yyn == 90)
    /* "src/main/resources/Java_16_Grammar.y":576  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),false); };
  break;


  case 91: /* ClassBodyDeclaration: STATIC Block  */
  if (yyn == 91)
    /* "src/main/resources/Java_16_Grammar.y":577  */
                      { yyval = new ClassInitializer(((tree.Statement.Block)(yystack.valueAt (0))),true); };
  break;


  case 92: /* ClassBodyDeclaration: SEMICOLON  */
  if (yyn == 92)
    /* "src/main/resources/Java_16_Grammar.y":578  */
                      { yyval = null; };
  break;


  case 93: /* PureBodyDeclaration: FieldDeclaration  */
  if (yyn == 93)
    /* "src/main/resources/Java_16_Grammar.y":582  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 94: /* PureBodyDeclaration: MethodDeclaration  */
  if (yyn == 94)
    /* "src/main/resources/Java_16_Grammar.y":583  */
                               { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 95: /* PureBodyDeclaration: ClassDeclaration  */
  if (yyn == 95)
    /* "src/main/resources/Java_16_Grammar.y":584  */
                               { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 96: /* PureBodyDeclaration: InterfaceDeclaration  */
  if (yyn == 96)
    /* "src/main/resources/Java_16_Grammar.y":585  */
                               { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 97: /* PureBodyDeclaration: ConstructorDeclaration  */
  if (yyn == 97)
    /* "src/main/resources/Java_16_Grammar.y":586  */
                               { yyval = ((ConstructorDeclaration)(yystack.valueAt (0))); };
  break;


  case 98: /* ConstructorDeclaration: ConstructorDeclarator ThrowsOpt ConstructorBody  */
  if (yyn == 98)
    /* "src/main/resources/Java_16_Grammar.y":593  */
                            { yyval = new ConstructorDeclaration(null,((ConstructorDeclarator)(yystack.valueAt (2))).typeParameters,((ConstructorDeclarator)(yystack.valueAt (2))).formalParameters,
                                                              ((tree.Type.TypeList)(yystack.valueAt (1))),((ConstructorBody)(yystack.valueAt (0))).invocation,((ConstructorBody)(yystack.valueAt (0))).block); };
  break;


  case 99: /* ConstructorDeclarator: TypeParametersOpt IDENTIFIER LPAREN FormalParameterList RPAREN  */
  if (yyn == 99)
    /* "src/main/resources/Java_16_Grammar.y":599  */
                                      { yyval = new ConstructorDeclarator(((TypeParameters)(yystack.valueAt (4))),((ParameterDeclarations)(yystack.valueAt (1)))); };
  break;


  case 100: /* ConstructorBody: LBRACE RBRACE  */
  if (yyn == 100)
    /* "src/main/resources/Java_16_Grammar.y":603  */
                                                                    { yyval = new ConstructorBody(null,null); };
  break;


  case 101: /* ConstructorBody: LBRACE ExplicitConstructorInvocation RBRACE  */
  if (yyn == 101)
    /* "src/main/resources/Java_16_Grammar.y":604  */
                                                                    { yyval = new ConstructorBody(((ExplicitConstructorInvocation)(yystack.valueAt (1))),null); };
  break;


  case 102: /* ConstructorBody: LBRACE BlockStatementSeq RBRACE  */
  if (yyn == 102)
    /* "src/main/resources/Java_16_Grammar.y":605  */
                                                                    { yyval = new ConstructorBody(null,new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1))))); };
  break;


  case 103: /* ConstructorBody: LBRACE ExplicitConstructorInvocation BlockStatementSeq RBRACE  */
  if (yyn == 103)
    /* "src/main/resources/Java_16_Grammar.y":606  */
                                                                    { yyval = new ConstructorBody(((ExplicitConstructorInvocation)(yystack.valueAt (2))),new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1))))); };
  break;


  case 104: /* ExplicitConstructorInvocation: TypeArgumentsOpt THIS Arguments SEMICOLON  */
  if (yyn == 104)
    /* "src/main/resources/Java_16_Grammar.y":610  */
                                                                  { yyval = new ExplicitConstructorInvocation(null,((tree.Type.TypeArguments)(yystack.valueAt (3))),false,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 105: /* ExplicitConstructorInvocation: TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 105)
    /* "src/main/resources/Java_16_Grammar.y":611  */
                                                                  { yyval = new ExplicitConstructorInvocation(null,((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 106: /* ExplicitConstructorInvocation: CompoundName DOT TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 106)
    /* "src/main/resources/Java_16_Grammar.y":612  */
                                                                  { Expression expr = new SimpleReference(((CompoundName)(yystack.valueAt (5))));
                                                                    yyval = new ExplicitConstructorInvocation(expr,((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 107: /* ExplicitConstructorInvocation: Primary DOT TypeArgumentsOpt SUPER Arguments SEMICOLON  */
  if (yyn == 107)
    /* "src/main/resources/Java_16_Grammar.y":614  */
                                                                  { yyval = new ExplicitConstructorInvocation(((Primary)(yystack.valueAt (5))),((tree.Type.TypeArguments)(yystack.valueAt (3))),true,((tree.Expression.ArgumentList)(yystack.valueAt (1)))); };
  break;


  case 108: /* EnumDeclaration: ENUM IDENTIFIER ClassImplementsOpt EnumBody  */
  if (yyn == 108)
    /* "src/main/resources/Java_16_Grammar.y":620  */
                                                                     { yyval = new EnumDeclaration(((Token)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((EnumBody)(yystack.valueAt (0)))); };
  break;


  case 109: /* EnumBody: LBRACE EnumConstantListOpt EnumBodyDeclarationsOpt RBRACE  */
  if (yyn == 109)
    /* "src/main/resources/Java_16_Grammar.y":624  */
                                                                      { yyval = new EnumBody(((Enumerators)(yystack.valueAt (2))),((Declarations)(yystack.valueAt (1)))); };
  break;


  case 110: /* EnumBody: LBRACE EnumConstantListOpt COMMA EnumBodyDeclarationsOpt RBRACE  */
  if (yyn == 110)
    /* "src/main/resources/Java_16_Grammar.y":625  */
                                                                      { yyval = new EnumBody(((Enumerators)(yystack.valueAt (3))),((Declarations)(yystack.valueAt (1)))); };
  break;


  case 111: /* EnumConstantListOpt: %empty  */
  if (yyn == 111)
    /* "src/main/resources/Java_16_Grammar.y":629  */
                         { yyval = null; };
  break;


  case 112: /* EnumConstantListOpt: EnumConstantList  */
  if (yyn == 112)
    /* "src/main/resources/Java_16_Grammar.y":630  */
                         { yyval = ((Enumerators)(yystack.valueAt (0))); };
  break;


  case 113: /* EnumConstantList: EnumConstant  */
  if (yyn == 113)
    /* "src/main/resources/Java_16_Grammar.y":634  */
                                          { yyval = new Enumerators(((Enumerator)(yystack.valueAt (0)))); };
  break;


  case 114: /* EnumConstantList: EnumConstantList COMMA EnumConstant  */
  if (yyn == 114)
    /* "src/main/resources/Java_16_Grammar.y":635  */
                                          { yyval = ((Enumerators)(yystack.valueAt (2))).add(((Enumerator)(yystack.valueAt (0)))); };
  break;


  case 115: /* EnumConstant: AnnotationSeqOpt IDENTIFIER  */
  if (yyn == 115)
    /* "src/main/resources/Java_16_Grammar.y":639  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (1))),((Token)(yystack.valueAt (0))),null,null); };
  break;


  case 116: /* EnumConstant: AnnotationSeqOpt IDENTIFIER Arguments  */
  if (yyn == 116)
    /* "src/main/resources/Java_16_Grammar.y":640  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0))),null); };
  break;


  case 117: /* EnumConstant: AnnotationSeqOpt IDENTIFIER Arguments ClassBody  */
  if (yyn == 117)
    /* "src/main/resources/Java_16_Grammar.y":641  */
                                                       { yyval = new Enumerator(((Annotations)(yystack.valueAt (3))),((Token)(yystack.valueAt (2))),((tree.Expression.ArgumentList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 118: /* EnumBodyDeclarationsOpt: %empty  */
  if (yyn == 118)
    /* "src/main/resources/Java_16_Grammar.y":645  */
                                        { yyval = null; };
  break;


  case 119: /* EnumBodyDeclarationsOpt: SEMICOLON  */
  if (yyn == 119)
    /* "src/main/resources/Java_16_Grammar.y":646  */
                                        { yyval = null; };
  break;


  case 120: /* EnumBodyDeclarationsOpt: SEMICOLON ClassBodyDeclarationSeq  */
  if (yyn == 120)
    /* "src/main/resources/Java_16_Grammar.y":647  */
                                        { yyval = ((Declarations)(yystack.valueAt (0))); };
  break;


  case 121: /* RecordDeclaration: RECORD IDENTIFIER TypeParametersOpt RecordHeader ClassImplementsOpt RecordBody  */
  if (yyn == 121)
    /* "src/main/resources/Java_16_Grammar.y":653  */
                                                                                                        { yyval = null; };
  break;


  case 134: /* FieldDeclaration: UnannotatedType VariableDeclaratorList SEMICOLON  */
  if (yyn == 134)
    /* "src/main/resources/Java_16_Grammar.y":690  */
                                                  { yyval = new TypeAndDeclarators(((tree.Type.UnannotatedType)(yystack.valueAt (2))),((VariableDeclarators)(yystack.valueAt (1)))); };
  break;


  case 135: /* VariableDeclaratorList: VariableDeclarator  */
  if (yyn == 135)
    /* "src/main/resources/Java_16_Grammar.y":694  */
                                                      { yyval = new VariableDeclarators(((VariableDeclarator)(yystack.valueAt (0)))); };
  break;


  case 136: /* VariableDeclaratorList: VariableDeclaratorList COMMA VariableDeclarator  */
  if (yyn == 136)
    /* "src/main/resources/Java_16_Grammar.y":695  */
                                                      { yyval = ((VariableDeclarators)(yystack.valueAt (2))).add(((VariableDeclarator)(yystack.valueAt (0)))); };
  break;


  case 137: /* VariableDeclarator: IDENTIFIER SimpleInitOpt  */
  if (yyn == 137)
    /* "src/main/resources/Java_16_Grammar.y":706  */
                                      { yyval = new VariableDeclarator(((Token)(yystack.valueAt (1))),null,((Initializer)(yystack.valueAt (0)))); };
  break;


  case 138: /* VariableDeclarator: IDENTIFIER Dims ArrayInitOpt  */
  if (yyn == 138)
    /* "src/main/resources/Java_16_Grammar.y":707  */
                                      { yyval = new VariableDeclarator(((Token)(yystack.valueAt (2))),((Dims)(yystack.valueAt (1))),((Initializer)(yystack.valueAt (0)))); };
  break;


  case 139: /* SimpleInitOpt: %empty  */
  if (yyn == 139)
    /* "src/main/resources/Java_16_Grammar.y":711  */
                              { yyval = null; };
  break;


  case 140: /* SimpleInitOpt: EQUAL Expression  */
  if (yyn == 140)
    /* "src/main/resources/Java_16_Grammar.y":712  */
                              { yyval = new InitializerSimple(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 141: /* SimpleInitOpt: EQUAL ArrayInitializer  */
  if (yyn == 141)
    /* "src/main/resources/Java_16_Grammar.y":713  */
                              { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 142: /* ArrayInitOpt: %empty  */
  if (yyn == 142)
    /* "src/main/resources/Java_16_Grammar.y":717  */
                              { yyval = null; };
  break;


  case 143: /* ArrayInitOpt: EQUAL ArrayInitializer  */
  if (yyn == 143)
    /* "src/main/resources/Java_16_Grammar.y":718  */
                              { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 144: /* ArrayInitializer: LBRACE VariableInitializerListOpt RBRACE  */
  if (yyn == 144)
    /* "src/main/resources/Java_16_Grammar.y":722  */
                                                     { yyval = ((InitializerArray)(yystack.valueAt (1))); };
  break;


  case 145: /* ArrayInitializer: LBRACE VariableInitializerListOpt COMMA RBRACE  */
  if (yyn == 145)
    /* "src/main/resources/Java_16_Grammar.y":723  */
                                                     { yyval = ((InitializerArray)(yystack.valueAt (2))); };
  break;


  case 146: /* VariableInitializerListOpt: %empty  */
  if (yyn == 146)
    /* "src/main/resources/Java_16_Grammar.y":727  */
                                { yyval = null; };
  break;


  case 147: /* VariableInitializerListOpt: VariableInitializerList  */
  if (yyn == 147)
    /* "src/main/resources/Java_16_Grammar.y":728  */
                                { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 148: /* VariableInitializerList: VariableInitializer  */
  if (yyn == 148)
    /* "src/main/resources/Java_16_Grammar.y":732  */
                                                        { yyval = new InitializerArray(((InitializerSimple)(yystack.valueAt (0)))); };
  break;


  case 149: /* VariableInitializerList: VariableInitializerList COMMA VariableInitializer  */
  if (yyn == 149)
    /* "src/main/resources/Java_16_Grammar.y":733  */
                                                        { yyval = ((InitializerArray)(yystack.valueAt (2))).add(((InitializerSimple)(yystack.valueAt (0)))); };
  break;


  case 150: /* VariableInitializer: Expression  */
  if (yyn == 150)
    /* "src/main/resources/Java_16_Grammar.y":737  */
                        { yyval = new InitializerSimple(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 151: /* VariableInitializer: ArrayInitializer  */
  if (yyn == 151)
    /* "src/main/resources/Java_16_Grammar.y":738  */
                        { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 152: /* MethodDeclaration: MethodHeader MethodBody  */
  if (yyn == 152)
    /* "src/main/resources/Java_16_Grammar.y":744  */
                              { yyval = new MethodDeclaration(((MethodHeader)(yystack.valueAt (1))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 153: /* MethodHeader: TypeParameters Type MethodDeclarator ThrowsOpt  */
  if (yyn == 153)
    /* "src/main/resources/Java_16_Grammar.y":754  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),((tree.Type.Type)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 154: /* MethodHeader: TypeParameters AnnotationSeq VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 154)
    /* "src/main/resources/Java_16_Grammar.y":755  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (4))),null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 155: /* MethodHeader: TypeParameters UnannotatedType MethodDeclarator ThrowsOpt  */
  if (yyn == 155)
    /* "src/main/resources/Java_16_Grammar.y":756  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),((tree.Type.UnannotatedType)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 156: /* MethodHeader: TypeParameters VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 156)
    /* "src/main/resources/Java_16_Grammar.y":757  */
                                                                              { yyval = new MethodHeader(((TypeParameters)(yystack.valueAt (3))),null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 157: /* MethodHeader: UnannotatedType MethodDeclarator ThrowsOpt  */
  if (yyn == 157)
    /* "src/main/resources/Java_16_Grammar.y":758  */
                                                                              { yyval = new MethodHeader(null,((tree.Type.UnannotatedType)(yystack.valueAt (2))),((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 158: /* MethodHeader: VOID MethodDeclarator ThrowsOpt  */
  if (yyn == 158)
    /* "src/main/resources/Java_16_Grammar.y":759  */
                                                                              { yyval = new MethodHeader(null,null,((MethodDeclarator)(yystack.valueAt (1))),((tree.Type.TypeList)(yystack.valueAt (0)))); };
  break;


  case 159: /* MethodDeclarator: IDENTIFIER LPAREN RPAREN DimsOpt  */
  if (yyn == 159)
    /* "src/main/resources/Java_16_Grammar.y":768  */
                                                                                { yyval = new MethodDeclarator(((Token)(yystack.valueAt (3))),null,((Dims)(yystack.valueAt (0)))); };
  break;


  case 160: /* MethodDeclarator: IDENTIFIER LPAREN FormalParameterList RPAREN DimsOpt  */
  if (yyn == 160)
    /* "src/main/resources/Java_16_Grammar.y":769  */
                                                                                { yyval = new MethodDeclarator(((Token)(yystack.valueAt (4))),((ParameterDeclarations)(yystack.valueAt (2))),((Dims)(yystack.valueAt (0)))); };
  break;


  case 161: /* FormalParameterList: FormalParameter  */
  if (yyn == 161)
    /* "src/main/resources/Java_16_Grammar.y":783  */
                                                { yyval = new ParameterDeclarations(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 162: /* FormalParameterList: FormalParameterList COMMA FormalParameter  */
  if (yyn == 162)
    /* "src/main/resources/Java_16_Grammar.y":784  */
                                                { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(((ParameterDeclaration)(yystack.valueAt (0))));};
  break;


  case 163: /* FormalParameter: ModifierSeq UnannotatedType FormalParameterTail  */
  if (yyn == 163)
    /* "src/main/resources/Java_16_Grammar.y":788  */
                                                      { yyval = ParameterDeclaration.create(((Modifiers)(yystack.valueAt (2))),((tree.Type.UnannotatedType)(yystack.valueAt (1))),((ParameterTail)(yystack.valueAt (0)))); };
  break;


  case 164: /* FormalParameter: UnannotatedType FormalParameterTail  */
  if (yyn == 164)
    /* "src/main/resources/Java_16_Grammar.y":789  */
                                                      { yyval = ParameterDeclaration.create(null,((tree.Type.UnannotatedType)(yystack.valueAt (1))),((ParameterTail)(yystack.valueAt (0)))); };
  break;


  case 165: /* FormalParameterTail: IDENTIFIER DimsOpt  */
  if (yyn == 165)
    /* "src/main/resources/Java_16_Grammar.y":793  */
                                                   { yyval = new ParameterTail(null,((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0))),false,false); };
  break;


  case 166: /* FormalParameterTail: AnnotationSeqOpt ELLIPSIS IDENTIFIER  */
  if (yyn == 166)
    /* "src/main/resources/Java_16_Grammar.y":794  */
                                                   { yyval = new ParameterTail(((Annotations)(yystack.valueAt (2))),((Token)(yystack.valueAt (0))),null,true,false); };
  break;


  case 167: /* FormalParameterTail: THIS  */
  if (yyn == 167)
    /* "src/main/resources/Java_16_Grammar.y":795  */
                                                   { yyval = new ParameterTail(null,null,null,false,true); };
  break;


  case 168: /* FormalParameterTail: IDENTIFIER DOT THIS  */
  if (yyn == 168)
    /* "src/main/resources/Java_16_Grammar.y":796  */
                                                   { yyval = new ParameterTail(null,((Token)(yystack.valueAt (2))),null,false,true); };
  break;


  case 169: /* ThrowsOpt: %empty  */
  if (yyn == 169)
    /* "src/main/resources/Java_16_Grammar.y":808  */
                             { yyval = null; };
  break;


  case 170: /* ThrowsOpt: THROWS ClassTypeList1  */
  if (yyn == 170)
    /* "src/main/resources/Java_16_Grammar.y":809  */
                             { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 171: /* MethodBody: Block  */
  if (yyn == 171)
    /* "src/main/resources/Java_16_Grammar.y":813  */
                   { yyval = ((tree.Statement.Block)(yystack.valueAt (0))); };
  break;


  case 172: /* MethodBody: SEMICOLON  */
  if (yyn == 172)
    /* "src/main/resources/Java_16_Grammar.y":814  */
                   { yyval = null; };
  break;


  case 173: /* DimsOpt: %empty  */
  if (yyn == 173)
    /* "src/main/resources/Java_16_Grammar.y":820  */
                 { yyval = null; };
  break;


  case 174: /* DimsOpt: Dims  */
  if (yyn == 174)
    /* "src/main/resources/Java_16_Grammar.y":821  */
                 { yyval = ((Dims)(yystack.valueAt (0))); };
  break;


  case 175: /* Dims: Dim  */
  if (yyn == 175)
    /* "src/main/resources/Java_16_Grammar.y":825  */
                { yyval = new Dims(((Dim)(yystack.valueAt (0)))); };
  break;


  case 176: /* Dims: Dims Dim  */
  if (yyn == 176)
    /* "src/main/resources/Java_16_Grammar.y":826  */
                { yyval = ((Dims)(yystack.valueAt (1))).add(((Dim)(yystack.valueAt (0)))); };
  break;


  case 177: /* Dim: LBRACKET RBRACKET  */
  if (yyn == 177)
    /* "src/main/resources/Java_16_Grammar.y":839  */
                                                 { yyval = new Dim(null,null); };
  break;


  case 178: /* Dim: AnnotationSeq LBRACKET RBRACKET  */
  if (yyn == 178)
    /* "src/main/resources/Java_16_Grammar.y":840  */
                                                 { yyval = new Dim(((Annotations)(yystack.valueAt (2))),null); };
  break;


  case 179: /* Dim: LBRACKET Expression RBRACKET  */
  if (yyn == 179)
    /* "src/main/resources/Java_16_Grammar.y":841  */
                                                 { yyval = new Dim(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 180: /* Dim: AnnotationSeq LBRACKET Expression RBRACKET  */
  if (yyn == 180)
    /* "src/main/resources/Java_16_Grammar.y":842  */
                                                 { yyval = new Dim(((Annotations)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 181: /* InterfaceDeclaration: NormalInterfaceDeclaration  */
  if (yyn == 181)
    /* "src/main/resources/Java_16_Grammar.y":848  */
                                      { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 182: /* InterfaceDeclaration: AnnotationInterfaceDeclaration  */
  if (yyn == 182)
    /* "src/main/resources/Java_16_Grammar.y":849  */
                                      { yyval = null; };
  break;


  case 183: /* NormalInterfaceDeclaration: INTERFACE IDENTIFIER TypeParametersOpt InterfaceExtendsOpt InterfaceBody  */
  if (yyn == 183)
    /* "src/main/resources/Java_16_Grammar.y":854  */
                                         { yyval = new NormalInterfaceDeclaration(((Token)(yystack.valueAt (3))),((TypeParameters)(yystack.valueAt (2))),((tree.Type.TypeList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 184: /* InterfaceExtendsOpt: %empty  */
  if (yyn == 184)
    /* "src/main/resources/Java_16_Grammar.y":858  */
                        { yyval = null; };
  break;


  case 185: /* InterfaceExtendsOpt: InterfaceExtends  */
  if (yyn == 185)
    /* "src/main/resources/Java_16_Grammar.y":859  */
                        { yyval = ((tree.Type.TypeList)(yystack.valueAt (0))); };
  break;


  case 186: /* InterfaceExtends: EXTENDS Type  */
  if (yyn == 186)
    /* "src/main/resources/Java_16_Grammar.y":863  */
                                   { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 187: /* InterfaceExtends: InterfaceExtends COMMA Type  */
  if (yyn == 187)
    /* "src/main/resources/Java_16_Grammar.y":864  */
                                   { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 188: /* InterfaceBody: LBRACE RBRACE  */
  if (yyn == 188)
    /* "src/main/resources/Java_16_Grammar.y":868  */
                                                  { yyval = null; };
  break;


  case 189: /* InterfaceBody: LBRACE InterfaceMemberDeclarationSeq RBRACE  */
  if (yyn == 189)
    /* "src/main/resources/Java_16_Grammar.y":869  */
                                                  { yyval = ((Declarations)(yystack.valueAt (1))); };
  break;


  case 190: /* InterfaceMemberDeclarationSeq: ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 190)
    /* "src/main/resources/Java_16_Grammar.y":873  */
                                                                              { yyval = new Declarations(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 191: /* InterfaceMemberDeclarationSeq: InterfaceMemberDeclarationSeq ModifierSeqOpt InterfaceMemberDeclaration  */
  if (yyn == 191)
    /* "src/main/resources/Java_16_Grammar.y":874  */
                                                                              { yyval = ((Declarations)(yystack.valueAt (2))).add(((tree.Declaration.Declaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 192: /* InterfaceMemberDeclaration: ConstantDeclaration  */
  if (yyn == 192)
    /* "src/main/resources/Java_16_Grammar.y":878  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 193: /* InterfaceMemberDeclaration: InterfaceMethodDeclaration  */
  if (yyn == 193)
    /* "src/main/resources/Java_16_Grammar.y":879  */
                                  { yyval = ((tree.Declaration.Declaration)(yystack.valueAt (0))); };
  break;


  case 194: /* InterfaceMemberDeclaration: ClassDeclaration  */
  if (yyn == 194)
    /* "src/main/resources/Java_16_Grammar.y":880  */
                                  { yyval = ((ClassDeclaration)(yystack.valueAt (0))); };
  break;


  case 195: /* InterfaceMemberDeclaration: InterfaceDeclaration  */
  if (yyn == 195)
    /* "src/main/resources/Java_16_Grammar.y":881  */
                                  { yyval = ((InterfaceDeclaration)(yystack.valueAt (0))); };
  break;


  case 196: /* ConstantDeclaration: Type VariableDeclaratorList SEMICOLON  */
  if (yyn == 196)
    /* "src/main/resources/Java_16_Grammar.y":885  */
                                            { yyval = new TypeAndDeclarators(((tree.Type.Type)(yystack.valueAt (2))),((VariableDeclarators)(yystack.valueAt (1)))); };
  break;


  case 197: /* InterfaceMethodDeclaration: MethodHeader MethodBody  */
  if (yyn == 197)
    /* "src/main/resources/Java_16_Grammar.y":889  */
                              { yyval = null; };
  break;


  case 198: /* AnnotationInterfaceDeclaration: AT INTERFACE IDENTIFIER AnnotationInterfaceBody  */
  if (yyn == 198)
    /* "src/main/resources/Java_16_Grammar.y":893  */
                                                      { yyval = null; };
  break;


  case 210: /* Block: LBRACE RBRACE  */
  if (yyn == 210)
    /* "src/main/resources/Java_16_Grammar.y":926  */
                                        { yyval = null; };
  break;


  case 211: /* Block: LBRACE BlockStatementSeq RBRACE  */
  if (yyn == 211)
    /* "src/main/resources/Java_16_Grammar.y":927  */
                                        { yyval = new Block(null,((tree.Statement.BlockStatements)(yystack.valueAt (1)))); };
  break;


  case 212: /* BlockStatementSeq: BlockStatement  */
  if (yyn == 212)
    /* "src/main/resources/Java_16_Grammar.y":931  */
                                           { yyval = new BlockStatements(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 213: /* BlockStatementSeq: BlockStatementSeq BlockStatement  */
  if (yyn == 213)
    /* "src/main/resources/Java_16_Grammar.y":932  */
                                       { yyval = ((tree.Statement.BlockStatements)(yystack.valueAt (1))).add(((tree.Statement.BlockStatement)(yystack.valueAt (0)))); };
  break;


  case 214: /* BlockStatement: ModifierSeqOpt ClassDeclaration  */
  if (yyn == 214)
    /* "src/main/resources/Java_16_Grammar.y":948  */
                                                { yyval = new BlockStatement(((ClassDeclaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 215: /* BlockStatement: ModifierSeqOpt NormalInterfaceDeclaration  */
  if (yyn == 215)
    /* "src/main/resources/Java_16_Grammar.y":949  */
                                                { yyval = new BlockStatement(((InterfaceDeclaration)(yystack.valueAt (0))).addModifiers(((Modifiers)(yystack.valueAt (1))))); };
  break;


  case 216: /* BlockStatement: ModifierSeq LocalVariableDeclaration SEMICOLON  */
  if (yyn == 216)
    /* "src/main/resources/Java_16_Grammar.y":951  */
                                                { yyval = new BlockStatement(((tree.Declaration.Declaration)(yystack.valueAt (1))).addModifiers(((Modifiers)(yystack.valueAt (2))))); };
  break;


  case 217: /* BlockStatement: LocalVariableDeclaration SEMICOLON  */
  if (yyn == 217)
    /* "src/main/resources/Java_16_Grammar.y":953  */
                                                { yyval = new BlockStatement(((tree.Declaration.Declaration)(yystack.valueAt (1)))); };
  break;


  case 218: /* BlockStatement: Statement  */
  if (yyn == 218)
    /* "src/main/resources/Java_16_Grammar.y":954  */
                                                { yyval = new BlockStatement(((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 219: /* LocalVariableDeclaration: UnannotatedType VariableDeclaratorList  */
  if (yyn == 219)
    /* "src/main/resources/Java_16_Grammar.y":958  */
                                             { yyval = new TypeAndDeclarators(((tree.Type.UnannotatedType)(yystack.valueAt (1))),((VariableDeclarators)(yystack.valueAt (0)))); /*$$.report(30);*/ };
  break;


  case 220: /* LocalVariableDeclaration: VAR VariableDeclaratorList  */
  if (yyn == 220)
    /* "src/main/resources/Java_16_Grammar.y":959  */
                                             { yyval = new TypeAndDeclarators(null,((VariableDeclarators)(yystack.valueAt (0)))); };
  break;


  case 221: /* Statement: SimpleStatement  */
  if (yyn == 221)
    /* "src/main/resources/Java_16_Grammar.y":963  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 222: /* Statement: LabeledStatement  */
  if (yyn == 222)
    /* "src/main/resources/Java_16_Grammar.y":964  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 223: /* Statement: IfThenElseStatement  */
  if (yyn == 223)
    /* "src/main/resources/Java_16_Grammar.y":965  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 224: /* Statement: WhileStatement  */
  if (yyn == 224)
    /* "src/main/resources/Java_16_Grammar.y":966  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 225: /* Statement: ForStatement  */
  if (yyn == 225)
    /* "src/main/resources/Java_16_Grammar.y":967  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 226: /* SimpleStatement: Block  */
  if (yyn == 226)
    /* "src/main/resources/Java_16_Grammar.y":971  */
                                        { yyval = ((tree.Statement.Block)(yystack.valueAt (0))); };
  break;


  case 227: /* SimpleStatement: SEMICOLON  */
  if (yyn == 227)
    /* "src/main/resources/Java_16_Grammar.y":972  */
                                            { yyval = null; };
  break;


  case 228: /* SimpleStatement: StatementExpression SEMICOLON  */
  if (yyn == 228)
    /* "src/main/resources/Java_16_Grammar.y":973  */
                                        { yyval = ((StatementExpression)(yystack.valueAt (1))); };
  break;


  case 229: /* SimpleStatement: ASSERT Expression SEMICOLON  */
  if (yyn == 229)
    /* "src/main/resources/Java_16_Grammar.y":975  */
                                                   { yyval = new Assert(null,((tree.Expression.Expression)(yystack.valueAt (1))),null); };
  break;


  case 230: /* SimpleStatement: ASSERT Expression COLON Expression SEMICOLON  */
  if (yyn == 230)
    /* "src/main/resources/Java_16_Grammar.y":976  */
                                                   { yyval = new Assert(null,((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 231: /* SimpleStatement: SWITCH LPAREN Expression RPAREN SwitchBlock  */
  if (yyn == 231)
    /* "src/main/resources/Java_16_Grammar.y":978  */
                                                   { yyval = null; };
  break;


  case 232: /* SimpleStatement: DO Statement WHILE LPAREN Expression RPAREN SEMICOLON  */
  if (yyn == 232)
    /* "src/main/resources/Java_16_Grammar.y":979  */
                                                            { yyval = new Do(null,((tree.Statement.Statement)(yystack.valueAt (5))),((tree.Expression.Expression)(yystack.valueAt (2)))); };
  break;


  case 233: /* SimpleStatement: BREAK SEMICOLON  */
  if (yyn == 233)
    /* "src/main/resources/Java_16_Grammar.y":981  */
                                  { yyval = new Break(null,null); };
  break;


  case 234: /* SimpleStatement: BREAK IDENTIFIER SEMICOLON  */
  if (yyn == 234)
    /* "src/main/resources/Java_16_Grammar.y":982  */
                                  { yyval = new Break(null,((Token)(yystack.valueAt (1)))); };
  break;


  case 235: /* SimpleStatement: CONTINUE SEMICOLON  */
  if (yyn == 235)
    /* "src/main/resources/Java_16_Grammar.y":984  */
                                      { yyval = new Continue(null,null); };
  break;


  case 236: /* SimpleStatement: CONTINUE IDENTIFIER SEMICOLON  */
  if (yyn == 236)
    /* "src/main/resources/Java_16_Grammar.y":985  */
                                      { yyval = new Continue(null,((Token)(yystack.valueAt (1)))); };
  break;


  case 237: /* SimpleStatement: RETURN SEMICOLON  */
  if (yyn == 237)
    /* "src/main/resources/Java_16_Grammar.y":987  */
                                      { yyval = new Return(null,null); };
  break;


  case 238: /* SimpleStatement: RETURN Expression SEMICOLON  */
  if (yyn == 238)
    /* "src/main/resources/Java_16_Grammar.y":988  */
                                      { yyval = new Return(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 239: /* SimpleStatement: SYNCHRONIZED LPAREN Expression RPAREN Block  */
  if (yyn == 239)
    /* "src/main/resources/Java_16_Grammar.y":990  */
                                                   { yyval = new Synchronized(null,((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 240: /* SimpleStatement: THROW Expression SEMICOLON  */
  if (yyn == 240)
    /* "src/main/resources/Java_16_Grammar.y":992  */
                                  { yyval = new Throw(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 241: /* SimpleStatement: YIELD Expression SEMICOLON  */
  if (yyn == 241)
    /* "src/main/resources/Java_16_Grammar.y":993  */
                                  { yyval = new Yield(null,((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 242: /* SimpleStatement: TRY Block Catches  */
  if (yyn == 242)
    /* "src/main/resources/Java_16_Grammar.y":996  */
                                   { yyval = null; };
  break;


  case 243: /* SimpleStatement: TRY Block Catches Finally  */
  if (yyn == 243)
    /* "src/main/resources/Java_16_Grammar.y":997  */
                                   { yyval = null; };
  break;


  case 244: /* SimpleStatement: TRY Block Finally  */
  if (yyn == 244)
    /* "src/main/resources/Java_16_Grammar.y":998  */
                                   { yyval = null; };
  break;


  case 245: /* SimpleStatement: TRY ResourceSpecification Block CatchesOpt FinallyOpt  */
  if (yyn == 245)
    /* "src/main/resources/Java_16_Grammar.y":1000  */
                                   { yyval = null; };
  break;


  case 246: /* SimpleStatement: error SEMICOLON  */
  if (yyn == 246)
    /* "src/main/resources/Java_16_Grammar.y":1001  */
                                   { yyval = null; };
  break;


  case 247: /* LabeledStatement: IDENTIFIER COLON Statement  */
  if (yyn == 247)
    /* "src/main/resources/Java_16_Grammar.y":1005  */
                                 { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))).addLabel(((Token)(yystack.valueAt (2)))); };
  break;


  case 248: /* StatementExpression: Assignment  */
  if (yyn == 248)
    /* "src/main/resources/Java_16_Grammar.y":1009  */
                                       { yyval = new StatementExpression(null,((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 249: /* StatementExpression: PreIncrementExpression  */
  if (yyn == 249)
    /* "src/main/resources/Java_16_Grammar.y":1010  */
                                       { yyval = new StatementExpression(null,((UnaryPrefix)(yystack.valueAt (0)))); };
  break;


  case 250: /* StatementExpression: PreDecrementExpression  */
  if (yyn == 250)
    /* "src/main/resources/Java_16_Grammar.y":1011  */
                                       { yyval = new StatementExpression(null,((UnaryPrefix)(yystack.valueAt (0)))); };
  break;


  case 251: /* StatementExpression: PostIncrementExpression  */
  if (yyn == 251)
    /* "src/main/resources/Java_16_Grammar.y":1012  */
                                       { yyval = new StatementExpression(null,((UnaryPostfix)(yystack.valueAt (0)))); };
  break;


  case 252: /* StatementExpression: PostDecrementExpression  */
  if (yyn == 252)
    /* "src/main/resources/Java_16_Grammar.y":1013  */
                                       { yyval = new StatementExpression(null,((UnaryPostfix)(yystack.valueAt (0)))); };
  break;


  case 253: /* StatementExpression: MethodInvocation  */
  if (yyn == 253)
    /* "src/main/resources/Java_16_Grammar.y":1014  */
                                       { yyval = new StatementExpression(null,((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 254: /* StatementExpression: ClassInstanceCreationExpression  */
  if (yyn == 254)
    /* "src/main/resources/Java_16_Grammar.y":1015  */
                                       { yyval = new StatementExpression(null,((Primary)(yystack.valueAt (0)))); };
  break;


  case 255: /* IfThenElseStatement: IF LPAREN Expression RPAREN Statement ElsePartOpt  */
  if (yyn == 255)
    /* "src/main/resources/Java_16_Grammar.y":1019  */
                                                        { yyval = new IfThenElse(null,((tree.Expression.Expression)(yystack.valueAt (3))),((tree.Statement.Statement)(yystack.valueAt (1))),((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 256: /* ElsePartOpt: %empty  */
  if (yyn == 256)
    /* "src/main/resources/Java_16_Grammar.y":1023  */
                      { yyval = null; };
  break;


  case 257: /* ElsePartOpt: ELSE Statement  */
  if (yyn == 257)
    /* "src/main/resources/Java_16_Grammar.y":1024  */
                      { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 258: /* SwitchBlock: LBRACE RBRACE  */
  if (yyn == 258)
    /* "src/main/resources/Java_16_Grammar.y":1028  */
                                                                { yyval = null; };
  break;


  case 259: /* SwitchBlock: LBRACE SwitchRuleSeq RBRACE  */
  if (yyn == 259)
    /* "src/main/resources/Java_16_Grammar.y":1029  */
                                                                { yyval = null; };
  break;


  case 260: /* SwitchBlock: LBRACE SwitchBlockStatementGroupSeq RBRACE  */
  if (yyn == 260)
    /* "src/main/resources/Java_16_Grammar.y":1030  */
                                                                { yyval = null; };
  break;


  case 261: /* SwitchRuleSeq: SwitchRule  */
  if (yyn == 261)
    /* "src/main/resources/Java_16_Grammar.y":1037  */
                               { yyval = new SwitchRules(((SwitchRule)(yystack.valueAt (0)))); };
  break;


  case 262: /* SwitchRuleSeq: SwitchRuleSeq SwitchRule  */
  if (yyn == 262)
    /* "src/main/resources/Java_16_Grammar.y":1038  */
                               { yyval = ((SwitchRules)(yystack.valueAt (1))).add(((SwitchRule)(yystack.valueAt (0)))); };
  break;


  case 263: /* SwitchRule: SwitchLabel ARROW Expression SEMICOLON  */
  if (yyn == 263)
    /* "src/main/resources/Java_16_Grammar.y":1042  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (3))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 264: /* SwitchRule: SwitchLabel ARROW Block  */
  if (yyn == 264)
    /* "src/main/resources/Java_16_Grammar.y":1043  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 265: /* SwitchRule: SwitchLabel ARROW THROW Expression SEMICOLON  */
  if (yyn == 265)
    /* "src/main/resources/Java_16_Grammar.y":1044  */
                                                    { yyval = new SwitchRule(((SwitchLabel)(yystack.valueAt (4))),new Throw(null,((tree.Expression.Expression)(yystack.valueAt (1))))); };
  break;


  case 269: /* SwitchLabelSeq: SwitchLabel COLON  */
  if (yyn == 269)
    /* "src/main/resources/Java_16_Grammar.y":1058  */
                                       { yyval = new SwitchLabels(((SwitchLabel)(yystack.valueAt (1)))); };
  break;


  case 270: /* SwitchLabelSeq: SwitchLabelSeq SwitchLabel COLON  */
  if (yyn == 270)
    /* "src/main/resources/Java_16_Grammar.y":1059  */
                                       { yyval = ((SwitchLabels)(yystack.valueAt (2))).add(((SwitchLabel)(yystack.valueAt (1)))); };
  break;


  case 271: /* SwitchLabel: CASE CaseExpressionList  */
  if (yyn == 271)
    /* "src/main/resources/Java_16_Grammar.y":1063  */
                               { yyval = ((SwitchLabel)(yystack.valueAt (0))); };
  break;


  case 272: /* SwitchLabel: DEFAULT  */
  if (yyn == 272)
    /* "src/main/resources/Java_16_Grammar.y":1064  */
                                   { yyval = null; };
  break;


  case 273: /* CaseExpressionList: AssignmentExpression  */
  if (yyn == 273)
    /* "src/main/resources/Java_16_Grammar.y":1068  */
                                                    { yyval = new SwitchLabel(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 274: /* CaseExpressionList: CaseExpressionList COMMA AssignmentExpression  */
  if (yyn == 274)
    /* "src/main/resources/Java_16_Grammar.y":1069  */
                                                    { yyval = ((SwitchLabel)(yystack.valueAt (2))).add(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 275: /* WhileStatement: WHILE LPAREN Expression RPAREN Statement  */
  if (yyn == 275)
    /* "src/main/resources/Java_16_Grammar.y":1076  */
                                                { yyval = new While(null,((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Statement.Statement)(yystack.valueAt (0)))); };
  break;


  case 276: /* ForStatement: BasicForStatement  */
  if (yyn == 276)
    /* "src/main/resources/Java_16_Grammar.y":1080  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 277: /* ForStatement: EnhancedForStatement  */
  if (yyn == 277)
    /* "src/main/resources/Java_16_Grammar.y":1081  */
                           { yyval = ((tree.Statement.Statement)(yystack.valueAt (0))); };
  break;


  case 278: /* BasicForStatement: FOR LPAREN ForInitOpt SEMICOLON ExpressionOpt SEMICOLON StatementExpressionListOpt RPAREN Statement  */
  if (yyn == 278)
    /* "src/main/resources/Java_16_Grammar.y":1086  */
                          { yyval = null; };
  break;


  case 282: /* ExpressionOpt: %empty  */
  if (yyn == 282)
    /* "src/main/resources/Java_16_Grammar.y":1096  */
                  { yyval = null; };
  break;


  case 283: /* ExpressionOpt: Expression  */
  if (yyn == 283)
    /* "src/main/resources/Java_16_Grammar.y":1097  */
                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 284: /* StatementExpressionList: StatementExpression  */
  if (yyn == 284)
    /* "src/main/resources/Java_16_Grammar.y":1104  */
                                                        { yyval = ((StatementExpression)(yystack.valueAt (0))); };
  break;


  case 285: /* StatementExpressionList: StatementExpressionList COMMA StatementExpression  */
  if (yyn == 285)
    /* "src/main/resources/Java_16_Grammar.y":1105  */
                                                        { yyval = ((StatementExpressions)(yystack.valueAt (2))).add(((StatementExpression)(yystack.valueAt (0)))); };
  break;


  case 286: /* StatementExpressionListOpt: %empty  */
  if (yyn == 286)
    /* "src/main/resources/Java_16_Grammar.y":1109  */
                               { yyval = null; };
  break;


  case 287: /* StatementExpressionListOpt: StatementExpressionList  */
  if (yyn == 287)
    /* "src/main/resources/Java_16_Grammar.y":1110  */
                               { yyval = ((StatementExpressions)(yystack.valueAt (0))); };
  break;


  case 288: /* EnhancedForStatement: FOR LPAREN LocalVariableDeclaration COLON Expression RPAREN Statement  */
  if (yyn == 288)
    /* "src/main/resources/Java_16_Grammar.y":1114  */
                                                                            { yyval = null; };
  break;


  case 289: /* CatchesOpt: %empty  */
  if (yyn == 289)
    /* "src/main/resources/Java_16_Grammar.y":1118  */
               { yyval = null; };
  break;


  case 290: /* CatchesOpt: Catches  */
  if (yyn == 290)
    /* "src/main/resources/Java_16_Grammar.y":1119  */
               { yyval = ((CatchClauses)(yystack.valueAt (0))); };
  break;


  case 291: /* Catches: CatchClause  */
  if (yyn == 291)
    /* "src/main/resources/Java_16_Grammar.y":1123  */
                            { yyval = new CatchClauses(((CatchClause)(yystack.valueAt (0)))); };
  break;


  case 292: /* Catches: Catches CatchClause  */
  if (yyn == 292)
    /* "src/main/resources/Java_16_Grammar.y":1124  */
                            { yyval = ((CatchClauses)(yystack.valueAt (1))).add(((CatchClause)(yystack.valueAt (0)))); };
  break;


  case 293: /* CatchClause: CATCH LPAREN CatchFormalParameter RPAREN Block  */
  if (yyn == 293)
    /* "src/main/resources/Java_16_Grammar.y":1128  */
                                                     { yyval = new CatchClause(((CatchParameter)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 294: /* CatchFormalParameter: ModifierSeqOpt CatchType IDENTIFIER DimsOpt  */
  if (yyn == 294)
    /* "src/main/resources/Java_16_Grammar.y":1132  */
                                                  { yyval = new CatchParameter(((Modifiers)(yystack.valueAt (3))),((tree.Type.TypeList)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((Dims)(yystack.valueAt (0)))); };
  break;


  case 295: /* CatchType: Type  */
  if (yyn == 295)
    /* "src/main/resources/Java_16_Grammar.y":1136  */
                              { yyval = new TypeList(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 296: /* CatchType: CatchType VERTICAL Type  */
  if (yyn == 296)
    /* "src/main/resources/Java_16_Grammar.y":1137  */
                              { yyval = ((tree.Type.TypeList)(yystack.valueAt (2))).add(((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 307: /* Primary: Literal  */
  if (yyn == 307)
    /* "src/main/resources/Java_16_Grammar.y":1174  */
                                        { yyval = new Literal(((Token)(yystack.valueAt (0)))); };
  break;


  case 308: /* Primary: Type DimsOpt DOT CLASS  */
  if (yyn == 308)
    /* "src/main/resources/Java_16_Grammar.y":1175  */
                                        { yyval = new ClassLiteral(((tree.Type.Type)(yystack.valueAt (3))),((Dims)(yystack.valueAt (2)))); };
  break;


  case 309: /* Primary: VOID DimsOpt DOT CLASS  */
  if (yyn == 309)
    /* "src/main/resources/Java_16_Grammar.y":1176  */
                                        { yyval = new ClassLiteral(null,((Dims)(yystack.valueAt (2)))); };
  break;


  case 310: /* Primary: THIS  */
  if (yyn == 310)
    /* "src/main/resources/Java_16_Grammar.y":1177  */
                                        { yyval = new This(null); };
  break;


  case 311: /* Primary: Type DOT THIS  */
  if (yyn == 311)
    /* "src/main/resources/Java_16_Grammar.y":1178  */
                                        { yyval = new This(((tree.Type.Type)(yystack.valueAt (2)))); };
  break;


  case 312: /* Primary: LPAREN Expression RPAREN  */
  if (yyn == 312)
    /* "src/main/resources/Java_16_Grammar.y":1179  */
                                        { yyval = new Parenthesized(((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 313: /* Primary: ClassInstanceCreationExpression  */
  if (yyn == 313)
    /* "src/main/resources/Java_16_Grammar.y":1180  */
                                        { yyval = ((Primary)(yystack.valueAt (0))); };
  break;


  case 314: /* Primary: FieldAccess  */
  if (yyn == 314)
    /* "src/main/resources/Java_16_Grammar.y":1181  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 315: /* Primary: ArrayAccess  */
  if (yyn == 315)
    /* "src/main/resources/Java_16_Grammar.y":1182  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 316: /* Primary: MethodInvocation  */
  if (yyn == 316)
    /* "src/main/resources/Java_16_Grammar.y":1183  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 317: /* Primary: MethodReference  */
  if (yyn == 317)
    /* "src/main/resources/Java_16_Grammar.y":1184  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 318: /* Primary: ArrayCreationExpression  */
  if (yyn == 318)
    /* "src/main/resources/Java_16_Grammar.y":1185  */
                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 319: /* ClassInstanceCreationExpression: UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 319)
    /* "src/main/resources/Java_16_Grammar.y":1201  */
                                                                  { yyval = new InstanceCreationQualified((Primary)null,((InstanceCreation)(yystack.valueAt (0)))); };
  break;


  case 320: /* ClassInstanceCreationExpression: CompoundName DOT UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 320)
    /* "src/main/resources/Java_16_Grammar.y":1202  */
                                                                  { yyval = new InstanceCreationQualified(((CompoundName)(yystack.valueAt (2))),((InstanceCreation)(yystack.valueAt (0)))); };
  break;


  case 321: /* ClassInstanceCreationExpression: Primary DOT UnqualifiedClassInstanceCreationExpression  */
  if (yyn == 321)
    /* "src/main/resources/Java_16_Grammar.y":1203  */
                                                                  { yyval = new InstanceCreationQualified(((Primary)(yystack.valueAt (2))),((InstanceCreation)(yystack.valueAt (0)))); };
  break;


  case 322: /* UnqualifiedClassInstanceCreationExpression: NEW TypeArgumentsOpt ClassOrInterfaceTypeToInstantiate Arguments ClassBodyOpt  */
  if (yyn == 322)
    /* "src/main/resources/Java_16_Grammar.y":1208  */
                                             { yyval = new InstanceCreation(((tree.Type.TypeArguments)(yystack.valueAt (3))),((Type)(yystack.valueAt (2))),((tree.Expression.ArgumentList)(yystack.valueAt (1))),((Declarations)(yystack.valueAt (0)))); };
  break;


  case 323: /* ClassOrInterfaceTypeToInstantiate: Type  */
  if (yyn == 323)
    /* "src/main/resources/Java_16_Grammar.y":1212  */
              { yyval = ((tree.Type.Type)(yystack.valueAt (0))); };
  break;


  case 324: /* TypeArgumentsOpt: %empty  */
  if (yyn == 324)
    /* "src/main/resources/Java_16_Grammar.y":1226  */
                      { yyval = null; };
  break;


  case 325: /* TypeArgumentsOpt: TypeArguments  */
  if (yyn == 325)
    /* "src/main/resources/Java_16_Grammar.y":1227  */
                      { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (0))); };
  break;


  case 326: /* TypeArguments: LESS GREATER  */
  if (yyn == 326)
    /* "src/main/resources/Java_16_Grammar.y":1231  */
                                     { yyval = null; };
  break;


  case 327: /* TypeArguments: LESS TypeArgumentList GREATER  */
  if (yyn == 327)
    /* "src/main/resources/Java_16_Grammar.y":1232  */
                                     { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (1))); };
  break;


  case 328: /* TypeArgumentList: TypeArgument  */
  if (yyn == 328)
    /* "src/main/resources/Java_16_Grammar.y":1236  */
                                           { yyval = new TypeArguments(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 329: /* TypeArgumentList: TypeArgumentList COMMA TypeArgument  */
  if (yyn == 329)
    /* "src/main/resources/Java_16_Grammar.y":1237  */
                                           { yyval = ((tree.Type.TypeArguments)(yystack.valueAt (2))).add(((tree.Type.TypeArgument)(yystack.valueAt (0)))); };
  break;


  case 330: /* TypeArgument: Type  */
  if (yyn == 330)
    /* "src/main/resources/Java_16_Grammar.y":1241  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),0,null); };
  break;


  case 331: /* TypeArgument: QUESTION  */
  if (yyn == 331)
    /* "src/main/resources/Java_16_Grammar.y":1242  */
                                               { yyval = new TypeArgument(null,1,null); };
  break;


  case 332: /* TypeArgument: QUESTION EXTENDS Type  */
  if (yyn == 332)
    /* "src/main/resources/Java_16_Grammar.y":1243  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),1,null); };
  break;


  case 333: /* TypeArgument: QUESTION SUPER Type  */
  if (yyn == 333)
    /* "src/main/resources/Java_16_Grammar.y":1244  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,null); };
  break;


  case 334: /* TypeArgument: AnnotationSeq QUESTION  */
  if (yyn == 334)
    /* "src/main/resources/Java_16_Grammar.y":1245  */
                                               { yyval = new TypeArgument(null,1,((Annotations)(yystack.valueAt (1)))); };
  break;


  case 335: /* TypeArgument: AnnotationSeq QUESTION EXTENDS Type  */
  if (yyn == 335)
    /* "src/main/resources/Java_16_Grammar.y":1246  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),2,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 336: /* TypeArgument: AnnotationSeq QUESTION SUPER Type  */
  if (yyn == 336)
    /* "src/main/resources/Java_16_Grammar.y":1247  */
                                               { yyval = new TypeArgument(((tree.Type.Type)(yystack.valueAt (0))),3,((Annotations)(yystack.valueAt (3)))); };
  break;


  case 337: /* FieldAccess: Primary DOT IDENTIFIER  */
  if (yyn == 337)
    /* "src/main/resources/Java_16_Grammar.y":1257  */
                                             { yyval = new FieldAccess(((Primary)(yystack.valueAt (2))),  false,((Token)(yystack.valueAt (0)))); };
  break;


  case 338: /* FieldAccess: SUPER DOT IDENTIFIER  */
  if (yyn == 338)
    /* "src/main/resources/Java_16_Grammar.y":1258  */
                                             { yyval = new FieldAccess(null,true, ((Token)(yystack.valueAt (0)))); };
  break;


  case 339: /* FieldAccess: CompoundName DOT SUPER DOT IDENTIFIER  */
  if (yyn == 339)
    /* "src/main/resources/Java_16_Grammar.y":1259  */
                                             { yyval = new FieldAccess(new SimpleReference(((CompoundName)(yystack.valueAt (4)))),true,((Token)(yystack.valueAt (0)))); };
  break;


  case 340: /* ArrayAccess: CompoundName Dim  */
  if (yyn == 340)
    /* "src/main/resources/Java_16_Grammar.y":1263  */
                        { yyval = new ArrayAccess(new SimpleReference(((CompoundName)(yystack.valueAt (1)))),((Dim)(yystack.valueAt (0))).expression); };
  break;


  case 341: /* ArrayAccess: Primary Dim  */
  if (yyn == 341)
    /* "src/main/resources/Java_16_Grammar.y":1264  */
                        { yyval = new ArrayAccess(((Primary)(yystack.valueAt (1))),((Dim)(yystack.valueAt (0))).expression); };
  break;


  case 342: /* ArrayAccess: ArrayAccess Dim  */
  if (yyn == 342)
    /* "src/main/resources/Java_16_Grammar.y":1265  */
                      { yyval = null; /* $1.addDimension($2.expression);*/ };
  break;


  case 343: /* MethodInvocation: CompoundName Arguments  */
  if (yyn == 343)
    /* "src/main/resources/Java_16_Grammar.y":1269  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (1))));
                                                                         yyval = new MethodInvocation(ref,false,null,null,((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 344: /* MethodInvocation: CompoundName DOT TypeArguments IDENTIFIER Arguments  */
  if (yyn == 344)
    /* "src/main/resources/Java_16_Grammar.y":1271  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (4))));
                                                                         yyval = new MethodInvocation(ref,false,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 345: /* MethodInvocation: Primary DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 345)
    /* "src/main/resources/Java_16_Grammar.y":1273  */
                                                                       { yyval = new MethodInvocation(((Primary)(yystack.valueAt (4))),false,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 346: /* MethodInvocation: SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 346)
    /* "src/main/resources/Java_16_Grammar.y":1274  */
                                                                       { yyval = new MethodInvocation(null,true,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 347: /* MethodInvocation: CompoundName DOT SUPER DOT TypeArgumentsOpt IDENTIFIER Arguments  */
  if (yyn == 347)
    /* "src/main/resources/Java_16_Grammar.y":1275  */
                                                                       { var ref = new SimpleReference(((CompoundName)(yystack.valueAt (6))));
                                                                         yyval = new MethodInvocation(ref,true,((tree.Type.TypeArguments)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))),((tree.Expression.ArgumentList)(yystack.valueAt (0)))); };
  break;


  case 348: /* Arguments: LPAREN RPAREN  */
  if (yyn == 348)
    /* "src/main/resources/Java_16_Grammar.y":1280  */
                                 { yyval = null; };
  break;


  case 349: /* Arguments: LPAREN ArgumentList RPAREN  */
  if (yyn == 349)
    /* "src/main/resources/Java_16_Grammar.y":1281  */
                                 { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (1))); };
  break;


  case 350: /* ArgumentList: Expression  */
  if (yyn == 350)
    /* "src/main/resources/Java_16_Grammar.y":1290  */
                                    { yyval = new ArgumentList(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 351: /* ArgumentList: ArgumentList COMMA Expression  */
  if (yyn == 351)
    /* "src/main/resources/Java_16_Grammar.y":1291  */
                                    { yyval = ((tree.Expression.ArgumentList)(yystack.valueAt (2))).add(((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 352: /* MethodReference: Primary DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 352)
    /* "src/main/resources/Java_16_Grammar.y":1296  */
                                                           { yyval = null; };
  break;


  case 353: /* MethodReference: Type DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 353)
    /* "src/main/resources/Java_16_Grammar.y":1297  */
                                                           { yyval = null; };
  break;


  case 354: /* MethodReference: SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 354)
    /* "src/main/resources/Java_16_Grammar.y":1298  */
                                                           { yyval = null; };
  break;


  case 355: /* MethodReference: Type DOT SUPER DBL_COLON TypeArgumentsOpt IDENTIFIER  */
  if (yyn == 355)
    /* "src/main/resources/Java_16_Grammar.y":1299  */
                                                           { yyval = null; };
  break;


  case 356: /* MethodReference: Type DBL_COLON TypeArgumentsOpt NEW  */
  if (yyn == 356)
    /* "src/main/resources/Java_16_Grammar.y":1300  */
                                                           { yyval = null; };
  break;


  case 357: /* ArrayCreationExpression: NEW PrimitiveType Dims ArrayInitializerOpt  */
  if (yyn == 357)
    /* "src/main/resources/Java_16_Grammar.y":1309  */
                                                             { PrimitiveType pt = new PrimitiveType(((Token)(yystack.valueAt (2))));
                                                               pt.setDimensions(((Dims)(yystack.valueAt (1))));
                                                               yyval = new ArrayCreation(pt,((InitializerArray)(yystack.valueAt (0)))); };
  break;


  case 358: /* ArrayCreationExpression: NEW CompoundName Dims ArrayInitializerOpt  */
  if (yyn == 358)
    /* "src/main/resources/Java_16_Grammar.y":1312  */
                                                             { TypeName tn = new TypeName(((CompoundName)(yystack.valueAt (2))),null);
                                                               tn.setDimensions(((Dims)(yystack.valueAt (1))));
                                                               yyval = new ArrayCreation(tn,((InitializerArray)(yystack.valueAt (0)))); };
  break;


  case 359: /* ArrayCreationExpression: NEW CompoundName TypeArguments Dims ArrayInitializerOpt  */
  if (yyn == 359)
    /* "src/main/resources/Java_16_Grammar.y":1315  */
                                                              { TypeName tn = new TypeName(((CompoundName)(yystack.valueAt (3))),((tree.Type.TypeArguments)(yystack.valueAt (2))));
                                                               tn.setDimensions(((Dims)(yystack.valueAt (1))));
                                                               yyval = new ArrayCreation(tn,((InitializerArray)(yystack.valueAt (0)))); };
  break;


  case 360: /* ArrayInitializerOpt: %empty  */
  if (yyn == 360)
    /* "src/main/resources/Java_16_Grammar.y":1321  */
                        { yyval = null; };
  break;


  case 361: /* ArrayInitializerOpt: ArrayInitializer  */
  if (yyn == 361)
    /* "src/main/resources/Java_16_Grammar.y":1322  */
                        { yyval = ((InitializerArray)(yystack.valueAt (0))); };
  break;


  case 362: /* Expression: LambdaExpression  */
  if (yyn == 362)
    /* "src/main/resources/Java_16_Grammar.y":1345  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 363: /* Expression: AssignmentExpression  */
  if (yyn == 363)
    /* "src/main/resources/Java_16_Grammar.y":1346  */
                            { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 364: /* LambdaExpression: IDENTIFIER ARROW Expression  */
  if (yyn == 364)
    /* "src/main/resources/Java_16_Grammar.y":1351  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 365: /* LambdaExpression: IDENTIFIER ARROW Block  */
  if (yyn == 365)
    /* "src/main/resources/Java_16_Grammar.y":1353  */
                        { yyval = new Lambda(new ParameterDeclarations(new ParameterDeclaration(((Token)(yystack.valueAt (2))))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 366: /* LambdaExpression: LambdaParameters ARROW Expression  */
  if (yyn == 366)
    /* "src/main/resources/Java_16_Grammar.y":1354  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 367: /* LambdaExpression: LambdaParameters ARROW Block  */
  if (yyn == 367)
    /* "src/main/resources/Java_16_Grammar.y":1355  */
                                         { yyval = new Lambda(((ParameterDeclarations)(yystack.valueAt (2))),((tree.Statement.Block)(yystack.valueAt (0)))); };
  break;


  case 368: /* LambdaParameters: LPAREN RPAREN  */
  if (yyn == 368)
    /* "src/main/resources/Java_16_Grammar.y":1364  */
                                           { yyval = null; };
  break;


  case 369: /* LambdaParameters: LPAREN LambdaParameterList RPAREN  */
  if (yyn == 369)
    /* "src/main/resources/Java_16_Grammar.y":1367  */
                                           { yyval = ((ParameterDeclarations)(yystack.valueAt (1))); };
  break;


  case 370: /* LambdaParameterList: LambdaParameter  */
  if (yyn == 370)
    /* "src/main/resources/Java_16_Grammar.y":1371  */
                                                { yyval = new ParameterDeclarations(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 371: /* LambdaParameterList: LambdaParameterList COMMA LambdaParameter  */
  if (yyn == 371)
    /* "src/main/resources/Java_16_Grammar.y":1372  */
                                                { yyval = ((ParameterDeclarations)(yystack.valueAt (2))).add(((ParameterDeclaration)(yystack.valueAt (0)))); };
  break;


  case 372: /* LambdaParameter: ModifierSeqOpt UnannotatedType IDENTIFIER DimsOpt  */
  if (yyn == 372)
    /* "src/main/resources/Java_16_Grammar.y":1387  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),((tree.Type.UnannotatedType)(yystack.valueAt (2))),((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 373: /* LambdaParameter: ModifierSeqOpt VAR IDENTIFIER DimsOpt  */
  if (yyn == 373)
    /* "src/main/resources/Java_16_Grammar.y":1388  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (3))),null,((Token)(yystack.valueAt (1))).image,null,false,((Dims)(yystack.valueAt (0)))); };
  break;


  case 374: /* LambdaParameter: ModifierSeqOpt UnannotatedType AnnotationSeqOpt ELLIPSIS IDENTIFIER  */
  if (yyn == 374)
    /* "src/main/resources/Java_16_Grammar.y":1390  */
                                                         { yyval = new ParameterDeclaration(((Modifiers)(yystack.valueAt (4))),((tree.Type.UnannotatedType)(yystack.valueAt (3))),((Token)(yystack.valueAt (0))).image,((Annotations)(yystack.valueAt (2))),true,null); };
  break;


  case 375: /* AssignmentExpression: ConditionalExpression  */
  if (yyn == 375)
    /* "src/main/resources/Java_16_Grammar.y":1399  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 376: /* AssignmentExpression: Assignment  */
  if (yyn == 376)
    /* "src/main/resources/Java_16_Grammar.y":1400  */
                             { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 377: /* Assignment: LeftHandSide AssignmentOperator Expression  */
  if (yyn == 377)
    /* "src/main/resources/Java_16_Grammar.y":1404  */
                                                 { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 378: /* LeftHandSide: CompoundName  */
  if (yyn == 378)
    /* "src/main/resources/Java_16_Grammar.y":1408  */
                   { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 379: /* LeftHandSide: FieldAccess  */
  if (yyn == 379)
    /* "src/main/resources/Java_16_Grammar.y":1409  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 380: /* LeftHandSide: ArrayAccess  */
  if (yyn == 380)
    /* "src/main/resources/Java_16_Grammar.y":1410  */
                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 381: /* AssignmentOperator: EQUAL  */
  if (yyn == 381)
    /* "src/main/resources/Java_16_Grammar.y":1414  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 382: /* AssignmentOperator: STAR_EQUAL  */
  if (yyn == 382)
    /* "src/main/resources/Java_16_Grammar.y":1415  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 383: /* AssignmentOperator: SLASH_EQUAL  */
  if (yyn == 383)
    /* "src/main/resources/Java_16_Grammar.y":1416  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 384: /* AssignmentOperator: PERCENT_EQUAL  */
  if (yyn == 384)
    /* "src/main/resources/Java_16_Grammar.y":1417  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 385: /* AssignmentOperator: PLUS_EQUAL  */
  if (yyn == 385)
    /* "src/main/resources/Java_16_Grammar.y":1418  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 386: /* AssignmentOperator: MINUS_EQUAL  */
  if (yyn == 386)
    /* "src/main/resources/Java_16_Grammar.y":1419  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 387: /* AssignmentOperator: LESS_LESS_EQUAL  */
  if (yyn == 387)
    /* "src/main/resources/Java_16_Grammar.y":1420  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 388: /* AssignmentOperator: GR_GR_EQUAL  */
  if (yyn == 388)
    /* "src/main/resources/Java_16_Grammar.y":1421  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 389: /* AssignmentOperator: GR_GR_GR_EQUAL  */
  if (yyn == 389)
    /* "src/main/resources/Java_16_Grammar.y":1422  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 390: /* AssignmentOperator: AMP_EQUAL  */
  if (yyn == 390)
    /* "src/main/resources/Java_16_Grammar.y":1423  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 391: /* AssignmentOperator: CARET_EQUAL  */
  if (yyn == 391)
    /* "src/main/resources/Java_16_Grammar.y":1424  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 392: /* AssignmentOperator: VERTICAL_EQUAL  */
  if (yyn == 392)
    /* "src/main/resources/Java_16_Grammar.y":1425  */
                        { yyval = ((Token)(yystack.valueAt (0))); };
  break;


  case 393: /* ConditionalExpression: ConditionalOrExpression ConditionalOrTail  */
  if (yyn == 393)
    /* "src/main/resources/Java_16_Grammar.y":1429  */
                                                { if ( ((tree.Expression.Binary)(yystack.valueAt (0))) == null ) yyval = ((tree.Expression.Expression)(yystack.valueAt (1)));
                                                  else              yyval = new Conditional(((tree.Expression.Expression)(yystack.valueAt (1))),((tree.Expression.Binary)(yystack.valueAt (0))).left,((tree.Expression.Binary)(yystack.valueAt (0))).right); };
  break;


  case 394: /* ConditionalOrTail: %empty  */
  if (yyn == 394)
    /* "src/main/resources/Java_16_Grammar.y":1434  */
                                                       { yyval = null; };
  break;


  case 395: /* ConditionalOrTail: QUESTION Expression COLON ConditionalExpression  */
  if (yyn == 395)
    /* "src/main/resources/Java_16_Grammar.y":1435  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 396: /* ConditionalOrTail: QUESTION Expression COLON LambdaExpression  */
  if (yyn == 396)
    /* "src/main/resources/Java_16_Grammar.y":1436  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),null); };
  break;


  case 397: /* ConditionalOrExpression: ConditionalAndExpression  */
  if (yyn == 397)
    /* "src/main/resources/Java_16_Grammar.y":1440  */
                                                                    { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 398: /* ConditionalOrExpression: ConditionalOrExpression DBL_VERTICAL ConditionalAndExpression  */
  if (yyn == 398)
    /* "src/main/resources/Java_16_Grammar.y":1441  */
                                                                    { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 399: /* ConditionalAndExpression: InclusiveOrExpression  */
  if (yyn == 399)
    /* "src/main/resources/Java_16_Grammar.y":1445  */
                                                                   { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 400: /* ConditionalAndExpression: ConditionalAndExpression DBL_AMPERSAND InclusiveOrExpression  */
  if (yyn == 400)
    /* "src/main/resources/Java_16_Grammar.y":1446  */
                                                                   { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 401: /* InclusiveOrExpression: ExclusiveOrExpression  */
  if (yyn == 401)
    /* "src/main/resources/Java_16_Grammar.y":1450  */
                                                           { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 402: /* InclusiveOrExpression: InclusiveOrExpression VERTICAL ExclusiveOrExpression  */
  if (yyn == 402)
    /* "src/main/resources/Java_16_Grammar.y":1451  */
                                                           { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 403: /* ExclusiveOrExpression: AndExpression  */
  if (yyn == 403)
    /* "src/main/resources/Java_16_Grammar.y":1455  */
                                                { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 404: /* ExclusiveOrExpression: ExclusiveOrExpression CARET AndExpression  */
  if (yyn == 404)
    /* "src/main/resources/Java_16_Grammar.y":1456  */
                                                { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 405: /* AndExpression: EqualityExpression  */
  if (yyn == 405)
    /* "src/main/resources/Java_16_Grammar.y":1460  */
                                                 { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 406: /* AndExpression: AndExpression AMPERSAND EqualityExpression  */
  if (yyn == 406)
    /* "src/main/resources/Java_16_Grammar.y":1461  */
                                                 { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 407: /* EqualityExpression: RelationalExpression  */
  if (yyn == 407)
    /* "src/main/resources/Java_16_Grammar.y":1465  */
                                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 408: /* EqualityExpression: EqualityExpression DBL_EQUAL RelationalExpression  */
  if (yyn == 408)
    /* "src/main/resources/Java_16_Grammar.y":1466  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 409: /* EqualityExpression: EqualityExpression NON_EQUAL RelationalExpression  */
  if (yyn == 409)
    /* "src/main/resources/Java_16_Grammar.y":1467  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 410: /* RelationalExpression: ShiftExpression  */
  if (yyn == 410)
    /* "src/main/resources/Java_16_Grammar.y":1471  */
                                                         { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 411: /* RelationalExpression: RelationalExpression LESS ShiftExpression  */
  if (yyn == 411)
    /* "src/main/resources/Java_16_Grammar.y":1472  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 412: /* RelationalExpression: RelationalExpression GREATER ShiftExpression  */
  if (yyn == 412)
    /* "src/main/resources/Java_16_Grammar.y":1473  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 413: /* RelationalExpression: RelationalExpression LESS_EQUAL ShiftExpression  */
  if (yyn == 413)
    /* "src/main/resources/Java_16_Grammar.y":1474  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 414: /* RelationalExpression: RelationalExpression GREATER_EQUAL ShiftExpression  */
  if (yyn == 414)
    /* "src/main/resources/Java_16_Grammar.y":1475  */
                                                         { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 415: /* RelationalExpression: InstanceofExpression  */
  if (yyn == 415)
    /* "src/main/resources/Java_16_Grammar.y":1476  */
                                                         { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 416: /* InstanceofExpression: RelationalExpression INSTANCEOF Type  */
  if (yyn == 416)
    /* "src/main/resources/Java_16_Grammar.y":1480  */
                                               { yyval = new InstanceOf(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Type.Type)(yystack.valueAt (0)))); };
  break;


  case 417: /* InstanceofExpression: RelationalExpression INSTANCEOF Pattern  */
  if (yyn == 417)
    /* "src/main/resources/Java_16_Grammar.y":1481  */
                                               { yyval = new InstanceOf(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Declaration.Declaration)(yystack.valueAt (0)))); };
  break;


  case 418: /* ShiftExpression: AdditiveExpression  */
  if (yyn == 418)
    /* "src/main/resources/Java_16_Grammar.y":1485  */
                                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 419: /* ShiftExpression: ShiftExpression DBL_LESS AdditiveExpression  */
  if (yyn == 419)
    /* "src/main/resources/Java_16_Grammar.y":1486  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 420: /* ShiftExpression: ShiftExpression DBL_GREATER AdditiveExpression  */
  if (yyn == 420)
    /* "src/main/resources/Java_16_Grammar.y":1487  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 421: /* ShiftExpression: ShiftExpression TRIPL_GREATER AdditiveExpression  */
  if (yyn == 421)
    /* "src/main/resources/Java_16_Grammar.y":1488  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 422: /* AdditiveExpression: MultiplicativeExpression  */
  if (yyn == 422)
    /* "src/main/resources/Java_16_Grammar.y":1492  */
                                                        { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 423: /* AdditiveExpression: AdditiveExpression PLUS MultiplicativeExpression  */
  if (yyn == 423)
    /* "src/main/resources/Java_16_Grammar.y":1493  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 424: /* AdditiveExpression: AdditiveExpression MINUS MultiplicativeExpression  */
  if (yyn == 424)
    /* "src/main/resources/Java_16_Grammar.y":1494  */
                                                        { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 425: /* MultiplicativeExpression: UnaryExpression  */
  if (yyn == 425)
    /* "src/main/resources/Java_16_Grammar.y":1498  */
                                                       { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 426: /* MultiplicativeExpression: MultiplicativeExpression STAR UnaryExpression  */
  if (yyn == 426)
    /* "src/main/resources/Java_16_Grammar.y":1499  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 427: /* MultiplicativeExpression: MultiplicativeExpression SLASH UnaryExpression  */
  if (yyn == 427)
    /* "src/main/resources/Java_16_Grammar.y":1500  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 428: /* MultiplicativeExpression: MultiplicativeExpression PERCENT UnaryExpression  */
  if (yyn == 428)
    /* "src/main/resources/Java_16_Grammar.y":1501  */
                                                       { yyval = new Binary(((tree.Expression.Expression)(yystack.valueAt (2))),((tree.Expression.Expression)(yystack.valueAt (0))),((Token)(yystack.valueAt (1)))); };
  break;


  case 429: /* UnaryExpression: PreIncrementExpression  */
  if (yyn == 429)
    /* "src/main/resources/Java_16_Grammar.y":1505  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 430: /* UnaryExpression: PreDecrementExpression  */
  if (yyn == 430)
    /* "src/main/resources/Java_16_Grammar.y":1506  */
                                  { yyval = ((UnaryPrefix)(yystack.valueAt (0))); };
  break;


  case 431: /* UnaryExpression: PLUS UnaryExpression  */
  if (yyn == 431)
    /* "src/main/resources/Java_16_Grammar.y":1507  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 432: /* UnaryExpression: MINUS UnaryExpression  */
  if (yyn == 432)
    /* "src/main/resources/Java_16_Grammar.y":1508  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 433: /* UnaryExpression: UnaryExpressionNotPlusMinus  */
  if (yyn == 433)
    /* "src/main/resources/Java_16_Grammar.y":1509  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 434: /* PreIncrementExpression: DBL_PLUS UnaryExpression  */
  if (yyn == 434)
    /* "src/main/resources/Java_16_Grammar.y":1513  */
                               { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 435: /* PreDecrementExpression: DBL_MINUS UnaryExpression  */
  if (yyn == 435)
    /* "src/main/resources/Java_16_Grammar.y":1517  */
                                 { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 437: /* UnaryExpressionNotPlusMinus: TILDE UnaryExpression  */
  if (yyn == 437)
    /* "src/main/resources/Java_16_Grammar.y":1522  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 438: /* UnaryExpressionNotPlusMinus: EXCLAMATION UnaryExpression  */
  if (yyn == 438)
    /* "src/main/resources/Java_16_Grammar.y":1523  */
                                  { yyval = new UnaryPrefix(((Token)(yystack.valueAt (1))),((tree.Expression.Expression)(yystack.valueAt (0)))); };
  break;


  case 439: /* UnaryExpressionNotPlusMinus: SwitchExpression  */
  if (yyn == 439)
    /* "src/main/resources/Java_16_Grammar.y":1525  */
                                  { yyval = ((tree.Expression.Expression)(yystack.valueAt (0))); };
  break;


  case 440: /* PostfixExpression: Primary  */
  if (yyn == 440)
    /* "src/main/resources/Java_16_Grammar.y":1529  */
                               { yyval = ((Primary)(yystack.valueAt (0))); };
  break;


  case 441: /* PostfixExpression: CompoundName  */
  if (yyn == 441)
    /* "src/main/resources/Java_16_Grammar.y":1530  */
                               { yyval = new SimpleReference(((CompoundName)(yystack.valueAt (0)))); };
  break;


  case 442: /* PostfixExpression: PostIncrementExpression  */
  if (yyn == 442)
    /* "src/main/resources/Java_16_Grammar.y":1531  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 443: /* PostfixExpression: PostDecrementExpression  */
  if (yyn == 443)
    /* "src/main/resources/Java_16_Grammar.y":1532  */
                               { yyval = ((UnaryPostfix)(yystack.valueAt (0))); };
  break;


  case 444: /* PostIncrementExpression: PostfixExpression DBL_PLUS  */
  if (yyn == 444)
    /* "src/main/resources/Java_16_Grammar.y":1536  */
                                 { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 445: /* PostDecrementExpression: PostfixExpression DBL_MINUS  */
  if (yyn == 445)
    /* "src/main/resources/Java_16_Grammar.y":1540  */
                                  { yyval = new UnaryPostfix(((Token)(yystack.valueAt (0))),((tree.Expression.Expression)(yystack.valueAt (1)))); };
  break;


  case 446: /* SwitchExpression: SWITCH LPAREN Expression RPAREN SwitchBlock  */
  if (yyn == 446)
    /* "src/main/resources/Java_16_Grammar.y":1558  */
                                                  { yyval = new SwitchExpression(((tree.Expression.Expression)(yystack.valueAt (2))),((SwitchBlock)(yystack.valueAt (0)))); };
  break;


  case 447: /* AnnotationSeqOpt: %empty  */
  if (yyn == 447)
    /* "src/main/resources/Java_16_Grammar.y":1570  */
                       { yyval = null; };
  break;


  case 448: /* AnnotationSeqOpt: AnnotationSeq  */
  if (yyn == 448)
    /* "src/main/resources/Java_16_Grammar.y":1571  */
                       { yyval = ((Annotations)(yystack.valueAt (0))); };
  break;


  case 449: /* AnnotationSeq: Annotation  */
  if (yyn == 449)
    /* "src/main/resources/Java_16_Grammar.y":1575  */
                                { yyval = new Annotations(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 450: /* AnnotationSeq: AnnotationSeq Annotation  */
  if (yyn == 450)
    /* "src/main/resources/Java_16_Grammar.y":1576  */
                                { yyval = ((Annotations)(yystack.valueAt (1))).add(((Annotation)(yystack.valueAt (0)))); };
  break;


  case 451: /* Annotation: AT CompoundName  */
  if (yyn == 451)
    /* "src/main/resources/Java_16_Grammar.y":1580  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (0))),(AnnoParameterList)null); };
  break;


  case 452: /* Annotation: AT CompoundName LPAREN RPAREN  */
  if (yyn == 452)
    /* "src/main/resources/Java_16_Grammar.y":1581  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (2))),(AnnoParameterList)null); };
  break;


  case 453: /* Annotation: AT CompoundName LPAREN AnnoParameterList RPAREN  */
  if (yyn == 453)
    /* "src/main/resources/Java_16_Grammar.y":1582  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),/*$4*/ (AnnoParameterList)null); };
  break;


  case 454: /* Annotation: AT CompoundName LPAREN ElementValue RPAREN  */
  if (yyn == 454)
    /* "src/main/resources/Java_16_Grammar.y":1583  */
                                                       { yyval = new Annotation(((CompoundName)(yystack.valueAt (3))),(AnnoElementValue)null); };
  break;


  case 455: /* AnnoParameterList: IDENTIFIER EQUAL ElementValue  */
  if (yyn == 455)
    /* "src/main/resources/Java_16_Grammar.y":1587  */
                                                            { yyval = null; };
  break;


  case 456: /* AnnoParameterList: AnnoParameterList COMMA IDENTIFIER EQUAL ElementValue  */
  if (yyn == 456)
    /* "src/main/resources/Java_16_Grammar.y":1588  */
                                                            { yyval = null; };
  break;


  case 457: /* ElementValue: ConditionalExpression  */
  if (yyn == 457)
    /* "src/main/resources/Java_16_Grammar.y":1592  */
                                                 { yyval = null; };
  break;


  case 458: /* ElementValue: LBRACE ElementValueListOpt RBRACE  */
  if (yyn == 458)
    /* "src/main/resources/Java_16_Grammar.y":1593  */
                                                 { yyval = null; };
  break;


  case 459: /* ElementValue: LBRACE COMMA RBRACE  */
  if (yyn == 459)
    /* "src/main/resources/Java_16_Grammar.y":1594  */
                                                 { yyval = null; };
  break;


  case 460: /* ElementValue: Annotation  */
  if (yyn == 460)
    /* "src/main/resources/Java_16_Grammar.y":1595  */
                                                 { yyval = null; };
  break;



/* "src/main/java/parser/JavaParser.java":4200  */

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

  private static final short yypact_ninf_ = -609;
  private static final short yytable_ninf_ = -461;

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short[] yypact_ = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
    {
      31,    -8,    11,   176,  -609,  4469,  -609,  -609,  -609,    11,
     485,   497,  -609,    11,  -609,  -609,  -609,  -609,  -609,  -609,
    -609,  -609,  -609,  -609,  -609,  -609,  2773,  -609,  1592,  -609,
    -609,  1516,  4480,  -609,   545,    36,  -609,   240,   -21,   413,
      95,   248,   265,   295,   286,  -609,  -609,  -609,  -609,  -609,
    -609,  -609,  -609,  -609,  2773,  1592,  -609,   264,  -609,   380,
    -609,   963,  2834,   356,   333,   386,   386,   373,  -609,   443,
    -609,  -609,  2642,  3494,  -609,  2900,  3560,  3560,  3560,  3560,
    3560,  3560,   430,  -609,  -609,  -609,  -609,  -609,  -609,  -609,
    -609,  -609,  -609,  -609,  -609,  1173,  -609,  -609,   431,   459,
    -609,  -609,   273,  -609,   454,   370,   273,  -609,   390,  -609,
    -609,  -609,   273,  -609,  -609,  -609,  -609,   287,   437,   481,
     452,   496,   469,    22,  -609,   492,   537,   606,  -609,  -609,
    -609,  -609,   522,  -609,  -609,  -609,  1123,   423,   332,   513,
     531,  1123,   535,   164,   477,  -609,   526,   386,  -609,  2722,
     539,  4579,   752,   596,   580,  -609,   563,  -609,  -609,  1769,
    -609,   591,  -609,    75,  -609,  -609,  -609,  -609,  -609,  -609,
    3032,  1092,   400,   273,  1123,  -609,    34,   572,  3494,  3098,
     598,   273,  -609,   348,  3164,     5,  -609,  -609,  -609,    72,
     572,   600,  -609,     9,   572,  -609,  -609,  3494,  3560,  -609,
    3560,  3560,  3560,  3560,  3560,  3560,  3560,  3560,  3560,  3560,
    1032,  3560,  3560,  3560,  3560,  3560,  3560,  3560,  3560,  -609,
    -609,   323,   273,  -609,   544,  -609,  4114,  -609,  -609,   592,
     177,  -609,   548,   351,  -609,  -609,   164,  1123,   601,   620,
     321,   333,   570,  -609,   486,   377,  -609,  4396,  3230,  -609,
    3230,  -609,  -609,  -609,  -609,  -609,  -609,  -609,  -609,  -609,
    -609,  -609,  -609,  3494,  -609,  -609,  3032,  -609,  -609,   -16,
    -609,   378,  -609,   589,   360,   273,   360,  -609,   643,  -609,
     599,   605,   651,  -609,   657,   604,  -609,  3296,  -609,   397,
    -609,   572,   663,  -609,   622,   662,  -609,   193,   610,  -609,
    -609,   630,   634,   679,   437,   481,   452,   496,   469,    22,
      22,   492,   492,   492,   492,   637,  -609,    49,  -609,  -609,
     537,   537,   537,   606,   606,  -609,  -609,  -609,   667,  -609,
    4353,  4142,  1123,   540,   687,  -609,   642,   680,  1123,   164,
    -609,  -609,  -609,  4153,  -609,  1123,   473,  -609,   940,   698,
    1123,   333,   649,   242,  -609,  4480,  1899,  -609,  -609,  -609,
    -609,  -609,  -609,  1123,  1123,  1385,  -609,    78,  3362,  -609,
    -609,   360,  -609,   702,   643,  -609,   703,  -609,  -609,  -609,
     704,  -609,  3494,    38,   643,   572,  -609,  -609,  -609,   643,
    -609,  3494,   161,   701,  -609,   701,  3032,   637,   259,  -609,
    -609,  -609,  -609,  -609,  -609,  4353,  -609,   700,  3883,   707,
     680,   643,  -609,   697,   660,  1123,  -609,  -609,  4241,  4181,
    -609,  -609,   680,   261,  3922,  -609,  -609,   702,   273,   273,
     688,   348,  -609,   710,  -609,  -609,   711,  3494,    41,    71,
    2595,   719,   721,  3428,   723,   727,  3494,   569,   735,  3494,
    4441,  1502,  -609,  2015,  -609,   729,  -609,  -609,  -609,   732,
    -609,  -609,  -609,  -609,  -609,   306,   482,  -609,  -609,  -609,
     522,   532,   567,  -609,  -609,  -609,  1123,  1123,  -609,   436,
     737,  -609,  -609,  -609,  3975,  -609,  -609,  -609,    62,  -609,
    -609,  -609,  -609,   692,  -609,   693,  -609,  -609,  -609,  3362,
    -609,   274,   637,  -609,   571,   746,  -609,   745,  -609,   749,
    4241,  4014,  -609,  -609,  -609,  -609,   702,  1123,  -609,   695,
     266,  -609,   384,   335,  -609,  -609,  -609,  -609,  -609,  4241,
    -609,  -609,   724,  -609,  4298,  -609,  4035,  -609,  -609,  -609,
    -609,   705,  -609,  2595,   614,  -609,   750,  -609,   751,   727,
     641,  3622,  3494,  -609,   755,  3494,  3494,   756,  3806,     7,
     749,  3494,   757,  -609,  -609,    49,   764,  -609,  -609,  -609,
    -609,  -609,  -609,  -609,   770,  3362,  -609,  4081,  -609,  3560,
    -609,    96,  -609,   172,  -609,  2131,   276,   643,  -609,  -609,
    -609,   772,  -609,  -609,  -609,   753,  -609,  -609,   280,  -609,
     726,   384,  -609,  -609,   672,  -609,  -609,   335,  -609,  -609,
    -609,  -609,   779,   672,   672,   695,   695,   266,   921,  -609,
    -609,  -609,  -609,   728,   792,  -609,  -609,  -609,  -609,  -609,
    3494,  -609,  -609,   781,   786,  -609,   789,   794,   805,  -609,
     812,   813,  -609,   366,  -609,   420,  -609,   390,   429,   825,
     749,     7,  -609,  -609,   761,   826,  -609,  -609,  -609,  -609,
    -609,   820,  -609,  -609,  -609,   808,  -609,  -609,   821,   822,
    1667,   823,  -609,  2966,  -609,  -609,   273,   283,   585,   833,
    1123,   792,  -609,  3862,  -609,  -609,   672,   672,   672,   695,
    -609,  1783,  -609,   827,  3494,  3494,  3494,  3684,  2595,   703,
     749,  -609,  3746,  4480,  -609,  -609,  -609,   765,   761,  2595,
    3560,  -609,  3494,  -609,   828,   774,  -609,  4396,   592,  -609,
     273,   940,    28,   490,  -609,  -609,  -609,  -609,   672,  -609,
     524,  2247,  2363,   471,   350,  -609,   838,   843,   837,  -609,
    -609,   776,  -609,  -609,  -609,  -609,  1123,   847,  -609,  -609,
    -609,  -609,   841,  -609,  3032,   842,   494,  -609,    28,   165,
    -609,  -609,   835,   273,  4396,  -609,     5,  -609,  2479,  -609,
       9,   643,   643,   844,  2595,  3684,  2595,  -609,  -609,   141,
     749,  -609,  -609,  -609,  -609,  -609,   771,  -609,   829,  -609,
    -609,   773,   622,  -609,     3,   867,   868,  -609,  -609,   794,
     876,  -609,  1123,   273,  -609,  -609,  -609,   643,   643,  -609,
    -609,  2595,  -609,  -609,   870,   871,  -609,  -609,  -609
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
      36,    11,     0,   449,     0,     0,    37,     0,    33,   451,
       0,     0,     0,     0,     0,    43,    45,    61,    62,    63,
      46,   181,   182,    16,    11,    14,   450,     0,    38,     0,
      10,    11,     0,     0,    77,    65,    65,     0,    44,     0,
      39,    32,    11,     0,   452,   461,     0,     0,     0,     0,
       0,     0,     9,     2,     3,     6,     7,    60,    53,    57,
      59,     5,    58,    55,    56,   324,     8,    54,     0,     0,
     310,     4,   173,   307,   441,     0,    47,    49,   440,   313,
     319,   314,   315,   316,   317,   318,   457,   394,   397,   399,
     401,   403,   405,   407,   415,   410,   418,   422,   425,   429,
     430,   433,   436,   442,   443,   439,     0,   449,     0,     0,
       0,     0,     0,     0,   184,    66,     0,    65,    40,    11,
       9,   441,   314,   315,     0,   362,     0,   363,   376,     0,
     375,     0,   462,     0,   431,   432,   437,   438,   434,   435,
       0,     0,     0,     0,     0,   325,     0,   324,     0,     0,
       0,   174,   175,     0,     0,     0,   340,    51,   343,     0,
     324,     0,    52,     0,   324,   341,   342,     0,     0,   393,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,   444,
     445,    50,    48,   453,     0,   454,    11,   198,    79,    78,
     111,   108,    72,     0,    68,    71,     0,     0,     0,   185,
     447,    77,    75,   368,     0,     0,   370,     0,     0,   312,
       0,   381,   382,   383,   384,   385,   386,   387,   388,   389,
     390,   391,   392,     0,   459,   458,     0,   455,   326,   331,
     330,     0,   328,     0,   360,     0,   360,   323,     0,   338,
       0,     0,     0,   177,     0,     0,   176,     0,   348,     0,
     350,   324,     0,   320,     0,     0,   311,     0,     0,   337,
     321,     0,     0,     0,   398,   400,   402,   404,   406,   408,
     409,   411,   412,   413,   414,     0,   416,    47,   306,   417,
     419,   420,   421,   423,   424,   426,   427,   428,     0,   199,
      11,    11,     0,   118,   112,   113,     0,   448,     0,     0,
      67,    70,   186,    11,   183,     0,     0,   124,     0,     0,
       0,    77,     0,   447,   369,    11,     0,   365,   364,   367,
     366,   377,   463,     0,     0,     0,   327,   334,   146,   361,
     358,   360,   357,    83,     0,   354,     0,   179,   309,   178,
       0,   349,     0,     0,     0,   324,   353,   356,   308,     0,
     352,     0,   139,   220,   135,   219,     0,     0,     0,   205,
     206,   204,   201,   203,   200,    11,    80,   118,    11,     0,
     447,   115,    81,    74,     0,     0,    69,   188,    11,    11,
     187,   122,   447,   447,    11,   121,    76,     0,   173,   173,
       0,   448,   371,     0,   210,   227,     9,     0,     0,     0,
       0,     0,     0,     0,     0,    25,     0,     0,     0,     0,
      11,    12,   226,     0,   212,     0,   218,   221,   222,     0,
     223,   224,   225,   276,   277,   313,   316,   248,   249,   250,
       0,   251,   252,   332,   333,   329,     0,     0,   151,     0,
     147,   148,   150,   359,    11,   322,    84,   346,     0,   446,
     180,   351,   339,     0,   344,     0,   345,   396,   395,     0,
     137,   142,     0,   456,     0,     0,   202,     0,    92,    23,
      11,    11,    87,    90,   109,   114,   116,     0,    73,     0,
       0,   194,     0,     0,   195,   190,   192,   193,   189,    11,
     125,   126,     0,   128,    11,   132,    11,   130,    64,   373,
     372,     0,   246,     0,     0,   233,     0,   235,     0,     0,
       0,   279,     0,   237,     0,     0,     0,     0,     0,     0,
       0,     0,     0,   214,   215,     0,     0,   211,   213,   217,
     228,   335,   336,   144,     0,     0,    85,    11,   258,     0,
     272,     0,   261,     0,   266,     0,     0,     0,   355,   141,
     140,     0,   138,   136,   196,     0,   110,    91,     0,    95,
       0,     0,    89,    97,   169,    93,    94,     0,    96,    88,
     117,    82,     0,   169,   169,     0,     0,     0,     0,   172,
     197,   171,   191,     0,     9,   129,   131,   374,   247,   229,
       0,   234,   236,     0,   281,   284,     0,   280,     0,   238,
       0,     0,   240,    50,   304,     0,   302,     0,   314,     0,
       0,   242,   291,   244,   289,     0,   241,   216,   145,   149,
      86,   271,   273,   259,   262,     0,   260,   267,     0,    17,
       0,     0,   269,     0,   347,   143,   173,   139,     0,     0,
       0,     0,   152,     0,   158,   157,   169,   169,   169,     0,
     127,     0,   133,     0,     0,     0,   282,     0,     0,     0,
       0,   300,     0,    11,   299,   292,   243,   297,   290,     0,
       0,   270,     0,   264,     0,   208,   134,     0,   170,    98,
     173,     0,   447,     0,   161,   156,   153,   155,   169,   100,
     378,     0,     0,   440,     0,   230,     0,     0,     0,   283,
     285,   256,   231,   239,   301,   303,     0,     0,   245,   298,
     275,   274,     0,   263,     0,     0,     0,   159,   447,   173,
     167,   164,     0,   173,     0,   154,     0,   101,     0,   102,
     324,     0,     0,     0,     0,   286,     0,   255,   295,     0,
       0,   265,   209,   207,    99,   163,     0,   165,     0,   160,
     162,     0,   325,   103,     0,     0,     0,   232,   288,   287,
       0,   257,     0,   173,   293,   168,   166,     0,     0,   105,
     104,     0,   296,   294,     0,     0,   278,   106,   107
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final short[] yypgoto_ = yypgoto_init();
  private static final short[] yypgoto_init()
  {
    return new short[]
    {
    -609,  -609,    -1,   233,  -338,   -13,   137,  -609,  -609,   845,
    -609,    67,  -609,   830,   832,   568,   564,   795,  -259,  -609,
     -17,  -258,  -609,   549,   653,  -609,  -207,   207,  -609,  -609,
    -387,   408,  -413,  -609,  -609,  -609,   212,  -609,  -609,  -609,
    -609,  -609,   487,   488,  -609,  -609,  -609,   474,  -609,  -609,
     363,  -609,  -309,   399,  -609,  -609,  -347,  -609,  -609,   327,
    -609,  -225,  -468,   187,   143,   147,  -577,   301,  -101,  -163,
     815,  -260,   460,  -609,  -609,  -609,  -609,   382,  -392,  -609,
    -609,  -609,  -609,   504,  -609,  -609,  -185,  -560,  -450,  -190,
    -402,  -609,  -609,  -534,  -609,  -609,   217,  -609,   336,  -609,
     342,  -609,  -115,  -609,  -609,  -609,  -609,  -609,  -609,   151,
    -609,  -609,  -609,   275,  -608,  -609,  -609,  -609,  -606,  -609,
    -609,   228,  -609,  -535,    -4,  -180,  -609,  -161,   -82,  -609,
     573,   656,   744,   475,  -144,  -609,  -609,  -609,  -246,   793,
     543,  -609,  -609,   582,  -572,   668,  -609,  -609,   -48,  -609,
    -609,   742,   741,   734,   768,   740,   438,  -609,   316,   458,
     435,    40,   736,   804,  -609,   824,   853,   934,  -609,  -196,
      82,   123,  -609,   -73,  -609
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
     600,   145,   233,   234,   235,   351,   142,   229,   413,   485,
     486,   511,   512,   602,   603,   604,   692,   731,    48,   231,
     333,   334,   335,   409,    49,   241,   346,   347,   425,   536,
     537,   605,   395,   394,   500,   592,   369,   479,   480,   481,
     606,   523,   614,   723,   724,   761,   681,   620,   180,   181,
     182,    50,    51,   238,   239,   344,   419,   525,   401,   527,
      52,   227,   331,   402,   403,   755,   452,   453,   454,   455,
     456,   457,   458,   459,   460,   777,   489,   581,   582,   583,
     584,   585,   586,   661,   461,   462,   463,   636,   738,   637,
     800,   464,   707,   651,   652,   747,   779,   748,   653,   560,
     645,   646,   319,   108,   109,   110,   278,   174,   175,   271,
     272,   152,   153,   113,   188,   289,   114,   115,   370,   154,
     155,   156,   245,   246,   157,   158,   159,   263,   160,   199,
     117,   118,   119,   120,   121,   122,   123,   124,   125,   126,
     127,   128,   129,   130,   131,   132,   133,   134,   135,   336,
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
      10,    11,   162,   568,   191,   293,   393,   662,    34,   274,
     276,   535,    39,   300,   116,   280,   281,   635,   451,    55,
     318,   478,   187,   647,   171,   670,   526,   116,   171,   297,
     372,   -29,   301,   302,   349,   179,   684,   685,   550,    39,
     538,   206,   207,   705,   348,   706,    13,     8,   144,   146,
      59,   613,   545,   171,   208,   209,   179,   171,   389,   363,
      60,   104,     1,   357,   299,   359,     8,    13,   578,   187,
     400,   399,    30,   649,   104,   104,   104,   104,   104,   104,
     104,   265,   547,   759,   266,   650,   364,    32,   504,   279,
     275,    60,     9,   492,   172,   291,   546,   267,   609,   291,
     705,   749,   663,   294,   392,   808,   210,   292,    32,   725,
     726,   727,   371,    32,     1,   451,   164,   165,   166,   167,
     168,   169,   116,   535,     2,   483,   548,   579,    30,   610,
     242,   732,   580,   760,   373,   221,    32,   526,   751,   187,
     221,   628,   414,    32,   427,   400,   399,   686,   687,   688,
       8,   765,   589,   476,    32,    56,   733,   430,   524,   521,
     522,   579,   802,   740,   609,    53,   580,   647,   179,   104,
     221,   768,   179,   221,   295,   786,    12,   296,   666,    13,
     477,    63,    13,    13,   183,   137,   183,   183,   183,   499,
     183,   563,    53,   362,   183,    13,   803,   104,   137,   104,
     104,   104,   104,   104,   104,   104,   104,   104,   104,   221,
     104,   104,   104,   104,   104,   104,   104,   104,   116,   232,
     568,   728,   493,   513,   495,   236,   348,   532,   478,   501,
     487,   247,  -447,   183,    55,   183,   221,   579,    26,   513,
     494,   635,   580,   221,   675,   496,   221,   451,   386,   179,
     608,   599,   601,   273,   183,   183,   325,   326,   327,    56,
      13,   566,   559,   183,    54,   104,   179,   516,   179,   524,
     521,   522,   221,   179,   608,   599,   601,    13,    69,    13,
     179,   179,   568,   387,    13,   607,   683,   179,   672,   678,
     179,    13,    13,   137,    26,    60,   741,   429,    13,   513,
     673,    13,   591,    64,   183,    54,    56,   750,    32,   607,
    -254,   499,   337,   197,   505,  -254,   531,  -254,   568,    60,
      65,   612,   337,   503,   597,  -123,   513,   539,   540,   221,
    -123,   221,   451,    37,   198,   677,   223,   221,   621,    13,
     356,   224,   171,   498,   221,   721,   619,   221,   116,   221,
      66,   513,   465,   451,    67,   287,   183,   183,   183,    56,
     339,   634,   221,   221,   221,   368,    13,   179,   644,   184,
      56,   340,   798,   179,   801,   654,   185,   179,    13,   721,
     189,   354,   244,   190,    13,   171,   355,   365,    13,   137,
     104,    70,   513,   451,   451,   104,    56,   179,   366,   183,
     193,   381,    13,   194,   221,   143,   382,   179,    13,   816,
      37,   140,   247,    32,   221,   141,    62,   221,    13,   171,
     415,   236,   621,    37,   701,    32,   721,  -460,   147,  -460,
     451,   702,  -460,  -305,  -460,   431,   465,    32,   247,     8,
    -305,   176,   573,   674,   177,   574,    87,   273,    88,   465,
     221,    89,   771,   183,   148,   772,    90,   184,   170,   330,
      56,   179,   178,    92,   185,   704,   665,   -50,   668,    93,
     671,    94,    13,   171,   183,   221,   221,   421,   179,   202,
     183,   770,   422,    97,   194,   200,  -253,   247,   713,    13,
      32,  -253,   337,  -253,   763,    35,    36,   615,   784,   764,
     247,    32,   201,   764,   337,   431,    32,    37,    38,   221,
     183,   183,   644,   203,   501,   743,   221,   225,   204,   137,
     205,   221,   311,   312,   313,   314,   762,   184,   221,   240,
     734,   179,    32,   221,   766,   247,   226,   -50,    56,   465,
     230,     8,    13,   171,   211,   212,   213,   465,    87,   407,
      88,   408,   237,    89,    56,    57,    58,   643,    90,   214,
     215,   187,   762,   248,   405,    92,    32,   219,   220,  -441,
    -441,    93,   558,    94,   356,   715,   418,  -442,  -442,   -50,
     502,   465,   594,   183,   249,    97,   293,   250,   244,   450,
     300,   171,    32,    32,   502,   804,   716,   264,   352,   328,
     221,   332,   183,   179,   618,   791,   343,    13,   285,   794,
     298,   247,  -443,  -443,    13,   367,    32,   221,    32,   757,
     216,   217,   218,   338,  -380,   629,   630,   795,   796,   345,
    -380,  -380,  -380,  -380,  -380,  -380,  -380,  -380,  -380,  -380,
    -380,   510,   309,   310,     8,   350,   184,   183,   187,   323,
     324,    87,   529,    88,   374,   376,    89,   534,   787,    32,
     375,    90,   789,   814,   815,   377,   465,   247,    92,   320,
     321,   322,   378,   383,    93,   385,    94,   384,   388,   221,
     183,   782,   221,   618,   792,   389,   450,   465,    97,   390,
     730,   391,   392,   465,   465,   396,   410,   411,    13,   183,
     222,   643,   813,   424,   428,   465,   116,   484,   488,   228,
     502,   408,   490,   514,   517,   518,   221,   510,   111,   541,
     221,   542,   551,   543,   552,   183,   555,   465,   465,   183,
     556,   111,   111,   111,   111,   111,   111,   111,   561,   270,
     569,    56,   277,   570,   510,   221,   575,   587,   588,   595,
     612,   596,   247,   104,   356,   623,   633,   676,   183,   183,
     627,   631,   632,   221,   465,    32,   639,   642,   656,   534,
     465,   465,   465,   247,   317,   657,   658,   368,   316,   680,
    -379,   679,   683,   690,   694,    32,  -379,  -379,  -379,  -379,
    -379,  -379,  -379,  -379,  -379,  -379,  -379,   691,   695,    32,
     696,   221,   183,   697,   431,   342,   112,   465,   353,   698,
     510,   222,   183,   247,   247,   183,   699,   700,   450,   112,
     112,   112,   112,   112,   112,   112,   111,   649,   703,   710,
     709,   466,   673,   672,  -272,   711,   717,   222,   735,   753,
     431,   183,   773,   650,   754,   183,    32,   774,   775,   776,
     247,   780,   781,   783,   111,   797,   111,   111,   111,   111,
     111,   111,   111,   111,   111,   111,   788,   111,   111,   111,
     111,   111,   111,   111,   111,   807,   805,   137,   809,   810,
     811,   817,   818,    61,   806,   183,    68,   718,   416,   341,
     173,    72,   577,   719,   398,   507,   530,   515,   397,   626,
     406,   593,   659,   450,   756,   785,   412,   790,   682,   506,
     564,   622,   423,   420,   112,   466,   742,   664,   426,   186,
     317,   192,   111,   195,   450,   667,   799,   196,   466,   708,
     745,   473,   474,   270,   497,   306,   746,   432,   475,    13,
     304,   305,   112,   308,   112,   112,   112,   112,   112,   112,
     112,   112,   112,   112,     0,   112,   112,   112,   112,   112,
     112,   112,   112,   -41,   450,   450,   186,     0,   196,   398,
     307,   282,   284,   397,     0,     0,     8,   290,     0,   222,
       0,    13,   520,    87,     0,    88,   397,     0,    89,     0,
     303,     0,     0,    90,     0,     8,   286,     0,     0,     0,
      92,   450,    87,     0,    88,     0,    93,    89,    94,     0,
     112,     0,    90,     0,     0,   565,     0,   317,   466,    92,
      97,     0,     0,    14,   467,    93,   466,    94,     0,     0,
       0,     0,     0,    15,   689,     0,     0,   192,     0,    97,
      16,   358,     0,   360,   571,   572,     1,   111,     0,     0,
      13,     0,   111,     0,     0,    17,   361,    18,    19,    20,
     466,     0,     0,    21,    22,     0,     0,    23,     0,     0,
       0,    24,     0,     0,   598,     0,     0,    25,     0,     0,
     380,     0,     0,     0,     0,   611,   617,     8,     0,   286,
     616,   286,   468,   520,    87,     0,    88,   397,   598,    89,
       0,     0,     0,     0,    90,     0,     0,     0,   467,     0,
      13,    92,   268,     0,     0,   317,     0,    93,   269,    94,
       0,   467,   317,     0,     0,     0,     0,     0,     0,     0,
       0,    97,   192,     0,     0,   112,     0,     0,     0,     0,
     112,    13,     0,     0,   315,   466,     0,     8,     0,   317,
       0,     0,     0,     0,    87,     0,    88,     0,     0,    89,
     469,   482,     0,     0,    90,   617,   466,     0,   192,   616,
       0,    92,   466,   466,     0,   491,   468,    93,     8,    94,
     470,     0,   222,     0,   466,    87,   286,    88,     0,   468,
      89,    97,   171,     0,     0,    90,     0,     0,     0,     0,
       0,     0,    92,     0,     0,     0,   466,   466,    93,   471,
      94,   467,     0,   192,   648,     0,     0,     0,     0,   467,
       0,     0,    97,     0,     0,     0,     0,     0,     8,     0,
     544,     0,     0,     0,   317,    87,   554,    88,   192,   557,
      89,     0,   562,   466,   469,    90,     0,   722,   228,   466,
     466,   466,    92,   467,     0,   317,     0,   469,    93,     0,
      94,     0,     0,     0,   470,     0,   317,     0,     0,     0,
       0,     0,    97,     0,     0,     0,     0,   470,     0,   468,
       0,   722,     0,     0,     0,   758,   466,   468,     0,     0,
     472,     0,   590,   471,     0,   317,   317,     0,     0,     0,
       0,     0,   112,     0,     0,     0,   471,     0,     0,     0,
       0,     0,     0,     0,   778,     0,   286,     0,     0,     0,
       0,   468,     0,     0,     0,     0,     0,     0,   722,     0,
       0,     0,   317,     0,     0,   192,     0,     0,   467,     0,
       0,     0,     0,     0,     0,   638,     0,   469,   640,   641,
       0,     0,     0,     0,   655,   469,     0,     0,   648,   467,
       0,     0,     0,     0,     0,   467,   467,   470,   482,     0,
     812,     0,     0,     0,   472,   470,     0,   467,     0,     0,
     192,     0,     0,     0,     0,     0,     0,   472,     0,   469,
       0,     0,     0,     0,     0,     0,   471,     0,     0,   467,
     467,     0,     0,    13,   471,     0,   468,     0,     0,   470,
     111,   269,     0,   192,     0,     0,     0,     0,     0,     0,
       0,     0,     0,   693,     0,     0,     0,   468,     0,     0,
       0,     0,   192,   468,   468,     0,   467,     0,   471,     0,
       8,     0,   467,   467,   467,   468,   112,    87,     0,    88,
       0,     0,    89,     0,     0,     0,     0,    90,   186,     0,
       0,     0,   195,     0,    92,     0,   714,   468,   468,     0,
      93,     0,    94,     0,   469,     0,     0,   472,     0,   467,
       0,     0,     0,     0,    97,   472,     0,   736,   737,   739,
       0,     0,     0,     0,   470,   469,     0,     0,   112,     0,
       0,   469,   469,     0,   468,   752,     0,     0,     0,     0,
     468,   468,   468,   469,     0,   470,   -31,     0,     0,   472,
       0,   470,   470,   471,     0,     0,     0,     0,     0,     0,
       0,     0,     0,   470,    13,   469,   469,   192,     0,     0,
       0,     0,     0,     0,   471,   186,     0,   468,   195,     0,
     471,   471,     0,     0,     0,   470,   470,     8,     0,     0,
       0,     0,   471,     0,    87,     0,    88,     0,     0,    89,
       0,     0,   469,   192,    90,     0,    14,     0,   469,   469,
     469,    92,     0,     0,   471,   471,    15,    93,     0,    94,
       0,     0,   470,    16,     0,     0,     0,     0,   470,   470,
     470,    97,     0,     0,   472,     0,     0,     0,    17,     0,
      18,    19,    20,     0,   315,   469,    21,    22,     0,     0,
      23,   471,     0,     0,    24,   472,     0,   471,   471,   471,
      25,   472,   472,     0,     0,   470,     0,     0,     0,     0,
       0,     0,     0,   472,     0,     0,     0,     0,     0,     0,
       0,     0,    14,     0,     0,     0,     0,     0,     0,     0,
       0,     0,    15,     0,   471,   472,   472,     0,   433,    16,
      73,     0,   356,  -268,     0,     0,     0,     0,   435,     0,
       0,     0,     0,     0,    17,    13,    18,    19,    20,     0,
       0,     0,    21,    22,     0,     0,    23,     0,     0,     0,
      24,     0,   472,     0,     0,     0,    25,     0,   472,   472,
     472,     0,    80,    81,     0,     0,     0,     0,     0,     0,
       0,     0,   436,    83,    84,    85,    86,    14,   437,    87,
     438,    88,  -268,     0,    89,   -11,   439,    15,   440,    90,
       0,   -11,     0,    91,    16,   472,    92,   441,   442,     0,
       0,     0,    93,   -11,    94,     0,     0,    95,    96,    17,
       0,    18,    19,    20,   -11,   443,    97,    21,    22,    98,
     444,   445,   100,   446,     0,    24,     0,   101,   447,   315,
     102,    25,   448,   449,   433,     0,    73,     0,   356,   729,
       0,     0,     0,     0,   435,     0,     0,   251,     0,     0,
       0,    13,   171,   252,   253,   254,   255,   256,   257,   258,
     259,   260,   261,   262,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,    80,    81,
       0,     0,     0,     0,     0,     0,     0,     0,   436,    83,
      84,    85,    86,    14,   437,    87,   438,    88,     0,     0,
      89,   -11,   439,    15,   440,    90,     0,   -11,     0,    91,
      16,     0,    92,   441,   442,     0,     0,     0,    93,   -11,
      94,     0,     0,    95,    96,    17,     0,    18,    19,    20,
     -11,   443,    97,    21,    22,    98,   444,   445,   100,   446,
       0,    24,     0,   101,   447,   315,   102,    25,   448,   449,
     433,     0,    73,     0,   356,   434,     0,     0,     0,     0,
     435,     0,     0,     0,     0,     0,     0,    13,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,    80,    81,     0,     0,     0,     0,
       0,     0,     0,     0,   436,    83,    84,    85,    86,    14,
     437,    87,   438,    88,     0,     0,    89,   -11,   439,    15,
     440,    90,     0,   -11,     0,    91,    16,     0,    92,   441,
     442,     0,     0,     0,    93,   -11,    94,     0,     0,    95,
      96,    17,     0,    18,    19,    20,   -11,   443,    97,    21,
      22,    98,   444,   445,   100,   446,     0,    24,     0,   101,
     447,   315,   102,    25,   448,   449,   433,     0,    73,     0,
     356,   567,     0,     0,     0,     0,   435,     0,     0,     0,
       0,     0,     0,    13,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
      80,    81,     0,     0,     0,     0,     0,     0,     0,     0,
     436,    83,    84,    85,    86,    14,   437,    87,   438,    88,
       0,     0,    89,   -11,   439,    15,   440,    90,     0,   -11,
       0,    91,    16,     0,    92,   441,   442,     0,     0,     0,
      93,   -11,    94,     0,     0,    95,    96,    17,     0,    18,
      19,    20,   -11,   443,    97,    21,    22,    98,   444,   445,
     100,   446,     0,    24,     0,   101,   447,   315,   102,    25,
     448,   449,   433,     0,    73,     0,   356,     0,     0,     0,
       0,     0,   435,     0,     0,     0,     0,     0,     0,    13,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,    80,    81,     0,     0,
       0,     0,     0,     0,     0,     0,   436,    83,    84,    85,
      86,    14,   437,    87,   438,    88,   579,     0,    89,   -11,
     439,   669,   440,    90,     0,   -11,     0,    91,    16,     0,
      92,   441,   442,     0,     0,     0,    93,   -11,    94,     0,
       0,    95,    96,    17,     0,    18,    19,    20,   -11,   443,
      97,    21,    22,    98,   444,   445,   100,   446,     0,    24,
       0,   101,   447,   315,   102,    25,   448,   449,   433,     0,
      73,     0,   356,   767,     0,     0,     0,     0,   435,     0,
       0,     0,     0,     0,     0,    13,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,    80,    81,     0,     0,     0,     0,     0,     0,
       0,     0,   436,    83,    84,    85,    86,    14,   437,    87,
     438,    88,     0,     0,    89,   -11,   439,    15,   440,    90,
       0,   -11,     0,    91,    16,     0,    92,   441,   442,     0,
       0,     0,    93,   -11,    94,     0,     0,    95,    96,    17,
       0,    18,    19,    20,   -11,   443,    97,    21,    22,    98,
     444,   445,   100,   446,     0,    24,     0,   101,   447,   315,
     102,    25,   448,   449,   433,     0,    73,     0,   356,   769,
       0,     0,     0,     0,   435,     0,     0,     0,     0,     0,
       0,    13,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,    80,    81,
       0,     0,     0,     0,     0,     0,     0,     0,   436,    83,
      84,    85,    86,    14,   437,    87,   438,    88,     0,     0,
      89,   -11,   439,    15,   440,    90,     0,   -11,     0,    91,
      16,     0,    92,   441,   442,     0,     0,     0,    93,   -11,
      94,     0,     0,    95,    96,    17,     0,    18,    19,    20,
     -11,   443,    97,    21,    22,    98,   444,   445,   100,   446,
       0,    24,     0,   101,   447,   315,   102,    25,   448,   449,
     433,     0,    73,     0,   356,   793,     0,     0,     0,     0,
     435,     0,     0,     0,     0,     0,     0,    13,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,    80,    81,     0,     0,     0,     0,
       0,     0,     0,     0,   436,    83,    84,    85,    86,    14,
     437,    87,   438,    88,     0,     0,    89,   -11,   439,    15,
     440,    90,     0,   -11,     0,    91,    16,     0,    92,   441,
     442,     0,     0,     0,    93,   -11,    94,     0,     0,    95,
      96,    17,     0,    18,    19,    20,   -11,   443,    97,    21,
      22,    98,   444,   445,   100,   446,     0,    24,     0,   101,
     447,   315,   102,    25,   448,   449,   433,     0,    73,     0,
     356,     0,     0,     0,     0,     0,   435,     0,     0,     0,
       0,     0,     0,    13,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
      80,    81,   -42,     0,     0,     0,     0,     0,     0,     0,
     436,    83,    84,    85,    86,     0,   437,    87,   438,    88,
      13,     0,    89,     0,   439,     0,   440,    90,     0,     0,
       0,    91,     0,     0,    92,   441,   442,     0,     0,     0,
      93,     0,    94,     0,     0,    95,    96,     0,     0,     0,
       0,     0,     0,   443,    97,     0,     0,    98,   444,   549,
     100,   446,    14,     0,     0,   101,   447,     0,   102,     0,
     448,   449,    15,     0,     0,     0,     0,     0,     0,    16,
       0,     0,     0,     0,     0,   149,   243,     0,     0,     0,
       0,     0,     0,     0,    17,     0,    18,    19,    20,     0,
      13,     0,    21,    22,    76,    77,    23,     0,     0,     0,
      24,    78,    79,     0,     0,     0,    25,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    80,    81,     0,
       0,     0,     0,     0,     0,     0,     0,   150,    83,    84,
      85,    86,    14,     0,    87,     0,    88,     0,     0,    89,
       0,    40,    15,     0,    90,     0,     0,     0,    91,    16,
       0,    92,     0,     0,     0,     0,     0,    93,     0,    94,
       0,     0,    95,    96,    17,     0,    18,    19,    20,     0,
       0,    97,    21,    22,    98,    99,    23,   100,     0,     0,
      24,     0,   101,    14,     0,   102,    25,    73,    74,    75,
       0,     0,     0,    15,     0,     0,     0,    41,     0,     0,
      16,     0,    13,     0,     0,     0,    76,    77,     0,    42,
       0,     0,     0,    78,    79,    17,     0,    18,    19,    20,
      43,     0,     0,    21,    22,     0,     0,    23,     0,    80,
      81,    24,     0,     0,     0,     0,     0,    25,     0,    82,
      83,    84,    85,    86,     0,     0,    87,     0,    88,     0,
       0,    89,     0,    73,     0,    75,    90,     0,     0,   161,
      91,     0,     0,    92,     0,     0,     0,     0,    13,    93,
       0,    94,    76,    77,    95,    96,     0,     0,     0,    78,
      79,     0,     0,    97,     0,     0,    98,    99,     0,   100,
       0,     0,     0,     0,   101,    80,    81,   102,     0,     0,
       0,     0,     0,     0,     0,     8,    83,    84,    85,    86,
       0,     0,    87,     0,    88,     0,     0,    89,     0,   149,
       0,   356,    90,     0,     0,     0,    91,     0,     0,    92,
       0,     0,     0,     0,    13,    93,     0,    94,    76,    77,
      95,    96,     0,     0,     0,    78,    79,     0,     0,    97,
       0,     0,    98,    99,     0,   100,     0,     0,     0,     0,
     101,    80,    81,   102,     0,     0,     0,     0,     0,     0,
       0,   150,    83,    84,    85,    86,     0,     0,    87,     0,
      88,     0,     0,    89,     0,    73,     0,    75,    90,     0,
       0,     0,    91,     0,     0,    92,     0,     0,     0,     0,
      13,    93,     0,    94,    76,    77,    95,    96,     0,     0,
       0,    78,    79,     0,     0,    97,     0,     0,    98,    99,
       0,   100,   712,     0,     0,     0,   101,    80,    81,   102,
       0,     0,     0,     0,     0,     0,     0,     8,    83,    84,
      85,    86,     0,     0,    87,     0,    88,     0,     0,    89,
       0,   149,     0,     0,    90,     0,   283,     0,    91,     0,
       0,    92,     0,     0,     0,     0,    13,    93,     0,    94,
      76,    77,    95,    96,     0,     0,     0,    78,    79,     0,
       0,    97,     0,     0,    98,    99,     0,   100,     0,     0,
       0,     0,   101,    80,    81,   102,     0,     0,     0,     0,
       0,     0,     0,   150,    83,    84,    85,    86,     0,     0,
      87,     0,    88,     0,     0,    89,     0,   149,   288,     0,
      90,     0,     0,     0,    91,     0,     0,    92,     0,     0,
       0,     0,    13,    93,     0,    94,    76,    77,    95,    96,
       0,     0,     0,    78,    79,     0,     0,    97,     0,     0,
      98,    99,     0,   100,     0,     0,     0,     0,   101,    80,
      81,   102,     0,     0,     0,     0,     0,     0,     0,   150,
      83,    84,    85,    86,     0,     0,    87,     0,    88,     0,
       0,    89,     0,   149,     0,   356,    90,     0,     0,     0,
      91,     0,     0,    92,     0,     0,     0,     0,    13,    93,
       0,    94,    76,    77,    95,    96,     0,     0,     0,    78,
      79,     0,     0,    97,     0,     0,    98,    99,     0,   100,
       0,     0,     0,     0,   101,    80,    81,   102,     0,     0,
       0,     0,     0,     0,     0,   150,    83,    84,    85,    86,
       0,     0,    87,     0,    88,     0,     0,    89,     0,   149,
       0,     0,    90,     0,   379,     0,    91,     0,     0,    92,
       0,     0,     0,     0,    13,    93,     0,    94,    76,    77,
      95,    96,     0,     0,     0,    78,    79,     0,     0,    97,
       0,     0,    98,    99,     0,   100,     0,     0,     0,     0,
     101,    80,    81,   102,     0,     0,     0,     0,     0,     0,
       0,   150,    83,    84,    85,    86,     0,     0,    87,     0,
      88,     0,     0,    89,     0,   149,     0,   368,    90,     0,
       0,     0,    91,     0,     0,    92,     0,     0,     0,     0,
      13,    93,     0,    94,    76,    77,    95,    96,     0,     0,
       0,    78,    79,     0,     0,    97,     0,     0,    98,    99,
       0,   100,     0,     0,     0,     0,   101,    80,    81,   102,
       0,     0,     0,     0,     0,     0,     0,   150,    83,    84,
      85,    86,     0,     0,    87,     0,    88,     0,     0,    89,
       0,   149,     0,     0,    90,     0,     0,     0,    91,   553,
       0,    92,     0,     0,     0,     0,    13,    93,     0,    94,
      76,    77,    95,    96,     0,     0,     0,    78,    79,     0,
       0,    97,     0,     0,    98,    99,     0,   100,     0,     0,
       0,     0,   101,    80,    81,   102,     0,     0,     0,     0,
       0,     0,     0,   150,    83,    84,    85,    86,     0,     0,
      87,     0,    88,     0,     0,    89,     0,   149,     0,     0,
      90,     0,     0,     0,    91,     0,     0,    92,     0,     0,
       0,     0,    13,    93,     0,    94,    76,    77,    95,    96,
       0,     0,     0,    78,    79,     0,     0,    97,     0,     0,
      98,    99,     0,   100,     0,     0,     0,     0,   101,    80,
      81,   102,     0,     0,     0,     0,     0,     0,     0,   150,
      83,    84,    85,    86,     0,     0,    87,     0,    88,     0,
       0,    89,     0,    73,     0,     0,    90,     0,     0,     0,
      91,     0,     0,    92,     0,     0,     0,     0,    13,    93,
       0,    94,    76,    77,    95,    96,     0,     0,     0,    78,
      79,     0,     0,    97,     0,     0,    98,    99,     0,   100,
       0,     0,     0,     0,   101,    80,    81,   102,     0,     0,
       0,     0,     0,     0,     0,     8,    83,    84,    85,    86,
       0,     0,    87,     0,    88,    73,     0,    89,     0,     0,
       0,     0,    90,     0,     0,     0,    91,     0,     0,    92,
      13,     0,     0,     0,     0,    93,     0,    94,     0,     0,
      95,    96,     0,     0,     0,     0,     0,     0,     0,    97,
       0,     0,    98,    99,     0,   100,     0,    80,    81,     0,
     101,     0,     0,   102,     0,     0,     0,     8,    83,    84,
      85,    86,     0,     0,    87,     0,    88,    73,     0,    89,
       0,     0,     0,     0,    90,     0,     0,     0,    91,     0,
       0,    92,    13,     0,     0,     0,     0,    93,     0,    94,
       0,     0,    95,    96,     0,     0,     0,     0,     0,     0,
       0,    97,     0,     0,    98,     0,     0,   100,     0,    80,
      81,     0,   101,     0,   315,   102,     0,     0,     0,     8,
      83,    84,    85,    86,     0,     0,    87,     0,    88,    73,
     744,    89,     0,     0,     0,     0,    90,     0,     0,     0,
      91,     0,     0,    92,    13,     0,     0,     0,     0,    93,
       0,    94,     0,     0,    95,    96,     0,     0,     0,     0,
       0,     0,     0,    97,     0,     0,    98,     0,     0,   100,
       0,     0,     0,     0,   101,     0,     0,   102,     0,     0,
       0,     8,    83,    84,    85,    86,     0,     0,    87,    73,
      88,     0,     0,    89,     0,     0,     0,     0,    90,     0,
       0,     0,    91,     0,    13,    92,     0,     0,     0,     0,
       0,    93,     0,    94,     0,     0,    95,    96,     0,     0,
       0,     0,     0,     0,     0,    97,     0,     0,    98,     0,
       0,   100,     0,     0,     0,     0,   101,     0,   315,   102,
       0,     8,    83,    84,    85,    86,   720,     0,    87,     0,
      88,     0,     0,    89,     0,     0,     0,     0,    90,     0,
      13,     0,    91,     0,     0,    92,     0,     0,   356,  -119,
       0,    93,     0,    94,   508,     0,    95,    96,     0,     0,
       0,    13,     0,     0,     0,    97,     0,     0,    98,     0,
       0,   100,     0,     0,     0,     0,   101,     8,   315,   102,
       0,     0,    14,     0,    87,     0,    88,   356,   533,    89,
       0,     0,    15,   508,    90,     0,     0,     0,     0,    16,
      13,    92,     0,    14,     0,     0,     0,    93,     0,    94,
       0,     0,     0,    15,    17,     0,    18,    19,    20,     0,
      16,    97,    21,    22,     0,     0,    23,     0,     0,     0,
      24,     0,     0,     0,     0,    17,    25,    18,    19,    20,
     356,   576,    14,   509,    22,     0,   508,    23,     0,     0,
       0,    24,    15,    13,     0,     0,     0,    25,     0,    16,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,    17,     0,    18,    19,    20,   356,
    -120,     0,   509,    22,     0,   508,    23,     0,     0,     0,
      24,     0,    13,     0,     0,    14,    25,     0,     0,     0,
     356,   625,     0,     0,     0,    15,   508,     0,     0,     0,
       0,     0,    16,    13,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    17,     0,    18,
      19,    20,     0,     0,    14,   509,    22,     0,     0,    23,
       0,     0,     0,    24,    15,     0,   356,   660,     0,    25,
       0,    16,   508,     0,     0,    14,     0,     0,     0,    13,
       0,     0,     0,     0,     0,    15,    17,     0,    18,    19,
      20,     0,    16,     0,   509,    22,     0,     0,    23,     0,
     329,     0,    24,     0,     0,     0,     0,    17,    25,    18,
      19,    20,    13,     0,     0,   509,    22,     0,     0,    23,
       0,    14,     0,    24,     0,     0,     0,     0,   404,    25,
       0,    15,     0,     0,     0,     0,     0,     0,    16,   417,
      13,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,    13,     0,    17,    14,    18,    19,    20,     0,     0,
       0,   509,    22,     0,    15,    23,     0,   528,     0,    24,
       0,    16,     0,     0,     0,    25,     0,     0,     0,    13,
       0,     0,    14,     0,     0,     0,    17,     0,    18,    19,
      20,     0,    15,    14,    21,    22,     0,     0,    23,    16,
       0,     0,    24,    15,     0,     0,     0,     0,    25,     0,
      16,     0,     0,     0,    17,     0,    18,    19,    20,     0,
       0,    14,    21,    22,     0,    17,    23,    18,    19,    20,
      24,    15,     0,    21,    22,     0,    25,    23,    16,    40,
     143,    24,     0,     0,     0,     0,     0,    25,     0,     0,
       0,     0,     0,    17,     0,    18,    19,    20,     0,     0,
       0,    21,    22,     0,     0,    23,     0,     0,     0,    24,
       0,     0,     0,     0,     0,    25,     8,     0,     0,     0,
       0,    14,     0,    87,     0,    88,     0,     0,    89,     0,
       0,    15,     0,    90,     0,    41,    40,   143,    16,     0,
      92,     0,     0,     0,     0,     0,    93,    42,    94,     0,
       0,     0,     0,    17,     0,    18,    19,    20,    43,     0,
      97,    21,    22,     0,     0,    23,     0,     0,     0,    24,
       0,     0,     0,   624,   519,    25,     0,     0,    14,     0,
      87,     0,    88,     0,     0,    89,     0,     0,    15,     0,
      90,    40,    41,     0,     0,    16,     0,    92,     0,     0,
       0,     0,     0,    93,    42,    94,     0,     0,     0,     0,
      17,     0,    18,    19,    20,    43,     0,    97,    21,    22,
       0,     0,    23,     0,     0,     0,    24,     0,     8,     0,
       0,   519,    25,    14,    13,    87,     0,    88,     0,     0,
      89,     0,     0,    15,     0,    90,     0,    41,     0,     0,
      16,     0,    92,     0,     0,     0,     0,     0,    93,    42,
      94,     0,     0,     0,     0,    17,     0,    18,    19,    20,
      43,     8,    97,    21,    22,     0,    14,    23,    87,    13,
      88,    24,     0,    89,     0,     0,    15,    25,    90,     0,
       0,     0,     0,    16,     0,    92,     0,     0,     0,     0,
       0,    93,     0,    94,     0,     0,     0,    13,    17,     0,
      18,    19,    20,     0,     0,    97,    21,    22,    13,     0,
      23,    14,     0,     0,    24,     0,     0,     0,     0,     0,
      25,    15,     0,     0,     0,    41,     0,     0,    16,     0,
       0,     0,     0,     0,     0,     0,     0,    42,     0,    14,
       0,     0,     0,    17,     0,    18,    19,    20,    43,    15,
      14,    21,    22,     0,     0,    23,    16,     0,     0,    24,
      15,     0,     1,     0,     0,    25,     0,    16,     0,     0,
       0,    17,     0,    18,    19,    20,     0,     0,     0,    21,
      22,     0,    17,    23,    18,    19,    20,    24,     0,     0,
      21,    22,   184,    25,    23,     0,   179,     0,    24,   185,
       0,     0,   -50,     0,    25,     0,     0,    13,   171,     0,
       0,     0,     0,     0,     0,     0,     0,  -378,     0,     0,
       0,     0,     0,  -378,  -378,  -378,  -378,  -378,  -378,  -378,
    -378,  -378,  -378,  -378,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,   -50
    };
  }

private static final short[] yycheck_ = yycheck_init();
  private static final short[] yycheck_init()
  {
    return new short[]
    {
       1,     2,    75,   453,   105,   185,   315,   579,     9,   172,
     173,   424,    13,   193,    62,   176,   177,   551,   356,    32,
     210,   368,   104,   558,    19,   585,   418,    75,    19,   190,
     276,     0,   193,   194,   241,     7,   613,   614,   440,    40,
     427,    19,    20,   651,   240,   651,    18,    55,    65,    66,
      14,   519,    11,    19,    32,    33,     7,    19,    55,    75,
      55,    62,    83,   248,    55,   250,    55,    18,     6,   151,
     330,   330,     5,    66,    75,    76,    77,    78,    79,    80,
      81,     6,    11,    55,     9,    78,   102,     5,   397,    55,
     172,    55,   100,    55,    95,    90,    55,   170,   511,    90,
     708,   707,     6,   185,    55,   102,    84,   102,    26,   686,
     687,   688,   275,    31,    83,   453,    76,    77,    78,    79,
      80,    81,   170,   536,    93,   371,    55,    65,    61,   516,
     147,   691,    70,   105,   278,   136,    54,   529,   710,   221,
     141,   543,   338,    61,   351,   405,   405,   615,   616,   617,
      55,   728,   499,    75,    72,    32,   691,   353,   418,   418,
     418,    65,    21,   697,   577,    28,    70,   702,     7,   170,
     171,   731,     7,   174,   102,    10,     0,   105,     6,    18,
     102,    86,    18,    18,   102,    62,   104,   105,   106,    28,
     108,   450,    55,   266,   112,    18,    55,   198,    75,   200,
     201,   202,   203,   204,   205,   206,   207,   208,   209,   210,
     211,   212,   213,   214,   215,   216,   217,   218,   266,    55,
     670,   689,   383,   408,   385,   143,   422,   423,   575,   392,
     374,   149,    55,   151,   247,   153,   237,    65,     5,   424,
     384,   775,    70,   244,   591,   389,   247,   585,    55,     7,
     510,   510,   510,   171,   172,   173,   216,   217,   218,   136,
      18,   451,   447,   181,    31,   266,     7,   411,     7,   529,
     529,   529,   273,     7,   534,   534,   534,    18,    14,    18,
       7,     7,   732,    90,    18,   510,     3,     7,    12,   598,
       7,    18,    18,   170,    61,    55,   698,    55,    18,   484,
      24,    18,    28,    55,   222,    72,   183,   709,   226,   534,
       4,    28,   230,    26,    55,     9,    55,    11,   768,    55,
      55,    55,   240,   396,   509,     4,   511,   428,   429,   330,
       9,   332,   670,    10,    47,    55,     4,   338,   523,    18,
       5,     9,    19,   391,   345,   683,    11,   348,   396,   350,
      55,   536,   356,   691,    68,     7,   274,   275,   276,   236,
       9,   551,   363,   364,   365,     5,    18,     7,   558,     3,
     247,    20,   774,     7,   776,   560,    10,     7,    18,   717,
      10,     4,   149,    13,    18,    19,     9,     9,    18,   266,
     391,    11,   577,   731,   732,   396,   273,     7,    20,   317,
      10,     4,    18,    13,   405,    19,     9,     7,    18,   811,
      10,    55,   330,   331,   415,    82,     3,   418,    18,    19,
     338,   339,   607,    10,     4,   343,   764,     4,    55,     6,
     768,    11,     9,     4,    11,   353,   440,   355,   356,    55,
      11,    10,     6,   587,    13,     9,    62,   365,    64,   453,
     451,    67,   102,   371,    11,   105,    72,     3,    28,   226,
     337,     7,     3,    79,    10,   650,   581,    13,   583,    85,
     585,    87,    18,    19,   392,   476,   477,     4,     7,    27,
     398,    10,     9,    99,    13,    48,     4,   405,   673,    18,
     408,     9,   410,    11,     4,    10,    11,   113,     4,     9,
     418,   419,    21,     9,   422,   423,   424,    10,    11,   510,
     428,   429,   702,    17,   677,   700,   517,     4,    49,   396,
      51,   522,   206,   207,   208,   209,   722,     3,   529,     3,
     691,     7,   450,   534,    10,   453,     5,    13,   415,   543,
       5,    55,    18,    19,    52,    53,    54,   551,    62,     9,
      64,    11,    75,    67,   431,    10,    11,   558,    72,    22,
      23,   643,   758,    24,   331,    79,   484,    45,    46,    45,
      46,    85,     3,    87,     5,   676,   343,    45,    46,    55,
       9,   585,    11,   501,     4,    99,   766,    24,   355,   356,
     770,    19,   510,   511,     9,   780,    11,     6,   112,    55,
     601,     9,   520,     7,   522,   766,     5,    18,    10,   770,
      10,   529,    45,    46,    18,    26,   534,   618,   536,   720,
      14,    15,    16,    75,    28,    11,    12,   771,   772,     9,
      34,    35,    36,    37,    38,    39,    40,    41,    42,    43,
      44,   408,   204,   205,    55,    75,     3,   565,   730,   214,
     215,    62,   419,    64,    55,     4,    67,   424,   759,   577,
      55,    72,   763,   807,   808,     8,   670,   585,    79,   211,
     212,   213,    68,    10,    85,    13,    87,    55,    68,   680,
     598,   754,   683,   601,   766,    55,   453,   691,    99,    55,
     691,    12,    55,   697,   698,    28,     9,    55,    18,   617,
     136,   702,   803,     5,    55,   709,   754,     5,     5,   141,
       9,    11,     8,     6,    17,    55,   717,   484,    62,    31,
     721,    11,     3,    12,     3,   643,     3,   731,   732,   647,
       3,    75,    76,    77,    78,    79,    80,    81,     3,   171,
      11,   618,   174,    11,   511,   746,     9,    55,    55,     3,
      55,     6,   670,   754,     5,    31,   115,     4,   676,   677,
      55,    11,    11,   764,   768,   683,    11,    11,    11,   536,
     774,   775,   776,   691,   210,    11,     6,     5,   210,   107,
      28,    55,     3,    55,     3,   703,    34,    35,    36,    37,
      38,    39,    40,    41,    42,    43,    44,     5,    12,   717,
      11,   802,   720,     9,   722,   237,    62,   811,   244,     4,
     577,   247,   730,   731,   732,   733,     4,     4,   585,    75,
      76,    77,    78,    79,    80,    81,   170,    66,     3,     9,
       4,   356,    24,    12,    12,    12,     3,   273,    11,    11,
     758,   759,     4,    78,    70,   763,   764,     4,    11,    73,
     768,     4,    11,    11,   198,    11,   200,   201,   202,   203,
     204,   205,   206,   207,   208,   209,    31,   211,   212,   213,
     214,   215,   216,   217,   218,   102,   105,   754,    11,    11,
       4,    11,    11,    38,    55,   803,    54,   680,   339,   236,
      95,    61,   484,   681,   330,   407,   422,   410,   330,   536,
     332,   502,   575,   670,   717,   758,   338,   764,   607,   405,
     450,   529,   348,   345,   170,   440,   699,   581,   350,   104,
     356,   106,   266,   108,   691,   583,   775,   112,   453,   654,
     702,   363,   364,   365,   391,   201,   703,   355,   365,    18,
     198,   200,   198,   203,   200,   201,   202,   203,   204,   205,
     206,   207,   208,   209,    -1,   211,   212,   213,   214,   215,
     216,   217,   218,     0,   731,   732,   151,    -1,   153,   405,
     202,   178,   179,   405,    -1,    -1,    55,   184,    -1,   415,
      -1,    18,   418,    62,    -1,    64,   418,    -1,    67,    -1,
     197,    -1,    -1,    72,    -1,    55,   181,    -1,    -1,    -1,
      79,   768,    62,    -1,    64,    -1,    85,    67,    87,    -1,
     266,    -1,    72,    -1,    -1,   451,    -1,   453,   543,    79,
      99,    -1,    -1,    60,   356,    85,   551,    87,    -1,    -1,
      -1,    -1,    -1,    70,   113,    -1,    -1,   222,    -1,    99,
      77,   248,    -1,   250,   476,   477,    83,   391,    -1,    -1,
      18,    -1,   396,    -1,    -1,    92,   263,    94,    95,    96,
     585,    -1,    -1,   100,   101,    -1,    -1,   104,    -1,    -1,
      -1,   108,    -1,    -1,   510,    -1,    -1,   114,    -1,    -1,
     287,    -1,    -1,    -1,    -1,   517,   522,    55,    -1,   274,
     522,   276,   356,   529,    62,    -1,    64,   529,   534,    67,
      -1,    -1,    -1,    -1,    72,    -1,    -1,    -1,   440,    -1,
      18,    79,    20,    -1,    -1,   551,    -1,    85,    26,    87,
      -1,   453,   558,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    99,   317,    -1,    -1,   391,    -1,    -1,    -1,    -1,
     396,    18,    -1,    -1,   112,   670,    -1,    55,    -1,   585,
      -1,    -1,    -1,    -1,    62,    -1,    64,    -1,    -1,    67,
     356,   368,    -1,    -1,    72,   601,   691,    -1,   353,   601,
      -1,    79,   697,   698,    -1,   382,   440,    85,    55,    87,
     356,    -1,   618,    -1,   709,    62,   371,    64,    -1,   453,
      67,    99,    19,    -1,    -1,    72,    -1,    -1,    -1,    -1,
      -1,    -1,    79,    -1,    -1,    -1,   731,   732,    85,   356,
      87,   543,    -1,   398,   558,    -1,    -1,    -1,    -1,   551,
      -1,    -1,    99,    -1,    -1,    -1,    -1,    -1,    55,    -1,
     437,    -1,    -1,    -1,   670,    62,   443,    64,   423,   446,
      67,    -1,   449,   768,   440,    72,    -1,   683,   680,   774,
     775,   776,    79,   585,    -1,   691,    -1,   453,    85,    -1,
      87,    -1,    -1,    -1,   440,    -1,   702,    -1,    -1,    -1,
      -1,    -1,    99,    -1,    -1,    -1,    -1,   453,    -1,   543,
      -1,   717,    -1,    -1,    -1,   721,   811,   551,    -1,    -1,
     356,    -1,   499,   440,    -1,   731,   732,    -1,    -1,    -1,
      -1,    -1,   558,    -1,    -1,    -1,   453,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,   746,    -1,   501,    -1,    -1,    -1,
      -1,   585,    -1,    -1,    -1,    -1,    -1,    -1,   764,    -1,
      -1,    -1,   768,    -1,    -1,   520,    -1,    -1,   670,    -1,
      -1,    -1,    -1,    -1,    -1,   552,    -1,   543,   555,   556,
      -1,    -1,    -1,    -1,   561,   551,    -1,    -1,   702,   691,
      -1,    -1,    -1,    -1,    -1,   697,   698,   543,   575,    -1,
     802,    -1,    -1,    -1,   440,   551,    -1,   709,    -1,    -1,
     565,    -1,    -1,    -1,    -1,    -1,    -1,   453,    -1,   585,
      -1,    -1,    -1,    -1,    -1,    -1,   543,    -1,    -1,   731,
     732,    -1,    -1,    18,   551,    -1,   670,    -1,    -1,   585,
     754,    26,    -1,   598,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,   630,    -1,    -1,    -1,   691,    -1,    -1,
      -1,    -1,   617,   697,   698,    -1,   768,    -1,   585,    -1,
      55,    -1,   774,   775,   776,   709,   702,    62,    -1,    64,
      -1,    -1,    67,    -1,    -1,    -1,    -1,    72,   643,    -1,
      -1,    -1,   647,    -1,    79,    -1,   673,   731,   732,    -1,
      85,    -1,    87,    -1,   670,    -1,    -1,   543,    -1,   811,
      -1,    -1,    -1,    -1,    99,   551,    -1,   694,   695,   696,
      -1,    -1,    -1,    -1,   670,   691,    -1,    -1,   754,    -1,
      -1,   697,   698,    -1,   768,   712,    -1,    -1,    -1,    -1,
     774,   775,   776,   709,    -1,   691,     0,    -1,    -1,   585,
      -1,   697,   698,   670,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,   709,    18,   731,   732,   722,    -1,    -1,
      -1,    -1,    -1,    -1,   691,   730,    -1,   811,   733,    -1,
     697,   698,    -1,    -1,    -1,   731,   732,    55,    -1,    -1,
      -1,    -1,   709,    -1,    62,    -1,    64,    -1,    -1,    67,
      -1,    -1,   768,   758,    72,    -1,    60,    -1,   774,   775,
     776,    79,    -1,    -1,   731,   732,    70,    85,    -1,    87,
      -1,    -1,   768,    77,    -1,    -1,    -1,    -1,   774,   775,
     776,    99,    -1,    -1,   670,    -1,    -1,    -1,    92,    -1,
      94,    95,    96,    -1,   112,   811,   100,   101,    -1,    -1,
     104,   768,    -1,    -1,   108,   691,    -1,   774,   775,   776,
     114,   697,   698,    -1,    -1,   811,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,   709,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    60,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    70,    -1,   811,   731,   732,    -1,     1,    77,
       3,    -1,     5,     6,    -1,    -1,    -1,    -1,    11,    -1,
      -1,    -1,    -1,    -1,    92,    18,    94,    95,    96,    -1,
      -1,    -1,   100,   101,    -1,    -1,   104,    -1,    -1,    -1,
     108,    -1,   768,    -1,    -1,    -1,   114,    -1,   774,   775,
     776,    -1,    45,    46,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    55,    56,    57,    58,    59,    60,    61,    62,
      63,    64,    65,    -1,    67,    68,    69,    70,    71,    72,
      -1,    74,    -1,    76,    77,   811,    79,    80,    81,    -1,
      -1,    -1,    85,    86,    87,    -1,    -1,    90,    91,    92,
      -1,    94,    95,    96,    97,    98,    99,   100,   101,   102,
     103,   104,   105,   106,    -1,   108,    -1,   110,   111,   112,
     113,   114,   115,   116,     1,    -1,     3,    -1,     5,     6,
      -1,    -1,    -1,    -1,    11,    -1,    -1,    28,    -1,    -1,
      -1,    18,    19,    34,    35,    36,    37,    38,    39,    40,
      41,    42,    43,    44,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,    46,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,
      57,    58,    59,    60,    61,    62,    63,    64,    -1,    -1,
      67,    68,    69,    70,    71,    72,    -1,    74,    -1,    76,
      77,    -1,    79,    80,    81,    -1,    -1,    -1,    85,    86,
      87,    -1,    -1,    90,    91,    92,    -1,    94,    95,    96,
      97,    98,    99,   100,   101,   102,   103,   104,   105,   106,
      -1,   108,    -1,   110,   111,   112,   113,   114,   115,   116,
       1,    -1,     3,    -1,     5,     6,    -1,    -1,    -1,    -1,
      11,    -1,    -1,    -1,    -1,    -1,    -1,    18,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    45,    46,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,    60,
      61,    62,    63,    64,    -1,    -1,    67,    68,    69,    70,
      71,    72,    -1,    74,    -1,    76,    77,    -1,    79,    80,
      81,    -1,    -1,    -1,    85,    86,    87,    -1,    -1,    90,
      91,    92,    -1,    94,    95,    96,    97,    98,    99,   100,
     101,   102,   103,   104,   105,   106,    -1,   108,    -1,   110,
     111,   112,   113,   114,   115,   116,     1,    -1,     3,    -1,
       5,     6,    -1,    -1,    -1,    -1,    11,    -1,    -1,    -1,
      -1,    -1,    -1,    18,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      45,    46,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      55,    56,    57,    58,    59,    60,    61,    62,    63,    64,
      -1,    -1,    67,    68,    69,    70,    71,    72,    -1,    74,
      -1,    76,    77,    -1,    79,    80,    81,    -1,    -1,    -1,
      85,    86,    87,    -1,    -1,    90,    91,    92,    -1,    94,
      95,    96,    97,    98,    99,   100,   101,   102,   103,   104,
     105,   106,    -1,   108,    -1,   110,   111,   112,   113,   114,
     115,   116,     1,    -1,     3,    -1,     5,    -1,    -1,    -1,
      -1,    -1,    11,    -1,    -1,    -1,    -1,    -1,    -1,    18,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    45,    46,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,
      59,    60,    61,    62,    63,    64,    65,    -1,    67,    68,
      69,    70,    71,    72,    -1,    74,    -1,    76,    77,    -1,
      79,    80,    81,    -1,    -1,    -1,    85,    86,    87,    -1,
      -1,    90,    91,    92,    -1,    94,    95,    96,    97,    98,
      99,   100,   101,   102,   103,   104,   105,   106,    -1,   108,
      -1,   110,   111,   112,   113,   114,   115,   116,     1,    -1,
       3,    -1,     5,     6,    -1,    -1,    -1,    -1,    11,    -1,
      -1,    -1,    -1,    -1,    -1,    18,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    45,    46,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    55,    56,    57,    58,    59,    60,    61,    62,
      63,    64,    -1,    -1,    67,    68,    69,    70,    71,    72,
      -1,    74,    -1,    76,    77,    -1,    79,    80,    81,    -1,
      -1,    -1,    85,    86,    87,    -1,    -1,    90,    91,    92,
      -1,    94,    95,    96,    97,    98,    99,   100,   101,   102,
     103,   104,   105,   106,    -1,   108,    -1,   110,   111,   112,
     113,   114,   115,   116,     1,    -1,     3,    -1,     5,     6,
      -1,    -1,    -1,    -1,    11,    -1,    -1,    -1,    -1,    -1,
      -1,    18,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,    46,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,
      57,    58,    59,    60,    61,    62,    63,    64,    -1,    -1,
      67,    68,    69,    70,    71,    72,    -1,    74,    -1,    76,
      77,    -1,    79,    80,    81,    -1,    -1,    -1,    85,    86,
      87,    -1,    -1,    90,    91,    92,    -1,    94,    95,    96,
      97,    98,    99,   100,   101,   102,   103,   104,   105,   106,
      -1,   108,    -1,   110,   111,   112,   113,   114,   115,   116,
       1,    -1,     3,    -1,     5,     6,    -1,    -1,    -1,    -1,
      11,    -1,    -1,    -1,    -1,    -1,    -1,    18,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    45,    46,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,    60,
      61,    62,    63,    64,    -1,    -1,    67,    68,    69,    70,
      71,    72,    -1,    74,    -1,    76,    77,    -1,    79,    80,
      81,    -1,    -1,    -1,    85,    86,    87,    -1,    -1,    90,
      91,    92,    -1,    94,    95,    96,    97,    98,    99,   100,
     101,   102,   103,   104,   105,   106,    -1,   108,    -1,   110,
     111,   112,   113,   114,   115,   116,     1,    -1,     3,    -1,
       5,    -1,    -1,    -1,    -1,    -1,    11,    -1,    -1,    -1,
      -1,    -1,    -1,    18,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      45,    46,     0,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      55,    56,    57,    58,    59,    -1,    61,    62,    63,    64,
      18,    -1,    67,    -1,    69,    -1,    71,    72,    -1,    -1,
      -1,    76,    -1,    -1,    79,    80,    81,    -1,    -1,    -1,
      85,    -1,    87,    -1,    -1,    90,    91,    -1,    -1,    -1,
      -1,    -1,    -1,    98,    99,    -1,    -1,   102,   103,   104,
     105,   106,    60,    -1,    -1,   110,   111,    -1,   113,    -1,
     115,   116,    70,    -1,    -1,    -1,    -1,    -1,    -1,    77,
      -1,    -1,    -1,    -1,    -1,     3,     4,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    92,    -1,    94,    95,    96,    -1,
      18,    -1,   100,   101,    22,    23,   104,    -1,    -1,    -1,
     108,    29,    30,    -1,    -1,    -1,   114,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    45,    46,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,
      58,    59,    60,    -1,    62,    -1,    64,    -1,    -1,    67,
      -1,    18,    70,    -1,    72,    -1,    -1,    -1,    76,    77,
      -1,    79,    -1,    -1,    -1,    -1,    -1,    85,    -1,    87,
      -1,    -1,    90,    91,    92,    -1,    94,    95,    96,    -1,
      -1,    99,   100,   101,   102,   103,   104,   105,    -1,    -1,
     108,    -1,   110,    60,    -1,   113,   114,     3,     4,     5,
      -1,    -1,    -1,    70,    -1,    -1,    -1,    74,    -1,    -1,
      77,    -1,    18,    -1,    -1,    -1,    22,    23,    -1,    86,
      -1,    -1,    -1,    29,    30,    92,    -1,    94,    95,    96,
      97,    -1,    -1,   100,   101,    -1,    -1,   104,    -1,    45,
      46,   108,    -1,    -1,    -1,    -1,    -1,   114,    -1,    55,
      56,    57,    58,    59,    -1,    -1,    62,    -1,    64,    -1,
      -1,    67,    -1,     3,    -1,     5,    72,    -1,    -1,     9,
      76,    -1,    -1,    79,    -1,    -1,    -1,    -1,    18,    85,
      -1,    87,    22,    23,    90,    91,    -1,    -1,    -1,    29,
      30,    -1,    -1,    99,    -1,    -1,   102,   103,    -1,   105,
      -1,    -1,    -1,    -1,   110,    45,    46,   113,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    55,    56,    57,    58,    59,
      -1,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,     3,
      -1,     5,    72,    -1,    -1,    -1,    76,    -1,    -1,    79,
      -1,    -1,    -1,    -1,    18,    85,    -1,    87,    22,    23,
      90,    91,    -1,    -1,    -1,    29,    30,    -1,    -1,    99,
      -1,    -1,   102,   103,    -1,   105,    -1,    -1,    -1,    -1,
     110,    45,    46,   113,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    55,    56,    57,    58,    59,    -1,    -1,    62,    -1,
      64,    -1,    -1,    67,    -1,     3,    -1,     5,    72,    -1,
      -1,    -1,    76,    -1,    -1,    79,    -1,    -1,    -1,    -1,
      18,    85,    -1,    87,    22,    23,    90,    91,    -1,    -1,
      -1,    29,    30,    -1,    -1,    99,    -1,    -1,   102,   103,
      -1,   105,   106,    -1,    -1,    -1,   110,    45,    46,   113,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    55,    56,    57,
      58,    59,    -1,    -1,    62,    -1,    64,    -1,    -1,    67,
      -1,     3,    -1,    -1,    72,    -1,     8,    -1,    76,    -1,
      -1,    79,    -1,    -1,    -1,    -1,    18,    85,    -1,    87,
      22,    23,    90,    91,    -1,    -1,    -1,    29,    30,    -1,
      -1,    99,    -1,    -1,   102,   103,    -1,   105,    -1,    -1,
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
      -1,     3,    -1,    -1,    72,    -1,    -1,    -1,    76,    11,
      -1,    79,    -1,    -1,    -1,    -1,    18,    85,    -1,    87,
      22,    23,    90,    91,    -1,    -1,    -1,    29,    30,    -1,
      -1,    99,    -1,    -1,   102,   103,    -1,   105,    -1,    -1,
      -1,    -1,   110,    45,    46,   113,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    55,    56,    57,    58,    59,    -1,    -1,
      62,    -1,    64,    -1,    -1,    67,    -1,     3,    -1,    -1,
      72,    -1,    -1,    -1,    76,    -1,    -1,    79,    -1,    -1,
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
      -1,    -1,    62,    -1,    64,     3,    -1,    67,    -1,    -1,
      -1,    -1,    72,    -1,    -1,    -1,    76,    -1,    -1,    79,
      18,    -1,    -1,    -1,    -1,    85,    -1,    87,    -1,    -1,
      90,    91,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    99,
      -1,    -1,   102,   103,    -1,   105,    -1,    45,    46,    -1,
     110,    -1,    -1,   113,    -1,    -1,    -1,    55,    56,    57,
      58,    59,    -1,    -1,    62,    -1,    64,     3,    -1,    67,
      -1,    -1,    -1,    -1,    72,    -1,    -1,    -1,    76,    -1,
      -1,    79,    18,    -1,    -1,    -1,    -1,    85,    -1,    87,
      -1,    -1,    90,    91,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    99,    -1,    -1,   102,    -1,    -1,   105,    -1,    45,
      46,    -1,   110,    -1,   112,   113,    -1,    -1,    -1,    55,
      56,    57,    58,    59,    -1,    -1,    62,    -1,    64,     3,
       4,    67,    -1,    -1,    -1,    -1,    72,    -1,    -1,    -1,
      76,    -1,    -1,    79,    18,    -1,    -1,    -1,    -1,    85,
      -1,    87,    -1,    -1,    90,    91,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    99,    -1,    -1,   102,    -1,    -1,   105,
      -1,    -1,    -1,    -1,   110,    -1,    -1,   113,    -1,    -1,
      -1,    55,    56,    57,    58,    59,    -1,    -1,    62,     3,
      64,    -1,    -1,    67,    -1,    -1,    -1,    -1,    72,    -1,
      -1,    -1,    76,    -1,    18,    79,    -1,    -1,    -1,    -1,
      -1,    85,    -1,    87,    -1,    -1,    90,    91,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    99,    -1,    -1,   102,    -1,
      -1,   105,    -1,    -1,    -1,    -1,   110,    -1,   112,   113,
      -1,    55,    56,    57,    58,    59,     4,    -1,    62,    -1,
      64,    -1,    -1,    67,    -1,    -1,    -1,    -1,    72,    -1,
      18,    -1,    76,    -1,    -1,    79,    -1,    -1,     5,     6,
      -1,    85,    -1,    87,    11,    -1,    90,    91,    -1,    -1,
      -1,    18,    -1,    -1,    -1,    99,    -1,    -1,   102,    -1,
      -1,   105,    -1,    -1,    -1,    -1,   110,    55,   112,   113,
      -1,    -1,    60,    -1,    62,    -1,    64,     5,     6,    67,
      -1,    -1,    70,    11,    72,    -1,    -1,    -1,    -1,    77,
      18,    79,    -1,    60,    -1,    -1,    -1,    85,    -1,    87,
      -1,    -1,    -1,    70,    92,    -1,    94,    95,    96,    -1,
      77,    99,   100,   101,    -1,    -1,   104,    -1,    -1,    -1,
     108,    -1,    -1,    -1,    -1,    92,   114,    94,    95,    96,
       5,     6,    60,   100,   101,    -1,    11,   104,    -1,    -1,
      -1,   108,    70,    18,    -1,    -1,    -1,   114,    -1,    77,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    92,    -1,    94,    95,    96,     5,
       6,    -1,   100,   101,    -1,    11,   104,    -1,    -1,    -1,
     108,    -1,    18,    -1,    -1,    60,   114,    -1,    -1,    -1,
       5,     6,    -1,    -1,    -1,    70,    11,    -1,    -1,    -1,
      -1,    -1,    77,    18,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    92,    -1,    94,
      95,    96,    -1,    -1,    60,   100,   101,    -1,    -1,   104,
      -1,    -1,    -1,   108,    70,    -1,     5,     6,    -1,   114,
      -1,    77,    11,    -1,    -1,    60,    -1,    -1,    -1,    18,
      -1,    -1,    -1,    -1,    -1,    70,    92,    -1,    94,    95,
      96,    -1,    77,    -1,   100,   101,    -1,    -1,   104,    -1,
       6,    -1,   108,    -1,    -1,    -1,    -1,    92,   114,    94,
      95,    96,    18,    -1,    -1,   100,   101,    -1,    -1,   104,
      -1,    60,    -1,   108,    -1,    -1,    -1,    -1,     6,   114,
      -1,    70,    -1,    -1,    -1,    -1,    -1,    -1,    77,     6,
      18,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    18,    -1,    92,    60,    94,    95,    96,    -1,    -1,
      -1,   100,   101,    -1,    70,   104,    -1,     6,    -1,   108,
      -1,    77,    -1,    -1,    -1,   114,    -1,    -1,    -1,    18,
      -1,    -1,    60,    -1,    -1,    -1,    92,    -1,    94,    95,
      96,    -1,    70,    60,   100,   101,    -1,    -1,   104,    77,
      -1,    -1,   108,    70,    -1,    -1,    -1,    -1,   114,    -1,
      77,    -1,    -1,    -1,    92,    -1,    94,    95,    96,    -1,
      -1,    60,   100,   101,    -1,    92,   104,    94,    95,    96,
     108,    70,    -1,   100,   101,    -1,   114,   104,    77,    18,
      19,   108,    -1,    -1,    -1,    -1,    -1,   114,    -1,    -1,
      -1,    -1,    -1,    92,    -1,    94,    95,    96,    -1,    -1,
      -1,   100,   101,    -1,    -1,   104,    -1,    -1,    -1,   108,
      -1,    -1,    -1,    -1,    -1,   114,    55,    -1,    -1,    -1,
      -1,    60,    -1,    62,    -1,    64,    -1,    -1,    67,    -1,
      -1,    70,    -1,    72,    -1,    74,    18,    19,    77,    -1,
      79,    -1,    -1,    -1,    -1,    -1,    85,    86,    87,    -1,
      -1,    -1,    -1,    92,    -1,    94,    95,    96,    97,    -1,
      99,   100,   101,    -1,    -1,   104,    -1,    -1,    -1,   108,
      -1,    -1,    -1,    55,   113,   114,    -1,    -1,    60,    -1,
      62,    -1,    64,    -1,    -1,    67,    -1,    -1,    70,    -1,
      72,    18,    74,    -1,    -1,    77,    -1,    79,    -1,    -1,
      -1,    -1,    -1,    85,    86,    87,    -1,    -1,    -1,    -1,
      92,    -1,    94,    95,    96,    97,    -1,    99,   100,   101,
      -1,    -1,   104,    -1,    -1,    -1,   108,    -1,    55,    -1,
      -1,   113,   114,    60,    18,    62,    -1,    64,    -1,    -1,
      67,    -1,    -1,    70,    -1,    72,    -1,    74,    -1,    -1,
      77,    -1,    79,    -1,    -1,    -1,    -1,    -1,    85,    86,
      87,    -1,    -1,    -1,    -1,    92,    -1,    94,    95,    96,
      97,    55,    99,   100,   101,    -1,    60,   104,    62,    18,
      64,   108,    -1,    67,    -1,    -1,    70,   114,    72,    -1,
      -1,    -1,    -1,    77,    -1,    79,    -1,    -1,    -1,    -1,
      -1,    85,    -1,    87,    -1,    -1,    -1,    18,    92,    -1,
      94,    95,    96,    -1,    -1,    99,   100,   101,    18,    -1,
     104,    60,    -1,    -1,   108,    -1,    -1,    -1,    -1,    -1,
     114,    70,    -1,    -1,    -1,    74,    -1,    -1,    77,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    86,    -1,    60,
      -1,    -1,    -1,    92,    -1,    94,    95,    96,    97,    70,
      60,   100,   101,    -1,    -1,   104,    77,    -1,    -1,   108,
      70,    -1,    83,    -1,    -1,   114,    -1,    77,    -1,    -1,
      -1,    92,    -1,    94,    95,    96,    -1,    -1,    -1,   100,
     101,    -1,    92,   104,    94,    95,    96,   108,    -1,    -1,
     100,   101,     3,   114,   104,    -1,     7,    -1,   108,    10,
      -1,    -1,    13,    -1,   114,    -1,    -1,    18,    19,    -1,
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
     191,   192,   200,   126,   123,   125,   291,    10,    11,    14,
      55,   129,     3,    86,    55,    55,    55,    68,   134,    14,
      11,   132,   133,     3,     4,     5,    22,    23,    29,    30,
      45,    46,    55,    56,    57,    58,    59,    62,    64,    67,
      72,    76,    79,    85,    87,    90,    91,    99,   102,   103,
     105,   110,   113,   121,   122,   135,   136,   137,   243,   244,
     245,   251,   252,   253,   256,   257,   268,   270,   271,   272,
     273,   274,   275,   276,   277,   278,   279,   280,   281,   282,
     283,   284,   285,   286,   287,   288,   290,   291,   292,   293,
      55,    82,   146,    19,   140,   141,   140,    55,    11,     3,
      55,   122,   251,   252,   259,   260,   261,   264,   265,   266,
     268,     9,   293,   294,   281,   281,   281,   281,   281,   281,
      28,    19,   122,   137,   247,   248,    10,    13,     3,     7,
     188,   189,   190,   290,     3,    10,   190,   248,   254,    10,
      13,   188,   190,    10,    13,   190,   190,    26,    47,   269,
      48,    21,    27,    17,    49,    51,    19,    20,    32,    33,
      84,    52,    53,    54,    22,    23,    14,    15,    16,    45,
      46,   122,   136,     4,     9,     4,     5,   201,   135,   147,
       5,   159,    55,   142,   143,   144,   290,    75,   193,   194,
       3,   165,   140,     4,   123,   262,   263,   290,    24,     4,
      24,    28,    34,    35,    36,    37,    38,    39,    40,    41,
      42,    43,    44,   267,     6,     6,     9,   293,    20,    26,
     135,   249,   250,   290,   189,   248,   189,   135,   246,    55,
     247,   247,   259,     8,   259,    10,   190,     7,     4,   255,
     259,    90,   102,   245,   248,   102,   105,   247,    10,    55,
     245,   247,   247,   259,   271,   272,   273,   274,   275,   276,
     276,   278,   278,   278,   278,   112,   135,   136,   209,   242,
     279,   279,   279,   280,   280,   281,   281,   281,    55,     6,
     123,   202,     9,   160,   161,   162,   289,   290,    75,     9,
      20,   144,   135,     5,   195,     9,   166,   167,   289,   146,
      75,   145,   112,   136,     4,     9,     5,   206,   259,   206,
     259,   259,   293,    75,   102,     9,    20,    26,     5,   176,
     258,   189,   258,   254,    55,    55,     4,     8,    68,     8,
     259,     4,     9,    10,    55,    13,    55,    90,    68,    55,
      55,    12,    55,   172,   173,   172,    28,   135,   136,   138,
     191,   198,   203,   204,     6,   123,   135,     9,    11,   163,
       9,    55,   135,   148,   289,   290,   143,     6,   123,   196,
     135,     4,     9,   136,     5,   168,   135,   146,    55,    55,
     289,   290,   263,     1,     6,    11,    55,    61,    63,    69,
      71,    80,    81,    98,   103,   104,   106,   111,   115,   116,
     123,   124,   206,   207,   208,   209,   210,   211,   212,   213,
     214,   224,   225,   226,   231,   244,   253,   265,   282,   283,
     285,   286,   287,   135,   135,   250,    75,   102,   176,   177,
     178,   179,   259,   258,     5,   149,   150,   254,     5,   216,
       8,   259,    55,   247,   254,   247,   254,   260,   268,    28,
     174,   189,     9,   293,   172,    55,   203,   163,    11,   100,
     123,   151,   152,   206,     6,   162,   254,    17,    55,   113,
     136,   138,   141,   181,   191,   197,   198,   199,     6,   123,
     167,    55,   289,     6,   123,   152,   169,   170,   150,   188,
     188,    31,    11,    12,   259,    11,    55,    11,    55,   104,
     210,     3,     3,    11,   259,     3,     3,   259,     3,   206,
     239,     3,   259,   138,   192,   136,   209,     6,   208,    11,
      11,   135,   135,     6,     9,     9,     6,   151,     6,    65,
      70,   217,   218,   219,   220,   221,   222,    55,    55,   176,
     259,    28,   175,   173,    11,     3,     6,   206,   136,   138,
     140,   141,   153,   154,   155,   171,   180,   181,   191,   152,
     150,   135,    55,   182,   182,   113,   135,   136,   290,    11,
     187,   206,   197,    31,    55,     6,   170,    55,   210,    11,
      12,    11,    11,   115,   209,   213,   227,   229,   259,    11,
     259,   259,    11,   122,   209,   240,   241,   243,   251,    66,
      78,   233,   234,   238,   206,   259,    11,    11,     6,   179,
       6,   223,   264,     6,   218,   222,     6,   220,   222,    70,
     207,   222,    12,    24,   254,   176,     4,    55,   172,    55,
     107,   186,   187,     3,   186,   186,   182,   182,   182,   113,
      55,     5,   156,   259,     3,    12,    11,     9,     4,     4,
       4,     4,    11,     3,   206,   234,   238,   232,   233,     4,
       9,    12,   106,   206,   259,   188,    11,     3,   147,   156,
       4,   124,   136,   183,   184,   186,   186,   186,   182,     6,
     122,   157,   207,   243,   247,    11,   259,   259,   228,   259,
     213,   210,   216,   206,     4,   241,   123,   235,   237,   238,
     210,   264,   259,    11,    70,   205,   183,   188,   136,    55,
     105,   185,   289,     4,     9,   186,    10,     6,   207,     6,
      10,   102,   105,     4,     4,    11,    73,   215,   135,   236,
       4,    11,   293,    11,     4,   185,    10,   188,    31,   188,
     184,   247,   248,     6,   247,   254,   254,    11,   210,   229,
     230,   210,    21,    55,   206,   105,    55,   102,   102,    11,
      11,     4,   135,   188,   254,   254,   210,    11,    11
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
     169,   169,   170,   170,   171,   172,   172,   173,   173,   174,
     174,   174,   175,   175,   176,   176,   177,   177,   178,   178,
     179,   179,   180,   181,   181,   181,   181,   181,   181,   182,
     182,   183,   183,   184,   184,   185,   185,   185,   185,   186,
     186,   187,   187,   188,   188,   189,   189,   190,   190,   190,
     190,   191,   191,   192,   193,   193,   194,   194,   195,   195,
     196,   196,   197,   197,   197,   197,   198,   199,   200,   201,
     201,   202,   202,   203,   203,   203,   203,   204,   205,   205,
     206,   206,   207,   207,   208,   208,   208,   208,   208,   209,
     209,   210,   210,   210,   210,   210,   211,   211,   211,   211,
     211,   211,   211,   211,   211,   211,   211,   211,   211,   211,
     211,   211,   211,   211,   211,   211,   211,   212,   213,   213,
     213,   213,   213,   213,   213,   214,   215,   215,   216,   216,
     216,   217,   217,   218,   218,   218,   219,   219,   220,   221,
     221,   222,   222,   223,   223,   224,   225,   225,   226,   227,
     227,   227,   228,   228,   229,   229,   230,   230,   231,   232,
     232,   233,   233,   234,   235,   236,   236,   237,   237,   238,
     239,   239,   240,   240,   241,   241,   242,   243,   243,   243,
     243,   243,   243,   243,   243,   243,   243,   243,   243,   244,
     244,   244,   245,   246,   247,   247,   248,   248,   249,   249,
     250,   250,   250,   250,   250,   250,   250,   251,   251,   251,
     252,   252,   252,   253,   253,   253,   253,   253,   254,   254,
     255,   255,   256,   256,   256,   256,   256,   257,   257,   257,
     258,   258,   259,   259,   260,   260,   260,   260,   261,   261,
     262,   262,   263,   263,   263,   264,   264,   265,   266,   266,
     266,   267,   267,   267,   267,   267,   267,   267,   267,   267,
     267,   267,   267,   268,   269,   269,   269,   270,   270,   271,
     271,   272,   272,   273,   273,   274,   274,   275,   275,   275,
     276,   276,   276,   276,   276,   276,   277,   277,   278,   278,
     278,   278,   279,   279,   279,   280,   280,   280,   280,   281,
     281,   281,   281,   281,   282,   283,   284,   284,   284,   284,
     285,   285,   285,   285,   286,   287,   288,   289,   289,   290,
     290,   291,   291,   291,   291,   292,   292,   293,   293,   293,
     293,   294,   294,   294
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
       1,     2,     1,     3,     3,     1,     3,     2,     3,     0,
       2,     2,     0,     2,     3,     4,     0,     1,     1,     3,
       1,     1,     2,     4,     5,     4,     4,     3,     3,     4,
       5,     1,     3,     3,     2,     2,     3,     1,     3,     0,
       2,     1,     1,     0,     1,     1,     2,     2,     3,     3,
       4,     1,     1,     5,     0,     1,     2,     3,     2,     3,
       2,     3,     1,     1,     1,     1,     3,     2,     4,     2,
       3,     2,     3,     1,     1,     1,     1,     7,     0,     2,
       2,     3,     1,     2,     2,     2,     3,     2,     1,     2,
       2,     1,     1,     1,     1,     1,     1,     1,     2,     3,
       5,     5,     7,     2,     3,     2,     3,     2,     3,     5,
       3,     3,     3,     4,     3,     5,     2,     3,     1,     1,
       1,     1,     1,     1,     1,     6,     0,     2,     2,     3,
       3,     1,     2,     4,     3,     5,     1,     2,     2,     2,
       3,     2,     1,     1,     3,     5,     1,     1,     9,     0,
       1,     1,     0,     1,     1,     3,     0,     1,     7,     0,
       1,     1,     2,     5,     4,     1,     3,     0,     1,     2,
       3,     4,     1,     3,     1,     1,     1,     1,     4,     4,
       1,     3,     3,     1,     1,     1,     1,     1,     1,     1,
       3,     3,     5,     1,     0,     1,     2,     3,     1,     3,
       1,     1,     3,     3,     2,     4,     4,     3,     3,     5,
       2,     2,     2,     2,     5,     5,     5,     7,     2,     3,
       1,     3,     4,     4,     4,     6,     4,     4,     4,     5,
       0,     1,     1,     1,     3,     3,     3,     3,     2,     3,
       1,     3,     4,     4,     5,     1,     1,     3,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     2,     0,     4,     4,     1,     3,     1,
       3,     1,     3,     1,     3,     1,     3,     1,     3,     3,
       1,     3,     3,     3,     3,     1,     3,     3,     1,     3,
       3,     3,     1,     3,     3,     1,     3,     3,     3,     1,
       1,     2,     2,     1,     2,     2,     1,     2,     2,     1,
       1,     1,     1,     1,     2,     2,     5,     0,     1,     1,
       2,     2,     4,     5,     5,     3,     5,     1,     3,     3,
       1,     0,     1,     3
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


  private static final int YYLAST_ = 4634;
  private static final int YYEMPTY_ = -2;
  private static final int YYFINAL_ = 12;
  private static final int YYNTOKENS_ = 120;

/* Unqualified %code blocks.  */
/* "src/main/resources/Java_16_Grammar.y":177  */

    public CompilationUnit ast;
    public HashMap<String,Declaration> classes = new HashMap<String,Declaration>();

/* "src/main/java/parser/JavaParser.java":6081  */

}
/* "src/main/resources/Java_16_Grammar.y":1604  */


