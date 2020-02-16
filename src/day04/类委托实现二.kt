package day04.hh

/**
 * @author xuxiaopeng
 * @date 2020-02-15 19:31
 * @className: 类委托实现二
 * @description: 不局限某个
 */

fun main(args: Array<String>) {
    val bigHeadSon = BigHeadSon()
    val smallHeadFather = SmallHeadFather(bigHeadSon)
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
class SmallHeadFather(var washPower: WashPower):WashPower by washPower