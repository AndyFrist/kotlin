package day04

/**
 * @author xuxiaopeng
 * @date 2020-02-16 18:06
 * @className: 枚举
 * @description:
 */

fun main(args: Array<String>) {
    println(WEEK.星期一)
    //所有元素
    val result = WEEK.values()
    result.forEach {
        print(it)
    }

    WEEK.星期一 ..WEEK.星期天

    Color.BLUE.b
}

enum class WEEK{
    星期一,星期二,星期三,星期四,星期五,星期六,星期天,
}

enum class Color(var r:Int,var g :Int ,var b: Int){
    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255)
}