package javatest.策略模式.支付方式;

import javatest.策略模式.Payment;

/**
 * @Author: 程序员小安
 * @description: QQ支付方式
 * @CreateDate: 2019/10/27
 * @Version: 1.0
 */
public class QQPay implements Payment {
    @Override
    public void pay(String price) {
        //调用QQ支付SDK
        System.out.println("QQ支付金额：" + price);
    }
}