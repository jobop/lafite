package com.github.jobop.lafite;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.vm.execute.ProcessEngine;
import com.github.jobop.lafite.syntax.*;
import com.github.jobop.lafite.syntax.expr.*;
import com.github.jobop.lafite.syntax.expr.Operator;
import com.github.jobop.lafite.utils.TypeUtils;

/**
 * Created by Enzo Cotter on 2020/3/17.
 */
public class Test {


    public static void main(String[] args) {


        Namespace ns1 = Namespace.builder()
                .nameSpaceName("main")
                .lineNum(0)
                .node(assembCallFunction())
                .build();


        Namespace ns2 = Namespace.builder()
                .nameSpaceName("nameSpace2")
                .lineNum(1)
                .node(assembBeCallFunction())
                .build();

        SourceStmt ss = SourceStmt.builder()
                .lineNum(0)
                .namespace(ns1)
                .build();

        SourceStmt ss2 = SourceStmt.builder()
                .lineNum(0)
                .namespace(ns2)
                .build();


        Compiler compiler = new Compiler();

        ss.compile(compiler);
        ss2.compile(compiler);

        ss.dumpSourceCode();
        ss2.dumpSourceCode();

        compiler.dumpByteCode();


        ProcessEngine engine = new ProcessEngine();
        engine.execute(compiler.getAssembByteCode());

    }

    private static FunctionStmt assembCallFunction() {
        FunctionStmt functionStmt = FunctionStmt.builder()
                .nameSpace("main")
                .functionName("main")
                .signatureStmt(SignatureStmt.builder().parameterList(ParametersStmt.builder().pids(ParamIdentifierListStmt.builder().build()).build()).build())
                .lineNum(1)
                .block(assembleCallFunctionBlockStmt())
                .build();
        return functionStmt;

    }

    private static BlockStmt assembleCallFunctionBlockStmt() {


        CallStmt callStmt = CallStmt.builder().lineNum(3)
                .functionId("nameSpace2.fuckFunction2")
                .params(ExprList.builder().expr(ExprStmtData.builder().lineNum(3).data(TypeUtils.transferType("66")).build())
                        .expr(ExprStmtData.builder().lineNum(3).data(TypeUtils.transferType("77")).build()).build())
                .build();

        LocalVarDeclMultiStmt localVarDeclMultiStmt = LocalVarDeclMultiStmt.builder().lineNum(11)
                .dataName("o1").dataName("o2").data(callStmt).build();


        ExprStmtIdentify o1 = ExprStmtIdentify.builder().lineNum(12).idName("o1").build();
        ExprStmtIdentify o2 = ExprStmtIdentify.builder().lineNum(12).idName("o2").build();

        BuildInFunction.OutStmt out1 = BuildInFunction.OutStmt.builder().lineNum(12).node(ExprList.builder().expr(o1).expr(o2).build()).build();

        BuildInFunction.OutStmt out3 = BuildInFunction.OutStmt.builder()
                .lineNum(12)
                .node(

                        ExprList.builder().expr(ExprStmtData.builder().data(TypeUtils.transferType("\"hello\""))
                                .build()).build()


                ).build();


        BlockStmt blockStmt = BlockStmt.builder().lineNum(2)
                .node(localVarDeclMultiStmt)
                .node(out3)
                .node(out1)
                .build();


        return blockStmt;
    }

    private static FunctionStmt assembBeCallFunction() {
//        ExprStmtParamIdentify.builder().lineNum(4).idName("p1").build()
//        ExprStmtParamIdentify.builder().lineNum(4).idName("p2").build()
        FunctionStmt functionStmt = FunctionStmt.builder().lineNum(4).nameSpace("nameSpace2").functionName("fuckFunction2")
                .signatureStmt(

                        SignatureStmt.builder().parameterList(
                                ParametersStmt.builder()
                                        .pids(
                                                ParamIdentifierListStmt.builder()
                                                        .node(ExprStmtParamIdentify.builder().lineNum(4).idName("p1").build())
                                                        .node(ExprStmtParamIdentify.builder().lineNum(4).idName("p2").build())
                                                        .build()
                                        )

                                        .build()

                        ).build()


                )
                .block(assembleBlockStmt()).build();

        return functionStmt;

    }


    private static void testBlock() {
        BlockStmt blockStmt = assembleBlockStmt();

        Compiler compiler = new Compiler();
        blockStmt.compile(compiler);
        compiler.dumpByteCode();

        ProcessEngine engine = new ProcessEngine();
        engine.execute(compiler.getByteCodeSeque());
    }

    private static BlockStmt assembleBlockStmt() {


        LocalVarDeclMultiStmt cs1 = LocalVarDeclMultiStmt.builder().lineNum(11).dataName("aaa")
                .data(ExprStmtData.builder().lineNum(11).data(TypeUtils.transferType("1")).build())
                .build();


        ExprStmtWithTwo et2 = ExprStmtWithTwo.builder()
                .left(ExprStmtData.builder().lineNum(12).data(TypeUtils.transferType("\"asdf\"")).build())
                .op(Operator.ADD)
                .right(ExprStmtData.builder().lineNum(12).data(TypeUtils.transferType("\"qwer\"")).build()).build();

        LocalVarDeclMultiStmt cs2 = LocalVarDeclMultiStmt.builder().lineNum(12)
                .dataName("bbb")
                .data(et2).build();


        LocalVarDeclMultiStmt cs3 = LocalVarDeclMultiStmt.builder().lineNum(13)
                .dataName("a")
                .data(
                        ExprStmtData.builder().lineNum(13).data(TypeUtils.transferType("3.1415926")).build()

                ).build();


        ExprStmtWithTwo et1 = ExprStmtWithTwo.builder().lineNum(15)
                .left(ExprStmtIdentify.builder().lineNum(15).idName("aaa").build())
                .op(Operator.ADD)
                .right(ExprStmtIdentify.builder().lineNum(15).idName("a").build())
                .build();


        ExprStmtWithTwo et = ExprStmtWithTwo.builder().lineNum(15)
                .left(et1)
                .op(Operator.GTEQ)
                .right(ExprStmtData.builder().lineNum(15).data(TypeUtils.transferType("5")).build())
                .build();


        LocalVarDeclMultiStmt vr1 = LocalVarDeclMultiStmt.builder().lineNum(15).dataName("ddd").data(
                ExprStmtData.builder().lineNum(16).data(TypeUtils.transferType("9999")).build()
        ).build();


        BlockStmt ifBlock = BlockStmt.builder().lineNum(16)
                .node(vr1).build();


        LocalVarDeclMultiStmt vr2 = LocalVarDeclMultiStmt.builder().lineNum(19).dataName("ddd")
                .data(ExprStmtData.builder().lineNum(19)
                        .data(TypeUtils.transferType("10000")).build()).build();


        BlockStmt elseBlock = BlockStmt.builder().lineNum(18)
                .node(vr2).build();

        IfStmt ifStmt = IfStmt.builder().lineNum(14)
                .condition(et)
                .block(ifBlock)
                .elseBlock(elseBlock).build();


        ExprStmtWithTwo et22 = ExprStmtWithTwo.builder().lineNum(15)
                .left(ExprStmtIdentify.builder().lineNum(15).idName("ddd").build())
                .op(Operator.ADD)
                .right(ExprStmtIdentify.builder().lineNum(15).idName("a").build())
                .build();


        BuildInFunction.OutStmt out = BuildInFunction.OutStmt.builder().lineNum(15).node(
                ExprList.builder().expr(et22).build()


        ).build();


        ExprStmtWithTwo et3 = ExprStmtWithTwo.builder().lineNum(15)
                .left(ExprStmtData.builder().lineNum(15).data("asdf").build())
                .op(Operator.ADD)
                .right(ExprStmtIdentify.builder().lineNum(15).idName("a").build())
                .build();


        BuildInFunction.OutStmt out2 = BuildInFunction.OutStmt.builder().lineNum(13).node(
                ExprList.builder().expr(et3).build()


        ).build();


        LocalVarDeclMultiStmt w1 = LocalVarDeclMultiStmt.builder().lineNum(23)
                .dataName("w1")
                .data(ExprStmtData.builder().lineNum(23).data(TypeUtils.transferType("1")).build())
                .build();


        VarAssignMultiStmt cs4 = VarAssignMultiStmt.builder().lineNum(24)
                .dataName("a")
                .data(
                        ExprStmtWithTwo.builder().left(ExprStmtIdentify.builder().lineNum(24).idName("a").build())
                                .op(Operator.ADD)
                                .right(ExprStmtData.builder().lineNum(24).data(TypeUtils.transferType("1")).build())
                                .build()

                )
                .build();


        VarAssignMultiStmt w2 = VarAssignMultiStmt.builder().lineNum(26)
                .dataName("w1")
                .data(
                        ExprStmtWithTwo.builder().lineNum(26)
                                .left(ExprStmtIdentify.builder().lineNum(26).idName("w1").build())
                                .op(Operator.ADD)
                                .right(ExprStmtData.builder().lineNum(26).data(TypeUtils.transferType("1")).build())
                                .build()

                )
                .build();


        VarAssignMultiStmt _p1 = VarAssignMultiStmt.builder().lineNum(28)
                .dataName("p1")
                .data(
                        ExprStmtWithTwo.builder().lineNum(28)
                                .left(ExprStmtIdentify.builder().lineNum(28).idName("p1").build())
                                .op(Operator.ADD)
                                .right(ExprStmtData.builder().lineNum(28).data(TypeUtils.transferType("1")).build())
                                .build()

                )
                .build();


        VarAssignMultiStmt _p2 = VarAssignMultiStmt.builder().lineNum(29)
                .dataName("p2")
                .data(
                        ExprStmtWithTwo.builder().lineNum(29)
                                .left(ExprStmtIdentify.builder().lineNum(29).idName("p2").build())
                                .op(Operator.ADD)
                                .right(ExprStmtData.builder().lineNum(29).data(TypeUtils.transferType("1")).build())
                                .build()

                )
                .build();

        BuildInFunction.OutStmt out3 = BuildInFunction.OutStmt.builder().lineNum(23).node(

                ExprList.builder().expr(ExprStmtIdentify.builder().lineNum(23).idName("w1").build()).build()

        ).build();


        BlockStmt whileBlock = BlockStmt.builder().lineNum(22)
                .node(cs4)
                .node(w2)
                .node(_p1)
                .node(_p2)
                .node(out3)
                .build();


        WhileStmt ws = WhileStmt.builder().lineNum(22)
                .condition(ExprStmtWithTwo.builder()
                        .left(ExprStmtIdentify.builder().lineNum(24).idName("w1").build())
                        .op(Operator.LTEQ)
                        .right(ExprStmtData.builder().lineNum(24).data(TypeUtils.transferType("10")).build())
                        .build()
                ).block(whileBlock).build();


        RetStmt rs = RetStmt.builder().lineNum(30)
                .rets(
                        ExprList.builder().expr(ExprStmtIdentify.builder().lineNum(30).idName("p1").build()).expr(ExprStmtIdentify.builder().lineNum(30).idName("p2").build()).build()
                )
                .build();


        BlockStmt blockStmt = BlockStmt.builder().lineNum(10)
                .node(cs1)
                .node(cs2)
                .node(cs3)
                .node(ifStmt)
                .node(out)
                .node(out2)
                .node(w1)
                .node(ws)
                .node(rs)
                .build();


        return blockStmt;
    }
}
