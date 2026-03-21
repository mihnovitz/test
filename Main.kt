//zadanie 2
val studentStatus = { name: String, auraColour: String ->
    println("$name has a $auraColour face color")
}

//zadanie 3
class Student3 {
    var name: String = "mike"
        get() = field.replaceFirstChar { it.uppercase() }
}

//zadanie 4
class Student4(name: String = "mike", var university: String = "AGH") {
    var name: String = name
        get() = field.replaceFirstChar { it.uppercase() }
}

//zadanie 5
class Student5(name: String = "mike", private var university: String = "AGH") {
    private var name: String = name
        get() = field.replaceFirstChar { it.uppercase() }
    val showStudent = { println("${this.name}, $university") }
}

//zadanie 6
open class Person(val name: String)

class Student6(name: String, private val university: String = "AGH") : Person(name) {
    val showStudent = { println("${name.replaceFirstChar { it.uppercase() }}, $university") }
}

fun main() {
    //zadanie 2
    studentStatus("Mike", "red")

    //zadanie 3
    val s3 = Student3()
    println(s3.name)

    //zadanie 4
    val s4 = Student4("mike")
    println("${s4.name}, ${s4.university}")

    //zadanie 5
    val s5 = Student5()
    s5.showStudent()

    //zadanie 6
    val s6 = Student6("mike")
    s6.showStudent()
}
