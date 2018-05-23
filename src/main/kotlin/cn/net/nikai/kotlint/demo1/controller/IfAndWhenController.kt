package cn.net.nikai.kotlint.demo1.controller

fun main(args: Array<String>) {

    val i = 1
    val result = if (i > 0) true else false
    println("result=" + result)
    println("---------------------------------------------")
    val wR =
            when (3) {
                1 -> {
                    println(1)
                }
                3, 4 -> {
                    println("""It's 3 or 4.""")
                }
                0 -> {
                    print("""It's "zero". """)
                }
                else -> {
                    println("nothing")
                }
            }
    println(wR)
}