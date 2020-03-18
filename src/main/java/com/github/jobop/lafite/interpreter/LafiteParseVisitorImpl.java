package com.github.jobop.lafite.interpreter;

import com.alibaba.fastjson.JSON;
import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.syntax.*;
import com.github.jobop.lafite.syntax.expr.*;
import com.github.jobop.lafite.syntax.expr.Operator;
import com.github.jobop.lafite.utils.TypeUtils;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Enzo Cotter on 2020/3/18.
 */
public class LafiteParseVisitorImpl extends LafiteParserBaseVisitor<Object> {
    //TODO:
    private Namespace currentNamespace;

    private FunctionStmt currentFunction;
    private SourceStmt currentSource;


    private Stack<SyntaxNode> nodeStack = new Stack<>();

    private int dealingFunctionCount = 0;

    @Override
    public SourceStmt visitSourceFile(LafiteParser.SourceFileContext ctx) {

        //解析namespace
        currentNamespace = (Namespace) visit(ctx.namespaceClause());

        //解析变量定义
        List<SyntaxNode> nodes = new ArrayList<>();
        if (null != ctx.shortVarDecl()) {
            for (LafiteParser.ShortVarDeclContext context : ctx.shortVarDecl()) {
                nodes.add((SyntaxNode) visit(context));
            }
        }


        if (null != ctx.functionDecl()) {
            for (LafiteParser.FunctionDeclContext functionDecl : ctx.functionDecl()) {
                nodes.add((SyntaxNode) visit(functionDecl));
            }
        }


        //重新生成namespace
        currentNamespace = currentNamespace.toBuilder().nodes(nodes).build();

        currentSource = SourceStmt.builder().namespace(currentNamespace).build();
        return currentSource;

    }

    @Override
    public Namespace visitNamespaceClause(LafiteParser.NamespaceClauseContext ctx) {
        this.currentNamespace = Namespace.builder().nameSpaceName(ctx.IDENTIFIER().getText()).build();

        return this.currentNamespace;
    }


    @Override
    public SyntaxNode visitShortVarDecl(LafiteParser.ShortVarDeclContext ctx) {
        SyntaxNode shortVarDecl = null;


        ////变量 IdentifierListContext
        List<String> identifierNodes = (List<String>) visit(ctx.identifierList());


        //表达式 ExpressionListContext
        ExprList exprlist = (ExprList) visit(ctx.expressionList());


        //要看是哪里来的，决定生成什么对象
        if (dealingFunctionCount == 0) {
            //栈外
            shortVarDecl = GlobalVarDeclMultiStmt.builder().dataNames(identifierNodes).data(exprlist).build();
        } else {
            //栈内
            shortVarDecl = LocalVarDeclMultiStmt.builder().dataNames(identifierNodes).data(exprlist).build();
        }
        return shortVarDecl;
    }

    //解析形如 aaa,bbb,ccc这种变量列表
    @Override
    public List<String> visitIdentifierList(LafiteParser.IdentifierListContext ctx) {
        List<String> nodes = new ArrayList<>();
        for (TerminalNode idCtx : ctx.IDENTIFIER()) {
            nodes.add(idCtx.getText());
        }
        return nodes;
    }

    //解析型如a,1,fuck(a,b,c),aa[1],a+1这种表达式列表

    @Override
    public ExprList visitExpressionList(LafiteParser.ExpressionListContext ctx) {

        List<SyntaxNode> exprNodes = new ArrayList<>();
        for (LafiteParser.ExpressionContext expCtx : ctx.expression()) {

            exprNodes.add((SyntaxNode) visit(expCtx));
        }
        return ExprList.builder().exprs(exprNodes).build();
    }


    //解析表达式 start:
    //表达式匹配多种规则，这里按照顺序解释
    //有可能是primaryExpr， unaryExpr ，expression op expression这些，所以都要解释,根据不同规则

    //TODO:处理方法调用之类，这里要拆分(这里不能返回null，如果返回null就跟踪不下去了)
//    @Override
//    public SyntaxNode visitPrimaryExpr_(LafiteParser.PrimaryExpr_Context ctx) {
//        return super.visitPrimaryExpr_(ctx);
//    }

    //处理操作数名（等号右边的变量名）
    @Override
    public Object visitOperandName(LafiteParser.OperandNameContext ctx) {
        if (null != ctx.IDENTIFIER()) {
            return ExprStmtIdentify.builder().idName(ctx.getText()).build();
        } else if (null != ctx.qualifiedIdent()) {
            return null;
        }
        return null;

    }


    //处理基本字面量


    @Override
    public ExprStmtData visitBasicLit(LafiteParser.BasicLitContext ctx) {
        //区分数字，string double long nil
        String lit = null;
        if (null != ctx.DECIMAL_LIT()) {
            lit = ctx.DECIMAL_LIT().getText();//long
        }

        if (null != ctx.FLOAT_LIT()) {
            lit = ctx.FLOAT_LIT().getText();
        }
        if (null != ctx.string_()) {
            lit = ctx.string_().getText();
        }
        if (null != ctx.NIL_LIT()) {
            //TODO:支持nil
            lit = ctx.NIL_LIT().getText();
        }
        if (null == lit) {
            throw new RuntimeException("parse lit fail");
        }

        return ExprStmtData.builder().data(TypeUtils.transferType(lit)).build();

    }

    @Override
    public Object visitLiteral(LafiteParser.LiteralContext ctx) {
        return super.visitLiteral(ctx);
    }

    //TODO:处理负数之类
    @Override
    public SyntaxNode visitUnaryExpr_(LafiteParser.UnaryExpr_Context ctx) {
        return null;
    }

    //处理除乘馍
    @Override
    public SyntaxNode visitMuldivmodExpr_(LafiteParser.MuldivmodExpr_Context ctx) {
        SyntaxNode node = null;
        Operator op = null;
        if (null != ctx.MOD()) {

        } else if (null != ctx.DIV()) {
            op = Operator.DIV;
        } else {
            op = Operator.MUL;
        }

        node = ExprStmtWithTwo.builder()
                .left((SyntaxNode) visit(ctx.expression(0)))
                .op(op)
                .right((SyntaxNode) visit(ctx.expression(1)))
                .build();

        return node;
    }

    //处理加减
    @Override
    public Object visitAddsubExpr_(LafiteParser.AddsubExpr_Context ctx) {
        SyntaxNode node = null;
        Operator op = null;
        if (null != ctx.PLUS()) {
            op = Operator.ADD;
        } else if (null != ctx.MINUS()) {
            op = Operator.MUL;
        } else {
            throw new RuntimeException("unknow op");
        }

        node = ExprStmtWithTwo.builder()
                .left((SyntaxNode) visit(ctx.expression(0)))
                .op(op)
                .right((SyntaxNode) visit(ctx.expression(1)))
                .build();

        return node;
    }

    @Override
    public Object visitAndExpr_(LafiteParser.AndExpr_Context ctx) {
        SyntaxNode node = ExprStmtWithTwo.builder()
                .left((SyntaxNode) visit(ctx.expression(0)))
                .op(Operator.AND)
                .right((SyntaxNode) visit(ctx.expression(1)))
                .build();

        return node;
    }

    @Override
    public Object visitOrExpr_(LafiteParser.OrExpr_Context ctx) {
        SyntaxNode node = ExprStmtWithTwo.builder()
                .left((SyntaxNode) visit(ctx.expression(0)))
                .op(Operator.OR)
                .right((SyntaxNode) visit(ctx.expression(1)))
                .build();

        return node;
    }


    //解析表达式 end:


    //TODO:解析方法定义
    @Override
    public FunctionStmt visitFunctionDecl(LafiteParser.FunctionDeclContext ctx) {

        FunctionStmt functionStmt = null;
        dealingFunctionCount++;
        //方法参数

        //方法体



        FunctionStmt.builder().nameSpace(currentNamespace.getNameSpaceName()).functionName(ctx.IDENTIFIER().getText()).build();
        dealingFunctionCount--;
        return functionStmt;
    }


    public void compile(Compiler compiler) {
        currentSource.compile(compiler);
    }

    public void dumpSourceCode() {
        currentSource.dumpSourceCode();
    }
}
