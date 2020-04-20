package day03.fff

/**
 * @author xuxiaopeng
 * @date 2020/4/20 10:31 下午
 * @className: `06.构造函数参数使用var和val`
 * @description:
 */

fun main() {
    val perso = Perso("lilei",78);
    println(perso.age)
}

class Perso(var name:String,var age :Int){

    var tell =""
    constructor(name: String, age: Int, tell: String):this(name,age){
        this.tell = tell
    }

}