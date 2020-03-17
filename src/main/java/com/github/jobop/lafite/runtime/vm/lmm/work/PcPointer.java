package com.github.jobop.lafite.runtime.vm.lmm.work;

/**
 * Created by Enzo Cotter on 2020/3/10.
 */
public class PcPointer {
    private int pc = 0;

    public int get() {
        return pc;
    }

    public void set(int pc) {
        this.pc = pc;
    }

    public void add() {
        pc++;
    }

    public void addCount(int count) {
        pc += count;
    }

    public void sub() {
        pc--;
    }

    public void subCount(int count) {
        pc -= count;
    }
}
