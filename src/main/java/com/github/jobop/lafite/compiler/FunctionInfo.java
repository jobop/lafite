package com.github.jobop.lafite.compiler;

/**
 * Created by Enzo Cotter on 2020/3/17.
 */
public class FunctionInfo {
    String functionId;
    Integer paramSize;
    Integer seq;

    public FunctionInfo(String functionId, Integer paramSize, Integer seq) {
        this.functionId = functionId;
        this.paramSize = paramSize;
        this.seq = seq;
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    public Integer getParamSize() {
        return paramSize;
    }

    public void setParamSize(Integer paramSize) {
        this.paramSize = paramSize;
    }


    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}
