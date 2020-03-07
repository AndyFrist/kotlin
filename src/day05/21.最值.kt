package day05.zui

import day05.girl.Girl

/**
 * @author xuxiaopeng
 * @date 2020-03-07 23:20
 * @className: `21.最值`
 * @description:
 */
fun main(args: Array<String>) {
    val list = listOf("z", "b", "c")
    //最大值
    println(list.max())
    // 最小值
    println(list.min())


    var list1 = listOf<Girl>(
        Girl("伊儿",18,168,"山东"),
        Girl("笑笑",19,175,"河南"),
        Girl("小百合",17,155,"福建"),
        Girl("michel",22,148,"广东"),
        Girl("猫咪",28,159,"广西"),
        Girl("玲儿",23,169,"广东"),
        Girl("环环",25,172,"安徽"),
        Girl("胖嘟嘟",32,180,"河北"),
        Girl("乔乔",18,180,"广东"),
        Girl("小可爱",27,150,"江西"),
        Girl("一生有你",22,163,"山东"),
        Girl("敏儿",18,155,"黑龙江"),
        Girl("月儿",25,178,"吉林"),
        Girl("花儿",21,183,"山东"),
        Girl("s小糖",49,190,"新疆"),
        Girl("悦悦",19,160,"广西"),
        Girl("小可爱",29,158,"广东"),
        Girl("紫琪",49,149,"新疆"),
        Girl("糖心",19,160,"广西"),
        Girl("棒棒糖",23,172,"浙江"),
        Girl("猪猪侠",18,173,"山东"),
        Girl("喵喵",27,164,"河南"),
        Girl("安琪",18,159,"河北"),
        Girl("叶子",20,160,"广东")
    )

    // 对象最大
    println(list1.maxBy { it.age })
    // 对象最小
    println(list1.minBy { it.age })
}