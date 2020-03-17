package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.syntax.expr.ExprStmt;

import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/14.
 */
public class ConstAssignStmt extends SyntaxNode {

    String dataName;
    SyntaxNode data;

    public ConstAssignStmt(int lineNum) {
        super(lineNum);
    }

    @Override
    public void compile(Compiler compiler) {
        data.compile(compiler);
        compiler.insertOpCode(Opcode.CONSTSTORE, getLineNum(), dataName);
    }

    @Override
    public void dumpSourceCode() {
        //const aaa=1
        System.out.print("const " + dataName + "=" );
        data.dumpSourceCode();
        System.out.println();
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public SyntaxNode getData() {
        return data;
    }

    public void setData(SyntaxNode data) {
        this.data = data;
    }
}
