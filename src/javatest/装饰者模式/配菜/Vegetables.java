package javatest.装饰者模式.配菜;

import javatest.装饰者模式.Price;

/**
 * @Author: 欢迎关注公众号：程序员小安
 * @description:青菜价格（具体装饰者类）
 * @CreateDate: 2020/3/6
 * @Version: 1.0
 */
public class Vegetables extends Price {
    private Price price;

    public Vegetables(Price price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return 8.9 + price.getPrice();
    }
}
