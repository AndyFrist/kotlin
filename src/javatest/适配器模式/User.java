package javatest.适配器模式;

public class User {
    public static void main(String[] args){
        ChinaPlug chinaPlug = new ChinaPlug();
        chinaPlug.powerWithChinastandard();

        HongkongPlug hongkongPlug = new HongkongPlug();
        ChinaPlugTarget chinaPlugAdaptee = new ChinaPlugAdapter(hongkongPlug);
        chinaPlugAdaptee.powerWithChinastandard();
    }
}