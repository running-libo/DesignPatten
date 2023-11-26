package com.example.designpatten.struct.adapter;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */
class Adapter implements Target {

    private Adapee220 adapee220;

    public Adapter(Adapee220 adapee220) {
        this.adapee220 = adapee220;
    }

    @Override
    public void v18() {
        adapee220.show();
        System.out.println("实现将220v电压转化为18v");
    }
}
