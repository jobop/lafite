package com.github.jobop.lafite;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.vm.execute.ProcessEngine;
import com.github.jobop.lafite.syntax.*;
import com.github.jobop.lafite.syntax.expr.ExprStmtData;
import com.github.jobop.lafite.syntax.expr.ExprStmtIdentify;
import com.github.jobop.lafite.syntax.expr.ExprStmtWithTwo;
import com.github.jobop.lafite.syntax.expr.Operator;
import com.github.jobop.lafite.utils.TypeUtils;

/**
 * Created by Enzo Cotter on 2020/3/17.
 */
public class Test {


    public static void main(String[] args) {
        SourceStmt ss = new SourceStmt(0);

        Namespace ns1 = new Namespace(1);
        ns1.setNameSpaceName("main");


        FunctionStmt callFunc = assembCallFunction();
        ns1.getNodes().add(callFunc);

        Namespace ns2 = new Namespace(1);
        ns2.setNameSpaceName("nameSpace2");
        FunctionStmt beCallFunc = assembBeCallFunction();
        ns2.getNodes().add(beCallFunc);


        ss.getNamespaceList().add(ns1);
        ss.getNamespaceList().add(ns2);


        Compiler compiler = new Compiler();
        ss.compile(compiler);

        ss.dumpSourceCode();


        compiler.dumpByteCode();


        ProcessEngine engine = new ProcessEngine();
        engine.execute(compiler.getAssembByteCode());

    }

    private static FunctionStmt assembCallFunction() {
        FunctionStmt functionStmt = new FunctionStmt("main", "main", 1);
        BlockStmt callStmt = assembleCallFunctionBlockStmt();


        functionStmt.setBlock(callStmt);
        return functionStmt;

    }

    private static BlockStmt assembleCallFunctionBlockStmt() {
        BlockStmt blockStmt = new BlockStmt(2);

        CallStmt callStmt = new CallStmt(3);
        callStmt.setNameSpace("nameSpace2");
        callStmt.setFunctionName("fuckFunction2");
        callStmt.getParams().add(new ExprStmtData(TypeUtils.transferType("66"), 3));
        callStmt.getParams().add(new ExprStmtData(TypeUtils.transferType("77"), 3));

        VarAssignMultiStmt varAssignMultiStmt = new VarAssignMultiStmt(11);
        varAssignMultiStmt.getDataNames().add("o1");
        varAssignMultiStmt.getDataNames().add("o2");
        varAssignMultiStmt.setData(callStmt);


        blockStmt.getNodes().add(varAssignMultiStmt);


        ExprStmtIdentify o1 = new ExprStmtIdentify("o1", 12);
        ExprStmtIdentify o2 = new ExprStmtIdentify("o2", 12);

        BuildInFunction.OutStmt out1 = new BuildInFunction.OutStmt(12);
        BuildInFunction.OutStmt out2 = new BuildInFunction.OutStmt(12);

        BuildInFunction.OutStmt out3 = new BuildInFunction.OutStmt(12);

        out3.setExpr(new ExprStmtData(TypeUtils.transferType("\"hello\""), 12));

        out1.setExpr(o1);
        out2.setExpr(o2);

        blockStmt.getNodes().add(out3);
        blockStmt.getNodes().add(out1);
        blockStmt.getNodes().add(out2);



        return blockStmt;
    }

    private static FunctionStmt assembBeCallFunction() {
        FunctionStmt functionStmt = new FunctionStmt("nameSpace2", "fuckFunction2", 4);
        functionStmt.getParams().add(new ParamStmt("p1", 4));
        functionStmt.getParams().add(new ParamStmt("p2", 4));

        functionStmt.setBlock(assembleBlockStmt());

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
        BlockStmt blockStmt = new BlockStmt(10);

        ConstAssignStmt cs1 = new ConstAssignStmt(11);
        cs1.setDataName("aaa");
        cs1.setData(new ExprStmtData(TypeUtils.transferType("1"), 11));

        ConstAssignStmt cs2 = new ConstAssignStmt(12);
        cs2.setDataName("bbb");


        cs2.setData(new ExprStmtWithTwo(new ExprStmtData(TypeUtils.transferType("\"asdf\""), 12), Operator.ADD, new ExprStmtData(TypeUtils.transferType("\"qwer\""), 12), 12));

        ConstAssignStmt cs3 = new ConstAssignStmt(13);
        cs3.setDataName("a");

        cs3.setData(new ExprStmtData(TypeUtils.transferType("3.1415926"), 13));


        IfStmt ifStmt = new IfStmt(14);

        ExprStmtWithTwo et = new ExprStmtWithTwo(new ExprStmtWithTwo(new ExprStmtIdentify("aaa", 15), Operator.ADD, new ExprStmtIdentify("a", 15), 15), Operator.GTEQ, new ExprStmtData(TypeUtils.transferType("5"), 15), 15);
        ifStmt.setCondition(et);


        BlockStmt ifBlock = new BlockStmt(16);
        VarAssignStmt vr1 = new VarAssignStmt(17);
        vr1.setDataName("ddd");


        vr1.setData(new ExprStmtData(TypeUtils.transferType("9999"), 17));
        ifBlock.getNodes().add(vr1);


        ifStmt.setBlock(ifBlock);

        BlockStmt elseBlock = new BlockStmt(18);
        VarAssignStmt vr2 = new VarAssignStmt(19);
        vr2.setDataName("ddd");

        vr2.setData(new ExprStmtData(TypeUtils.transferType("10000"), 19));
        elseBlock.getNodes().add(vr2);

        ifStmt.setElseBlock(elseBlock);


        blockStmt.getNodes().add(cs1);
        blockStmt.getNodes().add(cs2);
        blockStmt.getNodes().add(cs3);
        blockStmt.getNodes().add(ifStmt);

        BuildInFunction.OutStmt out = new BuildInFunction.OutStmt(20);
        ExprStmtWithTwo et2 = new ExprStmtWithTwo(new ExprStmtIdentify("ddd", 15), Operator.ADD, new ExprStmtIdentify("a", 15), 15);
        out.setExpr(et2);

        blockStmt.getNodes().add(out);


        BuildInFunction.OutStmt out2 = new BuildInFunction.OutStmt(21);
        ExprStmtWithTwo et3 = new ExprStmtWithTwo(new ExprStmtData("asdf", 15), Operator.ADD, new ExprStmtIdentify("a", 15), 15);
        out2.setExpr(et3);

        blockStmt.getNodes().add(out2);

        VarAssignStmt w1 = new VarAssignStmt(23);
        w1.setDataName("w1");
        w1.setData(new ExprStmtData(TypeUtils.transferType("1"), 23));
        blockStmt.getNodes().add(w1);

        WhileStmt ws = new WhileStmt(22);


        ws.setCondition(new ExprStmtWithTwo(new ExprStmtIdentify("w1", 24), Operator.LTEQ, new ExprStmtData(TypeUtils.transferType("10"), 24), 24));


        BlockStmt whileBlock = new BlockStmt(22);
        ConstAssignStmt cs4 = new ConstAssignStmt(22);
        cs4.setDataName("a");
        cs4.setData(new ExprStmtWithTwo(new ExprStmtIdentify("a", 13), Operator.ADD, new ExprStmtData(TypeUtils.transferType("1"), 13), 22));
        whileBlock.getNodes().add(cs4);


        VarAssignStmt w2 = new VarAssignStmt(26);
        w2.setDataName("w1");
        w2.setData(new ExprStmtWithTwo(new ExprStmtIdentify("w1", 26), Operator.ADD, new ExprStmtData(TypeUtils.transferType("1"), 26), 26));
        whileBlock.getNodes().add(w2);


        VarAssignStmt _p1 = new VarAssignStmt(28);
        _p1.setDataName("p1");
        _p1.setData(new ExprStmtWithTwo(new ExprStmtIdentify("p1", 27), Operator.ADD, new ExprStmtData(TypeUtils.transferType("1"), 27), 27));


        VarAssignStmt _p2 = new VarAssignStmt(29);
        _p2.setDataName("p2");
        _p2.setData(new ExprStmtWithTwo(new ExprStmtIdentify("p1", 29), Operator.ADD, new ExprStmtData(TypeUtils.transferType("1"), 29), 29));

        whileBlock.getNodes().add(_p1);
        whileBlock.getNodes().add(_p2);


        BuildInFunction.OutStmt out3 = new BuildInFunction.OutStmt(23);
        out3.setExpr(new ExprStmtIdentify("w1", 23));
        whileBlock.getNodes().add(out3);


        ws.setBlock(whileBlock);


        blockStmt.getNodes().add(ws);


        RetStmt rs = new RetStmt(30);
        rs.getRets().add(new ExprStmtIdentify("p1", 30));
        rs.getRets().add(new ExprStmtIdentify("p2", 30));

        blockStmt.getNodes().add(rs);


        return blockStmt;
    }
}
