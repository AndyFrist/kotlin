package day03

/**
 * @author xuxiaopeng
 * @date 2020/4/20 9:55 下午
 * @className: `02.访问器`
 * @description:
 */

fun main() {
    val person = Person()
    person.age = 90

}

class Person{
    var name = "张山"
    private set
    var age = 24
}