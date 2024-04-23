package classworks

import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CerealCookFacadeTest {

    private val cerealStorageMock = mockk<CerealStorage>()
    private val kitchenMock = mockk<Kitchen>()
    private val cookingFacade = CerealCookFacade(cerealStorageMock, kitchenMock)

    @Test
    fun cook() {
        Assertions.assertEquals(Dish("", 2),
            cookingFacade.cook(Cereal.RICE, 24f))
    }

    @Test
    fun `do a porridge`() {
        every { kitchenMock.selectCookware(any()) } returns Cookware(6f)
        every { kitchenMock.measureWater(any(), any()) } returns 4f
        every { kitchenMock.cook(any()) } returns Dish("Peas", 2)
        Assertions.assertEquals(Dish("Peas", 2),
            cookingFacade.cook(Cereal.PEAS, 2f))
    }

    @Test

    fun `check water in cookware`() {
        val cookware = Cookware(6f)
        every { kitchenMock.selectCookware(any()) } returns cookware
        every { kitchenMock.measureWater(any(), any()) } returns 4f
        every { kitchenMock.cook(any()) } returns Dish("Peas", 2)

        cookingFacade.cook(Cereal.PEAS, 2f)

        Assertions.assertEquals(4f, cookware.getWaterAmount())
    }

    @Test
    fun `check cereal in cookware`() {
        val cookware = Cookware(6f)
        every { kitchenMock.selectCookware(any()) } returns cookware
        every { kitchenMock.measureWater(any(), any()) } returns 4f
        every { kitchenMock.cook(any()) } returns Dish("Peas", 2)

        cookingFacade.cook(Cereal.PEAS, 2f)

        Assertions.assertEquals(mapOf(Cereal.PEAS to 2f), cookware.getCerealsComposition())
    }

    @Test
    fun testCook() {
    }

    @Test
    fun buyCereal() {
    }
}