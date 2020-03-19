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
public class ParametersStmt extends SyntaxNode {
    ParamIdentifierListStmt pids = null;

    @Override
    public void compile(Compiler compiler) {
        if (null != pids) {
            pids.compile(compiler);
        }

    }

    @Override
    public void dumpSourceCode() {
        if (null != pids) {
            pids.dumpSourceCode();
        }
    }
}
