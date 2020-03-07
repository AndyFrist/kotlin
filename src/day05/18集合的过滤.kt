package day05.filer

/**
 * @author xuxiaopeng
 * @date 2020-03-07 22:51
 * @className: `18集合的过滤`
 * @description:
 */
fun main(args: Array<String>) {

val list = listOf("张三","李四","王五","赵柳","张四","李五","李六")
val list2 = listOf("周芷若","张无忌","张武","李擅长","林青霞","张娜娜","苍老师")

    //找到第一个姓张的
    val find = list.find { it.startsWith("张") } //只会找一个，找到就退出
    println(find)
    // 把第一个集合中所有姓张的找出来
    val filter = list.filter { it.startsWith("张") }
    println(filter)
    // 把两个集合中所有姓张的找到并存放到同一个集合中
    val mulList = mutableListOf<String>()
    list.filterTo(mulList,{
        it.startsWith("张")
    })
    list2.filterTo(mulList,{
        it.startsWith("张")
    })

    println(mulList)
    // 吧第一个集合中角标为偶数的元素找出来
    val filterIndexed = list.filterIndexed { index, s ->
        index % 2 == 0
    }
    println(filterIndexed)
}