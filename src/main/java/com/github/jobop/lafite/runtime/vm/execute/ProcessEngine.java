package com.github.jobop.lafite.runtime.vm.execute;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.jobop.lafite.compiler.FunctionInfo;
import com.github.jobop.lafite.runtime.opcode.Command;
import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.runtime.opcode.OpcodeUtils;
import com.github.jobop.lafite.runtime.vm.lmm.main.HeapSpace;
import com.github.jobop.lafite.runtime.vm.lmm.main.MetaSpace;
import com.github.jobop.lafite.runtime.vm.lmm.work.PcPointer;
import com.github.jobop.lafite.runtime.vm.lmm.work.VmStack;
import com.github.jobop.lafite.runtime.vm.lmm.work.VmStackFrame;
import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;
import org.apache.commons.lang.StringEscapeUtils;

import java.util.*;

/**
 * Created by Enzo Cotter on 2020/3/9.
 */
public class ProcessEngine implements IProcessEngine {
    private static MetaSpace metaSpace = new MetaSpace();

    private static HeapSpace heapSpace = new HeapSpace();

    public Object execute(List<String> lLines) {
        //分离命令和方法路由表
        ByteCodeSplitor byteCodeSplitor = new ByteCodeSplitor(lLines).invoke();
        List<String> byteCommand = byteCodeSplitor.getByteCommand();
        String functionInfoMapStr = byteCodeSplitor.getFunctionInfoMapStr();


        if (null != functionInfoMapStr && !functionInfoMapStr.equals("")) {
            Map<String, JSONObject> functionMap = JSON.parseObject(functionInfoMapStr, HashMap.class);
            functionMap.forEach((key, value) -> {
                metaSpace.getMethodDescs().put(key, value.toJavaObject(FunctionInfo.class));
            });
        }

        //寻找main入口
        FunctionInfo mainFunction = metaSpace.getMethodDescs().get("main.main");

        List<Command> commands = OpcodeUtils.parseCommand(byteCommand);
        //先寻找常量定义段
        int startPos = 0;
        int endConstPos = queryEndConstPos(commands);
        int mainCodeStartPos = mainFunction.getSeq();
        int endPos = commands.size();


        programStart(commands, 0, endConstPos);

        programStart(commands, mainCodeStartPos, endPos);


        return null;
    }

    private void invokeConst(List<Command> commands, int startPos, int endPos) {
        PcPointer pc = new PcPointer();
        pc.set(startPos);
        //加一个栈帧
        invokeByteCode(commands, endPos, null, pc);
    }

    private void programStart(List<Command> commands, int startPos, int endPos) {
        VmStack vmStack = new VmStack();
        PcPointer pc = new PcPointer();
        pc.set(startPos);
        //加一个栈帧
        vmStack.push(new VmStackFrame());

        invokeByteCode(commands, endPos, vmStack, pc);
    }

    private void invokeByteCode(List<Command> commands, int endPos, VmStack vmStack, PcPointer pc) {
        for (; ; ) {
            if (pc.get() >= endPos) {
                break;
            }
            Command command = commands.get(pc.get());
            Opcode opcode = command.getOpCode();
            List<String> addrs = command.getAddrs();

            if (opcode == Opcode.CALL) {
                //从方法区拿出方法信息
                String functionId = addrs.get(0);
                FunctionInfo functionInfo = metaSpace.getMethodDescs().get(functionId);
                //从旧帧里面拿出N个元素（视方法参数而定）
                List<Object> params = new ArrayList<>();
                for (int i = 0; i < functionInfo.getParamSize(); i++) {
                    params.add(vmStack.peek().pop());
                }
                //旧栈帧保存当前pc+1，用于恢复时跳转
                vmStack.peek().setCallBackPc(pc.get() + 1);

                //push新栈帧
                vmStack.push(new VmStackFrame());

                //把旧的入参移到新的方法栈帧的操作数栈中(倒序)
                for (int i = params.size() - 1; i >= 0; i--) {
                    vmStack.peek().getOpStack().push(params.get(i));
                }
                //把程序计数器指针指向被调用方法所在行
                pc.set(functionInfo.getSeq());
                continue;
            }

            if (opcode == Opcode.FUC) {
                pc.add();
                continue;
            }

            if (opcode == Opcode.RET) {
                Integer retConut = Integer.valueOf(addrs.get(0));
                List<Object> rets = new ArrayList<>();
                for (int i = 0; i < retConut; i++) {
                    rets.add(vmStack.peek().pop());
                }
                //旧栈帧出栈
                vmStack.pop();

                if (vmStack.isEmpty()) {
                    //没有栈帧了，退出
                    break;
                }

                //把返回值压到当前栈帧的操作数栈（倒序）
                for (int i = rets.size() - 1; i >= 0; i--) {
                    vmStack.peek().push(rets.get(i));
                }

                //恢复指针
                pc.set(vmStack.peek().getCallBackPc());
                continue;
            }
            if (opcode == Opcode.LLDC) {
                //把操作数丢到操作数栈(怎么判断类型)
                vmStack.peek().push(Long.valueOf(addrs.get(0)));
                //程序计数器+1
                pc.add();
                continue;
            }
            if (opcode == Opcode.DLDC) {
                //把操作数丢到操作数栈(怎么判断类型)
                vmStack.peek().push(Double.valueOf(addrs.get(0)));
                //程序计数器+1
                pc.add();
                continue;
            }
            if (opcode == Opcode.SLDC) {
                //把操作数丢到操作数栈(怎么判断类型)
                vmStack.peek().push(addrs.get(0));
                //程序计数器+1
                pc.add();
                continue;
            }
            if (opcode == Opcode.STACKDECL) {
                //如果原来就已经定义过，要抛出运行时异常
                if (null != vmStack.peek().getLocalVarTable().get(addrs.get(0))) {
                    throw new RuntimeException(addrs.get(0) + " dumplicate define!");
                }


                //把操作数栈的顶元素出栈，存入局部变量表的变量
                Object o = vmStack.peek().pop();
                vmStack.peek().getLocalVarTable().put(addrs.get(0), o);
                //程序计数器+1
                pc.add();
                continue;
            }
            if (opcode == Opcode.HEAPDECL) {

                if (null != heapSpace.getGlobalTable().get(addrs.get(0))) {
                    throw new RuntimeException(addrs.get(0) + " dumplicate define!");
                }

                //把操作数栈的顶元素出栈，存入全局变量表的变量
                Object o = vmStack.peek().pop();
                heapSpace.getGlobalTable().put(addrs.get(0), o);
                //程序计数器+1
                pc.add();
                continue;
            }
            if (opcode == Opcode.VARASSIGN) {

                //把操作数栈的顶元素出栈，看是全局变量还是局部变量
                Object o = vmStack.peek().pop();
                //如果定义了局部变量则先存入栈内，否则存入堆内

                if (null != vmStack.peek().getLocalVarTable().get(addrs.get(0))) {
                    vmStack.peek().getLocalVarTable().put(addrs.get(0), o);
                } else if (null != heapSpace.getGlobalTable().get(addrs.get(0))) {
                    heapSpace.getGlobalTable().put(addrs.get(0), o);
                } else {
                    throw new RuntimeException("no var [" + addrs.get(0) + "] define!");
                }

                //程序计数器+1
                pc.add();
                continue;
            }


            if (opcode == Opcode.LOAD) {
                //这里优先找局部变量，再找全局变量？？
                //从局部变量表取元素，然后压栈
                Object o = o = vmStack.peek().getLocalVarTable().get(addrs.get(0));
                if (null == o) {
                    o = heapSpace.getGlobalTable().get(addrs.get(0));
                }
                vmStack.peek().push(o);
                //程序计数器+1
                pc.add();
                continue;
            }
            if (opcode == Opcode.ADD) {

                //从栈顶取两个元素，相加再压栈

                Object o1 = vmStack.peek().pop();
                Object o2 = vmStack.peek().pop();
                Object o3 = null;
                if (String.class.isAssignableFrom(o1.getClass()) || String.class.isAssignableFrom(o2.getClass())) {
                    o3 = o1.toString() + o2.toString();
                } else if (Double.class.isAssignableFrom(o1.getClass()) || Double.class.isAssignableFrom(o2.getClass())) {
                    o3 = Double.valueOf(o1.toString()) + Double.valueOf(o2.toString());
                } else {
                    o3 = Long.valueOf(o1.toString()) + Long.valueOf(o2.toString());
                }
                vmStack.peek().push(o3);
                //程序计数器+1
                pc.add();
                continue;
            }

            if (opcode == Opcode.SUB) {

                //从栈顶取两个元素，相减再压栈
                Object o1 = vmStack.peek().pop();
                Object o2 = vmStack.peek().pop();
                Object o3 = null;
                if (Double.class.isAssignableFrom(o1.getClass()) || Double.class.isAssignableFrom(o2.getClass())) {
                    o3 = Double.valueOf(o1.toString()) - Double.valueOf(o2.toString());
                } else {
                    o3 = Long.valueOf(o1.toString()) - Long.valueOf(o2.toString());
                }
                vmStack.peek().push(o3);
                //程序计数器+1
                pc.add();
                continue;
            }

            if (opcode == Opcode.MUL) {

                //从栈顶取两个元素，相乘再压栈

                Object o1 = vmStack.peek().pop();
                Object o2 = vmStack.peek().pop();
                Object o3 = null;
                if (Double.class.isAssignableFrom(o1.getClass()) || Double.class.isAssignableFrom(o2.getClass())) {
                    o3 = Double.valueOf(o1.toString()) * Double.valueOf(o2.toString());
                } else {
                    o3 = Long.valueOf(o1.toString()) * Long.valueOf(o2.toString());
                }
                vmStack.peek().push(o3);
                //程序计数器+1
                pc.add();
                continue;
            }
            if (opcode == Opcode.DIV) {

                //从栈顶取两个元素，相除压栈

                Object o1 = vmStack.peek().pop();
                Object o2 = vmStack.peek().pop();
                Object o3 = null;
                if (Double.class.isAssignableFrom(o1.getClass()) || Double.class.isAssignableFrom(o2.getClass())) {
                    o3 = Double.valueOf(o1.toString()) / Double.valueOf(o2.toString());
                } else {
                    o3 = Long.valueOf(o1.toString()) / Long.valueOf(o2.toString());
                }
                vmStack.peek().push(o3);
                //程序计数器+1
                pc.add();
                continue;
            }

            if (opcode == Opcode.OUT) {
                //从栈顶取1个元素,输出
                Object o = vmStack.peek().pop();
//                if(o.equals("\\r\\n")){
//                    o="\r\n";
//                }
                System.out.print(o);

                //程序计数器+1
                pc.add();
                continue;
            }

            if (opcode == Opcode.CMPANDJMP) {
                //从栈顶取1个元素(必须为long)
                Long o = (Long) vmStack.peek().pop();
                //真
                if (o == 1) {
                    //把指令指针指向0号位置
                    pc.set(Integer.valueOf(addrs.get(0)));
                } else {
                    //假
                    //把指令指针指向1号位置
                    pc.set(Integer.valueOf(addrs.get(1)));
                }
                continue;
            }
            if (opcode == Opcode.JMP) {
                //把指令指针指向0号位置
                pc.set(Integer.valueOf(addrs.get(0)));
                continue;
            }
            if (opcode == Opcode.GTEQ) {
                //从栈顶取2个元素
                Object o1 = vmStack.peek().pop();
                Object o2 = vmStack.peek().pop();
                //判断元素2大于元素1是否
                if (Double.class.isAssignableFrom(o1.getClass()) || Double.class.isAssignableFrom(o2.getClass())) {
                    if (Double.valueOf(o1.toString()) >= Double.valueOf(o2.toString())) {
                        vmStack.peek().push(Long.valueOf(1));
                    } else {
                        vmStack.peek().push(Long.valueOf(0));
                    }
                } else {
                    if (Long.valueOf(o1.toString()) >= Long.valueOf(o2.toString())) {
                        vmStack.peek().push(Long.valueOf(1));
                    } else {
                        vmStack.peek().push(Long.valueOf(0));
                    }
                }

                //程序计数器+1
                pc.add();
                continue;
            }

            if (opcode == Opcode.GT) {
                //从栈顶取2个元素
                Object o1 = vmStack.peek().pop();
                Object o2 = vmStack.peek().pop();
                //判断元素2大于元素1是否
                if (Double.class.isAssignableFrom(o1.getClass()) || Double.class.isAssignableFrom(o2.getClass())) {
                    if (Double.valueOf(o1.toString()) > Double.valueOf(o2.toString())) {
                        vmStack.peek().push(Long.valueOf(1));
                    } else {
                        vmStack.peek().push(Long.valueOf(0));
                    }
                } else {
                    if (Long.valueOf(o1.toString()) > Long.valueOf(o2.toString())) {
                        vmStack.peek().push(Long.valueOf(1));
                    } else {
                        vmStack.peek().push(Long.valueOf(0));
                    }
                }

                //程序计数器+1
                pc.add();
                continue;
            }

            if (opcode == Opcode.EQEQ) {
                //从栈顶取2个元素
                Object o1 = vmStack.peek().pop();
                Object o2 = vmStack.peek().pop();
                //判断元素2大于元素1是否
                if (Double.class.isAssignableFrom(o1.getClass()) && Double.class.isAssignableFrom(o2.getClass())) {
                    if (Double.valueOf(o2.toString()) == Double.valueOf(o1.toString())) {
                        vmStack.peek().push(Long.valueOf(1));
                    } else {
                        vmStack.peek().push(Long.valueOf(0));
                    }
                } else if (Long.class.isAssignableFrom(o1.getClass()) && Long.class.isAssignableFrom(o2.getClass())) {
                    if (Long.valueOf(o2.toString()) == Long.valueOf(o1.toString())) {
                        vmStack.peek().push(Long.valueOf(1));
                    } else {
                        vmStack.peek().push(Long.valueOf(0));
                    }
                } else {
                    if (String.valueOf(o2.toString()) == String.valueOf(o1.toString())) {
                        vmStack.peek().push(Long.valueOf(1));
                    } else {
                        vmStack.peek().push(Long.valueOf(0));
                    }
                }

                //程序计数器+1
                pc.add();
                continue;
            }

            if (opcode == Opcode.LT) {
                //从栈顶取2个元素
                Object o1 = vmStack.peek().pop();
                Object o2 = vmStack.peek().pop();
                //判断元素2大于元素1是否
                if (Double.class.isAssignableFrom(o1.getClass()) || Double.class.isAssignableFrom(o2.getClass())) {
                    if (Double.valueOf(o1.toString()) < Double.valueOf(o2.toString())) {
                        vmStack.peek().push(Long.valueOf(1));
                    } else {
                        vmStack.peek().push(Long.valueOf(0));
                    }
                } else {
                    if (Long.valueOf(o1.toString()) < Long.valueOf(o2.toString())) {
                        vmStack.peek().push(Long.valueOf(1));
                    } else {
                        vmStack.peek().push(Long.valueOf(0));
                    }
                }

                //程序计数器+1
                pc.add();
                continue;
            }

            if (opcode == Opcode.LTEQ) {
                //从栈顶取2个元素
                Object o1 = vmStack.peek().pop();
                Object o2 = vmStack.peek().pop();
                //判断元素2大于元素1是否
                if (Double.class.isAssignableFrom(o1.getClass()) || Double.class.isAssignableFrom(o2.getClass())) {
                    if (Double.valueOf(o1.toString()) <= Double.valueOf(o2.toString())) {
                        vmStack.peek().push(Long.valueOf(1));
                    } else {
                        vmStack.peek().push(Long.valueOf(0));
                    }
                } else {
                    if (Long.valueOf(o1.toString()) <= Long.valueOf(o2.toString())) {
                        vmStack.peek().push(Long.valueOf(1));
                    } else {
                        vmStack.peek().push(Long.valueOf(0));
                    }
                }

                //程序计数器+1
                pc.add();
                continue;
            }

            if (opcode == Opcode.AND) {
                //从栈顶取2个元素
                Long o1 = (Long) vmStack.peek().pop();
                Long o2 = (Long) vmStack.peek().pop();
                if (o1 == 1l && o2 == 1l) {
                    vmStack.peek().push(Long.valueOf(1));
                } else {
                    vmStack.peek().push(Long.valueOf(0));
                }

                //程序计数器+1
                pc.add();
                continue;
            }


            if (opcode == Opcode.OR) {
                //从栈顶取2个元素
                Long o1 = (Long) vmStack.peek().pop();
                Long o2 = (Long) vmStack.peek().pop();
                if (o1 == 1l || o2 == 1l) {
                    vmStack.peek().push(Long.valueOf(1));
                } else {
                    vmStack.peek().push(Long.valueOf(0));
                }

                //程序计数器+1
                pc.add();
                continue;
            }


            if (opcode == Opcode.DUP) {


                //TODO:
//                //从栈顶取1个元素
//                Object o =  currentVmStackFrame.pop();
//                Object o2=Copy
//                //判断元素2大于元素1是否
//                if (o1 == 1l && o2 == 2l) {
//                    currentVmStackFrame.push(Long.valueOf(1));
//                } else {
//                    currentVmStackFrame.push(Long.valueOf(0));
//                }
//
//                //程序计数器+1
                pc.add();
                continue;
            }
        }
    }

    public static MetaSpace getMetaSpace() {
        return metaSpace;
    }

    public static void setMetaSpace(MetaSpace metaSpace) {
        ProcessEngine.metaSpace = metaSpace;
    }

    private class ByteCodeSplitor {
        private List<String> lLines;
        private List<String> byteCommand;
        private String functionInfoMapStr;

        public ByteCodeSplitor(List<String> lLines) {
            this.lLines = lLines;
        }

        public List<String> getByteCommand() {
            return byteCommand;
        }

        public String getFunctionInfoMapStr() {
            return functionInfoMapStr;
        }

        public ByteCodeSplitor invoke() {
            byteCommand = new ArrayList<>();
            functionInfoMapStr = "";
            boolean switchToFunctionInfo = false;
            int lineIndex = 0;
            for (; lineIndex < lLines.size(); lineIndex++) {
                String line = lLines.get(lineIndex);
                if (line.equals("%%")) {
                    switchToFunctionInfo = true;
                    continue;
                }
                if (switchToFunctionInfo) {
                    functionInfoMapStr = line;
                } else {
                    byteCommand.add(line);
                }
            }
            return this;
        }
    }


    private int queryEndConstPos(List<Command> commands) {
        int pos = 0;
        for (int i = 0; i < commands.size(); i++) {
            pos = i;
            Command command = commands.get(i);
            //找到第一个fuc的地方就是常量初始化结束
            if (command.getOpCode() == Opcode.FUC) {
                break;
            }
        }
        return pos;
    }

    public static void main(String[] args){
        String s="\\r\\n";
        String s2="\r\n";
        System.out.println(s);
        System.out.println(s2);

        System.out.println(StringEscapeUtils.unescapeJava(s));
    }
}
