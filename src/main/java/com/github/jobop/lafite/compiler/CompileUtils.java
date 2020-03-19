package com.github.jobop.lafite.compiler;

import com.github.jobop.lafite.interpreter.LafiteLexer;
import com.github.jobop.lafite.interpreter.LafiteParseVisitorImpl;
import com.github.jobop.lafite.interpreter.LafiteParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;

/**
 * Created by Enzo Cotter on 2020/3/19.
 */
public class CompileUtils {



    public static void compiler(String sourceDir, String outputFile) throws IOException {
        Compiler compiler = new Compiler();
        File scriptDir = new File(sourceDir);

        File[] scripts = scriptDir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".la");
            }
        });

        if (null != scripts & scripts.length > 0) {
            for (File script : scripts) {
                InputStream is = null;
                try {
                    is = new FileInputStream(script);
                    ANTLRInputStream input = new ANTLRInputStream(is);
                    LafiteLexer lexer = new LafiteLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    LafiteParser parser = new LafiteParser(tokens);
                    LafiteParseVisitorImpl visitor = new LafiteParseVisitorImpl();
                    visitor.visit(parser.sourceFile());
                    compiler.add(visitor);
                } finally {
                    is.close();
                }
            }
        }
        compiler.genFile(new File(outputFile));
    }
}
