package day05

/**
 *@author ex-xuxiaopeng002
 *@date 2020-02-21 15:34
 *@className kotlin
 *@description:
 */
fun main(args: Array<String>) {
    // 三种定义
    val map0 = mapOf("中国" to "china","英国" to "english","美国" to "USA")

    val map1 = mutableMapOf("中国" to "china","英国" to "english")

    val map = HashMap<String,String>()
    map["04"] = "张三"
    map["01"] = "李四"
    map["03"] = "王二"
    map["02"] = "麻子"


    //遍历


    //所有的key
    val keySet = map0.keys
    keySet.forEach {
        println(it)
    }
    //所有的value
    val values = map0.values
    values.forEach {
        println(it)
    }

    //key 和 value
    map0.forEach { t, u ->
        println("key = $t , value = $u")
    }

    for ((key, value) in map) {
        println("key = $key , value = $value")
    }

}
