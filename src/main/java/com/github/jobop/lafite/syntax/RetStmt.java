package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.syntax.expr.ExprList;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/17.
 */
@Builder
@Data
public class RetStmt extends SyntaxNode {
    private int lineNum;
    ExprList rets;

    @Override
    public void compile(Compiler compiler) {
        if (null != rets) {
            rets.compile(compiler);
            compiler.insertOpCode(Opcode.RET, getLineNum(), String.valueOf(rets.getExprs().size()));
        } else {
            compiler.insertOpCode(Opcode.RET, getLineNum(), String.valueOf(0));
        }


    }

    @Override
    public void dumpSourceCode() {
        System.out.print("return ");
        if (null != rets) {
            rets.dumpSourceCode();
        }
        System.out.println();
    }

}
