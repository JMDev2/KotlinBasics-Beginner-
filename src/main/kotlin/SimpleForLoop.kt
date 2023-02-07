

fun main() {

    for (i in 1..5) {
        print("for (i in 1..5) print(i) = ")
        for (i in 1..5) print(i)

        println()

        print("for (i in 5..1) print(i) = ")
        for (i in 5..1) print(i)             // prints nothing

        println()

        print("for (i in 5 downTo 1) print(i) = ")
        for (i in 5 downTo 1) print(i)

        println()

        print("for (i in 1..5 step 2) print(i) = ")
        for (i in 1..5 step 2) print(i)

        println()

        print("for (i in 5 downTo 1 step 2) print(i) = ")
        for (i in 5 downTo 1 step 2) print(i)
    }


    for (i in 1..100){
        println("Number is : $i")
    }

    //step over
    for (i in 1..100 step 5){
        println("Number is : $i")
    }

    //downto

    for (i in 100 downTo 1 step 11){
        println("Number is : $i")
    }
}