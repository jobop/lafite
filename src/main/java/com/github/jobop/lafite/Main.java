package com.github.jobop.lafite;

import com.github.jobop.lafite.compiler.CompileUtils;
import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.interpreter.LafiteInterpreter;
import com.github.jobop.lafite.interpreter.LafiteLexer;
import com.github.jobop.lafite.interpreter.LafiteParseVisitorImpl;
import com.github.jobop.lafite.interpreter.LafiteParser;
import com.github.jobop.lafite.launcher.loader.FileLoader;
import com.github.jobop.lafite.runtime.utils.RuntimeUtils;
import com.github.jobop.lafite.runtime.utils.StringUtils;
import com.github.jobop.lafite.runtime.vm.execute.IProcessEngine;
import com.github.jobop.lafite.runtime.vm.execute.ProcessEngine;
import com.sun.tools.javac.resources.compiler;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

/**
 * Created by Enzo Cotter on 2020/3/9.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String sourceDir = "/Users/zhengwei/projects/java/lafite/src/main/resources/test_script";
        String outputFile = "/Users/zhengwei/projects/java/lafite/src/main/resources/test_script/bin/output.l";
        CompileUtils.compiler(sourceDir, outputFile);

        RuntimeUtils.execute(outputFile);

    }


}
