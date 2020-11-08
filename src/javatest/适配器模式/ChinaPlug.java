package javatest.适配器模式;

/**
 * @Author: 欢迎关注公众号：程序员小安
 * @description:国标充电头
 * @CreateDate: 2019/11/20
 * @Version: 1.0
 */
public class ChinaPlug implements ChinaPlugTarget {
    @Override
    public void powerWithChinastandard() {
        System.out.println("使用国标充电头供电");
    }
}