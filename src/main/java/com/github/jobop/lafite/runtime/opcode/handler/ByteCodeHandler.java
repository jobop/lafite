package com.github.jobop.lafite.runtime.opcode.handler;

import com.github.jobop.lafite.runtime.opcode.Opcode;
import com.github.jobop.lafite.runtime.vm.lmm.work.VmStack;
import com.github.jobop.lafite.runtime.vm.lmm.work.VmStackFrame;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Enzo Cotter on 2020/3/9.
 */
public interface ByteCodeHandler {
    static Map<Opcode, ByteCodeHandler> BYTE_CODE_HANDLER_MAP = new HashMap<Opcode, ByteCodeHandler>();

    public VmStackFrame handle(VmStack vmStack, VmStackFrame currentStackFrame);
}
