package com.socks.sample;

import android.app.Application;

import com.socks.library.KLog;

/**
 * Created by zhaokaiqiang on 15/11/14.
 */
public class KLogApplication extends Application {
    public static final String TAG = "KLog";
    @Override
    public void onCreate() {
        super.onCreate();
//        KLog.init(BuildConfig.LOG_DEBUG);
        KLog.init(BuildConfig.LOG_DEBUG, TAG);
    }
}
