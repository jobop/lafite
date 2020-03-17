package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Enzo Cotter on 2020/3/14.
 */
public class FunctionStmt extends SyntaxNode {
    String nameSpace = "";
    String functionName = "";
    List<SyntaxNode> params = new ArrayList<>();

    BlockStmt block = null;


    public FunctionStmt(String nameSpace, String functionName, int lineNum) {
        super(lineNum);
        this.nameSpace = nameSpace;
        this.functionName = functionName;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public BlockStmt getBlock() {
        return block;
    }

    public void setBlock(BlockStmt block) {
        this.block = block;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }


    @Override
    public void compile(Compiler compiler) {
        compiler.registFuction(nameSpace + "." + functionName, params.size());
        compiler.insertOpCode(Opcode.FUC, getLineNum(), nameSpace + "." + functionName);

        //这里会从栈里面获取数据放到局部变量（CALL的时候放进去）
        for (SyntaxNode param : params) {
            param.compile(compiler);
        }

        //如果没有返回语句，给他加一个(强制方法的block里面需要有return)
        boolean hasRet = false;
        for (SyntaxNode node : block.getNodes()) {
            if (RetStmt.class.isAssignableFrom(node.getClass())) {
                hasRet = true;
            }
        }
        if (!hasRet) {
            block.getNodes().add(new RetStmt(getLineNum()));
        }
        block.compile(compiler);
    }

    @Override
    public void dumpSourceCode() {
        System.out.print("func " + functionName + " (");
        for (SyntaxNode param : params) {
            param.dumpSourceCode();
            System.out.print(",");
        }
        System.out.print(")");

        block.dumpSourceCode();
    }

    public List<SyntaxNode> getParams() {
        return params;
    }

    public void setParams(List<SyntaxNode> params) {
        this.params = params;
    }
}
