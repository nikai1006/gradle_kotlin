package cn.net.nikai.kotlint.demo1.function

/**
 * 默认值参数函数
 * @author: nikai
 * @Description:
 * @Date: Create in 0:06 2018/5/24
 * @Modified By:
 */
fun main(args: Array<String>) {
    println(makeCoffee())
    println(makeCoffee("拿铁"))
}

fun makeCoffee(type: String = "java"): String {
    return "一杯${type}咖啡"
}