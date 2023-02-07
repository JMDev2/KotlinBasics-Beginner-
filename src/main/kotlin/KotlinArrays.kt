


fun main(){

    println("Start App")
    println("Enter the number of pets: ")
    var petSize = readln()!!.toInt()
    println("Enter the pets below: ")
    var listOfPets: Array<String> = Array(petSize){""} //for empty string of array
    for (i in 0 until petSize){
        print("pet $i: ")
        listOfPets[i] = readln()!!.toString()
    }


    println("The pets array")
    for (i in 0 until petSize){
        println("Pet $i: ${listOfPets[i]}")
    }
}