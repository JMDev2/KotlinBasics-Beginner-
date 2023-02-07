

fun main(){

    print("Enter your grade: ")
    val grade = readln()!!.toInt()

    if(grade in 90..100){
        println("You scrored an A")
    }
    else if(grade in 80..89){
        println("You scrored an B")
    }
    else if (grade in 70..79){
        println("You scrored an C")
    }
    else if (grade in 60..69){
        println("You scrored an D")
    }
    else if (grade in 0..59){
        println("You scrored a FAIL")
    }
    else{
        println("The grade is out of the range")
    }

}