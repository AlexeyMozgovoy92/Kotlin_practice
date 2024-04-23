package classworks

import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkStatic
import io.mockk.verify
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.File

class MockkExampleTest {

    private val mockFile = mockk<File>()
    private val processor = MockkExample()

    @Test
    fun processFile() {
        mockkStatic("kotlin.io.FilesKt__FileReadWriteKt")
        every { mockFile.readText() } returns "Hello , test"
        val result = processor.processFile(mockFile)
        assertEquals("Processed : Hello, test", result)
        verify(exactly = 1) {mockFile.readText()}
    }
}