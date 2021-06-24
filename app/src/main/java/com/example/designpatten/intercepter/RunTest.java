package com.example.designpatten.intercepter;


/**
 * create by apple
 * create on 2021/4/25
 * description
 */
class RunTest {

    public static void main(String[] args) {
        String request = new RealInterceptor().request("request->");
        System.out.println(request);
    }
}
