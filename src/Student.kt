class Student (val name: String, var gender: String, var age: Int ) {
}

fun main(args: Array<String>) {
    // create object
    val stu = Student("Mwaura", "Male", 20 )

    println("Student Name: ${stu.name}")
    println("Student Gender: ${stu.gender}")
    println("Student Age: ${stu.age}")
}