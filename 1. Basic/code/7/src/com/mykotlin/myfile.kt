@file:JvmName("MyCustomKotlineFileName")

package com.mykotlin

import com.myjava.MyJavaFile

fun main(args: Array<String>) {
    var sum = add(2, 4)
    println("Sum is $sum")

    printLine()
    var largerValue = max(4, 6)
    println("The greater number is $largerValue")
    printLine()
    var area = MyJavaFile.getArea(5,10)
    println("The area is $area")

    printLine()
    var volume = findVolume(2,3)
    println("Volume $volume")
    printLine()
    volume = findVolume(height = 100, breadth = 2, length = 3)
    println("Volume $volume")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun max(a: Int, b: Int): Int = if (a > b) {
    println("$a is greater")
    a
} else {
    println("$b is greater")
    b
}

fun printLine() {
    println("----------------------------")
}

@JvmOverloads
fun findVolume(length: Int, breadth: Int, height: Int = 10) : Int {
    println("Length is $length")
    println("Breadth is $breadth")
    println("Height is $height")
    return length * breadth * height;
}