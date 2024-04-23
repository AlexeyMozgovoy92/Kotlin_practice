package homeworks

interface OS {
    val baseOsVersion: String
    fun loading()
    fun upgrade()
}