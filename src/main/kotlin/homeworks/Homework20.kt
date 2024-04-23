package homeworks

class Homework20 {
}

fun main(){
timeTracker { " " }


}

// TASK1
fun timeTracker(operation: () -> Unit): Long {
    val startTime = System.nanoTime()
    operation()
    return System.nanoTime() - startTime

}

class Person(val name: String, val age: Int) {
    var email: String = ""
}


class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

// TASK 2
val person1 = Person("Lack", 43)
val employee = with(person1) {
    Employee(this.name, age, "Software Engineer")
}


// TASK 3
val employee2 = Person("Jack", 42).run {
    Employee(name, age, "").apply {
        email = "sdsd@sdsd"
        department = "ssss"
    }

}

// TASK 4

val person3: Person? = null
val employee3 = person3?.let{ p ->
    Employee(p.name, p.age, "")
}?: Employee("", 1, "")

// TASk 5
val person = Person("Mike", 25).also {
    it.email = "mike@example.com"
}

//TASK 6

val employee5 = Employee("Emily", 32, "Accountant").apply {
    email = "emily@example.com"
    department = "Finance"
}
