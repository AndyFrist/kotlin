package day04.扩展函数.bb

import day04.扩展函数.Student

/**
 * @author xuxiaopeng
 * @date 2020-02-16 15:59
 * @className: funcation
 * @description:
 */

fun Student?.isOld(): Boolean {

    return this?.age ?: -1 > 20
}

fun Student?.isTall(): String {
    val tall = this?.tall ?: -1
    return when (tall) {
        -1 -> "未知身高"

        in 0..160 -> "矮个子"
        in 160..170 -> "个子不高"
        in 170..180 -> "高个子"
        in 180..190 -> "男神"
        else -> {
            ""
        }
    }

}