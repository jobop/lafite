package com.github.jobop.lafite.launcher.loader;

import com.github.jobop.lafite.runtime.utils.StringUtils;
import com.google.common.base.Splitter;

import java.util.List;

/**
 * Created by Enzo Cotter on 2020/3/11.
 */
public abstract class AbstraLoader implements Loader {
    @Override
    public List<String> load() {
        byte[] bytes = load0();
        String hexString = new String(bytes);
        String byteCode = StringUtils.hexStringToString(hexString);
        List<String> byteCodeommands = Splitter.on("\r\n").splitToList(byteCode);
        return byteCodeommands;
    }

    protected abstract byte[] load0();
}
