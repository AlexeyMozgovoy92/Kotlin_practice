package classworks

import java.io.File

class MockkExample {

    fun processFile(file: File): String{
        val content =file.readText()
        return "Processed: $content"
    }
}