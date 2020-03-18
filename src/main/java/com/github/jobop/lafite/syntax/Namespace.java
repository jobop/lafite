package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Enzo Cotter on 2020/3/14.
 */
@Builder(toBuilder = true)
@Data
public class Namespace extends SyntaxNode {
    private int lineNum;
    private String nameSpaceName;
    @Singular
    List<SyntaxNode> nodes = new ArrayList<>();


    @Override
    public void compile(Compiler compiler) {
        for (SyntaxNode node : nodes) {
            node.compile(compiler);
        }
    }

    @Override
    public void dumpSourceCode() {
        System.out.println("namespace"+" "+nameSpaceName);
        for (SyntaxNode node : nodes) {
            node.dumpSourceCode();
        }

    }


}
