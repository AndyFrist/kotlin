package day04.ab

/**
 * @author xuxiaopeng
 * @date 2020-02-16 17:05
 * @className: object单例
 * @description:
 *
 * object单例 所有字段都是static静态 方法不是
 * object 试用条件：字段不多的时候
 * Java可以控制字段是静态还是非静态 但是kotlin没有static关键字
 *
 */

fun main(args: Array<String>) {

    //单例调用方法和属性
    Utils.name
    Utils.sayHello()

    Teather.instance.age
}

object Utils {
    var name = "张三"
    fun sayHello() {
        println("Hello")
    }
}

class Person {
    var age = 20

    //伴生对象，就是为了解决有些字段是static的，有些事非static的
    companion object {
        var name = "张三"
    }
}

class Teather private constructor(){  //私有构造函数
    var age = 20
    companion object {
        var name = "张三"

        //instance 代表Teather的实例
        val instance by lazy { Teather() } //惰性加载 只会加载一次 线程安全
    }
}