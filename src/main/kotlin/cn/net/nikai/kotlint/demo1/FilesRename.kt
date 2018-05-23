package cn.net.nikai.kotlint.demo1

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

/**
 * 用来批量修改文件名的，需要修改的文件名必须相同
 *
 * @author keni
 */
object FilesRename {
    private val MIN_LENGTH = 200 * 1024L

    /**
     * @param args
     * @throws Exception
     */
    /**
     * @param args
     * @throws Exception
     */
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val currentTime = Date()
        val formatter = SimpleDateFormat("yyyy-MM-dd")
        val dateString = formatter.format(currentTime)
        moveTo(File("G:/photo/temp"), File("G:/photo/wallpaper/$dateString"), ".jpg")
    }

    /**
     *
     * @param sourceDir
     * @param targetDir
     * @param subfix
     * @throws Exception
     */
    @Throws(Exception::class)
    fun moveTo(sourceDir: File, targetDir: File, subfix: String) {
        if (sourceDir.exists() && sourceDir.isDirectory) {
            if (!targetDir.exists())
                targetDir.mkdirs()
            if (targetDir.isFile)
                throw Exception("目标文件应为目录，请重新输入")
            val subFiles = sourceDir.listFiles()
            var i = 0
            for (subFile in subFiles!!) {
                val name = subFile.name
                if (subFile.isFile) {
                    val length = subFile.length()
                    println(subFile.name + ":" + length)
                    if (length > MIN_LENGTH)
                    //过滤掉200K以下的文件
                    {

                        val targetFile = File(targetDir, name + subfix)
                        println("move [" + subFile.absolutePath
                                + "] to [" + targetFile.absolutePath
                                + "].")
                        i++
                        subFile.renameTo(targetFile)
                    } else {
                        subFile.delete()
                    }
                }
            }

            println("Total files: $i")

        }
    }
}
