package com.example.designpatten.proxy;

/**
 * create by apple
 * create on 2021/4/26
 * description
 */

/**
 * 代理类：律师，需要打官司，可以搜集证据，代理客户打官司
 */
class Lawyer implements Law {
    private Customer customer;

    public Lawyer(Customer customer) {
        this.customer = customer;
    }

    /**
     * 陈述事实却需要当事人自己在法庭上陈述，自己调用law
     */
    @Override
    public void law() {
        collEvidence();
        //目标类调用自己方法
        customer.law();
        over();
    }

    /**
     * 律师可以做搜集证据
     */
    public void collEvidence() {
        System.out.println("搜集证据");
    }

    /**
     * 律师可以尽量打赢官司
     */
    public void over() {
        System.out.println("打赢官司");
    }
}
