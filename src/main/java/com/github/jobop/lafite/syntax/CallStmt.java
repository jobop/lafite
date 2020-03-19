package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.syntax.expr.ExprList;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Enzo Cotter on 2020/3/17.
 */
@Builder
@Data
public class CallStmt extends SyntaxNode {
    private int lineNum;
    //namespace.functionName
    private String functionId;

    ExprList params = null;


    @Override
    public void compile(Compiler compiler) {
        int paramsCount = 0;
        if (null != params) {
            params.compile(compiler);
            paramsCount = params.getExprs().size();
        }
        //把执行方法后，返回位置压栈，方便方法返回

        //执行引擎收到call命令，要去方法列表中查找function位置，并把执行指针执向那个鬼地方
        //FIXME:栈帧变了，被调用方法找不到这些栈内参数，是否需要带过去？？
        compiler.insertOpCode(Opcode.CALL, getLineNum(), functionId, paramsCount + "");
    }

    @Override
    public void dumpSourceCode() {
        System.out.print(functionId + "(");
        if (null != params) {
            params.dumpSourceCode();
        }
        System.out.println(")");
    }

}
