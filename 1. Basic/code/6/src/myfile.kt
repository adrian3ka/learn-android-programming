fun main(args: Array<String>) {
    for (i in 1..4) {
        println("Hello $i")
    }
    printLine()
    var i = 1
    while (i < 5) {
        println("Hello $i")
        i++
    }
    printLine()
    var j = 1
    do {
        println("Hello $j")
        j++
    } while (j < 5)
    printLine()
    for (i in 1..10) {
        if (i % 2 == 0)
            println(i)
    }
    printLine()
    for (i in 1..10 step 2) {
        println(i)
    }
    printLine()
    i = 1
    while (i <= 10) {
        if (i % 2 == 0)
            println(i)
        i++
    }
    printLine()
    i = 1
    do {
        if (i % 2 == 0)
            println(i)
        i++
    } while (i <= 10)

    printLine()
    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
            if (i == 2 && j == 2)
                break@myLoop
        }
    }
    printLine()
    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2)
                continue@myLoop
            println("$i $j")
        }
    }
}

fun printLine() {
    println("-----------------")
}