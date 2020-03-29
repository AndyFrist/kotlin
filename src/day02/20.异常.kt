package day02.a20

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * @author xuxiaopeng
 * @date 2020/3/24 9:24 下午
 * @className: `20.异常`
 * @description:
 */

fun main() {
    var a = 0
    var b = 1
    try {
        b / a
    } catch (e: Exception) {
        println("捕获到异常")
    }finally {
        println("最终要执行的代码")
    }


    //----------------------------kotlin编译时异常不检查------------------
//   File file = new File("");
//        if (file != null){
//            try {
//                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
    //kotlin认为大部分的编译时异常都是没有必要的
    val file = File("")
    val bufferedReader = BufferedReader(FileReader(file))
}