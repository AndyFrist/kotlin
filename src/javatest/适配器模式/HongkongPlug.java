package javatest.适配器模式;

/**
 * @Author: 欢迎关注公众号：程序员小安
 * @description:港行充电头
 * @CreateDate: 2019/11/20
 * @Version: 1.0
 */
public class HongkongPlug implements HongkongPlugAdaptee {
    @Override
    public void powerWithHongkongstandard() {
        System.out.println("使用港行充电头供电");
    }
}