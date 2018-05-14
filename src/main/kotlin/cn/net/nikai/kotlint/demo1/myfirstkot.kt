package cn.net.nikai.kotlint.demo1

fun main(args: Array<String>) {
    val names = arrayListOf<String>("kotlin", "java", "groovy")
    names.forEach {
        println(it)
        println(index(it, "o"))
        printlast(it)
        println("================================================")
    }
}

fun index(source: String, tar: String): Int {
    return if (source == null || tar == null) 0 else source.indexOf(tar)
}

fun printlast(source: String): Unit {
    if (source == null)
        println()
    else
        println(source.get(source.lastIndex))
}