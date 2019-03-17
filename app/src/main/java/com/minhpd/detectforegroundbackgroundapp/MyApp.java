package com.minhpd.detectforegroundbackgroundapp;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        AppLifecycleObserver appLifecycleObserver = new AppLifecycleObserver();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(appLifecycleObserver);
    }
}
