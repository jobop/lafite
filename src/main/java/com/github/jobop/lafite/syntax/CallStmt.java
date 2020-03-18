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
public class CallStmt extends SyntaxNode {
    private int lineNum;
    private String nameSpace;
    private String functionName;

    @Singular
    List<SyntaxNode> params = new ArrayList<>();


    @Override
    public void compile(Compiler compiler) {
        for (SyntaxNode param : params) {
            param.compile(compiler);
        }
        //把执行方法后，返回位置压栈，方便方法返回

        //执行引擎收到call命令，要去方法列表中查找function位置，并把执行指针执向那个鬼地方
        //FIXME:栈帧变了，被调用方法找不到这些栈内参数，是否需要带过去？？
        compiler.insertOpCode(Opcode.CALL, getLineNum(), nameSpace + "." + functionName, params.size() + "");
    }

    @Override
    public void dumpSourceCode() {
        System.out.print(nameSpace + "." + functionName + "(");
        for (SyntaxNode param : params) {
            param.dumpSourceCode();
            System.out.print(",");
        }
        System.out.println(")");
    }

}
