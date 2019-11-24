package eight.one

fun main(args: Array<String>) {
    var student = Student()

    student.name = "Adrian"
    println("eight.one.Student has got a name as ${student.name}")
    printLine()
    var studentWithConstructor = StudentWithConstructor("Adrian")
    println("eight.one.StudentWithConstructor has got a name as ${studentWithConstructor.name}")
    printLine()
    studentWithConstructor = StudentWithConstructor("Adrian")
    println(
        "eight.one.StudentWithConstructor has got a name as ${studentWithConstructor.name} " +
                "with id ${studentWithConstructor.id}"
    )
    printLine()
    studentWithConstructor = StudentWithConstructor("Adrian", 10)
    println(
        "eight.one.StudentWithConstructor has got a name as ${studentWithConstructor.name} " +
                "with id ${studentWithConstructor.id}"
    )

    printLine()
    var dog = Dog()
    dog.breed = "labra"
    dog.color = "black"
    dog.bark()
    dog.eat()

    printLine()
    var cat = Cat()
    cat.age = 7
    cat.color = "brown"
    cat.meow()
    cat.eat()


    printLine()
    var animal = Animal()
    animal.color = "white"
    animal.eat()

    printLine()
    var animal2 = Animal()
    println(animal2.color)
    var dog2 = Dog()
    println(dog2.color)
}

fun printLine() {
    println("--------------------")
}