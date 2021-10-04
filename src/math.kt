class math {
    // data member
    private var number: Int = 5

    // member function
    fun calculateSquare(): Int {
        return number*number
    }
}

fun main(args: Array<String>) {
    // creating an object
    val obj = math()
    println("${obj.calculateSquare()}")
}