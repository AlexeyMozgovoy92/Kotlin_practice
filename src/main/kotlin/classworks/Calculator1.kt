package classworks

class Calculator1 {
    fun sum(a: Int, b: Int): Int{
        return a + b
    }

    fun sum (a: Double, b: Double): Int {
        return (a + b).toInt()
    }

    fun sum (a: Int, vararg b: Int): Int {
        return a + b.sum()
    }

    fun sum (a: List<Int>): Int {
        return a.sum()
    }

    fun sum (a: Array<Int>): Int {
        return a.sum()
    }
}