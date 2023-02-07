import java.util.*
import kotlin.collections.HashMap

fun main(){


    var listOfUsers = HashMap<String, LinkedList<String>>()

    while (true) {
        print("Enter your name or quit: ")
        val name = readln()!!.toString()

        if (name == "quit"){
            break
        }

        print("Enter where you live: ")
        val livePlace = readLine()!!.toString()

        var listOfuserPets = LinkedList<String>()
        do {
            print("Enter pet name or type next: ")
            var petName: String = readln()!!.toString()
            if (petName != "next") {
                listOfuserPets.add(petName)
            }
        } while (petName != "next")

        listOfUsers["$name:$livePlace"] = listOfuserPets

    }
    println("===User Infor===")
    for (key in listOfUsers.keys){
        val listOfPets = listOfUsers[key]!!
        for (petName in listOfPets){
            println("petName: $petName")
        }
        if (listOfPets.contains("cta")){
            println("You have a cat!!!")
        }
    }
}