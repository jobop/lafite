package com.github.jobop.lafite.interpreter;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.syntax.*;
import com.github.jobop.lafite.syntax.expr.*;
import com.github.jobop.lafite.syntax.expr.Operator;
import com.github.jobop.lafite.utils.TypeUtils;
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
//    public Object visitPrimaryExpr_(LafiteParser.PrimaryExpr_Context ctx) {
//        return super.visitPrimaryExpr_(ctx);
//    }


    @Override
    public CallStmt visitCall_(LafiteParser.Call_Context ctx) {
        //方法名
        String methodName = (String) visit(ctx.methodExpr());
        //方法实参
        ExprList argus = (ExprList) visit(ctx.arguments());

        return CallStmt.builder().functionId(methodName).params(argus).build();
    }

    //被调用方法名
    @Override
    public String visitMethodExpr_(LafiteParser.MethodExpr_Context ctx) {
        String methodName = "";
        if (null == ctx.DOT()) {
            methodName = this.currentNamespace.getNameSpaceName() + "." + ctx.IDENTIFIER(0).getText();
        } else {
            methodName = ctx.IDENTIFIER(0).getText() + "." + ctx.IDENTIFIER(1).getText();
        }
        return methodName;
    }

    //被调用方法参数
    @Override
    public ExprList visitArguments(LafiteParser.ArgumentsContext ctx) {
        if (null != ctx.expressionList()) {
            return (ExprList) visit(ctx.expressionList());
        } else {
            return ExprList.builder().build();
        }


    }


    //处理操作数名（等号右边的变量名）
    @Override
    public Object visitOperandName(LafiteParser.OperandNameContext ctx) {
        if (null != ctx.IDENTIFIER()) {
            return ExprStmtIdentify.builder().idName(ctx.IDENTIFIER().getText()).build();
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

    @Override
    public SyntaxNode visitCompareExpr_(LafiteParser.CompareExpr_Context ctx) {
        SyntaxNode node = null;
        Operator op = null;
        if (null != ctx.GREATER()) {
            op = Operator.GT;
        } else if (null != ctx.GREATER_OR_EQUALS()) {
            op = Operator.GTEQ;
        } else if (null != ctx.LESS()) {
            op = Operator.LT;
        } else if (null != ctx.LESS_OR_EQUALS()) {
            op = Operator.LTEQ;
        } else if (null != ctx.EQUALS()) {
            op = Operator.EQEQ;
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


    //解析表达式 end:


    //解析方法定义start
    @Override
    public FunctionStmt visitFunctionDecl(LafiteParser.FunctionDeclContext ctx) {

        FunctionStmt functionStmt = null;
        dealingFunctionCount++;
        //方法参数
        SignatureStmt signatureStmt = (SignatureStmt) visit(ctx.signature());

        //方法体
        BlockStmt funcBlockStmt = (BlockStmt) visit(ctx.block());

        functionStmt = FunctionStmt.builder()
                .nameSpace(currentNamespace.getNameSpaceName())
                .functionName(ctx.IDENTIFIER().getText())
                .signatureStmt(signatureStmt)
                .block(funcBlockStmt)
                .build();
        dealingFunctionCount--;
        return functionStmt;
    }

    //解析方法参数start
    @Override
    public SignatureStmt visitSignature(LafiteParser.SignatureContext ctx) {


        ParametersStmt parameters = (ParametersStmt) visitParameters(ctx.parameters());

        return SignatureStmt.builder().parameterList(parameters).build();
    }

    @Override
    public ParametersStmt visitParameters(LafiteParser.ParametersContext ctx) {

        if (null != ctx.param_identifierList()) {
            ParamIdentifierListStmt pids = (ParamIdentifierListStmt) visit(ctx.param_identifierList());
            return ParametersStmt.builder().pids(pids).build();
        } else {
            return ParametersStmt.builder().build();
        }


    }

    @Override
    public ParamIdentifierListStmt visitParam_identifierList(LafiteParser.Param_identifierListContext ctx) {

        List<ExprStmtParamIdentify> params = new ArrayList<>();
        for (TerminalNode node : ctx.IDENTIFIER()) {
            params.add(ExprStmtParamIdentify.builder().idName(node.getText()).build());
        }
        return ParamIdentifierListStmt.builder().nodes(params).build();
    }
    //解析方法参数end


    //解析方法体start

    @Override
    public BlockStmt visitBlock(LafiteParser.BlockContext ctx) {
        List<SyntaxNode> blockInsizeNodes = new ArrayList<>();
        if (null != ctx.statementList()) {
            blockInsizeNodes = (List<SyntaxNode>) visit(ctx.statementList());
        }
        return BlockStmt.builder().nodes(blockInsizeNodes).build();
    }

    @Override
    public List<SyntaxNode> visitStatementList(LafiteParser.StatementListContext ctx) {
        List<SyntaxNode> statements = new ArrayList<>();
        for (LafiteParser.StatementContext sctx : ctx.statement()) {
            statements.add((SyntaxNode) visit(sctx));
        }
        return statements;
    }


    //解析方法体end

    //解析方法定义end


    //解析block中各种元素start
//    : shortVarDecl
//    | simpleStmt
//    | laStmt
//    | returnStmt
//    | breakStmt
//    | continueStmt
//    | block
//    | ifStmt
//    | forStmt

    @Override
    public RetStmt visitReturnStmt(LafiteParser.ReturnStmtContext ctx) {
        if (null != ctx.expressionList()) {
            ExprList exprList = visitExpressionList(ctx.expressionList());
            return RetStmt.builder().rets(exprList).build();
        } else {
            return RetStmt.builder().build();
        }
    }

    //赋值
    @Override
    public VarAssignMultiStmt visitAssignment(LafiteParser.AssignmentContext ctx) {
        List<String> identifierNodes = (List<String>) visit(ctx.identifierList());

        ExprList el = (ExprList) visit(ctx.expressionList());

        return VarAssignMultiStmt.builder().dataNames(identifierNodes).data(el).build();
    }

    @Override
    public BuildInFunction.OutStmt visitOutStmt(LafiteParser.OutStmtContext ctx) {

        List<SyntaxNode> nodes = new ArrayList<>();
        for (LafiteParser.MixListContext mixList : ctx.mixList()) {
            nodes.add((SyntaxNode) visit(mixList));
        }

        return BuildInFunction.OutStmt.builder().nodes(nodes).build();
    }

    @Override
    public Object visitMixList(LafiteParser.MixListContext ctx) {

        if (null != ctx.IDENTIFIER()) {
            return ExprStmtIdentify.builder().idName(ctx.IDENTIFIER().getText());

        } else if (null != ctx.expression()) {
            //委托下去
            return visit(ctx.expression());
        } else {
            //委托下去
            return visit(ctx.basicLit());
        }

    }


    //解析ifelse

    //TODO:增加elseif
    @Override
    public IfStmt visitIfStmt(LafiteParser.IfStmtContext ctx) {

        SyntaxNode condition = (SyntaxNode) visit(ctx.expression());
        BlockStmt ifBlock = (BlockStmt) visit(ctx.block(0));

        BlockStmt elseBlock = (BlockStmt) visit(ctx.block(1));
        return IfStmt.builder().condition(condition)
                .block(ifBlock)
                .elseBlock(elseBlock).build();
    }

    @Override
    public WhileStmt visitWhileStmt(LafiteParser.WhileStmtContext ctx) {
        SyntaxNode condition = (SyntaxNode) visit(ctx.expression());

        BlockStmt block = (BlockStmt) visit(ctx.block());
        return WhileStmt.builder().condition(condition).block(block).build();
    }

    //解析block中各种元素end

    public void compile(Compiler compiler) {
        currentSource.compile(compiler);
    }

    public void dumpSourceCode() {
        currentSource.dumpSourceCode();
    }
}
