package classworks

import org.junit.jupiter.api.Assertions

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class ParametrizedTests {

    companion object{
        @JvmStatic
        fun parameters() = listOf(
            Arguments.of("8 (922) 941-11-11", "+7 (922) 941-11-11"),
            Arguments.of("79229411111", "+7 (922) 941-11-11"),
            Arguments.of("+7 922 941 11 11", "+7 (922) 941-11-11"),
            Arguments.of("8229411111", null),
            Arguments.of("12345", null),
            Arguments.of("abc +7 922 941 11 11", "+7 (922) 941-11-11"),
            Arguments.of("+1 (922) 941-11-11", null),
            Arguments.of("+7 (922) 941-11", null),

        )
    }
val formatter: Parametrized = Parametrized()

    @ParameterizedTest
    @MethodSource("parameters")
    fun formatPhoneNumber(input: String, output: String?) {
        Assertions.assertEquals(output, formatter.formatPhoneNumber(input))
    }
}
