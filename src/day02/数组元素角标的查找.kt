package day02

fun main(args: Array<String>) {
    val arr = arrayOf("张三","lisi","hanmei","张三","hanmeimei")

    val index = arr.indexOf("张三")
    println(index)

    val lastIndexOf = arr.lastIndexOf("张三")
    println(lastIndexOf)

    val indexOfFirst = arr.indexOfFirst {
        it.startsWith("张")
    }
    println(indexOfFirst)

    val indexOfLast = arr.indexOfLast {
        it.startsWith("张")
    }
    println(indexOfLast)
}