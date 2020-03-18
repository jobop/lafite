package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Enzo Cotter on 2020/3/17.
 */
@Builder
@Data
public class ParamStmt extends SyntaxNode {
    private int lineNum;
    String dataName;


    @Override
    public void compile(Compiler compiler) {
        compiler.insertOpCode(Opcode.STACKDECL, getLineNum(), dataName);
    }

    @Override
    public void dumpSourceCode() {
        System.out.print(dataName);
    }

}
