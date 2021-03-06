package com.github.jobop.lafite.syntax.expr;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.syntax.SyntaxNode;
import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Enzo Cotter on 2020/3/15.
 */
@Builder
@Data
public class ExprStmtWithTwo extends ExprStmt {
    private int lineNum;
    SyntaxNode left = null;
    Operator op;
    SyntaxNode right = null;


    @Override
    public void compile(Compiler compiler) {

        right.compile(compiler);

        left.compile(compiler);

        //插入运算符
        if (op == Operator.ADD) {
            compiler.insertOpCode(Opcode.ADD, getLineNum());

        } else if (op == Operator.SUB) {
            compiler.insertOpCode(Opcode.SUB, getLineNum());
        } else if (op == Operator.MUL) {
            compiler.insertOpCode(Opcode.MUL, getLineNum());
        } else if (op == Operator.DIV) {
            compiler.insertOpCode(Opcode.DIV, getLineNum());
        } else if (op == Operator.AND) {
            compiler.insertOpCode(Opcode.AND, getLineNum());
        } else if (op == Operator.OR) {
            compiler.insertOpCode(Opcode.OR, getLineNum());
        } else if (op == Operator.LT) {
            compiler.insertOpCode(Opcode.LT, getLineNum());
        } else if (op == Operator.GT) {
            compiler.insertOpCode(Opcode.GT, getLineNum());
        } else if (op == Operator.GTEQ) {
            compiler.insertOpCode(Opcode.GTEQ, getLineNum());
        } else if (op == Operator.LTEQ) {
            compiler.insertOpCode(Opcode.LTEQ, getLineNum());
        } else if (op == Operator.EQEQ) {
            compiler.insertOpCode(Opcode.EQEQ, getLineNum());
        } else {
            throw new RuntimeException("no op found!");
        }


    }

    @Override
    public void dumpSourceCode() {
        left.dumpSourceCode();
        System.out.print(" " + op.symbol + " ");
        right.dumpSourceCode();
    }
}
