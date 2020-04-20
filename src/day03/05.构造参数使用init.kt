package day03.adfshjkl.fjkla

/**
 * @author xuxiaopeng
 * @date 2020/4/20 10:21 下午
 * @className: `04.构造函数`
 * @description:
 */
fun main() {
    val p = Pson("lisi",89)

    println(p.name)
}

 class Pson(name: String, age: Int){

     var name: String = ""
     var age:Int = 12

     init {
         this.age = age
         this.name = name
     }
}
