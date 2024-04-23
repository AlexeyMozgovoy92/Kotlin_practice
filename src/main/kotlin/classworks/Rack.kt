package classworks

class Rack {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): Boolean {
        if (index in 0 until shelves.size) {
            shelves.removeAt(index)
            return true
        }
        return false
    }

}