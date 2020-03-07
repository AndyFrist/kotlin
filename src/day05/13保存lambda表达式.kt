package day05.ac

/**
 * @author xuxiaopeng
 * @date 2020-03-07 11:21
 * @className: `13保存lambda表达式`
 * @description:
 */
fun main(args: Array<String>) {
    //保存lambda表达式
   val block:(()->Unit) =  {
        println("hello")
    }

    val test:((Int,Int)->Unit) = {a:Int,b:Int ->
        println((a + b))
    }

    //调用lambda表达式
    block()
    block.invoke()

    test(2,3)
    test.invoke(2,3)

}