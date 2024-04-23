package classworks

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class InventoryManagerTest {

    private val inventoryManager = InventoryManager(10)

    companion object{
        @JvmStatic
        fun parameters() = listOf(
            Arguments.of("knife", "knife"),
            Arguments.of("knife", "nife")
        )
    }


    @Test
    fun addItem() {
        inventoryManager.addItem("sword", 3)
        Assertions.assertEquals(3, inventoryManager.getItemCount("sword"))
    }

    @Test
    fun addExtraItem() {
        inventoryManager.addItem("sword", 3)
        inventoryManager.addItem("sword", 2)
        Assertions.assertEquals(5, inventoryManager.getItemCount("sword"))
    }

    @Test
    fun `should throw exception`() {
        inventoryManager.addItem("knife", 2)
        Assertions.assertThrows(IllegalStateException::class.java){
            inventoryManager.addItem("sword", 12)}
    }

    @Test
    fun removeItem() {
    }

    @Test
    fun getItemCount() {
        inventoryManager.addItem("sword", 3)
        val result = inventoryManager.getItemCount("sword")
        Assertions.assertEquals(3, result)
    }


    val formatter:InventoryManager  = InventoryManager(10)

    @ParameterizedTest
    @MethodSource("parameters")
    fun getItemCountParam(input: String, output: String) {
        inventoryManager.addItem(input, 3)

        Assertions.assertEquals(output, input)
    }

    @Test
    fun getItemCountOrNull(){
        val result = inventoryManager.getItemCount("sword")
        Assertions.assertEquals(0, result)

    }
}