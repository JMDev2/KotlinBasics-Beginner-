

fun main(){

    print("Enter your grade: ")
    val grade = readln()!!.toInt()

    if(grade in 90..100){
        if (grade >= 90){
            println("You scrored an A+")
        }else{
            println("You scrored an A-")
        }
    }
    else if(grade in 80..89){
        if (grade >= 85){
            println("You scrored an B+")
        }else{
            println("You scrored an B-")
        }

    }
    else if (grade in 70..79){
        if (grade >=75){
            println("You scrored an C+")
        }else{
            println("You scrored an C-")
        }
    }
    else if (grade in 60..69){
        if (grade >= 65){
            println("You scrored an D+")
        }else{
            println("You scrored an D-")
        }
    }
    else if (grade in 0..59){
        println("You scrored a FAIL")
    }
    else{
        println("The grade is out of the range")
    }

}