package classworks

import java.io.File

class Classwork21 {
}

fun createFileOrDirectory(path: String){
    if(path.endsWith("/")){
        File(path).mkdir()
    } else {
        File(path).parentFile.mkdirs()
        File(path).createNewFile()
    }
}