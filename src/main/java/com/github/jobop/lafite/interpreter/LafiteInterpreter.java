package com.github.jobop.lafite.interpreter;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.runtime.opcode.OpcodeUtils;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by Enzo Cotter on 2020/3/11.
 */
public class LafiteInterpreter extends LafiteParserBaseListener {

    private Compiler compiler = new Compiler();




//
//    @Override
//    public void exitAssignExprToId(CalcParser.AssignExprToIdContext ctx) {
//        //匹配exp要继续拆解
//        //如果是int
////        if (ctx.expr().getRuleIndex() == 4) {
////            compiler.insertOpCode(Opcode.LDC, ctx, ctx.expr().getText());
////        } else if (ctx.expr().getRuleIndex() == 5) {
////            //如果是其他ID
////            compiler.insertOpCode(Opcode.LDV, ctx, variables.get(ctx.expr()).toString());
////        } else {
////            //如果是其他表达式
////            compiler.insertOpCode(Opcode.LDC, ctx, variables.get(ctx.expr()).toString());
////        }
//
//        compiler.insertOpCode(Opcode.STORE, ctx, ctx.ID().getText());
//
//    }
//
//
//    @Override
//    public void exitInt(CalcParser.IntContext ctx) {
//        compiler.insertOpCode(Opcode.LDC, ctx, ctx.INT().getText());
//    }
//
//    @Override
//    public void exitId(CalcParser.IdContext ctx) {
//        compiler.insertOpCode(Opcode.LOAD, ctx, ctx.ID().getText());
//    }
//
//
//    @Override
//    public void exitRet(CalcParser.RetContext ctx) {
//        compiler.insertOpCode(Opcode.LDC, ctx, "0");
//        compiler.insertOpCode(Opcode.RET, ctx);
//    }
//
//    @Override
//    public void exitRetINT(CalcParser.RetINTContext ctx) {
//        compiler.insertOpCode(Opcode.LDC, ctx, ctx.INT().getText());
//        compiler.insertOpCode(Opcode.RET, ctx);
//    }
//
//    @Override
//    public void exitRetID(CalcParser.RetIDContext ctx) {
//        compiler.insertOpCode(Opcode.LOAD, ctx, ctx.ID().getText());
//        compiler.insertOpCode(Opcode.RET, ctx);
//    }
//
//    @Override
//    public void exitOutStr(CalcParser.OutStrContext ctx) {
//        compiler.insertOpCode(Opcode.LDC, ctx, ctx.StringLiteral().getText());
//        compiler.insertOpCode(Opcode.OUT, ctx, ctx.StringLiteral().getText());
//    }
//
//    @Override
//    public void exitOutINT(CalcParser.OutINTContext ctx) {
//        compiler.insertOpCode(Opcode.LDC, ctx, ctx.INT().getText());
//        compiler.insertOpCode(Opcode.OUT, ctx, ctx.INT().getText());
//    }
//
//    @Override
//    public void exitOutID(CalcParser.OutIDContext ctx) {
//        compiler.insertOpCode(Opcode.LOAD, ctx, ctx.ID().getText());
//        compiler.insertOpCode(Opcode.OUT, ctx, ctx.ID().getText());
//    }
//
//    @Override
//    public void exitRetStr(CalcParser.RetStrContext ctx) {
//        compiler.insertOpCode(Opcode.LOAD, ctx, ctx.StringLiteral().getText());
//        compiler.insertOpCode(Opcode.OUT, ctx, ctx.StringLiteral().getText());
//    }
//
//    @Override
//    public void exitMulDiv(CalcParser.MulDivContext ctx) {
//        if (ctx.op.getType() == CalcParser.MUL) {
//            //分别判断参数1和参数2是ID还是INT，还是表达式
//            compiler.insertOpCode(Opcode.MUL, ctx);
//        } else {
//            compiler.insertOpCode(Opcode.DIV, ctx);
//        }
//    }
//
//    @Override
//    public void exitAddSub(CalcParser.AddSubContext ctx) {
//        if (ctx.op.getType() == CalcParser.ADD) {
//            compiler.insertOpCode(Opcode.ADD, ctx);
//        } else {
//            compiler.insertOpCode(Opcode.SUB, ctx);
//        }
//    }


    @Override
    public void exitFunc_(LafiteParser.Func_Context ctx) {
    }

    @Override
    public void exitLoperandName_IDENTIFIER(LafiteParser.LoperandName_IDENTIFIERContext ctx) {
    }

    @Override
    public void exitLinvokeParam_arguments_(LafiteParser.LinvokeParam_arguments_Context ctx) {
        System.out.println(ctx.arguments().getText());
    }

    @Override
    public void exitLcallFunc(LafiteParser.LcallFuncContext ctx) {
    }

    @Override
    public void exitLoperand_methodExpr_(LafiteParser.Loperand_methodExpr_Context ctx) {
    }

    public Compiler getCompiler() {
        return compiler;
    }

    public String dump() {
        return compiler.dumpToHex();
    }

    public void toFile(File file) {
        compiler.genFile(file);
    }
}
