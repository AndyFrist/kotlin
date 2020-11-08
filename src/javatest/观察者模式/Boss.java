package javatest.观察者模式;

/**
 * @Author: 欢迎关注公众号：程序员小安
 * @description: 触发条件：老板
 * @CreateDate: 2019/10/30
 * @Version: 1.0
 */
public class Boss {
    public static void main(String[] args) {
        new 程序员1();
        new 程序员2();
        new 程序员3();
        sendOrder();
    }
    public static void sendOrder(){
        ProductManager.getInstance().demandChanged();
    }
}