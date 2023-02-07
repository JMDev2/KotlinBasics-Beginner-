import java.util.*

fun main(){
    print("Enter a text: ")
    val message = readln()!!.toString().trim()
    print("Enter name: ")
    val name = readln()!!.toString().trim()
    val allMessage = "$name,$message"

    println(allMessage)
    println(allMessage.uppercase())
    println(allMessage.lowercase())


    //splitting the string
    val listOfTokens: List<String> = message.trim().split("")
    for (token in listOfTokens){
        if (!token.contains("to") && !token.contains("is")){
            println("token: $token")
        }
    }
}