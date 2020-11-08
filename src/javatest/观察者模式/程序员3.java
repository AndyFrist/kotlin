package javatest.观察者模式;

/**
 * @Author: 欢迎关注公众号：程序员小安
 * @description: 观察者（程序员1）
 * @CreateDate: 2019/10/30
 * @Version: 1.0
 */
public class 程序员3 implements Observer{
    public 程序员3() {
        ProductManager.getInstance().registerObserver(this);
    }

    @Override
    public void updateCode() {
        //苦逼的完成需求
        System.out.println(getClass().getName()+"苦逼的完成需求");
    }
}