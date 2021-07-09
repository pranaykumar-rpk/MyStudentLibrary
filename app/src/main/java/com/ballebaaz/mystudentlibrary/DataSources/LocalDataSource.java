package com.ballebaaz.mystudentlibrary.DataSources;

import com.ballebaaz.mystudentlibrary.Interfaces.LocalSource;

public class LocalDataSource implements LocalSource {
    private static LocalDataSource INSTANCE;
    public static LocalDataSource getINSTANCE() {
        if (INSTANCE == null)
            INSTANCE = new LocalDataSource();
        return INSTANCE;
    }
}
