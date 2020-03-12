package day05.函数回调

/**
 * @author xuxiaopeng
 * @date 2020/3/12 11:55 下午
 * @className: SuperMarket
 * @description:
 */
class SuperMarket {
    //高阶函数
    fun buySoy(objec:(Soy)->Unit){

        Thread{
            Thread.sleep(3*1000)
            //创建
            val soy = Soy("海天")
            //返回
            objec(soy)
        }.start()

    }
}