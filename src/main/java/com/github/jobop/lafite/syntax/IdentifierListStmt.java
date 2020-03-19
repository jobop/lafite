package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.syntax.expr.ExprStmtIdentify;
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
public class IdentifierListStmt extends SyntaxNode {
    @Singular
    private List<ExprStmtIdentify> identifys = new ArrayList<>();

    @Override
    public void compile(Compiler compiler) {
        for (ExprStmtIdentify identify : identifys) {
            identify.compile(compiler);
        }

    }

    @Override
    public void dumpSourceCode() {
        for (ExprStmtIdentify identify : identifys) {
            identify.dumpSourceCode();
        }
    }
}
