package day05

/**
 * @author xuxiaopeng
 * @date 2020-03-07 23:33
 * @className: `23.集合的拆分`
 * @description:
 */
fun main(args: Array<String>) {
    val list = listOf("张三","李四","王五","赵柳","张四","李五","张三")

    val partition = list.partition { it.startsWith("张") }
    println(partition.first)
    println(partition.second)
}