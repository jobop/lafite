package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Enzo Cotter on 2020/3/14.
 */
public class Namespace extends SyntaxNode {
    private String nameSpaceName;
    List<SyntaxNode> nodes = new ArrayList<>();

    public Namespace(int lineNum) {
        super(lineNum);
    }

    public String getNameSpaceName() {
        return nameSpaceName;
    }

    public void setNameSpaceName(String nameSpaceName) {
        this.nameSpaceName = nameSpaceName;
    }

    public List<SyntaxNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<SyntaxNode> nodes) {
        this.nodes = nodes;
    }

    @Override
    public void compile(Compiler compiler) {
        for (SyntaxNode node : nodes) {
            node.compile(compiler);
        }
    }

    @Override
    public void dumpSourceCode() {
        System.out.println(nameSpaceName+" ");
        for (SyntaxNode node : nodes) {
            node.dumpSourceCode();
        }

    }


}
