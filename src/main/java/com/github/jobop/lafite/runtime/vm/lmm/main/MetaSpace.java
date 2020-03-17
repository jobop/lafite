package com.github.jobop.lafite.runtime.vm.lmm.main;

import com.github.jobop.lafite.compiler.FunctionInfo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Enzo Cotter on 2020/3/9.
 */
public class MetaSpace {
    private Map<String, FunctionInfo> methodDescs = new HashMap<String, FunctionInfo>();


    public Map<String, FunctionInfo> getMethodDescs() {
        return methodDescs;
    }

    public void setMethodDescs(Map<String, FunctionInfo> methodDescs) {
        this.methodDescs = methodDescs;
    }

}
