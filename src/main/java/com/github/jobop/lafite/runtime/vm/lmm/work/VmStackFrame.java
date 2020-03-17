package com.github.jobop.lafite.runtime.vm.lmm.work;

import java.util.Hashtable;
import java.util.Stack;

/**
 * Created by Enzo Cotter on 2020/3/9.
 */
public class VmStackFrame {
    private Stack<Object> opStack = new Stack<Object>();
    private Hashtable<String, Object> localVarTable = new Hashtable<String, Object>();
    //在方法跳转后用于保存当最后的行
    private Integer callBackPc = 0;

    public Stack<Object> getOpStack() {
        return opStack;
    }

    public void setOpStack(Stack<Object> opStack) {
        this.opStack = opStack;
    }

    public Object pop() {
        return opStack.pop();
    }

    public Hashtable<String, Object> getLocalVarTable() {
        return localVarTable;
    }

    public void setLocalVarTable(Hashtable<String, Object> localVarTable) {
        this.localVarTable = localVarTable;
    }

    public void push(Object o) {
        opStack.push(o);
    }

    public Integer getCallBackPc() {
        return callBackPc;
    }

    public void setCallBackPc(Integer callBackPc) {
        this.callBackPc = callBackPc;
    }
}
