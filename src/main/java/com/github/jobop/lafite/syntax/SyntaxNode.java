package com.github.jobop.lafite.syntax;


import com.github.jobop.lafite.compiler.Compiler;
import com.sun.tools.javac.resources.compiler;

import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/15.
 */
public abstract class SyntaxNode {


    private int lineNum = 0;

    public SyntaxNode(int lineNum) {
        this.lineNum = lineNum;
    }

    public void peekLocalByteCode() {
        Compiler compiler = new Compiler();
        compile(compiler);
        compiler.dumpByteCode();
    }

    public List<String> getLocalByteCodeSeq() {
        Compiler compiler = new Compiler();
        compile(compiler);
        return compiler.getByteCodeSeque();
    }

    public abstract void compile(Compiler compiler);

    public abstract void dumpSourceCode();

    public int getLineNum() {
        return lineNum;
    }


}
