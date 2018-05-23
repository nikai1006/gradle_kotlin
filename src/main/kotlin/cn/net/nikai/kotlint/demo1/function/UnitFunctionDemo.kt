package cn.net.nikai.kotlint.demo1.function

import java.io.IOException

/**
 * Unit与Nothing区别
 * Unit表示数据没有实际意义，可以声明函数返回类型，也可以声明变量类型，
 * 声明函数时候函数可以正常返回，只是返回的数据没有实际意义
 * Nothing只能声明函数返回类型，说明函数永远不能正常返回，Nothing不能声明变量
 * @author: nikai
 * @Description:
 * @Date: Create in 23:52 2018/5/23
 * @Modified By:
 */
fun main(args: Array<String>) {
    printArea1(30.0, 40.0)
    printArea2(30.0, 40.0)
    printArea2(30.0, height = 50.0)
    printArea2(width = 30.0, height = 60.0)//在函数调用时候，一旦其中一个参数采用了命名参数形式传递，那么其后的所有参数都必须使用命名参数形式传递
//    printArea2(width = 30.0,60.0) //编译错误
    readDate()
}

fun printArea1(width: Double, height: Double): Unit {
    val area = width * height
    println("$width x $height 面积是：$area")
    return
}

fun printArea2(width: Double, height: Double) {//省略Unit
    val area = width * height
    println("$width x $height 面积是：$area")
//    省略return
}

fun readDate(): Nothing {
    throw IOException()
}

