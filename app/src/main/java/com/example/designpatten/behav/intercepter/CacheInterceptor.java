package com.example.designpatten.behav.intercepter;

/**
 * create by apple
 * create on 2021/6/23
 * description
 */
class CacheInterceptor implements Interceptor {

    @Override
    public String chain(String data) {
        return data = data + "缓存拦截器处理 ->";
    }
}
