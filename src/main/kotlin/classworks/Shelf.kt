package classworks
class Shelf(private val capacity: Int ){
    private val books =  mutableListOf<Book>()

    fun addItem(book: Book): Boolean {
        if (books.size < capacity) {
            books.add(book)
            return true
        }
        return false

    }

    fun removeItem(book: Book): Boolean {
        return books.remove(book)
    }

    fun isFull(): Boolean {
        // Метод для проверки, заполнена ли полка
        return books.size >= capacity
    }

    fun availableSpace(): Int {
        // Метод для определения доступного места на полке
        return capacity - books.size
    }

    fun printContents() {
        println("classworks.Shelf capacity: $capacity")
        books.forEachIndexed { index, item -> println("$index: $item") }
    }

    override fun toString(): String {
        return "Shelf with capacity $capacity, currently holding ${books.size} books"
    }
}