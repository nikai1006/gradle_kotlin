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

    println("*****************************************")
    for (x in 0..4) {
        for (y in 5 downTo 1) {
            if (y == x) {
                break
            }
            println("(x,y)=($x,$y)")
        }
    }
    println("--------------")
    label1@ for (x in 0..4) {
        for (y in 5 downTo 1) {
            if (y == x) {
                break@label1 //跳转到label1指向的外循环
            }
            println("(x,y)=($x,$y)")
        }
    }
    println("End!")
}