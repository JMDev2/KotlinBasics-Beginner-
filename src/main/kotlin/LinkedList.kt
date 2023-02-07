import java.util.LinkedList


fun main(){


    println("Start App")
    println("Enter the number of pets: ")

    var listOfPets = LinkedList<String>() //for empty string of array

    do{
        print("Enter Pet name or exit to quit: ")
        var petName = readLine()!!.toString()
        if (petName != "quit"){
            listOfPets.add(petName)
        }
    }while (petName != "quit")

    println("Your pets are using index")
    for (i in 0 until listOfPets.size){
        println("pet $i: ${listOfPets[i]}")

    }
    if (listOfPets.contains("cat")){
        println("You must be a lady. right???")
    }
}