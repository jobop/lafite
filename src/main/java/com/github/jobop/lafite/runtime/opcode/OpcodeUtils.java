package com.github.jobop.lafite.runtime.opcode;

import com.google.common.base.Splitter;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/11.
 */
public class OpcodeUtils {

    public static String translateOpCode(Opcode opcode, ParserRuleContext cxt, String... v) {
        StringBuilder argus = new StringBuilder();
        List<String> datas = new ArrayList<>();
        if (null != v && v.length > 0) {
            for (String _v : v) {
                argus.append(" %s");
                datas.add(_v);
            }
        }
        datas.add(cxt.start.getLine() + "");
        String flag = opcode + argus.toString() + " #%s";
        return String.format(flag, datas.toArray());

    }


    public static String translateOpCode(Opcode opcode,int lineNum, String... v) {
        StringBuilder argus = new StringBuilder();
        List<String> datas = new ArrayList<>();
        if (null != v && v.length > 0) {
            for (String _v : v) {
                argus.append(" %s");
                datas.add(_v);
            }
        }
        datas.add(lineNum+"");
        String flag = opcode + argus.toString() + " #%s";
        return String.format(flag, datas.toArray());

    }
    public static List<Command> parseCommand(List<String> commandLines) {
        List<Command> commands = new ArrayList<Command>();
        if (null == commandLines || "".equals(commandLines)) {
            return null;
        }
        for (String commandLine : commandLines) {
            if (commandLine.equals("") || commandLines.equals("\r\n")) {
                continue;
            }
            List<String> items = Splitter.on(" ").splitToList(commandLine);
            Command command = new Command();
            Opcode opcode = Opcode.getOpcode(items.get(0));
            command.setOpCode(opcode);
            for (int i = 1; i <= opcode.numSet.ordinal(); i++) {
                command.pushAddr(items.get(i));
            }
            command.setLineNum(items.get(opcode.numSet.ordinal() + 1));
            commands.add(command);
        }
        return commands;

    }

}
