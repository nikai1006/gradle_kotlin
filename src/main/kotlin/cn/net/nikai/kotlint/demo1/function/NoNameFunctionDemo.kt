package cn.net.nikai.kotlint.demo1.function

/**
 * 匿名函数
 */
fun calcFun2(num1: Int, num2: Int, operator: Char): Int {
    val resultFun = if (operator == '+') {
        fun(a1: Int, a2: Int): Int {
            return a1 + a2
        }
    } else {
        fun(s1: Int, s2: Int): Int {
            return s1 - s2
        }
    }

    val resultFun2 = if (operator == '+') {//这种情况下的两个匿名函数的确切参数要一致
        fun(a1: Int, a2: Int): Int {
            return a1 + a2
        }
    } else {
        fun(s1: Int, s2: Int, opt: String?): Int {
            return s1 - s2
        }
    }

    return resultFun(num1, num2)
}

fun main(args: Array<String>) {
    println(calcFun2(20, 10, '+'))
    println(calcFun2(20, 10, '-'))
}