package cn.com.iresearch.monitordemo;

import android.app.Application;


/**
 * Created By: Seal.Wu
 * Date: 2016/9/20
 * Time: 19:37
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable throwable) {
                throw new RuntimeException("我是宿主进程抛出来的崩溃");
            }
        });
    }
}
