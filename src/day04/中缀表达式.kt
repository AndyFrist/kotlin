package day04

/**
 * @author xuxiaopeng
 * @date 2020-02-1519:03
 * @className: 中缀表达式
 * @description:
 * 方法前面间关键字infix
 * 中缀表达式 让代码更间简洁易懂 可以用于自定义操作符
 * 使用条件：必须是成员函数或者是扩展函数，必须是只有一个参数，不能是可变参数或者默认参数
 *
 */

fun main(args: Array<String>) {

    val 张三 = Person()

    张三.sayHelloTo("李四")
    张三 sayHelloTo "李四"

    val pair = Pair("张三", 20)
    val pair2 = "张三" to 20
}

class Person{
    infix fun sayHelloTo(name: String) {
        println("你好$name")
    }
}