package day04.g

import kotlin.reflect.KProperty

/**
 * @author xuxiaopeng
 * @date 2020-02-16 10:29
 * @className: 委托属性
 * @description:
 */
fun main(args: Array<String>) {
    val bigHeadSon = BigHeadSon()
    //爷爷奶奶给的压岁钱
    bigHeadSon.压岁钱 = 100
    println(bigHeadSon.压岁钱)

}

class BigHeadSon {
    var 压岁钱: Int by Mother() //压岁钱委托给妈妈
}

class Mother {
    operator fun getValue(bigHeadSon: BigHeadSon, property: KProperty<*>): Int {
        return 儿子的压岁钱
    }

    operator fun setValue(bigHeadSon: BigHeadSon, property: KProperty<*>, i: Int) {
        儿子的压岁钱 = i / 2

        自己的小金库 = i / 2
    }

    var 儿子的压岁钱 = 0

    var 自己的小金库 = 0
}