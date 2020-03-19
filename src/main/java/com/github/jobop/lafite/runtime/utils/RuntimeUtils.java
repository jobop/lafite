package com.github.jobop.lafite.runtime.utils;

import com.github.jobop.lafite.launcher.loader.FileLoader;
import com.github.jobop.lafite.runtime.vm.execute.IProcessEngine;
import com.github.jobop.lafite.runtime.vm.execute.ProcessEngine;

import java.io.File;

/**
 * Created by Enzo Cotter on 2020/3/19.
 */
public class RuntimeUtils {
    public static void execute(String filePath) {
        File outputFile = new File(filePath);
        IProcessEngine engine = new ProcessEngine();
        FileLoader loader = new FileLoader(outputFile);
        engine.execute(loader.load());
    }
}
