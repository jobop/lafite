package com.github.jobop.lafite.syntax.expr;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.syntax.SyntaxNode;

/**
 * Created by Enzo Cotter on 2020/3/16.
 */
public class ExprStmtData extends ExprStmt {
    Object data;

    public ExprStmtData(Object data, int lineNum) {
        super(lineNum);
        this.data = data;
    }

    @Override
    public void compile(Compiler compiler) {
        compiler.insertOpCode(Opcode.getConstOpcode(data), getLineNum(), data.toString());
    }

    @Override
    public void dumpSourceCode() {
        System.out.print(data);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
