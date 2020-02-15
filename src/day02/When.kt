package day02

fun main(args: Array<String>) {
    println( todo(1))
    println( todo1(12))
    println( todo2(17))
}

fun todo(age: Any): String {
    when (age) {
        is String -> return "字符串数据"
        in 1..6 -> return "没上学"

        7 -> return "开始上小学"

        in 8..11 -> return "在上小学"

        12 -> {
            return "开始上中学"
        }
        13, 14 -> return "正在上中学"
        15 -> {
            return "开始上高中"
        }
        16, 17 -> return "正在上高中"
        18 -> {
            return "开始上大学"
        }
        in 19..22 -> return "正在读大学"
        else -> {
            return "开始工作"
        }
    }
}

fun todo1(age: Any): String {
    when  {
        age is String -> return "字符串数据"
        age  in 1..6 -> return "没上学"

        age == 7 -> return "开始上小学"

       age in 8..11 -> return "在上小学"

        age == 12 -> {
            return "开始上中学"
        }
        age == 15 -> {
            return "开始上高中"
        }
        age == 18 -> {
            return "开始上大学"
        }
       age in 19..22 -> return "正在读大学"
        else -> {
            return "开始工作"
        }
    }
}

fun todo2(age: Any): String {
    return when  {
        age is String ->  "字符串数据"
        age  in 1..6 ->  "没上学"

        age == 7 ->  "开始上小学"

        age in 8..11 ->  "在上小学"

        age == 12 -> {
             "开始上中学"
        }
        age == 15 -> {
             "开始上高中"
        }
        age == 18 -> {
             "开始上大学"
        }
        age in 19..22 ->  "正在读大学"
        else -> {
             "开始工作"
        }
    }
}