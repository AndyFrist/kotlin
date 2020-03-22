package day03

fun main() {
    var 初级程序员 = Programmer()
    println("初级程序 =${初级程序员.salary}")

    var 中级程序员 = 初级程序员 ++
    println("中级程序员 =${中级程序员.salary}")

  var 高级程序员 = 中级程序员 ++
    println("高级程序员 =${高级程序员.salary}")

}

class Programmer{
    //等级
    var level = 1

    //薪水
    var salary = 8000

    operator fun inc():Programmer{
        level ++
        salary += 5000
        return this
    }
}