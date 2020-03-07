package day05

/**
 * @author xuxiaopeng
 * @date 2020-03-07 17:07
 * @className: `14.lambda表达式使用it`
 * @description:
 */

fun main(args: Array<String>) {

    val tools = tool(10, { m ->
        m * 2
    })

    //相比上面，最后一个参数为匿名函数时，（）可以前移
    val tool = tool(10) { m ->
        m * 2
    }

    tool(10, ::add)
    tool(100, add)
    tool(1000, { m: Int ->
        m + 10
    })
    tool(10000) { m: Int ->
        m + 10
    }
    //lambda表达式使用的时候如果只有一个参数可以省略参数名，默认是通过it来时实现的
    tool(10000) {
        it + 10
    }



}

//高阶函数

fun tool(a: Int, block: (Int) -> Int): Int {
    return block(a)
}

fun add(a: Int): Int {
    return a + 10
}

val add = { m: Int ->
    m + 10
}