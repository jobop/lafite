package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.syntax.expr.ExprStmt;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Enzo Cotter on 2020/3/17.
 */
public class BuildInFunction {
    @Builder
    @Data
    public static class OutStmt extends SyntaxNode {
        private int lineNum;
        ExprStmt expr;


        @Override
        public void compile(Compiler compiler) {
            expr.compile(compiler);
            compiler.insertOpCode(Opcode.OUT, getLineNum());
        }

        @Override
        public void dumpSourceCode() {
            System.out.print("out ");
            expr.dumpSourceCode();
            System.out.println();
        }

    }


}
