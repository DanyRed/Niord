package com.dany.niord.db;

import android.app.Application;
import android.content.Context;

import com.raizlabs.android.dbflow.config.FlowManager;


public class DbFlow extends Application {

    private static DbFlow dbFlow;

    public static DbFlow getApplication() {
        return dbFlow;
    }

    public static Context getApplicationCtx() {
        return dbFlow.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        FlowManager.destroy();
    }
}
