parser grammar LafiteParser;

@header{
package com.github.jobop.lafite.interpreter;
}
options {
    tokenVocab=LafiteLexer;
    superClass=LafiteParserBase;
}

sourceFile
    : namespaceClause eos (importDecl eos)* ((functionDecl | shortVarDecl) eos)*
    ;

namespaceClause
    : NAMESPACE IDENTIFIER
    ;

importDecl
    : 'import' importSpec
    ;

importSpec
    : (DENTIFIER)? importPath
    ;

importPath
    : string_
    ;

declaration
    : varDecl
    ;

constDecl
    : 'const' constSpec #declaration_constDecl
    ;

constSpec
    : identifierList
    ;

identifierList
    : IDENTIFIER (',' IDENTIFIER)*
    ;

param_identifierList
    : IDENTIFIER (',' IDENTIFIER)*
    ;

call_param_identifierList
    : IDENTIFIER (',' IDENTIFIER)*
    ;


expressionList
    : expression (',' expression)*
    ;




// Function declarations

functionDecl
    : 'func' IDENTIFIER (signature block?)
    ;


varDecl
    : 'var' varSpec # varDecl_
    ;

varSpec
    : identifierList
    ;

block
    : '{' statementList? '}'
    ;

statementList
    : (statement eos)+
    ;

statement
    : shortVarDecl
    | simpleStmt
    | laStmt
    | returnStmt
    | breakStmt
    | continueStmt
    | block
    | ifStmt
    | whileStmt
    | outStmt
    ;



simpleStmt
    : expressionStmt
    | incDecStmt //TODO
    | assignment
    | shortVarDecl
    | emptyStmt
    ;

expressionStmt
    : expression
    ;


incDecStmt
    : expression (PLUS_PLUS | MINUS_MINUS)
    ;

assignment
    : identifierList assign_op expressionList
    ;

assign_op
    : '='
    ;

shortVarDecl
    : identifierList ':=' expressionList
    ;

emptyStmt
    : ';'
    ;


returnStmt
    : 'return' expressionList?
    ;

outStmt
    : OUT (mixList)(',' mixList)*
    ;
//TODO:
mixList
    :basicLit
    |expression
    |IDENTIFIER
    ;

breakStmt
    : 'break'
    ;

continueStmt
    : 'continue'
    ;




ifStmt
    : 'if' expression block ('else' (ifStmt | block))?
    ;

whileStmt
    : WHILE expression block
    ;

recvStmt
    : (expressionList '=' | identifierList ':=')? expression
    ;

forStmt
    : 'for' (expression | forClause | rangeClause)? block
    ;

forClause
    : simpleStmt? ';' expression? ';' simpleStmt?
    ;

rangeClause
    : (expressionList '=' | identifierList ':=')? 'range' expression
    ;

laStmt
    : 'la' expression
    ;




arrayLength
    : expression
    ;



methodSpec
    : {noTerminatorAfterParams(2)}? IDENTIFIER parameters
    | IDENTIFIER parameters
    ;

functionType
    : 'func' signature
    ;

signature
    : parameters
    ;


parameters
//    : '(' (parameterDecl (COMMA parameterDecl)* COMMA?)? ')'
    : '(' param_identifierList? ')'
    ;

call_parameters
//    : '(' (parameterDecl (COMMA parameterDecl)* COMMA?)? ')'
    : '(' call_param_identifierList? ')'
    ;



expression
    : callStmt                                      #callParent_
    | primaryExpr                                   #primaryExpr_
    | unaryExpr                                     #unaryExpr_
    | expression ('*' | '/' | '%' ) expression      #muldivmodExpr_
    | expression ('+' | '-' ) expression            #addsubExpr_
    | expression ('==' | '!=' | '<' | '<=' | '>' | '>=') expression #compareExpr_
    | expression '&&' expression                     #andExpr_
    | expression '||' expression                    #orExpr_
    ;

twoExpr
    :expression ('*' | '/' | '%' ) expression
    | expression ('+' | '-' ) expression
    | expression ('==' | '!=' | '<' | '<=' | '>' | '>=') expression
    | expression '&&' expression
    | expression '||' expression
    ;

primaryExpr
    : operand
    | primaryExpr (invokeParam)
    ;

callStmt
    :methodExpr arguments #call_
    ;


invokeParam
    :DOT IDENTIFIER
    | index
    | arguments
    ;

unaryExpr
    : primaryExpr
    | ('+' | '-' | '!') expression
    ;


operand
    : literal
    | operandName
    | methodExpr
    | '(' expression ')'
    ;

literal
    : basicLit
    | compositeLit
    | functionLit
    ;

basicLit
    : NIL_LIT
    | DECIMAL_LIT
    | string_
    | FLOAT_LIT
    ;


operandName
    : IDENTIFIER
    | qualifiedIdent
    ;

qualifiedIdent
    : IDENTIFIER '.' IDENTIFIER
    ;

compositeLit
    : literalValue
    ;


literalValue
    : '{' (elementList ','?)? '}'
    ;

elementList
    : keyedElement (',' keyedElement)*
    ;

keyedElement
    : (key ':')? element
    ;

key
    : IDENTIFIER
    | expression
    | literalValue
    ;

element
    : expression
    | literalValue
    ;



fieldDecl
    : ({noTerminatorBetween(2)}? identifierList ) string_?
    ;

string_
    : RAW_STRING_LIT
    | INTERPRETED_STRING_LIT
    ;



functionLit
    : 'func' signature block // function
    ;

index
    : '[' expression ']'
    ;



arguments
    : '(' ((expressionList |  (',' expressionList)?) '...'? ','?)? ')'
    ;

methodExpr
    : (IDENTIFIER DOT)? IDENTIFIER #methodExpr_
    ;

eos
    : ';'
    | EOF
    | {lineTerminatorAhead()}?
    | {checkPreviousTokenText("}")}?
    ;