package day03.iop

/**
 * @author xuxiaopeng
 * @date 2020/4/20 9:55 下午
 * @className: `02.访问器`
 * @description:
 */

fun main() {
    val person = Person()
    person.age = 90

    println(person.age)
}

class Person{
    var name = "张山"
    private set


    var age = 24//age不能超过150
    set(value) {
        if (value < 150) {
            field = value
        }
    }
}