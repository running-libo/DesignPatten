package com.example.designpatten.struct.dynamicproxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

    //定义生成代理对象方法
    //方法传入接口来定义生成哪个接口的代理,并返回实现该接口的对象
    public static Star createProxy(Star bigStar) {
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //对各个调用事件进行判断分别处理
                        if (method.getName().equals("sing")) {
                            Log.i("minfo", "收钱20w");
                        } else if (method.getName().equals("dance")) {
                            Log.i("minfo", "收钱100w");
                        }
                        return method.invoke(bigStar, args);  //这里再使用反射调用被代理对象的当前方法
                    }
                });
        return starProxy;
    }
}
