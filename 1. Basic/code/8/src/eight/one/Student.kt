package eight.one

class Student {
    var name: String = "dummy"

    init {
        println("Init eight.one.Student has got a name as $name")
    }
}

class StudentWithConstructor(var name: String) {
    var id: Int = -1

    // belongs to primary constructor
    init {
        println("Init eight.one.StudentWithConstructor has got a name as $name with id $id")
    }

    constructor(name: String, id: Int) : this(name) {
        //Body
        this.id = id
    }
}