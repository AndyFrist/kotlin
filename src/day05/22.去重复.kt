package day05

/**
 * @author xuxiaopeng
 * @date 2020-03-07 23:25
 * @className: `22.去重复`
 * @description:
 */
fun main(args: Array<String>) {
    val list = listOf("张三","李四","王五","赵柳","张四","李五","张三")
    //把重复的张三去掉
    val toSet = list.toSet()
    println(toSet)
    val distinctBy = list.distinct()
    println(distinctBy)
    //把重复的同姓去掉

    val distinctBy1 = list.distinctBy { it.substring(0, 1) }
    println(distinctBy1)
}