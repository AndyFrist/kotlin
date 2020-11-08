package javatest.观察者模式;

/**
 * @Author: 欢迎关注公众号：程序员小安
 * @description: 抽象的观察者，所有的观察者都实现该接口
 * 当被观察者有变化需要通知时，有了一个共同的接口。
 * @CreateDate: 2019/10/30
 * @Version: 1.0
 */
public interface Observer {
    void updateCode();
}