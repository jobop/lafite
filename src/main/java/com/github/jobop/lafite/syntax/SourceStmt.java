package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Enzo Cotter on 2020/3/14.
 */
public class SourceStmt extends SyntaxNode {
    List<Namespace> namespaceList = new ArrayList<>();

    public SourceStmt(int lineNum) {
        super(lineNum);
    }

    public List<Namespace> getNamespaceList() {
        return namespaceList;
    }

    public void setNamespaceList(List<Namespace> namespaceList) {
        this.namespaceList = namespaceList;
    }

    @Override
    public void compile(Compiler compiler) {
        for (Namespace ns : namespaceList) {
            ns.compile(compiler);
        }
    }

    @Override
    public void dumpSourceCode() {

        for (Namespace ns : namespaceList) {
            System.out.println();
            ns.dumpSourceCode();
        }

    }
}
