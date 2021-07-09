package com.ballebaaz.mystudentlibrary;

import android.app.Application;
import android.content.Context;

public class MyApplication  extends Application{
    private static  Context context;

    @Override
    public void onCreate() {
        context=this;
        super.onCreate();
    }

    public static Context getApplicationContex(){
        return context;
    }
}
