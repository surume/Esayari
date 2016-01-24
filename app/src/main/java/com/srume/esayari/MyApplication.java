package com.srume.esayari;

import android.app.Application;

import com.os.operando.garum.Garum;

/**
 * Created by shota on 2016/01/24.
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Garum.initialize(getApplicationContext());
    }
}
