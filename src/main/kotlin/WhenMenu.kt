

fun main(){

    print("Enter the food ID: ")
    val foodId = readln()!!.toInt()

    when (foodId){
        1 -> {
            print("You got sandwich")
        }

        10 -> {
            print("You got bread")
        }
        else -> {
            print("Not picked anything")
        }


    }
}