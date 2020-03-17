package com.github.jobop.lafite.runtime.vm.lmm.main;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Enzo Cotter on 2020/3/10.
 */
public class HeapSpace {
    private Map<String, Object> constPool = new HashMap<>();

    public Map<String, Object> getConstPool() {
        return constPool;
    }

    public void setConstPool(Map<String, Object> constPool) {
        this.constPool = constPool;
    }
}
