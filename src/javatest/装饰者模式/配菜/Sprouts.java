package javatest.装饰者模式.配菜;

import javatest.装饰者模式.Price;

/**
 * @Author: 欢迎关注公众号：程序员小安
 * @description: 豆芽价格（具体装饰者类）
 * @CreateDate: 2020/3/6
 * @Version: 1.0
 */
public class Sprouts extends Price {

    private Price price;

    public Sprouts(Price price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return 4.9 + price.getPrice();
    }
}