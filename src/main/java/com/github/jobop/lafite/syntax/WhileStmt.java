package com.github.jobop.lafite.syntax;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.syntax.expr.ExprStmt;

/**
 * Created by Enzo Cotter on 2020/3/15.
 */
public class WhileStmt extends SyntaxNode {
    ExprStmt condition = null;

    BlockStmt block = null;

    public WhileStmt(int lineNum) {
        super(lineNum);
    }

    @Override
    public void compile(Compiler compiler) {

        compiler.pushNode(this);

        int whileStartJumpPoint = compiler.getByteCodeSeque().size();

        //+1为了增加跳转指令本身
        int blockStartJumpPoint = whileStartJumpPoint + condition.getLocalByteCodeSeq().size() + 1;

        //+1为了增加跳转指令本身
        int endWhileJumpPoint = blockStartJumpPoint + block.getLocalByteCodeSeq().size()+1;


        condition.compile(compiler);
        compiler.insertOpCode(Opcode.CMPANDJMP, getLineNum(), String.valueOf(blockStartJumpPoint), String.valueOf(endWhileJumpPoint));

        block.compile(compiler);

        //跳回循环开始进行判断
        compiler.insertOpCode(Opcode.JMP, getLineNum(), String.valueOf(whileStartJumpPoint));


    }

    @Override
    public void dumpSourceCode() {
        System.out.print("while ");
        condition.dumpSourceCode();
        block.dumpSourceCode();
    }

    public ExprStmt getCondition() {
        return condition;
    }

    public void setCondition(ExprStmt condition) {
        this.condition = condition;
    }

    public BlockStmt getBlock() {
        return block;
    }

    public void setBlock(BlockStmt block) {
        this.block = block;
    }
}
