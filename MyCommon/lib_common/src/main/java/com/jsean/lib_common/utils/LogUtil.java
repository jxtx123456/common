package com.jsean.lib_common.utils;

import androidx.annotation.Nullable;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * @author David
 * @description:
 * @date :2020/7/21 9:55
 */
public class LogUtil {

    public static void init(final boolean DEBUG) {
        Logger.addLogAdapter(new AndroidLogAdapter() {
            @Override
            public boolean isLoggable(int priority, @Nullable String tag) {
                return DEBUG;
            }
        });
    }


    public static void i(String msg){
        Logger.i(msg);
    }


    public static void d(String msg){
        Logger.d(msg);
    }

    public static void e(String msg){
        Logger.e(msg);
    }
    public static void e(Throwable e){
        Logger.e(e,"崩溃了");
    }

    public static void w(String msg){
        Logger.w(msg);
    }
    public static void e(String tag,String msg){
        Logger.e(tag,msg);
    }




}
