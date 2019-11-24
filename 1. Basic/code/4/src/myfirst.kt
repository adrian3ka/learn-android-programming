fun main(args: Array<String>): Unit {
    var age: Int = 10
    println(age)

    var age2 = 10
    println(age2)

    var name: String = "Adrian"
    println(name)

    var isAlive: Boolean = true
    println(isAlive)

    val immutableObject = 10
    println(immutableObject)
    println("-----------------------------")
    var marks: Float = 97.4F
    var percentage: Double = 90.78
    println(marks)
    println(percentage)
    println("------------------------------")

    val myName = "Adrian"
    val myFullName = "$myName Eka"
    println(
        "The Statement is $myFullName. " +
                "The number of characters in the statement ${myFullName.length}"
    )
    val a = 10
    val b = 5
    println("The sum of $a and $b is ${a + b}")

    var rect = Rectangle()
    rect.length = 5
    rect.width = 3
    println("The Length of rectangle ${rect.length}\n" +
            "Width is ${rect.width}\n" +
            "The Area is ${rect.width * rect.length}")
    println("----------------------")

    // Ranges
    
    val r1 = 1..5
    // This range contains 1, 2, 3, 4, 5

    val r2 = 5 downTo 1
    // This range contains the number 5, 4, 3, 2, 1

    val r3 = 5 downTo 1 step 2
    // This range contains the number 5, 3, 1

    val r4 = "a".."z"
    // This range contains the values from "a", "b", "c", ... , "z"

    var isPresent = "a" in r4
    println(isPresent)

    var countDown = 10.downTo(1)
    // 10, 9, 8, ..., 1

    var moveUp = 1.rangeTo(10)
    // 1, 2, 3, 4


}

class Rectangle {
    var length: Int = 0
    var width: Int = 0
}