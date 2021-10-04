fun main(args: Array<String>) {
    print("Enter Num 1: ")
    var num1= Integer.valueOf(readLine())
    print("Enter Operator: ")
    var op = readLine()
    print("Enter Num 2: ")
    var num2 = Integer.valueOf(readLine())

    if (op == "+"){
        println("Addition Result: " + (num1 + num2))
    }else if (op == "-"){
        println("Subtraction Result: " + (num1-num2))
    }else if (op == "*"){
        println("Multiplication Result: " + (num1 * num2))
    }else if (op == "/"){
        println("Division Result: " + (num1 / num2))
    }else if (op == "%"){
        println("Modulus Result: " + (num1 % num2))
    }else {
        println("Invalid Input")
    }
}