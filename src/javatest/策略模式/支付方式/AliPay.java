package javatest.策略模式.支付方式;

import javatest.策略模式.Payment;

/**
 * @Author: 程序员小安
 * @description: 支付宝支付方式
 * @CreateDate: 2019/10/27
 * @Version: 1.0
 */
public class AliPay implements Payment {
    @Override
    public void pay(String price) {
        //调用支付宝支付SDK
        System.out.println("支付宝支付金额：" + price);
    }
}