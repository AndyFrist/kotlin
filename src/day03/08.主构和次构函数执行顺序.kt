package day03.ff90

/**
 * @author xuxiaopeng
 * @date 2020/4/20 10:31 下午
 * @className: `06.构造函数参数使用var和val`
 * @description:
 */

fun main() {
    val perso = Perso("lilei",78,"134785934");
    println(perso.age)
}

class Perso(var name:String,var age :Int){
    init {
        println("主构函数")
    }
    var tell =""
    constructor(name: String, age: Int, tell: String):this(name,age){
        this.tell = tell
        println("次构函数")
    }

}