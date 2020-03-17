package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/14.
 */
public class BlockStmt extends SyntaxNode {
    List<SyntaxNode> nodes = new ArrayList<>();

    public BlockStmt(int lineNum) {
        super(lineNum);
    }


    public List<SyntaxNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<SyntaxNode> nodes) {
        this.nodes = nodes;
    }


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
