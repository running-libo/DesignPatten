package com.example.designpatten.struct.dynamicproxy;

public class BigStar implements Star {
    //需要实现需要代理方法创建的接口Star接口，去做真实的实现
    private String name;

    public BigStar(String name) {
        this.name = name;
    }

    @Override
    public String sing(String song) {
        System.out.println("唱一首" + song);
        return "谢谢";
    }

    @Override
    public void dance(String dance) {
        System.out.println("跳一个" + dance);
    }
}
