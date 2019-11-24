import com.sherks.OutsidePerson;

/* This is the main function.
** Entry point of the application
* */
fun main(args: Array<String>) {//This is a inline Comment
    var myString = "Hello World"
    println(myString)

    var myNumber = 10 //int
    println(myNumber)

    var myDecimal = 1.0 //float
    println(myDecimal)

    var myString2: String
    myString2 = "Hello World 2"
    println(myString2)
    myString2 = "Another World" // this is mutable string
    println(myString2)

    var myAnotherStr = "My Constant String Value" // immutable
    // myAnotherStr = "This Will Get Error"
    println(myAnotherStr)


    var name: String
    name = "Adrian Eka"
    println(name)
    display(name)

    var personObj = Person()
    personObj.name = "Adrian"
    personObj.display()
    println("The name of the person is " + personObj.name)
    println("The name of the person is ${personObj.name}")
    println("The name of the person is $personObj.name")

    var outsidePersonObj = OutsidePerson("Adrian")
    outsidePersonObj.display()
}

fun display(name: String) {
    println(name)
}

class Person {
    var name: String = ""
    fun display() {
        println(name)
    }
}