// Generated from LafiteParser.g4 by ANTLR 4.8

package com.github.jobop.lafite.interpreter;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LafiteParser}.
 */
public interface LafiteParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LafiteParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(LafiteParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(LafiteParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#namespaceClause}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceClause(LafiteParser.NamespaceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#namespaceClause}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceClause(LafiteParser.NamespaceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(LafiteParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(LafiteParser.ImportDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void enterImportSpec(LafiteParser.ImportSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#importSpec}.
	 * @param ctx the parse tree
	 */
	void exitImportSpec(LafiteParser.ImportSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#importPath}.
	 * @param ctx the parse tree
	 */
	void enterImportPath(LafiteParser.ImportPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#importPath}.
	 * @param ctx the parse tree
	 */
	void exitImportPath(LafiteParser.ImportPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LafiteParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LafiteParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_constDecl}
	 * labeled alternative in {@link LafiteParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_constDecl(LafiteParser.Declaration_constDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_constDecl}
	 * labeled alternative in {@link LafiteParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_constDecl(LafiteParser.Declaration_constDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#constSpec}.
	 * @param ctx the parse tree
	 */
	void enterConstSpec(LafiteParser.ConstSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#constSpec}.
	 * @param ctx the parse tree
	 */
	void exitConstSpec(LafiteParser.ConstSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(LafiteParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(LafiteParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(LafiteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(LafiteParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func_}
	 * labeled alternative in {@link LafiteParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_(LafiteParser.Func_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code func_}
	 * labeled alternative in {@link LafiteParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_(LafiteParser.Func_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code varDecl_}
	 * labeled alternative in {@link LafiteParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl_(LafiteParser.VarDecl_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code varDecl_}
	 * labeled alternative in {@link LafiteParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl_(LafiteParser.VarDecl_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void enterVarSpec(LafiteParser.VarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void exitVarSpec(LafiteParser.VarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LafiteParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LafiteParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(LafiteParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(LafiteParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LafiteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LafiteParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(LafiteParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(LafiteParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(LafiteParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(LafiteParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncDecStmt(LafiteParser.IncDecStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncDecStmt(LafiteParser.IncDecStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LafiteParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LafiteParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(LafiteParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(LafiteParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#shortVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterShortVarDecl(LafiteParser.ShortVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#shortVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitShortVarDecl(LafiteParser.ShortVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(LafiteParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(LafiteParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(LafiteParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(LafiteParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(LafiteParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(LafiteParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(LafiteParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(LafiteParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(LafiteParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(LafiteParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#recvStmt}.
	 * @param ctx the parse tree
	 */
	void enterRecvStmt(LafiteParser.RecvStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#recvStmt}.
	 * @param ctx the parse tree
	 */
	void exitRecvStmt(LafiteParser.RecvStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(LafiteParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(LafiteParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(LafiteParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(LafiteParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void enterRangeClause(LafiteParser.RangeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void exitRangeClause(LafiteParser.RangeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#laStmt}.
	 * @param ctx the parse tree
	 */
	void enterLaStmt(LafiteParser.LaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#laStmt}.
	 * @param ctx the parse tree
	 */
	void exitLaStmt(LafiteParser.LaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(LafiteParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(LafiteParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#methodSpec}.
	 * @param ctx the parse tree
	 */
	void enterMethodSpec(LafiteParser.MethodSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#methodSpec}.
	 * @param ctx the parse tree
	 */
	void exitMethodSpec(LafiteParser.MethodSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(LafiteParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(LafiteParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(LafiteParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(LafiteParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(LafiteParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(LafiteParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(LafiteParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(LafiteParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterParameterDecl(LafiteParser.ParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitParameterDecl(LafiteParser.ParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LafiteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LafiteParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LprimaryExpr_primaryExpr}
	 * labeled alternative in {@link LafiteParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterLprimaryExpr_primaryExpr(LafiteParser.LprimaryExpr_primaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LprimaryExpr_primaryExpr}
	 * labeled alternative in {@link LafiteParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitLprimaryExpr_primaryExpr(LafiteParser.LprimaryExpr_primaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LprimaryExpr_primaryExpr_operand_}
	 * labeled alternative in {@link LafiteParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterLprimaryExpr_primaryExpr_operand_(LafiteParser.LprimaryExpr_primaryExpr_operand_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LprimaryExpr_primaryExpr_operand_}
	 * labeled alternative in {@link LafiteParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitLprimaryExpr_primaryExpr_operand_(LafiteParser.LprimaryExpr_primaryExpr_operand_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LinvokeParam_IDENTIFIER_}
	 * labeled alternative in {@link LafiteParser#invokeParam}.
	 * @param ctx the parse tree
	 */
	void enterLinvokeParam_IDENTIFIER_(LafiteParser.LinvokeParam_IDENTIFIER_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LinvokeParam_IDENTIFIER_}
	 * labeled alternative in {@link LafiteParser#invokeParam}.
	 * @param ctx the parse tree
	 */
	void exitLinvokeParam_IDENTIFIER_(LafiteParser.LinvokeParam_IDENTIFIER_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LinvokeParam_index_}
	 * labeled alternative in {@link LafiteParser#invokeParam}.
	 * @param ctx the parse tree
	 */
	void enterLinvokeParam_index_(LafiteParser.LinvokeParam_index_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LinvokeParam_index_}
	 * labeled alternative in {@link LafiteParser#invokeParam}.
	 * @param ctx the parse tree
	 */
	void exitLinvokeParam_index_(LafiteParser.LinvokeParam_index_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LinvokeParam_arguments_}
	 * labeled alternative in {@link LafiteParser#invokeParam}.
	 * @param ctx the parse tree
	 */
	void enterLinvokeParam_arguments_(LafiteParser.LinvokeParam_arguments_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LinvokeParam_arguments_}
	 * labeled alternative in {@link LafiteParser#invokeParam}.
	 * @param ctx the parse tree
	 */
	void exitLinvokeParam_arguments_(LafiteParser.LinvokeParam_arguments_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(LafiteParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(LafiteParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Loperand_literal_}
	 * labeled alternative in {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterLoperand_literal_(LafiteParser.Loperand_literal_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Loperand_literal_}
	 * labeled alternative in {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitLoperand_literal_(LafiteParser.Loperand_literal_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Loperand_operandName_}
	 * labeled alternative in {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterLoperand_operandName_(LafiteParser.Loperand_operandName_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Loperand_operandName_}
	 * labeled alternative in {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitLoperand_operandName_(LafiteParser.Loperand_operandName_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Loperand_methodExpr_}
	 * labeled alternative in {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterLoperand_methodExpr_(LafiteParser.Loperand_methodExpr_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Loperand_methodExpr_}
	 * labeled alternative in {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitLoperand_methodExpr_(LafiteParser.Loperand_methodExpr_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Loperand_expression_}
	 * labeled alternative in {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterLoperand_expression_(LafiteParser.Loperand_expression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Loperand_expression_}
	 * labeled alternative in {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitLoperand_expression_(LafiteParser.Loperand_expression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LafiteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LafiteParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void enterBasicLit(LafiteParser.BasicLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void exitBasicLit(LafiteParser.BasicLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoperandName_IDENTIFIER}
	 * labeled alternative in {@link LafiteParser#operandName}.
	 * @param ctx the parse tree
	 */
	void enterLoperandName_IDENTIFIER(LafiteParser.LoperandName_IDENTIFIERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoperandName_IDENTIFIER}
	 * labeled alternative in {@link LafiteParser#operandName}.
	 * @param ctx the parse tree
	 */
	void exitLoperandName_IDENTIFIER(LafiteParser.LoperandName_IDENTIFIERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LqualifiedIdent_}
	 * labeled alternative in {@link LafiteParser#operandName}.
	 * @param ctx the parse tree
	 */
	void enterLqualifiedIdent_(LafiteParser.LqualifiedIdent_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LqualifiedIdent_}
	 * labeled alternative in {@link LafiteParser#operandName}.
	 * @param ctx the parse tree
	 */
	void exitLqualifiedIdent_(LafiteParser.LqualifiedIdent_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LcallFunc}
	 * labeled alternative in {@link LafiteParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void enterLcallFunc(LafiteParser.LcallFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LcallFunc}
	 * labeled alternative in {@link LafiteParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void exitLcallFunc(LafiteParser.LcallFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#compositeLit}.
	 * @param ctx the parse tree
	 */
	void enterCompositeLit(LafiteParser.CompositeLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#compositeLit}.
	 * @param ctx the parse tree
	 */
	void exitCompositeLit(LafiteParser.CompositeLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void enterLiteralValue(LafiteParser.LiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void exitLiteralValue(LafiteParser.LiteralValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(LafiteParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(LafiteParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#keyedElement}.
	 * @param ctx the parse tree
	 */
	void enterKeyedElement(LafiteParser.KeyedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#keyedElement}.
	 * @param ctx the parse tree
	 */
	void exitKeyedElement(LafiteParser.KeyedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(LafiteParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(LafiteParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(LafiteParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(LafiteParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(LafiteParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(LafiteParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#string_}.
	 * @param ctx the parse tree
	 */
	void enterString_(LafiteParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#string_}.
	 * @param ctx the parse tree
	 */
	void exitString_(LafiteParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#functionLit}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLit(LafiteParser.FunctionLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#functionLit}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLit(LafiteParser.FunctionLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(LafiteParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(LafiteParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(LafiteParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(LafiteParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpr(LafiteParser.MethodExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpr(LafiteParser.MethodExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(LafiteParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(LafiteParser.EosContext ctx);
}