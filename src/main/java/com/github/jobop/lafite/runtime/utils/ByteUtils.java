package com.github.jobop.lafite.runtime.utils;


import com.github.jobop.lafite.runtime.opcode.Opcode;

/**
 * Created by Enzo Cotter on 2020/3/9.
 */
public class ByteUtils {
    //接受一个byte，判断是什么操作指令
    public static Opcode readByteToOpcode(byte b) {
//        return Opcode.get((int) b);
        return null;
    }

    public static byte[] byte2Array(byte... bytes) {
        byte[] byteArray = new byte[bytes.length];
        System.arraycopy(bytes, 0, byteArray, 0, bytes.length);
        return byteArray;
    }

    public static void main(String[] args) {

    }
}
