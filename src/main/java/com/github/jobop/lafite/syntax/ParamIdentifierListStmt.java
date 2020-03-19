package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/19.
 */
@Builder
@Data
public class ParamIdentifierListStmt extends SyntaxNode {
    //PARAM_IDENTIFIER
    @Singular
    private List<SyntaxNode> nodes = new ArrayList<>();

    @Override
    public void compile(Compiler compiler) {
        for (SyntaxNode node : nodes) {
            node.compile(compiler);
        }

    }

    @Override
    public void dumpSourceCode() {
        for (SyntaxNode node : nodes) {
            node.dumpSourceCode();
            System.out.print(",");
        }
    }
}
