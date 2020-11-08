package javatest.策略模式;

/**
 * @Author: 程序员小安
 * @description: 购物车
 * @CreateDate: 2019/10/27
 * @Version: 1.0
 */
public class ShopCart {
    private Payment payment;

    public ShopCart() {
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void pay(String price) {
        payment.pay(price);
    }
}