package com.github.jobop.lafite.syntax.expr;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.syntax.SyntaxNode;

/**
 * Created by Enzo Cotter on 2020/3/16.
 */
public abstract class ExprStmt extends SyntaxNode {

    public ExprStmt(int lineNum) {
        super(lineNum);
    }
}
