package com.github.jobop.lafite.utils;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by Enzo Cotter on 2020/3/11.
 */
public class FileUtils {
    public static void byte2file(File file, byte[] data) {
        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(data);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
