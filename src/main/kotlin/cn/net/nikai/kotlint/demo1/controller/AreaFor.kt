package cn.net.nikai.kotlint.demo1.controller

/**
 * 区间
 * @author: nikai
 * @Description:
 * @Date: Create in 23:32 2018/5/23
 * @Modified By:
 */
fun main(args: Array<String>) {
    for (x in 0..5) {//声明闭区间包含0和5
        print("$x,")
    }
    println()
    for (x in 0 until 5) {//声明半开区间包含0，不包含5
        print("$x,")
    }
    println()
    for (x in 'a'..'e') {//声明闭区间包含‘a’和‘e’
        print("$x,")
    }
    println()
    for (x in 'a' until 'e') {//声明半开区间包含a，不包含e
        print("$x,")
    }
}