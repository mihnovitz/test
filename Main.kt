val studentStatus = { name: String, auraColour: String ->
    println("$name has a $auraColour face color")
}

class Student {
    var name: String = "mike"
        get() = field.replaceFirstChar { it.uppercase() }
}

fun main() {
    studentStatus("Mike", "red")

    val student = Student()
    println(student.name)
}
