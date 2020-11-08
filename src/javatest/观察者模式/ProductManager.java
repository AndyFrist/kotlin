package javatest.观察者模式;

/**
 * @Author: 欢迎关注公众号：程序员小安
 * @description: 具体的被观察者（产品经理）
 * @CreateDate: 2019/10/30
 * @Version: 1.0
 */
public class ProductManager  extends Subject{

    private static class ProductManagerSingletonHolder {
        private static final ProductManager INSTANCE = new ProductManager();
    }
    private ProductManager (){}
    public static final ProductManager getInstance() {
        return ProductManagerSingletonHolder.INSTANCE;
    }

    //需求变更，通知观察者
    public void demandChanged(){
        notifyObservers();
    }
}