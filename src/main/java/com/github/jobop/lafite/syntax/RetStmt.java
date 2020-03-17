package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/17.
 */
public class RetStmt extends SyntaxNode {
    List<SyntaxNode> rets = new ArrayList<>();

    public RetStmt(int lineNum) {
        super(lineNum);
    }

    @Override
    public void compile(Compiler compiler) {
        for (SyntaxNode ret : rets) {
            ret.compile(compiler);
        }
        compiler.insertOpCode(Opcode.RET, getLineNum(), String.valueOf(rets.size()));

    }

    @Override
    public void dumpSourceCode() {
        System.out.print("return ");
        for (SyntaxNode ret : rets) {
            ret.dumpSourceCode();
            System.out.print(",");
        }
        System.out.println();
    }

    public List<SyntaxNode> getRets() {
        return rets;
    }

    public void setRets(List<SyntaxNode> rets) {
        this.rets = rets;
    }
}
