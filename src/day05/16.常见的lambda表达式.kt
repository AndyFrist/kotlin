package day05.ui

/**
 * @author xuxiaopeng
 * @date 2020-03-07 17:42
 * @className: `16.常见的lambda表达式`
 * @description:
 */
fun main(args: Array<String>) {
    val str = "中国人"

    //forEach lambda表达式的演进过程

    str.forEach({ char: Char ->
        println(char)
    })

    //1.lambda表达式在最后一位 ()可以前移
    str.forEach() { char: Char ->
        println(char)
    }
    //2.()没有参数可以省略
    str.forEach { char: Char ->
        println(char)
    }
    //3.lambda只有一个参数可以使用it
    str.forEach {
        println(it)
    }

    str.forEach(::myPrint)

    str.forEach(::println)


    //-----------------------------------------------------------------------------------------
    val array = arrayOf("孙悟空", "沙和尚", "猪八戒")

    println(array.indexOfFirst(::startWith))

    println(array.indexOfFirst({ m: String ->
        m.startsWith("沙")
    }))
//1.lambda表达式在最后一位 ()可以前移
    println(array.indexOfFirst() { m: String ->
        m.startsWith("猪")
    })
//2.()没有参数可以省略
    println(array.indexOfFirst { m: String ->
        m.startsWith("猪")
    })
//3.lambda只有一个参数可以使用it
    println(array.indexOfFirst {
        it.startsWith("猪")
    })
}

fun myPrint(char: Char) {
    println(char)
}

fun startWith(str: String): Boolean {

    return str.startsWith("孙")
}