package com.github.jobop.lafite.launcher.loader;

import java.net.URI;

/**
 * Created by Enzo Cotter on 2020/3/11.
 */
public class UriLoader extends AbstraLoader {
    private URI uri = null;

    public UriLoader(URI uri) {
        this.uri = uri;
    }

    @Override
    protected byte[] load0() {
        //TODO:
        return new byte[0];
    }
}
