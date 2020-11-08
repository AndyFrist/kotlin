package javatest.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 欢迎关注公众号：程序员小安
 * @description: 抽象者父类
 * @CreateDate: 2019/10/30
 * @Version: 1.0
 */
public class Subject {
    //观察者对象列表
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 注册观察者对象
     * @param observer
     */
    public void registerObserver(Observer observer){
        if(!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    /**
     * 解绑观察者对象
     */
    public void unRegisterObserver(Observer observer){
        if(!observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    //通知所有注册的观察者执行对应操作
    public  void notifyObservers(){
        for (Observer observer : observers) {
            observer.updateCode();
        }
    }
}
