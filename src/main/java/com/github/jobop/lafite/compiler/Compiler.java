package com.github.jobop.lafite.compiler;

import com.alibaba.fastjson.JSON;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.runtime.opcode.OpcodeUtils;
import com.github.jobop.lafite.runtime.utils.StringUtils;
import com.github.jobop.lafite.syntax.Namespace;
import com.github.jobop.lafite.syntax.SyntaxNode;
import com.github.jobop.lafite.utils.FileUtils;
import org.antlr.v4.runtime.ParserRuleContext;
import sun.security.provider.MD5;
import sun.security.rsa.RSASignature;

import java.io.File;
import java.util.*;

/**
 * Created by Enzo Cotter on 2020/3/11.
 */
public class Compiler {


    private HashMap<String, FunctionInfo> functionPosMap = new HashMap<>();

    private SyntaxNode currentNode = null;
    private Stack<SyntaxNode> nodeStack = new Stack<>();
    private List<String> byteCodeSeque = new ArrayList<String>();

    public void insertOpCode(Opcode opcode, ParserRuleContext cxt, String... v) {
        byteCodeSeque.add(OpcodeUtils.translateOpCode(opcode, cxt, v));
    }

    public void insertOpCode(Opcode opcode, int lineNum, String... v) {


        byteCodeSeque.add(OpcodeUtils.translateOpCode(opcode, lineNum, v));
    }

    public void registFuction(String functionId, Integer paramSize) {
        FunctionInfo functionInfo = new FunctionInfo(functionId, paramSize, byteCodeSeque.size());
        functionPosMap.put(functionId, functionInfo);
    }

    public String dumpToHex() {
        StringBuffer sb = new StringBuffer();
        for (String byteCodeLine : getAssembByteCode()) {
            sb.append(byteCodeLine).append("\r\n");
        }
        return StringUtils.bytesToHexString(sb.toString().getBytes());
    }

    public void dumpByteCode() {
        int i = 0;
        for (String byteCode : byteCodeSeque) {
            System.out.println(byteCode + " L" + i);
            i++;
        }
    }

    public void genFile(File file) {
        FileUtils.byte2file(file, this.dumpToHex().getBytes());
    }

    public List<String> getByteCodeSeque() {
        return byteCodeSeque;
    }

    public List<String> getAssembByteCode() {
        List<String> allByteCode = new ArrayList<>();
        allByteCode.addAll(byteCodeSeque);
        allByteCode.add("%%");
        allByteCode.add(JSON.toJSONString(functionPosMap));
        return allByteCode;
    }

    public void setByteCodeSeque(List<String> byteCodeSeque) {
        this.byteCodeSeque = byteCodeSeque;
    }
//    public String recoverHex(String hex) {
//        Base64.decode(hex);
//    }


    public SyntaxNode popNode() {
        return nodeStack.pop();
    }


    public SyntaxNode peekNode() {
        return nodeStack.peek();
    }

    public void pushNode(SyntaxNode currentNode) {
        nodeStack.push(currentNode);
    }

}
