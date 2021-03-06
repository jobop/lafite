package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/14.
 */
@Builder
@Data
public class VarAssignMultiStmt extends SyntaxNode {
    private int lineNum;
    @Singular
    List<String> dataNames = new ArrayList<>();
    SyntaxNode data;


    @Override
    public void compile(Compiler compiler) {
        data.compile(compiler);
        //反过来取栈数据
        for(int i=dataNames.size()-1;i>=0;i--){
            compiler.insertOpCode(Opcode.VARASSIGN, getLineNum(), dataNames.get(i));
        }
    }

    @Override
    public void dumpSourceCode() {
        //const aaa=1
        for (String dataName : dataNames) {
            System.out.print(dataName + ",");
        }
        System.out.print(" =");

        data.dumpSourceCode();
        System.out.println();
    }

}
