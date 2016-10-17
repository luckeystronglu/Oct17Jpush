package com.qf.oct17jpush;

import android.app.Application;
import android.util.Log;

import java.util.Set;

import cn.jpush.android.api.JPushInterface;
import cn.jpush.android.api.TagAliasCallback;

/**
 * Created by Ken on 2016/10/17.11:03
 */
public class AppContext extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //开启debug模式
        JPushInterface.setDebugMode(true);
        //初始化极光推送
        JPushInterface.init(this);

        JPushInterface.setAlias(this, "luck", new TagAliasCallback() {
            @Override
            public void gotResult(int i, String s, Set<String> set) {
                Log.d("print", "设置别名------>" + s);
            }
        });

//        JPushInterface.setTags();
    }
}
