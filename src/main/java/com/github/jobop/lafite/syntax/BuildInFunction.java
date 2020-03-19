package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/17.
 */
public class BuildInFunction {
    @Builder
    @Data
    public static class OutStmt extends SyntaxNode {
        private int lineNum;
        @Singular
        private List<SyntaxNode> nodes = new ArrayList<>();


        @Override
        public void compile(Compiler compiler) {

            for (int i = 0; i < nodes.size(); i++) {
                nodes.get(i).compile(compiler);
                compiler.insertOpCode(Opcode.OUT, getLineNum());
            }

        }

        @Override
        public void dumpSourceCode() {
            System.out.print("out ");
            for (int i = 0; i < nodes.size(); i++) {
                nodes.get(i).dumpSourceCode();
            }
            System.out.println();
        }

    }


}
