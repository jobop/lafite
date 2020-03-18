package com.github.jobop.lafite.interpreter;

import com.github.jobop.lafite.syntax.Namespace;
import com.github.jobop.lafite.syntax.SourceStmt;
import com.github.jobop.lafite.syntax.SyntaxNode;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/18.
 */
public class LafiteParseVisitorImpl extends LafiteParserBaseVisitor {
    @Override
    public SourceStmt visitSourceFile(LafiteParser.SourceFileContext ctx) {

        List<Namespace> namespaces = new ArrayList<>();


        for (LafiteParser.NamespaceClauseContext nsContext : ctx.namespaceClause()) {
            namespaces.add((Namespace) visit(nsContext));
        }

        return SourceStmt.builder().lineNum(ctx.getAltNumber())
                .namespaces(namespaces)
                .build();
    }

    @Override
    public Namespace visitNamespaceClause(LafiteParser.NamespaceClauseContext ctx) {
        List<SyntaxNode> nodes = new ArrayList<>();

        for (ParseTree node : ctx.children) {
            nodes.add((SyntaxNode) visit(node));
        }

        return Namespace.builder().lineNum(ctx.getAltNumber()).nameSpaceName(ctx.IDENTIFIER()
                .getText())
                .nodes(nodes)
                .build();
    }

    @Override
    public Object visitImportDecl(LafiteParser.ImportDeclContext ctx) {
        return null;
    }

    @Override
    public Object visitImportSpec(LafiteParser.ImportSpecContext ctx) {
        return null;
    }

    @Override
    public Object visitImportPath(LafiteParser.ImportPathContext ctx) {
        return null;
    }

    @Override
    public Object visitDeclaration(LafiteParser.DeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitDeclaration_constDecl(LafiteParser.Declaration_constDeclContext ctx) {
        return null;
    }

    @Override
    public Object visitConstSpec(LafiteParser.ConstSpecContext ctx) {
        return null;
    }

    @Override
    public Object visitIdentifierList(LafiteParser.IdentifierListContext ctx) {
        return null;
    }

    @Override
    public Object visitExpressionList(LafiteParser.ExpressionListContext ctx) {
        return null;
    }

    @Override
    public Object visitFunc_(LafiteParser.Func_Context ctx) {
        return null;
    }

    @Override
    public Object visitVarDecl_(LafiteParser.VarDecl_Context ctx) {
        return null;
    }

    @Override
    public Object visitVarSpec(LafiteParser.VarSpecContext ctx) {
        return null;
    }

    @Override
    public Object visitBlock(LafiteParser.BlockContext ctx) {
        return null;
    }

    @Override
    public Object visitStatementList(LafiteParser.StatementListContext ctx) {
        return null;
    }

    @Override
    public Object visitStatement(LafiteParser.StatementContext ctx) {
        return null;
    }

    @Override
    public Object visitSimpleStmt(LafiteParser.SimpleStmtContext ctx) {
        return null;
    }

    @Override
    public Object visitExpressionStmt(LafiteParser.ExpressionStmtContext ctx) {
        return null;
    }

    @Override
    public Object visitIncDecStmt(LafiteParser.IncDecStmtContext ctx) {
        return null;
    }

    @Override
    public Object visitAssignment(LafiteParser.AssignmentContext ctx) {
        return null;
    }

    @Override
    public Object visitAssign_op(LafiteParser.Assign_opContext ctx) {
        return null;
    }

    @Override
    public Object visitShortVarDecl(LafiteParser.ShortVarDeclContext ctx) {
        return null;
    }

    @Override
    public Object visitEmptyStmt(LafiteParser.EmptyStmtContext ctx) {
        return null;
    }

    @Override
    public Object visitReturnStmt(LafiteParser.ReturnStmtContext ctx) {
        return null;
    }

    @Override
    public Object visitBreakStmt(LafiteParser.BreakStmtContext ctx) {
        return null;
    }

    @Override
    public Object visitContinueStmt(LafiteParser.ContinueStmtContext ctx) {
        return null;
    }

    @Override
    public Object visitIfStmt(LafiteParser.IfStmtContext ctx) {
        return null;
    }

    @Override
    public Object visitRecvStmt(LafiteParser.RecvStmtContext ctx) {
        return null;
    }

    @Override
    public Object visitForStmt(LafiteParser.ForStmtContext ctx) {
        return null;
    }

    @Override
    public Object visitForClause(LafiteParser.ForClauseContext ctx) {
        return null;
    }

    @Override
    public Object visitRangeClause(LafiteParser.RangeClauseContext ctx) {
        return null;
    }

    @Override
    public Object visitLaStmt(LafiteParser.LaStmtContext ctx) {
        return null;
    }

    @Override
    public Object visitArrayLength(LafiteParser.ArrayLengthContext ctx) {
        return null;
    }

    @Override
    public Object visitMethodSpec(LafiteParser.MethodSpecContext ctx) {
        return null;
    }

    @Override
    public Object visitFunctionType(LafiteParser.FunctionTypeContext ctx) {
        return null;
    }

    @Override
    public Object visitSignature(LafiteParser.SignatureContext ctx) {
        return null;
    }

    @Override
    public Object visitResult(LafiteParser.ResultContext ctx) {
        return null;
    }

    @Override
    public Object visitParameters(LafiteParser.ParametersContext ctx) {
        return null;
    }

    @Override
    public Object visitParameterDecl(LafiteParser.ParameterDeclContext ctx) {
        return null;
    }

    @Override
    public Object visitExpression(LafiteParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitLprimaryExpr_primaryExpr(LafiteParser.LprimaryExpr_primaryExprContext ctx) {
        return null;
    }

    @Override
    public Object visitLprimaryExpr_primaryExpr_operand_(LafiteParser.LprimaryExpr_primaryExpr_operand_Context ctx) {
        return null;
    }

    @Override
    public Object visitLinvokeParam_IDENTIFIER_(LafiteParser.LinvokeParam_IDENTIFIER_Context ctx) {
        return null;
    }

    @Override
    public Object visitLinvokeParam_index_(LafiteParser.LinvokeParam_index_Context ctx) {
        return null;
    }

    @Override
    public Object visitLinvokeParam_arguments_(LafiteParser.LinvokeParam_arguments_Context ctx) {
        return null;
    }

    @Override
    public Object visitUnaryExpr(LafiteParser.UnaryExprContext ctx) {
        return null;
    }

    @Override
    public Object visitLoperand_literal_(LafiteParser.Loperand_literal_Context ctx) {
        return null;
    }

    @Override
    public Object visitLoperand_operandName_(LafiteParser.Loperand_operandName_Context ctx) {
        return null;
    }

    @Override
    public Object visitLoperand_methodExpr_(LafiteParser.Loperand_methodExpr_Context ctx) {
        return null;
    }

    @Override
    public Object visitLoperand_expression_(LafiteParser.Loperand_expression_Context ctx) {
        return null;
    }

    @Override
    public Object visitLiteral(LafiteParser.LiteralContext ctx) {
        return null;
    }

    @Override
    public Object visitBasicLit(LafiteParser.BasicLitContext ctx) {
        return null;
    }

    @Override
    public Object visitLoperandName_IDENTIFIER(LafiteParser.LoperandName_IDENTIFIERContext ctx) {
        return null;
    }

    @Override
    public Object visitLqualifiedIdent_(LafiteParser.LqualifiedIdent_Context ctx) {
        return null;
    }

    @Override
    public Object visitLcallFunc(LafiteParser.LcallFuncContext ctx) {
        return null;
    }

    @Override
    public Object visitCompositeLit(LafiteParser.CompositeLitContext ctx) {
        return null;
    }

    @Override
    public Object visitLiteralValue(LafiteParser.LiteralValueContext ctx) {
        return null;
    }

    @Override
    public Object visitElementList(LafiteParser.ElementListContext ctx) {
        return null;
    }

    @Override
    public Object visitKeyedElement(LafiteParser.KeyedElementContext ctx) {
        return null;
    }

    @Override
    public Object visitKey(LafiteParser.KeyContext ctx) {
        return null;
    }

    @Override
    public Object visitElement(LafiteParser.ElementContext ctx) {
        return null;
    }

    @Override
    public Object visitFieldDecl(LafiteParser.FieldDeclContext ctx) {
        return null;
    }

    @Override
    public Object visitString_(LafiteParser.String_Context ctx) {
        return null;
    }

    @Override
    public Object visitFunctionLit(LafiteParser.FunctionLitContext ctx) {
        return null;
    }

    @Override
    public Object visitIndex(LafiteParser.IndexContext ctx) {
        return null;
    }

    @Override
    public Object visitArguments(LafiteParser.ArgumentsContext ctx) {
        return null;
    }

    @Override
    public Object visitMethodExpr(LafiteParser.MethodExprContext ctx) {
        return null;
    }

    @Override
    public Object visitEos(LafiteParser.EosContext ctx) {
        return null;
    }


    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
