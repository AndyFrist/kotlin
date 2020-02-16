package day04

/**
 * @author xuxiaopeng
 * @date 2020-02-1519:03
 * @className: 类委托
 * @description: TODO
 */

fun main(args: Array<String>) {
    val smallHeadFather = SmallHeadFather()
    smallHeadFather.wash()

}

//洗碗能力
interface WashPower{
    //洗碗行为
    fun wash()
}

//大头儿子
class BigHeadSon :WashPower{
    override fun wash() {
        println("大头儿子开始洗完了")
    }

}
//小头爸爸 将洗碗的能力委托给大头儿子
class SmallHeadFather:WashPower by BigHeadSon()