package com.github.jobop.lafite.runtime.vm.lmm.work;

import java.util.Stack;

/**
 * Created by Enzo Cotter on 2020/3/9.
 */
public class VmStack {
    private Stack<VmStackFrame> vmInnerStack = new Stack<VmStackFrame>();

    public VmStackFrame pop() {
        return vmInnerStack.pop();
    }

    public void push(VmStackFrame frame) {
        vmInnerStack.push(frame);
    }

    public boolean isEmpty(){
        return vmInnerStack.isEmpty();
    }

    public VmStackFrame peek(){
        return vmInnerStack.peek();
    }


}
