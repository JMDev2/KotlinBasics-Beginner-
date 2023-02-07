

fun main(){
    println("start App")

    println("===Continue===")
    for (number in 1..10) {
        if (number == 5){
            continue //jumps number 5
        }
        println(number)
    }
    println("===Break===")
    for (number in 1..10){
        if (number == 6){
            break
        }
        println(number)
    }
println("End App")

}