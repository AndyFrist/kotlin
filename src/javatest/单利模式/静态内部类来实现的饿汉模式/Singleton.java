package javatest.单利模式.静态内部类来实现的饿汉模式;

/**
 * 饿汉模式在类被加载时，就创建出对象，而通过静态内部类的方式，Singleton对象被加载时，INSTANCE没有被初始化，
 * SingletonHolder类不会被加载，只有在调用getInstance()方法时，才会加载SingletonHolder类，实例化INSTANCE对象。
 * 由于类的初始化是由ClassLoader完成的，利用了ClassLoader的线程安全机制，所以通过静态内部类来实现的饿汉模式既不过早消耗资源，又能保证线程安全。
 *
 *
 */

public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

