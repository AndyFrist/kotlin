package day05

/**
 * @author xuxiaopeng
 * @date 2020-03-07 11:14
 * @className: `11.lambda表达式单独存在`
 * @description:
 */
fun main(args: Array<String>) {

//    {
//        print("hello")
//    }()

    var result = {
        a:Int,b:Int->a+b
    }(1,2)

    println(result)
}