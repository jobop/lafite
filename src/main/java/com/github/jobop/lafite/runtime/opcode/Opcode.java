package com.github.jobop.lafite.runtime.opcode;

/**
 * Created by Enzo Cotter on 2020/3/9.
 */
public enum Opcode {
    //    指令   说明            操作数    功能
//    LDV	Load Variable	1	变量的值入栈
//    LDC   Load Constant	1	常量入栈
//    STR	Store Value	    1	栈顶一个元素存入指定变量
//    ADD	Add            	0	栈顶两个元素出栈，求和后入栈
//    SUB	Subtract	    0	栈顶两个元素出栈，求差后入栈
//    MUL	Multiply	    0	栈顶两个元素出栈，求积后入栈
//    DIV	Divide	        0	栈顶两个元素出栈，求商后入栈
//    RET   Return	        0	栈顶一个元素出栈，计算结束
//    JMP   jump pos        1   跳转到指定位置
// IF_ICMPGE IF_ICMPGE pos  1   栈顶两个元素出栈，判断元素1大于元素2，则跳转到pos
// IF_ICMPEQ IF_ICMPEQ pos  1   栈顶两个元素出栈，判断元素1等于元素2，则跳转到pos
//    ASSIGN                2   为元素赋值，加到局部变量表
//    LOAD                  1   从局部变量表load一个数据到变量
    //int

    //string
    SLDV(OpNumSet.ONE),
    SLDC(OpNumSet.ONE),
    //long
    LLDV(OpNumSet.ONE),
    LLDC(OpNumSet.ONE),
    //double
    DLDV(OpNumSet.ONE),
    DLDC(OpNumSet.ONE),

    //boolean
    BLDV(OpNumSet.ONE),
    BLDC(OpNumSet.ONE),

    STR(OpNumSet.ONE),

    ADD(OpNumSet.ZERO),
    SUB(OpNumSet.ZERO),
    MUL(OpNumSet.ZERO),
    DIV(OpNumSet.ZERO),

    //方法标示，执行引擎生成新栈帧
    FUC(OpNumSet.ONE),
    //方法结束标示，执行引擎跳转回指定地址，并把栈帧pop出来
    FUCEND(OpNumSet.ONE),

    CALL(OpNumSet.ONE),

    RET(OpNumSet.ONE),
    JMP(OpNumSet.ONE),

    CMPANDJMP(OpNumSet.TWO),

    ASSIGN(OpNumSet.TWO),

//    ILOAD(OpNumSet.ONE),
//    SLOAD(OpNumSet.ONE),
//    LLOAD(OpNumSet.ONE),
//    DLOAD(OpNumSet.ONE),
//    BLOAD(OpNumSet.ONE),
    LOAD(OpNumSet.ONE),

    HEAPDECL(OpNumSet.ONE),
    STACKDECL(OpNumSet.ONE),
    VARASSIGN(OpNumSet.ONE),


    DUP(OpNumSet.ZERO),
    OUT(OpNumSet.ZERO),
    AND(OpNumSet.ZERO),
    OR(OpNumSet.ZERO),
    LT(OpNumSet.ZERO),
    GT(OpNumSet.ZERO),
    LTEQ(OpNumSet.ZERO),
    GTEQ(OpNumSet.ZERO),
    EQEQ(OpNumSet.ZERO);


    OpNumSet numSet;

    Opcode(OpNumSet set) {
        this.numSet = set;
    }

    static enum OpNumSet {
        ZERO,
        ONE,
        TWO,
        THREE
    }

    public static Opcode getOpcode(String opcode) {
        for (Opcode oc : values()) {
            if (oc.toString().equals(opcode)) {
                return oc;
            }
        }
        return null;
    }

    public static Opcode getConstOpcode(Object obj) {
        if (String.class.isAssignableFrom(obj.getClass())) {
            return Opcode.SLDC;
        } else if (Long.class.isAssignableFrom(obj.getClass())) {
            return Opcode.LLDC;
        } else if (Double.class.isAssignableFrom(obj.getClass())) {
            return Opcode.DLDC;
        }
        return Opcode.SLDC;
    }

    public static Opcode getVarOpcode(Object obj) {
        if (String.class.isAssignableFrom(obj.getClass())) {
            return Opcode.SLDV;
        } else if (Long.class.isAssignableFrom(obj.getClass())) {
            return Opcode.LLDV;
        } else if (Double.class.isAssignableFrom(obj.getClass())) {
            return Opcode.DLDV;
        }
        return Opcode.SLDV;
    }


//    public static Opcode getLoadOpcode(Object obj) {
//        if (String.class.isAssignableFrom(obj.getClass())) {
//            return Opcode.SLOAD;
//        } else if (Long.class.isAssignableFrom(obj.getClass())) {
//            return Opcode.LLOAD;
//        } else if (Double.class.isAssignableFrom(obj.getClass())) {
//            return Opcode.DLOAD;
//        }
//        return Opcode.SLOAD;
//    }


//    public static Opcode getAddOpcode(Object left, Object right) {
//        if (Long.class.isAssignableFrom(left.getClass()) && Long.class.isAssignableFrom(right.getClass())) {
//            return Opcode.LADD;
//        } else if (Double.class.isAssignableFrom(left.getClass()) && Double.class.isAssignableFrom(right.getClass())) {
//            return Opcode.DADD;
//        } else {
//            return Opcode.SADD;
//        }
//
//    }


//    public static Opcode getSubOpcode(Object left, Object right) {
//        if (Double.class.isAssignableFrom(left.getClass()) || Double.class.isAssignableFrom(right.getClass())) {
//            return Opcode.DSUB;
//        } else {
//            return Opcode.LSUB;
//        }
//    }
//
//
//    public static Opcode getMulOpcode(Object left, Object right) {
//        if (Double.class.isAssignableFrom(left.getClass()) || Double.class.isAssignableFrom(right.getClass())) {
//            return Opcode.DMUL;
//        } else {
//            return Opcode.LMUL;
//        }
//    }
//
//
//    public static Opcode getDivOpcode(Object left, Object right) {
//        if (Double.class.isAssignableFrom(left.getClass()) || Double.class.isAssignableFrom(right.getClass())) {
//            return Opcode.DDIV;
//        } else {
//            return Opcode.LDIV;
//        }
//    }
}
