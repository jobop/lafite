package com.github.jobop.lafite.runtime.vm.lmm.main;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Enzo Cotter on 2020/3/10.
 */
public class HeapSpace {
    Hashtable<String, Object> globalTable = new Hashtable<String, Object>();
    private Map<String, Object> constPool = new HashMap<>();

    public Map<String, Object> getConstPool() {
        return constPool;
    }

    public void setConstPool(Map<String, Object> constPool) {
        this.constPool = constPool;
    }

    public Hashtable<String, Object> getGlobalTable() {
        return globalTable;
    }

    public void setGlobalTable(Hashtable<String, Object> globalTable) {
        this.globalTable = globalTable;
    }
}
