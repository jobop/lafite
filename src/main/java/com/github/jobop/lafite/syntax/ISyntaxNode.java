package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;

/**
 * Created by Enzo Cotter on 2020/3/18.
 */
public interface ISyntaxNode {

    public void compile(Compiler compiler);

    public void dumpSourceCode();
}
