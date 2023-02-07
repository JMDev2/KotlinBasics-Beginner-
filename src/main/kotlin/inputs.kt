

fun main(){

    print("Enter your name: ")
    val name = readln()!! .toString()
    print("Enter your age: ")
    val age = readln()!!.toInt()
    print("Enter your GPA: ")
    val GPA = readln().toDouble()


    println("*******USER INFO******")
    println("name is: $name")
    println("age is: $age")
    println("GPA is: $GPA")
}