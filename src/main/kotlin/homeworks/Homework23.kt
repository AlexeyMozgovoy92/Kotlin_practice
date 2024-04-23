package homeworks

import com.google.gson.*
import java.lang.reflect.Type
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class TestCase(
    val id: String,
    val name: String,
    val dateAndTime: LocalDateTime,
    val critical: Criticality,
    val author: String,
    val risc: Risk,
    val runs: List<Runs>,
    val steps: List<Steps>,


)

enum class Criticality {
    LOW,
    MEDIUM,
    HIGH;
}

enum class Risk {
    LOW,
    MEDIUM,
    HIGH;
}

data class Runs(
    val id: String,
    val result: Result,
    val dateAndTime: LocalDateTime,
    val defectLink: String?,

)

enum class Result {
    GOOD,
    BAD,
    SKIP;
}

data class Steps(
    val step: Int,
    val action: String,
    val result: String,
    )


fun main(){

    val step1 = Steps(1,"s", "a")
    val step2 = Steps(2,"a", "d")
    val case1 = Runs("1", Result.GOOD, LocalDateTime.now(), "good")
    val result = TestCase("1", "test", LocalDateTime.now(), Criticality.LOW, "John", Risk.LOW, listOf(case1),listOf(step1, step2))
    val gson1 = GsonBuilder()
        .setPrettyPrinting()
        //.registerTypeAdapter()
        .create()


}
class LocalDateTimeSerializer: JsonSerializer<LocalDateTime> {
    override fun serialize(src: LocalDateTime?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
        return JsonPrimitive(src?.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
    }
}

//class LocalDateTimeDeserializer: JsonSerializer<LocalDateTime> {
//    override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext?): LocalDateTime {
//        return LocalDateTime.parse(json?.asJsonPrimitive?.asString, DateTimeFormatter.ISO_LOCAL_DATE_TIME)
//    }
//
//    override fun serialize(src: LocalDateTime?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
//        TODO("Not yet implemented")
//    }
//}

fun findFaildCase(tests: List<TestCase>, id: String): List<TestCase> {
    return tests.filter { testCase: TestCase ->
        testCase.runs.any { run: Runs ->
            run.id == id && run.result == Result.BAD
        }
    }
}