package com.ballebaaz.mystudentlibrary.DataSources;


import android.content.Context;

import com.ballebaaz.mystudentlibrary.Interfaces.RemoteSource;

public class RemoteDataSource implements RemoteSource {
    private  static RemoteDataSource INSTANCE;
    public static RemoteDataSource getINSTANCE(){
        if(INSTANCE==null)
            INSTANCE=new RemoteDataSource();
        return INSTANCE;
    }

}
