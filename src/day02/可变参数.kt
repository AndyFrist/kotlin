package day02

import java.lang.NullPointerException

fun main(args: Array<String>) {
    plus(1)
    plus(1,2)
    plus(1,2,3,4)

    NullPointerException
}

fun plus(vararg a: Int): Int { //a 是数组
    var resoult = 0
    a.forEach {
        resoult += it
    }
    return resoult
}