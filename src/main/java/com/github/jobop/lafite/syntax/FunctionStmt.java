package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Enzo Cotter on 2020/3/14.
 */
@Builder
@Data
public class FunctionStmt extends SyntaxNode {
    private int lineNum;
    String nameSpace = "";
    String functionName = "";
    @Singular
    List<SyntaxNode> params = new ArrayList<>();

    BlockStmt block = null;


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
            block = block.toBuilder().node(RetStmt.builder().lineNum(getLineNum()).build()).build();
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

}
