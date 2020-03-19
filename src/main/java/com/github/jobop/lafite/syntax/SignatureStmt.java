package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Enzo Cotter on 2020/3/19.
 */
@Builder
@Data
public class SignatureStmt extends SyntaxNode {

    ParametersStmt parameterList;


    @Override
    public void compile(Compiler compiler) {
        parameterList.compile(compiler);
    }

    @Override
    public void dumpSourceCode() {
        parameterList.dumpSourceCode();

    }
}
