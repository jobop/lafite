package com.github.jobop.lafite;

import com.github.jobop.lafite.compiler.Compiler;
import com.github.jobop.lafite.interpreter.LafiteInterpreter;
import com.github.jobop.lafite.interpreter.LafiteLexer;
import com.github.jobop.lafite.interpreter.LafiteParseVisitorImpl;
import com.github.jobop.lafite.interpreter.LafiteParser;
import com.github.jobop.lafite.launcher.loader.FileLoader;
import com.github.jobop.lafite.runtime.utils.StringUtils;
import com.github.jobop.lafite.runtime.vm.execute.IProcessEngine;
import com.github.jobop.lafite.runtime.vm.execute.ProcessEngine;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Enzo Cotter on 2020/3/9.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream(new File("/Users/zhengwei/projects/java/lafite/src/main/lafiles/aaa.la"));
        ANTLRInputStream input = new ANTLRInputStream(is);
        LafiteLexer lexer = new LafiteLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LafiteParser parser = new LafiteParser(tokens);


        LafiteInterpreter interpreter = new LafiteInterpreter();
//        parser.addParseListener(interpreter);
        LafiteParseVisitorImpl visitor=new LafiteParseVisitorImpl();



        visitor.visit(parser.sourceFile());


//        System.out.println("源码:");
//        visitor.dumpSourceCode();

        Compiler compiler=new Compiler();

        visitor.compile(compiler);
//        System.out.println();
//        System.out.println("字节码:");
//        compiler.dumpByteCode();


//        System.out.println("开始执行:");

        ProcessEngine engine = new ProcessEngine();
        engine.execute(compiler.getAssembByteCode());


        // print LISP-style tree

//        System.out.println("编译结束，字节码为:");
//        System.out.println(StringUtils.hexStringToString(interpreter.dump()));
//        System.out.println("HEX编码为:");
//        System.out.println(interpreter.dump());
//
//        File outputFile = new File("/Users/zhengwei/Desktop/test.l");
//        interpreter.writeToFile(outputFile);
//        System.out.println("编译文件输出到" + outputFile.getAbsolutePath());
//
//        System.out.println("开始从" + outputFile.getAbsolutePath() + "载入文件");
//        IProcessEngine engine = new ProcessEngine();
//        FileLoader loader = new FileLoader(outputFile);
//        System.out.println("开始执行：");
//        engine.execute(loader.load());
//        System.out.println("执行结束");

    }
}
