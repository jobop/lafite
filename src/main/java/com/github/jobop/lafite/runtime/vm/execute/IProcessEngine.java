package com.github.jobop.lafite.runtime.vm.execute;

import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/9.
 */
public interface IProcessEngine {
    public Object execute(List<String> byteCodeommands) ;
}
