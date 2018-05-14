package cn.net.nikai.kotlint.demo1

import java.io.Serializable
import java.util.*

/**
 * demo1 cn.net.nikai.kotlint.demo1
 * @author: nikai
 * @Description:
 * @Date: Create in 16:20 2018/5/13
 * @Modified By:
 */
fun main(args: Array<String>) {
    val chars = charArrayOf('a', 'b', 'c', 'd', 'e')
    val s1 = String(chars)
    val s2 = String(chars, 1, 4)
    println(s1)
    println(s2)

    val bytes = byteArrayOf(97, 98, 99)
    val s3 = String(bytes)
    val s4 = String(bytes, 1, 2)
    println(s3)
    println(s4)

    println("--------------------------------------------------")
    val age = 16
    val s5 = "he's age is $age" //使用变量形式模板
    val s6 = "he's age is ${age}year"
    println(s5)
    println(s6)

    val now = Date()
    val s7 = "今天是：${now.year + 1900}year ${now.month}mon ${now.day}day"
    println(s7)

    val s8 = """today is:
        |${now.year + 1900}year
        |${now.month}mon
        |${now.day}day
    """.trimMargin()
    println(s8)
}

class MyString : Serializable {

    public fun index(source: String, tar: String): Int {
        return if (source == null || tar == null) 0 else source.indexOf(tar)
    }

}