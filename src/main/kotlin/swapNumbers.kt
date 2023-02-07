

fun main(){


    print("Enter the firstNumber")
    var num1 = readln()!!.toInt()

    print("Enter the second number")
    var num2 = readln()!!.toInt()
    var temp = 0;


    temp = num1
    num1 = num2
    num2 = temp


    println(num1)
    println(num2)
    println(temp)
}