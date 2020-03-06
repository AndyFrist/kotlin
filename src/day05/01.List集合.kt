package day05

import java.util.*

/**
 * listOf()  创建只读集合，不能修改，添加
 * mutableListOf 创建集合可变
 *
 */

fun main(args: Array<String>) {
    //listOf
    val list1 = listOf("张三","张三","张三","李四")
    list1.forEach{
        println(it)
    }

    //mutableListOf
    val list2 = mutableListOf("张三","张三","张三","李四")
    list2.add(0,"柳岩")
    list2.forEach{
        println(it)
    }

    //java方式 创建ArrayList
    val list3 = ArrayList<String>()
    list3.add("")
    val list4 = arrayListOf("张三","张三","张三","李四")
    list4.add("")
    val list5 = Vector<String>()



}
