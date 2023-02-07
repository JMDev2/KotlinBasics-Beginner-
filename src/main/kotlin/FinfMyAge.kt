import java.util.Calendar

fun main(){
    print("Enter the year of Birth: ")
    var YOB = readln()!!.toInt()
    val YearInDevice = Calendar.getInstance().get(Calendar.YEAR)

    val time = Calendar.getInstance().time
    var age = YearInDevice - YOB


    if (YOB >= YearInDevice){
        println("Year is wrong")

    }else{
        println("Your age is $age years old")
        println(time)
    }





}