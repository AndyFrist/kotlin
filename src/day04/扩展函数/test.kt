package day04.扩展函数

import day04.扩展函数.bb.isOld
import day04.扩展函数.bb.isTall

/**
 * @author xuxiaopeng
 * @date 2020-02-16 15:56
 * @className: test
 * @description:
 */
fun main(args: Array<String>) {
    val student :Student? = Student(20,"张三",187)
    //判断学生是否大于20岁

    val old = student.isOld()
    println(old)

    val tall = student.isTall()
    println(tall)
}