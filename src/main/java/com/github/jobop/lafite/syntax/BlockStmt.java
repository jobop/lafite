package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/14.
 */
@Builder(toBuilder = true)
@Data
public class BlockStmt extends SyntaxNode {
    private int lineNum;
    @Singular
    List<SyntaxNode> nodes ;

    @Override
    public void compile(Compiler compiler) {
        compiler.pushNode(this);
        for (SyntaxNode node : nodes) {
            node.compile(compiler);
        }
    }

    @Override
    public void dumpSourceCode() {
        System.out.println("{");
        for (SyntaxNode node : nodes) {
            node.dumpSourceCode();
        }
        System.out.println("}");
    }


}
