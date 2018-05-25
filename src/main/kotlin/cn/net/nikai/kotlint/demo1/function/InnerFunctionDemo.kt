package cn.net.nikai.kotlint.demo1.function

/**
 * 局部函数
 */
fun calcFun(num1: Int, num2: Int, operator: Char): Int {
    fun add(a1: Int, a2: Int): Int {
        return a1 + a2
    }

    fun sub(s1: Int, s2: Int): Int {
        return s1 - s2
    }

    return if (operator == '+') add(num1, num2) else sub(num1, num2)
}

fun main(args: Array<String>) {

    println(calcFun(20, 10, '+'))
    println(calcFun(20, 10, '-'))
}