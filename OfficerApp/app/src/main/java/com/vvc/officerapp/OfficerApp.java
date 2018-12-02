package com.vvc.officerapp;

import android.app.Application;
import android.support.multidex.MultiDex;

public class OfficerApp extends Application {

    private static OfficerApp mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
        mApplication = this;
    }

    public static OfficerApp getApplicationInstance() {
        return mApplication;
    }
}
