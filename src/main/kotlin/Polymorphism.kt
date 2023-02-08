

//same function name but different datatypes

fun showInfo(cardId: Int){
    println("card is: $cardId")
}

fun showInfo(name: String){
    println("Name is: $name")
}

fun main(){
    showInfo(10)
    showInfo("maina")
}