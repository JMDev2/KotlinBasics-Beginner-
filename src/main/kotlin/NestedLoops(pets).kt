

fun main(){

    for (userID in 1..10) {
        print("$userID. Enter your name: ")
        val name = readln()!!.toString()
        print("Enter where you live: ")
        val livePlace = readLine()!!.toString()
        print("Enter the number of pets: ")
        var petCount = readln()!!.toInt()

        var petName: String? = ""
        for (petID in 1..petCount) {
            print("Enter pet $petID: ")
            petName = petName + readln()!!.toString() + ","
        }
        println("=====USER INFOR=====")
        println("name: $name")
        println("liveplace: $livePlace")
        println("petname : $petName")

        if (petName!!.contains("cat")){
            println("You must be a lady!!!")
        }
    }


}