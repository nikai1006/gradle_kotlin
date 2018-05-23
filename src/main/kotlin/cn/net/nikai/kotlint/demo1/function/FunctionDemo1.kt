package cn.net.nikai.kotlint.demo1.function

/**
 * 函数的语法格式如下：
 * fun 函数名（参数列表）:返回值类型{
 *      函数体
 *      return 返回值
 * }
 * @author: nikai
 * @Description:
 * @Date: Create in 23:43 2018/5/23
 * @Modified By:
 */
fun main(args: Array<String>) {
    print("20*60长方形面积：${rectangleArea(20.0, 60.0)}")
}

/**
 *     长方形面积
 * @param with
 * @param height
 */
fun rectangleArea2(with: Double, height: Double) = with * height //如果函数只有一条语句，可以简化为这样，连返回值都可以省略

fun rectangleArea(with: Double, height: Double): Double {
    val area = with * height
    return area
}



