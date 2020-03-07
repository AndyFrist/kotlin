package day05

/**
 * @author xuxiaopeng
 * @date 2020-03-07 10:04
 * @className: `07.闭包`
 * @description:
 */
fun main(args: Array<String>) {
    test()
    test()
    test()

    var result =  test0()
    result()
    result()
    result()
}

//函数不保存状态，
fun test(){
    var a = 10
    println(a)
    a++
}

//闭包可以让函数携带状态
fun test0():()->Unit{
    var a = 10
    return  {
        println(a)
        a++
    }
}