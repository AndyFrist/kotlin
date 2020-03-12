package day05.函数回调

/**
 * @author xuxiaopeng
 * @date 2020/3/12 11:55 下午
 * @className: Mother
 * @description:
 */
fun main() {
    println("hello")

    //超市对象
    val superMarket = SuperMarket()

    //买酱油
//    superMarket.buySoy({
//        println("买到${it.name}酱油")
//        println("妈妈开始做饭")
//
//    })

    superMarket.buySoy{
        println("买到${it.name}酱油")
        println("妈妈开始做饭")
    }


    println("做甜点")
}