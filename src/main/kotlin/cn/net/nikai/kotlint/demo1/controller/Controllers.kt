/*
 * 控制流转
 */
package cn.net.nikai.kotlint.demo1.controller

/**
 * <pre>控制流转</pre>
 */
fun main(args: Array<String>) {
    //for
    for (i in 1..9)
        println(i)
    println("========================================")
    val nums = intArrayOf(10, 9, 8, 6, 1, 2, 3, 4)
    for (num in nums) {
        println(num)
    }
    println("---------------------------------------------")
    for (i in nums.indices)
        println("nums[${i}]=" + nums[i])
    println("---------------------------------------------")
    var i = 0
    while (i < 100) {
        println(i)
        i++
    }
    println("=========================================")
    do {
        i++
        println(i)
    } while (i < 200)

}