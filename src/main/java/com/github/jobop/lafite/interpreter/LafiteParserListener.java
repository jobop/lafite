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
	 * Enter a parse tree produced by {@link LafiteParser#param_identifierList}.
	 * @param ctx the parse tree
	 */
	void enterParam_identifierList(LafiteParser.Param_identifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#param_identifierList}.
	 * @param ctx the parse tree
	 */
	void exitParam_identifierList(LafiteParser.Param_identifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#call_param_identifierList}.
	 * @param ctx the parse tree
	 */
	void enterCall_param_identifierList(LafiteParser.Call_param_identifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#call_param_identifierList}.
	 * @param ctx the parse tree
	 */
	void exitCall_param_identifierList(LafiteParser.Call_param_identifierListContext ctx);
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
	 * Enter a parse tree produced by {@link LafiteParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(LafiteParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(LafiteParser.FunctionDeclContext ctx);
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
	 * Enter a parse tree produced by {@link LafiteParser#outStmt}.
	 * @param ctx the parse tree
	 */
	void enterOutStmt(LafiteParser.OutStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#outStmt}.
	 * @param ctx the parse tree
	 */
	void exitOutStmt(LafiteParser.OutStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#mixList}.
	 * @param ctx the parse tree
	 */
	void enterMixList(LafiteParser.MixListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#mixList}.
	 * @param ctx the parse tree
	 */
	void exitMixList(LafiteParser.MixListContext ctx);
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
	 * Enter a parse tree produced by {@link LafiteParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(LafiteParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(LafiteParser.WhileStmtContext ctx);
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
	 * Enter a parse tree produced by {@link LafiteParser#call_parameters}.
	 * @param ctx the parse tree
	 */
	void enterCall_parameters(LafiteParser.Call_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#call_parameters}.
	 * @param ctx the parse tree
	 */
	void exitCall_parameters(LafiteParser.Call_parametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr_(LafiteParser.PrimaryExpr_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr_(LafiteParser.PrimaryExpr_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr_(LafiteParser.UnaryExpr_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr_(LafiteParser.UnaryExpr_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code callParent_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallParent_(LafiteParser.CallParent_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code callParent_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallParent_(LafiteParser.CallParent_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr_(LafiteParser.OrExpr_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr_(LafiteParser.OrExpr_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code addsubExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddsubExpr_(LafiteParser.AddsubExpr_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code addsubExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddsubExpr_(LafiteParser.AddsubExpr_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code muldivmodExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMuldivmodExpr_(LafiteParser.MuldivmodExpr_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code muldivmodExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMuldivmodExpr_(LafiteParser.MuldivmodExpr_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr_(LafiteParser.AndExpr_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr_(LafiteParser.AndExpr_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr_(LafiteParser.CompareExpr_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpr_}
	 * labeled alternative in {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr_(LafiteParser.CompareExpr_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#twoExpr}.
	 * @param ctx the parse tree
	 */
	void enterTwoExpr(LafiteParser.TwoExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#twoExpr}.
	 * @param ctx the parse tree
	 */
	void exitTwoExpr(LafiteParser.TwoExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(LafiteParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(LafiteParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call_}
	 * labeled alternative in {@link LafiteParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_(LafiteParser.Call_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code call_}
	 * labeled alternative in {@link LafiteParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_(LafiteParser.Call_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#invokeParam}.
	 * @param ctx the parse tree
	 */
	void enterInvokeParam(LafiteParser.InvokeParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#invokeParam}.
	 * @param ctx the parse tree
	 */
	void exitInvokeParam(LafiteParser.InvokeParamContext ctx);
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
	 * Enter a parse tree produced by {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(LafiteParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(LafiteParser.OperandContext ctx);
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
	 * Enter a parse tree produced by {@link LafiteParser#operandName}.
	 * @param ctx the parse tree
	 */
	void enterOperandName(LafiteParser.OperandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#operandName}.
	 * @param ctx the parse tree
	 */
	void exitOperandName(LafiteParser.OperandNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LafiteParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdent(LafiteParser.QualifiedIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LafiteParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdent(LafiteParser.QualifiedIdentContext ctx);
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
	 * Enter a parse tree produced by the {@code methodExpr_}
	 * labeled alternative in {@link LafiteParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpr_(LafiteParser.MethodExpr_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code methodExpr_}
	 * labeled alternative in {@link LafiteParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpr_(LafiteParser.MethodExpr_Context ctx);
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