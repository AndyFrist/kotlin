import java.math.BigDecimal

fun main(args: Array<String>) {

    var a:Int = 10
    var b : Int = a +10
    var c : Int = a +10


    println(b.hashCode())

    println(a.hashCode())

    println(c.hashCode())


    var bigd: BigDecimal = BigDecimal("1.123456789123456789")

    println(bigd)



}