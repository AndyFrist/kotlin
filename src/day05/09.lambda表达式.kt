package day05.biaodashi

/**
 * @author xuxiaopeng
 * @date 2020-03-07 10:41
 * @className: `09.lambda表达式`
 * @description:
 */

fun main(args: Array<String>) {


    val cacl = cacl(10, 20, {m,n -> m+n})
    val cacl1 = cacl(10, 20, {m,n->m-n})
    println(cacl)
    println(cacl1)


    // 匿名函数 lambda表达式
    //  调用的时候最后一个参数是一个匿名函数lambda表达式，可以把（）前移
    val cac2 = cacl(10, 20) { m, n -> m+n}
    val cacl3 = cacl(10, 20) { m, n->m-n}
    println(cac2)
    println(cacl3)
}
//第三个参数是函数类型，说明kotlin里面的函数可以传递函数参数
// 如果函数里面传递函数参数的话，就称为高阶函数
fun cacl(a: Int, b: Int, block: (a: Int, b: Int) -> Int): Int {
    return block.invoke(a, b)
}

