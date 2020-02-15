package day02

fun main(args: Array<String>) {
    val arr0 = BooleanArray(2)
    val arr1 = ByteArray(10)
    val arr2 = ShortArray(10)
    val arr3 = CharArray(10)
    val arr4 = FloatArray(10)
    val arr5 = DoubleArray(10)
    val arr6 = LongArray(10)
    val arr7 = IntArray(10){
        9 //把数组中的每一个元素都初始化为9
    }

    val arr8 = arrayOf("张三",true,23,'*') //数组中的类型Any  Object 字符串数组只能通过这个方式创建

    val arr9 = arrayOf(1,2,3,4)


    for (value in arr8) {
        println(value)
    }
    for ((value, index) in arr8.withIndex()) {
        println("value = $value,index = $index")
    }

    arr8[3] = false
    arr8[1] = 1000000000

    arr8.forEach {
        println(it)
    }

    arr8.forEachIndexed { index, value ->
        println("value = $value,index = $index")
    }
}