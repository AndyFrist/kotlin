package javatest.装饰者模式.锅底;

import javatest.装饰者模式.Price;

/**
 * @Author: 欢迎关注公众号：程序员小安
 * @description:鸳鸯锅底（具体被装饰者类）
 * @CreateDate: 2020/3/6
 * @Version: 1.0
 */
public class MandarinDuckPrice extends Price {

    @Override
    public double getPrice() {
        return 88.0;
    }
}
