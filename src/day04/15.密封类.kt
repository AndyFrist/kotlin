package day04

/**
 * @author xuxiaopeng
 * @date 2020/3/22 9:47 上午
 * @className: `15.密封类`
 * @description:
 */

fun main() {
    val wang = wang5()
    println(isZhang(wang))
  val zhang1 = zhang.zhang1()
    println(isZhang(zhang1))

}

fun isZhang(person: zhang): Boolean {

   return when(person){
       is zhang.zhang1 -> true
       is zhang.zhang2 -> true
       is zhang.zhang3 -> true
       is zhang.zhang4 -> true
       else -> false
    }
}

sealed class zhang {
    class zhang1 : zhang()
    class zhang2 : zhang()
    class zhang3 : zhang()
    class zhang4 : zhang()

}

class wang5 : zhang()