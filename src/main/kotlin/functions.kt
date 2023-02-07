
fun addNumbers(x: Int, y: Int): Int{
    var sum = x+y;
    return sum
}

fun displayNames(vararg names: String){
    for (name in names){
        println(name)

    }
}

fun main(){
    println("Start main Fun")

    var returnSum = addNumbers(10,20)
    println("The sum is: $returnSum")


    returnSum = addNumbers(70,34)
    println("The sum is: $returnSum")

    returnSum = addNumbers(79,123)
    println("The sum is: $returnSum")


    displayNames(names = *arrayOf("maina", "joseph", "mwangi"))
    println("End Main fun")




}