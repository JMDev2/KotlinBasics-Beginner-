
var name2: String? =null //global
fun showUserInfo(name: String){
    name2="Welcome Mr. $name2"
    println("name is $name")
}

fun main(){

    name2 = "John"
    var name = "kevin"
    showUserInfo(name)

    println("$name2")
}
