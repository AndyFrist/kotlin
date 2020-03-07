package day05.kl

/**
 * @author xuxiaopeng
 * @date 2020-03-07 10:21
 * @className: `08.高阶函数`
 * @description:
 */
fun main(args: Array<String>) {
    var add = ::add
    var sub = ::sub

    println(cacl(10, 20, add))
    println(cacl(10, 20, sub))

}
//第三个参数是函数类型，说明kotlin里面的函数可以传递函数参数
// 如果函数里面传递函数参数的话，就称为高阶函数
fun cacl(a: Int, b: Int, block: (a: Int, b: Int) -> Int): Int {
    return block.invoke(a, b)
}

fun add(a: Int, b: Int):Int {
    return a + b
}
fun sub(a: Int, b: Int):Int {
    return a - b
}