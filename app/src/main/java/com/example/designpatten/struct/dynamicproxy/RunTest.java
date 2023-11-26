package com.example.designpatten.struct.dynamicproxy;

import android.util.Log;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */
class RunTest {

    public static void main(String[] args) {
        Star bigStar = new BigStar("Lisa");
        Star starProxy = ProxyUtil.createProxy(bigStar);
        String result = starProxy.sing("solo"); //代理来唱歌
//        starProxy.dance("惊鸿舞"); //代理来跳舞

        Log.i("minfo", "sing结果:" + result);
    }
}
