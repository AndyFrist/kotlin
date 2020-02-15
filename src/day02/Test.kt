package day02

fun main(args: Array<String>) {
    val str = "abcd"

//    for (value in str) {
//        println(value)
//    }

    for ((index, value) in str.withIndex()) {
        println("index = $index , value = $value")
    }

//    str.forEach {
//        println(it)
//    }

    str.forEachIndexed { index, value ->
        println("index = $index , value = $value")


    }
}