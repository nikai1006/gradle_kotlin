package cn.net.nikai.kotlint.demo1

/**
 * demo1 cn.net.nikai.kotlint.demo1
 * 基本数据类型
 * @author: nikai
 * @Description:
 * @Date: Create in 16:18 2018/5/13
 * @Modified By:
 */
fun main(args: Array<String>) {

    val byte: Byte = 16
    val st: Short = 16
    val i: Int = 16
    var ll = 16L

    ll = st.toLong()
    println(byte)
    println(i)
    print(ll)
    println()
    println("--------------------------------")
    println(index("abacdefg", "d"))

}