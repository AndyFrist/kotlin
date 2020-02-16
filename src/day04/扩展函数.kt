package day04

/**
 * @author xuxiaopeng
 * @date 2020-02-16 15:44
 * @className: 扩展函数
 * @description:
 */

fun main(args: Array<String>) {
    val str: String? = ""

    val myIsEmpty = str.myIsEnpty()
    println(myIsEmpty)
}

/**
 * 1.String类扩展 fun String.扩展函数名
 * 2.扩展函数可以访问当前对象里面的字段和方法
 *
 * */

fun String?.myIsEnpty(): Boolean {
    return this == null || this.length ==0
}