package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Enzo Cotter on 2020/3/16.
 */
@Builder
@Data
public class Operator extends SyntaxNode {
    private int lineNum;
    @Override
    public void compile(Compiler compiler) {

    }

    @Override
    public void dumpSourceCode() {

    }
}
