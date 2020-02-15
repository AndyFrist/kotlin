package day02

fun main(args: Array<String>) {
    println(add(2, 3))

    val addplus = ::add0        //::获取add函数的引用

    println(addplus(11, 12))
    println(addplus?.invoke(12, 13))//可以处理函数变量为空的情况下调用

    val padd: (Int, Int) -> Int = { a, b -> a + b } //匿名函数
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun add0(a: Int, b: Int) = a + b