package day02

fun main(args: Array<String>) {
    requst("www.baidu.com", "get") //正常请求
    requst("www.baidu.com")             //默认参数
    requst(path = "www.baidu.com", method = "get") //具名参数 参数位置可以变化
    requst(method = "get", path = "www.baidu.com") //具名参数 参数位置可以变化
}

fun requst(path: String, method: String = "GET") { //GET默认参数
    println("请求地址=${path} 请求方式 = ${method}")
}