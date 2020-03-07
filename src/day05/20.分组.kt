package day05.group

/**
 * @author xuxiaopeng
 * @date 2020-03-07 23:10
 * @className: `20.分组`
 * @description:
 */
fun main(args: Array<String>) {
    val list = listOf("张三","李四","王五","赵柳","张四","李五","李六")
    val groupBy = list.groupBy {
        val first = it.substring(0, 1)
        when (first) {
            "张" -> "张"
            "李" -> "李"
            else -> "其他"
        }
    }
    println(groupBy)
}