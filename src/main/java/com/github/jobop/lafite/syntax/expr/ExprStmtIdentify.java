package com.github.jobop.lafite.syntax.expr;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.syntax.SyntaxNode;

/**
 * Created by Enzo Cotter on 2020/3/16.
 */
public class ExprStmtIdentify extends ExprStmt {
    String idName;

    public ExprStmtIdentify(String idName, int lineNum) {
        super(lineNum);
        this.idName = idName;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    @Override
    public void compile(Compiler compiler) {
        compiler.insertOpCode(Opcode.LOAD, getLineNum(), idName.toString());
    }

    @Override
    public void dumpSourceCode() {
        System.out.print(idName);
    }
}
