package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/14.
 */
@Builder
@Data
public class FunctionStmt extends SyntaxNode {
    private int lineNum;
    String nameSpace = "";
    String functionName = "";
    SignatureStmt signatureStmt = null;

    BlockStmt block = null;


    @Override
    public void compile(Compiler compiler) {


        int paramCount = 0;
        if (null != signatureStmt && null != signatureStmt.getParameterList() && null != signatureStmt.getParameterList().getPids()) {
            paramCount = signatureStmt.getParameterList().getPids().getNodes().size();
        }

        compiler.registFuction(nameSpace + "." + functionName, paramCount);
        compiler.insertOpCode(Opcode.FUC, getLineNum(), nameSpace + "." + functionName);

        //这里会从栈里面获取数据放到局部变量（CALL的时候放进去）
        signatureStmt.compile(compiler);

        //如果没有返回语句，给他加一个(强制方法的block里面需要有return)
        boolean hasRet = false;
        for (SyntaxNode node : block.getNodes()) {
            if (RetStmt.class.isAssignableFrom(node.getClass())) {
                hasRet = true;
            }
        }
        if (!hasRet) {
            block = block.toBuilder().node(RetStmt.builder().lineNum(getLineNum()).build()).build();
        }
        block.compile(compiler);
    }

    @Override
    public void dumpSourceCode() {
        System.out.print("func " + functionName + " ");
        signatureStmt.dumpSourceCode();

        block.dumpSourceCode();
    }

}
