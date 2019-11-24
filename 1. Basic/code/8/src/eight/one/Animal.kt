package eight.one

open class Animal {
    open var color: String = "white"

    init {
        println("${this.javaClass.name} is born")
    }

    open fun eat() {
        println("${this.javaClass.name} with $color color Eat")
    }
}

class Dog : Animal() {
    var breed: String = ""

    override var color: String = "Black"
    fun bark() {
        println("eight.one.Dog is barking")
    }

    override fun eat() {
        // prevent future confusion
        super<Animal>.eat()
        println("eight.one.Dog is eating")
    }
}


class Cat : Animal() {
    var age: Int = -1
    fun meow() {
        println("Meow")
    }

    override fun eat() {
        println("eight.one.Cat on age $age is eating")
    }
}
