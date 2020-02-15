package day02

fun main(args: Array<String>) {
    val range1 = 1..100
    val range2 = IntRange(1, 100)
    val range3 = 1.rangeTo(100)

    val range4 = 'a'..'z'
    val range5 = '张'..'李'

    //反向区间
    val range6 = 100 downTo 1

    //区间的反转
    val range7 = range6.reversed()

//    for (value in range1) {
//        println(value)
//    }
//    for ((index, value) in range1.withIndex()) {
//        println("index = $index value = $value")
//    }
//    range7.forEach {
//        println(it)
//    }
    range7.forEachIndexed { index, value ->
        println(value)
    }

    for (value in range1 step 5) {
        println(value)
    }

}