package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;

/**
 * Created by Enzo Cotter on 2020/3/17.
 */
public class ParamStmt extends SyntaxNode {
    String dataName;

    public ParamStmt(String dataName,int lineNum) {
        super(lineNum);
        this.dataName=dataName;
    }

    @Override
    public void compile(Compiler compiler) {
        compiler.insertOpCode(Opcode.STACKSTORE, getLineNum(), dataName);
    }

    @Override
    public void dumpSourceCode() {
        System.out.print(dataName);
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }
}
