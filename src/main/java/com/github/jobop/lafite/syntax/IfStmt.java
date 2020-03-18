package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.syntax.expr.ExprStmt;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Enzo Cotter on 2020/3/15.
 */
@Builder
@Data
public class IfStmt extends SyntaxNode {
    private int lineNum;
    ExprStmt condition = null;

    BlockStmt block = null;

    BlockStmt elseBlock = null;

    @Override
    public void compile(Compiler compiler) {
        compiler.pushNode(this);

        //这里+1是为了跳过CMPANDJUM这条指令本身
        int ifBlockStartJumpPoint = compiler.getByteCodeSeque().size() + condition.getLocalByteCodeSeq().size() + 1;
        //这里+1是因为ifblock中加了jmp指令，所以elseblock后移了一条指令
        int elseBlockStartJumpPoint = ifBlockStartJumpPoint + block.getLocalByteCodeSeq().size() + 1;
        int elseBlockEndJumpPoint = elseBlockStartJumpPoint + elseBlock.getLocalByteCodeSeq().size();

        condition.compile(compiler);
        //插入CMPANDJUM ifBlockStartJumpPoint  elseBlockStartJumpPoint
        //从栈里面拿出栈顶元素，看是0还是1，1(真)则调第一个地址，0（假）则跳第二个地址
        compiler.insertOpCode(Opcode.CMPANDJMP, getLineNum(), String.valueOf(ifBlockStartJumpPoint), String.valueOf(elseBlockStartJumpPoint));
        block.compile(compiler);
        compiler.insertOpCode(Opcode.JMP, getLineNum(), String.valueOf(elseBlockEndJumpPoint));
        elseBlock.compile(compiler);
    }

    @Override
    public void dumpSourceCode() {
        System.out.print("if ");
        condition.dumpSourceCode();

        block.dumpSourceCode();

        if (null != elseBlock) {
            System.out.print("else");
            elseBlock.dumpSourceCode();
        }

    }
}
