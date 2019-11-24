package eight.two

fun main(args: Array<String>) {
    var dog = Dog("Black", "Pug")

    printLine()
    var person = Person()
    println(person.c)
    println(person.d)
}

fun printLine() {
    println("--------------------")
}

open class Person {
    // visible only on this class
    private val a = 1
    // visible on inherited class
    protected val b = 2
    // visible on same package
    internal val c = 3
    // visible for all
    val d = 10 // public by default
}

class Indonesian : Person() {
    //a is not visible
    // b, c,d are visible
    fun test() {
        println("$b , $c, $d");
    }
}