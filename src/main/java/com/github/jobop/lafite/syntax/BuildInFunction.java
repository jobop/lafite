package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.syntax.expr.ExprStmt;

/**
 * Created by Enzo Cotter on 2020/3/17.
 */
public class BuildInFunction {

    public static class OutStmt extends SyntaxNode {
        ExprStmt expr;

        public OutStmt(int lineNum) {
            super(lineNum);
        }

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

        public ExprStmt getExpr() {
            return expr;
        }

        public void setExpr(ExprStmt expr) {
            this.expr = expr;
        }
    }


}
