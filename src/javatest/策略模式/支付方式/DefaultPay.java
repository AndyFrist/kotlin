package javatest.策略模式.支付方式;

import javatest.策略模式.Payment;

/**
 * @Author: 程序员小安
 * @description: 无支付方式
 * @CreateDate: 2019/10/27
 * @Version: 1.0
 */
public class DefaultPay implements Payment {
    @Override
    public void pay(String price) {
        //无支付方式
        System.out.println("您选择的支付方式暂未开通");
    }
}