package javatest.单利模式.懒汉模式加双重锁;

/**
 * 当执行singleton = new Singleton(); 语句时，正常会分下面三个步骤：
 * 1）分配内存
 * 2）初始化对象
 * 3）将singleton指向分配的内存地址
 * 可以看到，实例化对象并不是原子操作，并且编译器可能会指令重排，比如以上步骤被重排为下面的步骤：
 * 1）分配内存
 * 2）将singleton指向分配的内存地址
 * 3）初始化对象
 *
 * 这样的话，如果线程A先分配内存，再singleton指向分配的内存地址 ，最后初始化对象时可能会出现如下情况：
 * 当线程A还没有执行3）初始化对象时，线程2执行到 if (singleton == null) 语句，因为线程A已经把singleton指向了内存地址，
 * 所以if (singleton == null) 语句返回false，getSingleton（）方法则直接把未初始化的singleton对象返回回去，这个时候，
 * 线程B用到singleton对象时，就会出现空指针。我们通过volatile来阻止指令重排，从而避免上面问题的发生。
 *
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}