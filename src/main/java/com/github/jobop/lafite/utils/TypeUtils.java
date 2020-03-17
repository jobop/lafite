package com.github.jobop.lafite.utils;

/**
 * Created by Enzo Cotter on 2020/3/17.
 */
public class TypeUtils {
    //FIXME:用正则表达式判断
    public static Object transferType(String o) {
        if (null == o) {
            return null;
        }
        if (o.toString().startsWith("\"")) {
            return o.substring(1, o.length() - 1);
        } else if (o.contains(".")) {
            return Double.valueOf(o);
        } else {
            return Long.valueOf(o);
        }

    }
}
