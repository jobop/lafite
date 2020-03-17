package com.github.jobop.lafite.syntax.expr;

/**
 * Created by Enzo Cotter on 2020/3/16.
 */
public enum Operator {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/"),
    ADDADD("++"),
    SUBSUB("--"),
    LT("<"),
    GT(">"),
    GTEQ(">="),
    LTEQ("<="),
    EQEQ("=="),

    AND("&&"),
    OR("||"),

    ;
    String symbol;

    private Operator(String symbol) {
        this.symbol = symbol;
    }

    ;
}
