package javatest.单利模式.饿汉模式;

/**
 * 饿汉模式中的类实例是当类被加载时就被初始化出来的，所以在应用初始化时，会占用不必要的内存。
 * 同时，由于该实例在类被加载的时候就创建出来了，所以他是线程安全的。因为类的初始化是由ClassLoader完成的，
 * 利用了ClassLoader的线程安全机制，ClassLoader的loadClass方法在加载类的时候使用了synchronized关键字实现线程同步。
 *
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}