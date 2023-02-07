

fun main(){


    //immutable
    var list = listOf<String>("maina", "joe")
    for (name in list){
        println(name)
    }

    //mutable

    var myList = mutableListOf<String>("")
    myList.add("maina")
    myList.add("kimani")

    for (name in myList){
        println(name)
    }
}