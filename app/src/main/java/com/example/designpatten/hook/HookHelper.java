package com.example.designpatten.hook;

import android.view.View;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * create by apple
 * create on 2021/6/27
 * description
 */
public class HookHelper {

    public static void hookOnClickListener(View view) throws Exception {
        Method getListenerInfo = View.class.getDeclaredMethod("getListenerInfo");  //获取getListenerInfo方法
        getListenerInfo.setAccessible(true);

        Object mListenerInfo = getListenerInfo.invoke(view);  //执行完getListenerInfo方法即可返回ListenerInfo对象

        //去得到原始OnClickListener
        Class<?> aClass = Class.forName("android.view.View$ListenerInfo");
        Field mOnClickListener = aClass.getDeclaredField("mOnClickListener");
        mOnClickListener.setAccessible(true);
        View.OnClickListener originOnClickListener = (View.OnClickListener) mOnClickListener.get(mListenerInfo);//从ListenerInfo中获取原始OnClickListener类对象

        View.OnClickListener hookClickListener = new MyClickListener(originOnClickListener);

        mOnClickListener.set(mListenerInfo, hookClickListener); //将原始的onClickListener替换成自己的
    }
}
