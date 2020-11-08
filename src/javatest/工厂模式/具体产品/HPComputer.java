package javatest.工厂模式.具体产品;

import javatest.工厂模式.Computer;

public class HPComputer extends Computer {
    @Override
    public void start() {
        System.out.println("惠普电脑启动");
    }
}