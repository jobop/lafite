package com.github.jobop.lafite.syntax.expr;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.syntax.SyntaxNode;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Enzo Cotter on 2020/3/16.
 */
@Builder
@Data
public class ExprStmtIdentify extends ExprStmt {
    private int lineNum;
    String idName;

    @Override
    public void compile(Compiler compiler) {
        compiler.insertOpCode(Opcode.LOAD, getLineNum(), idName.toString());
    }

    @Override
    public void dumpSourceCode() {
        System.out.print(idName);
    }
}
