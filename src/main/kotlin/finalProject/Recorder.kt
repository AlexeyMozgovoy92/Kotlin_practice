package finalProject

interface Recorder {

    fun saveToFile(fileName: String)
    fun loadFromFile(fileName: String)
}