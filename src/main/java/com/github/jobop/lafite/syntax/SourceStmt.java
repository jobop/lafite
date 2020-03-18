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
@Builder
@Data
public class SourceStmt extends SyntaxNode {
    private int lineNum;
    @Singular
    List<Namespace> namespaces = new ArrayList<>();



    @Override
    public void compile(Compiler compiler) {
        for (Namespace ns : namespaces) {
            ns.compile(compiler);
        }
    }

    @Override
    public void dumpSourceCode() {

        for (Namespace ns : namespaces) {
            System.out.println();
            ns.dumpSourceCode();
        }

    }
}
