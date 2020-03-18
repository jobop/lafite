package com.github.jobop.lafite.syntax.expr;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.syntax.SyntaxNode;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/19.
 */
@Builder
@Data
public class ExprList extends SyntaxNode {
    private int lineNum;
    private List<SyntaxNode> exprs = new ArrayList<>();

    @Override
    public void compile(Compiler compiler) {
        for (SyntaxNode node : exprs) {
            node.compile(compiler);
        }

    }

    @Override
    public void dumpSourceCode() {
        for (SyntaxNode node : exprs) {
            node.dumpSourceCode();
            System.out.print(",");
        }
    }
}
