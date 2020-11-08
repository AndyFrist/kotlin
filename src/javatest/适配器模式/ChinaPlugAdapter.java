package javatest.适配器模式;

/**
 * @Author: 欢迎关注公众号：程序员小安
 * @description:适配器
 * @CreateDate: 2019/11/20
 * @Version: 1.0
 */
public class ChinaPlugAdapter implements ChinaPlugTarget {
    private HongkongPlugAdaptee hongkongPlugTarget;

    public ChinaPlugAdapter(HongkongPlugAdaptee hongkongPlugTarget) {
        this.hongkongPlugTarget = hongkongPlugTarget;
    }

    @Override
    public void powerWithChinastandard() {
        hongkongPlugTarget.powerWithHongkongstandard();
    }
}