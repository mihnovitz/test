val studentStatus = { name: String, auraColour: String ->
    println("$name has a $auraColour face color")
}

class Student {
    private var name: String = "mike"
        get() = field.replaceFirstChar { it.uppercase() }
    private var university: String = "AGH"

    val showStudent = { println("$name, $university") }
}

fun main() {
    studentStatus("Mike", "red")

    val student = Student()
    student.showStudent()
}
