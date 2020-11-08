package javatest.装饰者模式;

import javatest.装饰者模式.配菜.FlammulinaVelutipes;
import javatest.装饰者模式.配菜.Vegetables;
import javatest.装饰者模式.锅底.MandarinDuckPrice;

/**
 * @Author: 欢迎关注公众号：程序员小安
 * @description:用户点餐类
 * @CreateDate: 2020/3/6
 * @Version: 1.0
 */
public class User {
    public static void main(String[] args){
        Price mandarinDuckPrice = new MandarinDuckPrice();//用户选中鸳鸯锅底
        mandarinDuckPrice = new Vegetables(mandarinDuckPrice);//用户需要青菜，用Vegetables装饰mandarinDuckPrice
        mandarinDuckPrice= new Vegetables(mandarinDuckPrice);//用户需要青菜，用Vegetables装饰mandarinDuckPrice
        mandarinDuckPrice = new FlammulinaVelutipes(mandarinDuckPrice);//用户需要金针菇，FlammulinaVelutipes装饰mandarinDuckPrice
        System.out.println("您需要支付金额为："+mandarinDuckPrice.getPrice());//输出总金额
    }
}