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
@Builder
@Data
public class RetStmt extends SyntaxNode {
    private int lineNum;
    @Singular
    List<SyntaxNode> rets = new ArrayList<>();

    @Override
    public void compile(Compiler compiler) {
        for (SyntaxNode ret : rets) {
            ret.compile(compiler);
        }
        compiler.insertOpCode(Opcode.RET, getLineNum(), String.valueOf(rets.size()));

    }

    @Override
    public void dumpSourceCode() {
        System.out.print("return ");
        for (SyntaxNode ret : rets) {
            ret.dumpSourceCode();
            System.out.print(",");
        }
        System.out.println();
    }

}