package cn.net.nikai.kotlint.demo1.function

/**
 * 可变参数函数
 * @author: nikai
 * @Description:
 * @Date: Create in 0:20 2018/5/24
 * @Modified By:
 */
fun main(args: Array<String>) {
    println(sum(100.0, 20.0, 30.0))
    println(sum(30.0, 50.0))
    println(sum(30.0, 40.0, multiple = 5))//可变参数不是最后一个参数时候，后面的参数需要采用命名参数形式传递

    val doubleAry = doubleArrayOf(40.0, 30.0, 20.0)
    println(sum(30.0, 50.0, *doubleAry))//*展开运算符， *doubleAry吧数组展开
}

fun sum(vararg numbers: Double, multiple: Int = 1): Double {
    var total = 0.0
    for (number in numbers) {
        total += number
    }
    return total * multiple
}