package com.example.designpatten.behav.intercepter;

/**
 * create by apple
 * create on 2021/6/23
 * description
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 把责任 集合起来
 */
class RealInterceptor {
    List<Interceptor> list = new ArrayList<>();

    public RealInterceptor() {
        list.add(new CacheInterceptor());
        list.add(new CallServerInterceptor());
    }

    public String request(String data) {
        for (Interceptor interceptor: list) {
            data = interceptor.chain(data);
        }
        return data;
    }
}
