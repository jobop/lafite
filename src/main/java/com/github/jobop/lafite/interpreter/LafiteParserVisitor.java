// Generated from LafiteParser.g4 by ANTLR 4.8

package com.github.jobop.lafite.interpreter;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LafiteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LafiteParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LafiteParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(LafiteParser.SourceFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#namespaceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceClause(LafiteParser.NamespaceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#importDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDecl(LafiteParser.ImportDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#importSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpec(LafiteParser.ImportSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#importPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportPath(LafiteParser.ImportPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LafiteParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaration_constDecl}
	 * labeled alternative in {@link LafiteParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_constDecl(LafiteParser.Declaration_constDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#constSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSpec(LafiteParser.ConstSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(LafiteParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(LafiteParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_}
	 * labeled alternative in {@link LafiteParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_(LafiteParser.Func_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code varDecl_}
	 * labeled alternative in {@link LafiteParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl_(LafiteParser.VarDecl_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#varSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSpec(LafiteParser.VarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LafiteParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(LafiteParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LafiteParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(LafiteParser.SimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#expressionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(LafiteParser.ExpressionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#incDecStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecStmt(LafiteParser.IncDecStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LafiteParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(LafiteParser.Assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#shortVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortVarDecl(LafiteParser.ShortVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#emptyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(LafiteParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(LafiteParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(LafiteParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(LafiteParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(LafiteParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#recvStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecvStmt(LafiteParser.RecvStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(LafiteParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(LafiteParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#rangeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeClause(LafiteParser.RangeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#laStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLaStmt(LafiteParser.LaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLength(LafiteParser.ArrayLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#methodSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSpec(LafiteParser.MethodSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(LafiteParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(LafiteParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(LafiteParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(LafiteParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#parameterDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDecl(LafiteParser.ParameterDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LafiteParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LprimaryExpr_primaryExpr}
	 * labeled alternative in {@link LafiteParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLprimaryExpr_primaryExpr(LafiteParser.LprimaryExpr_primaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LprimaryExpr_primaryExpr_operand_}
	 * labeled alternative in {@link LafiteParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLprimaryExpr_primaryExpr_operand_(LafiteParser.LprimaryExpr_primaryExpr_operand_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LinvokeParam_IDENTIFIER_}
	 * labeled alternative in {@link LafiteParser#invokeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinvokeParam_IDENTIFIER_(LafiteParser.LinvokeParam_IDENTIFIER_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LinvokeParam_index_}
	 * labeled alternative in {@link LafiteParser#invokeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinvokeParam_index_(LafiteParser.LinvokeParam_index_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LinvokeParam_arguments_}
	 * labeled alternative in {@link LafiteParser#invokeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinvokeParam_arguments_(LafiteParser.LinvokeParam_arguments_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(LafiteParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Loperand_literal_}
	 * labeled alternative in {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoperand_literal_(LafiteParser.Loperand_literal_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Loperand_operandName_}
	 * labeled alternative in {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoperand_operandName_(LafiteParser.Loperand_operandName_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Loperand_methodExpr_}
	 * labeled alternative in {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoperand_methodExpr_(LafiteParser.Loperand_methodExpr_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Loperand_expression_}
	 * labeled alternative in {@link LafiteParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoperand_expression_(LafiteParser.Loperand_expression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LafiteParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#basicLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicLit(LafiteParser.BasicLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoperandName_IDENTIFIER}
	 * labeled alternative in {@link LafiteParser#operandName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoperandName_IDENTIFIER(LafiteParser.LoperandName_IDENTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LqualifiedIdent_}
	 * labeled alternative in {@link LafiteParser#operandName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLqualifiedIdent_(LafiteParser.LqualifiedIdent_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LcallFunc}
	 * labeled alternative in {@link LafiteParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcallFunc(LafiteParser.LcallFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#compositeLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeLit(LafiteParser.CompositeLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#literalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralValue(LafiteParser.LiteralValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(LafiteParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#keyedElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyedElement(LafiteParser.KeyedElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(LafiteParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(LafiteParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(LafiteParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#string_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_(LafiteParser.String_Context ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#functionLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLit(LafiteParser.FunctionLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(LafiteParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(LafiteParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#methodExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodExpr(LafiteParser.MethodExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LafiteParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(LafiteParser.EosContext ctx);
}