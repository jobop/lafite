package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.sun.tools.javac.resources.compiler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/14.
 */
public class ConstAssignMultiStmt extends SyntaxNode {

    List<String> dataNames = new ArrayList<>();
    SyntaxNode data;

    public ConstAssignMultiStmt(int lineNum) {
        super(lineNum);
    }

    @Override
    public void compile(Compiler compiler) {
        data.compile(compiler);
        for (String dataName : dataNames) {
            compiler.insertOpCode(Opcode.CONSTSTORE, getLineNum(), dataName);
        }

    }

    @Override
    public void dumpSourceCode() {
        //const aaa=1
        System.out.print("const ");
        for (String dataName : dataNames) {
            System.out.print(dataName+" ");
        }
        System.out.print(" =");

        data.dumpSourceCode();
        System.out.println();
    }

    public List<String> getDataNames() {
        return dataNames;
    }

    public void setDataNames(List<String> dataNames) {
        this.dataNames = dataNames;
    }

    public SyntaxNode getData() {
        return data;
    }

    public void setData(SyntaxNode data) {
        this.data = data;
    }
}
