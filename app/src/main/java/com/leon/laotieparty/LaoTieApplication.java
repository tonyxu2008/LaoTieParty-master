package com.leon.laotieparty;

import android.app.Application;

/**
 * 在Application类中初始化RtcEngine，注意在AndroidManifest.xml中配置下Application
 */
public class LaoTieApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AgoraManager.getInstance().init(getApplicationContext());
    }
}
