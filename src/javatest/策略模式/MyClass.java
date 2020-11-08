package javatest.策略模式;

import javatest.策略模式.支付方式.WeixinPay;

public class MyClass {
    public static void main(String[] args){
        ShopCart shopCart = new ShopCart();
        WeixinPay weixinPay = new WeixinPay();
        shopCart.setPayment(weixinPay);
        shopCart.pay("123");
    }
}