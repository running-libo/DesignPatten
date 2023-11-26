package com.example.designpatten.behav.intercepter;

/**
 * create by apple
 * create on 2021/6/23
 * description
 */
class CallServerInterceptor implements Interceptor {

    @Override
    public String chain(String data) {
        return data = data + "请求拦截器处理 ->";
    }
}
