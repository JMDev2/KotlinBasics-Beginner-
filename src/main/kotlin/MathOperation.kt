

fun main(){
    print("Enter the first Number: ")
    val num1 = readln().toInt()
    print("Enter the second Number :")
    val num2 = readln().toInt()

    val sum = num1+num2
    val multi = num1*num2
    val div = num1/num2
    val mod = num1%num2

    println("The sum is : $sum")
    println("The multiplication is :$multi")
    println("The division is : $div")
    println("The modulus is :$mod")
}