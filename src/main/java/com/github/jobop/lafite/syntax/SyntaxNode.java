package com.github.jobop.lafite.syntax;


import com.github.jobop.lafite.compiler.Compiler;
import com.sun.tools.javac.resources.compiler;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/15.
 */
@Data
public abstract class SyntaxNode implements ISyntaxNode {

    public void peekLocalByteCode() {

        Compiler compiler = new Compiler();
        compile(compiler);
        compiler.dumpByteCode();

    }

    public List<String> getLocalByteCodeSeq() {
        Compiler compiler = new Compiler();
        compile(compiler);
        return compiler.getByteCodeSeque();
    }

}
