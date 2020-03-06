package day05.a

import day04.Person
import java.util.*

/**
 *@author ex-xuxiaopeng002
 *@date 2020-02-20 16:06
 *@className kotlin
 *@description:
 *
 * setOf 创建集合不可修改
 *
 */
fun main(args: Array<String>) {
    val set1 = setOf("张三","张三","张三","张三")

    val set2 = mutableSetOf("张三","张三","张三","张三")
    set2.add("hah")

    //java
    val treeSet = TreeSet<String>()
    treeSet.add("a")
    treeSet.add("b")
    treeSet.add("c")
    treeSet.add("d")
    treeSet.add("f")
    println(treeSet)

    val treeSet2 = TreeSet<Presom>()
    treeSet2.add(Presom("zhang",10))
    treeSet2.add(Presom("li",30))
    treeSet2.add(Presom("wang",20))
    treeSet2.add(Presom("ma",90))

    treeSet2.forEach {
        println(it.age)
    }
}

class Presom(var name:String,var age:Int) :Comparable<Presom> {
    override fun compareTo(other: Presom): Int {
        return this.age - other.age
    }
}
