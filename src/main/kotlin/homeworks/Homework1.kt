package homeworks


const val EVENTTITLE: String = "Event"

class Homework1 {

    val eventDate: Double = 20.05

    val eventLocation: String = "place"

    val budget: List<Double> = arrayListOf()

    val numberOfParticipants: Int = 4

    val eventDuration: Int = 60

    val vendorContacts: List<String> = arrayListOf()

    var eventStatus: Boolean = true

    val sponsors: List<String> = arrayListOf()

    private val totalBudget: Int = 10000

    val internetAccessLevel: Boolean = true

    lateinit var equipmentTransportPlan: List<Any>

    var numberOfTeams: Int = 5

    val tasks: List<String> = arrayListOf()

    val evacuationPlan: String = "EvacuationPlan"

    val availableEquipment: List<String> = arrayListOf()

    val freeEquipment: List<String> = arrayListOf()

    lateinit var cateringSchedule: List<Any>

    val eventFailPlan: List<String> = arrayListOf()

    var expertsAndJudges: List<String> = arrayListOf()

    val feedbackMethods: List<String> = arrayListOf()

    val privacyPolicy: String = ""


    lateinit var privateFeedback: String

    val currentTemperature: Int = 0
    val networkPerformanceLog: String = ""
    val lightingLevel: Int = 0
    val eventLog: String = ""
    val medicalAssistanceAvailability: Boolean = true
    val safetyProcedures: String = ""
    val eventRegistrationNumber: String = ""

}
