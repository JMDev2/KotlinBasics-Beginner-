

fun main(){


    var users = HashMap<Int, String>()
    users[1] = "MAina"
    users[2] = "Joseph"
    users[3] = "Mwangi"


    for (key in users.keys){
        println("$key: ${users[key]}")
    }


}