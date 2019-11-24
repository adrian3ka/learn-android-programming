package eight.two

open class Animal {
    var color: String = ""

    init {
        println("Animal Is Born")
    }

    constructor(color: String) {
        println("From Animal Init: $color")
        this.color = color
    }
}

class Dog : Animal {
    var breed: String = ""

    init {
    }

    constructor(color: String, breed: String) : super(color) {
        println("From Dog Init: $color and $breed")
        this.breed = breed;
    }

}
