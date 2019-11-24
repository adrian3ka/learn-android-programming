fun main(args: Array<String>) {
    // IF as Expression

    val a = 2
    val b = 5

    var maxValue: Int
    if (a > b)
        maxValue = a
    else
        maxValue = b

    println(maxValue)

    var maxValue2: Int = if (a > b) {
        println("a is greater")
        a
    } else {
        println("b is greater")
        b
    }

    println(maxValue)
    println("-----------------------------")
    // When as Expression

    val x = 5

    when (x) {
        in 0..1 -> println("x is 0 OR 1")
        2 -> {
            println("x is 2")
        }
        else -> {
            println("x value is unknown")
            println("I don't know what is x")
        }
    }

    val y = 11
    var str:String = when(y) {
        in 0..10 -> {
            "Between 1 and 10"
        }
        else -> {
            "Value y is unknown"
            "Y is an alien"
        }
    }
    println(str)
}