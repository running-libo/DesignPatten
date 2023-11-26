package com.example.designpatten.singleton;

/**
 * 双重校验锁模式
 */
public class SingleTon3 {
    private static SingleTon3 instance = null;

    private SingleTon3() {}

    public static SingleTon3 getInstance() {
        if (instance == null) {  // 第一次判空，保证不必要的同步
            synchronized (SingleTon.class) {  // synchronized 对 Singleton 加全局锁，保证每次只要一个线程创建实例
                if(instance == null) {  // 第二次判空只有在第一为 null 的情况下创建实例，只需创建一次，以后不再创建
                    instance = new SingleTon3();
                }
            }
        }

        return instance;
    }
}
