package classworks

import java.io.File
import java.nio.file.Files

class Classwork21 {
}

fun main(){

    val file = File("path/to/file.txt")
    val directory = File("path/to/directory.txt")

    if (file.exists()) {
        println("file exist")
    } else {
        println("file absent")
    }

    file.parentFile.mkdirs()
    val isNewFileCreated: Boolean = file.createNewFile()
    if (isNewFileCreated){
        println("file created")
    } else {
        println("already exist")
    }

    file.writeText("Hello, world")
    val text = file.readText()
    println(text)


    val d = File("src")
    val listFiles = d.listFiles()
    listFiles?.forEach { file ->
        println(file.name)
    }

    // удаление всего пути
    if(File("path").deleteRecursively()){
        println("deleted")
    } else {
        println("can't delete")
    }

    //копирование файла
    file.copyTo(File("path/to/file1.txt"), overwrite = true)
}

fun searchFilesUsingWalk(startDir: String, query: String): List<String> {
    return File(startDir)
        .walk() //рекврсивный обход файлов  и деоекторий с startDir
        .filter { it.isFile && it.name.contains(query, ignoreCase = true) } //фильтрация по имени файла
        .map { it.absolutePath } // преобразование в абсолютный путь
        .toList()
}

fun createFileOrDirectory(path: String){
    if(path.endsWith("/")){
        File(path).mkdir()
    } else {
        File(path).parentFile.mkdirs()
        File(path).createNewFile()
    }
}