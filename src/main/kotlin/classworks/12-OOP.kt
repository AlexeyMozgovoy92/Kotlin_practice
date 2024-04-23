package classworks

import java.time.LocalDate
import java.time.LocalDateTime

class Book(
    private val title: String,
    private val author: String,
    private val date: LocalDate,
    ){
    // используется для выполнения кода инициализации при создании экземпляра класса.
    // также блок выполняет дополнительные действия при создании объекта класса.
    init{
        if (title.isBlank()) throw Exception("")
    }
    // как static
    companion object{
        val field = ""
        fun met(){

        }
    }
    override fun toString(): String {
        return "$title by $author"
    }
}
fun main() {
    val book1 = Book("War and pease",
        "Tolstoy",
        LocalDate.of(1985, 1, 1)
    )
    val book2 = Book("JAVALANG",
        "John",
        LocalDate.of(1986, 2, 1)
    )
    val book3 = Book("Warrior",
        "Brand",
        LocalDate.of(1995, 5, 25)
    )

    val shelf = Shelf(10)
    shelf.addItem(book1)
    shelf.addItem(book2)
    shelf.isFull()
    shelf.availableSpace()
    shelf.printContents()
    println(shelf)



    Configuration.pr("object")
    Book.field
    Book.met()

}


object Configuration{
    var conf2 = ""

    fun pr(str: String){
        println(str)
    }
}