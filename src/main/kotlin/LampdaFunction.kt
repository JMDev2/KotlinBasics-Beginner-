
//normal function
fun sum(number1: Int, number2: Int): Int{
    return number1 + number2
}

//lampda function
val sumLambda = {number1: Int, number2: Int, number3: Int ->
    number1 + number2
}

fun main(){

    //print normal
    var sum = sum(34,27)
    println(sum)

    //print lampda
    var sumLambda = sumLambda(35,77,38)
    println(sumLambda)

    //lampdas in arrays
    var listOfNumbers = listOf<Int>(45,27,58,35,79)

    listOfNumbers.forEach{ number ->
        println(number)
    }
}