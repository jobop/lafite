package com.github.jobop.lafite.runtime.opcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/11.
 */
public class Command {
    private Opcode opCode;
    private List<String> addrs=new ArrayList<>();

    private String lineNum;

    public Opcode getOpCode() {
        return opCode;
    }

    public void setOpCode(Opcode opCode) {
        this.opCode = opCode;
    }

    public void pushAddr(String addr) {
        addrs.add(addr);
    }

    public List<String> getAddrs() {
        return addrs;
    }

    public void setAddrs(List<String> addrs) {
        this.addrs = addrs;
    }

    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }
}
