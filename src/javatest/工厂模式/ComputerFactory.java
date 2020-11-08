package javatest.工厂模式;

import javatest.工厂模式.具体产品.AsusComputer;
import javatest.工厂模式.具体产品.HPComputer;
import javatest.工厂模式.具体产品.LenovoComputer;

/**
 * 接下来创建一个工厂类，它提供了一个静态方法createComputer用来生产电脑。你只需要传入你想生产的电脑的品牌，它就会实例化相应品牌的电脑对象：
 */
public class ComputerFactory {
    public static Computer createComputer(String type){
        Computer mComputer=null;
        switch (type) {
            case "lenovo":
                mComputer=new LenovoComputer();
                break;
            case "hp":
                mComputer=new HPComputer();
                break;
            case "asus":
                mComputer=new AsusComputer();
                break;

        }
        return mComputer;
    }
}