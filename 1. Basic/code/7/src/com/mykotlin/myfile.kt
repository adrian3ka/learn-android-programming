@file:JvmName("MyCustomKotlineFileName")

package com.mykotlin

import com.myjava.MyJavaFile
import java.math.BigInteger

fun main(args: Array<String>) {
    var sum = add(2, 4)
    println("Sum is $sum")

    printLine()
    var largerValue = max(4, 6)
    println("The greater number is $largerValue")
    printLine()
    var area = MyJavaFile.getArea(5, 10)
    println("The area is $area")

    printLine()
    var volume = findVolume(2, 3)
    println("Volume $volume")
    printLine()
    volume = findVolume(height = 100, breadth = 2, length = 3)
    println("Volume $volume")
    printLine()
    // Extension Function

    var student = Student()
    println("Pass status ${student.hasPassed(57)}")
    println("Scholarship status ${student.isScholar(57)}")
    printLine()
    var str1 = "Hello "
    var str2 = "World"
    var str3 = "Hey "
    println(str3.add(str1, str2))

    val x = 6
    val y = 10
    println("The greater number is : ${x.greaterValue(y)}")
    printLine()
    // Infix Function
    println("The greater number is : ${x greaterValue y}")
    printLine()
    println(getFibonacciNumber(10000, BigInteger("1"), BigInteger("0")))
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
fun findVolume(length: Int, breadth: Int, height: Int = 10): Int {
    println("Length is $length")
    println("Breadth is $breadth")
    println("Height is $height")
    return length * breadth * height;
}

fun Student.isScholar(marks: Int): Boolean {
    return marks > 95
}

fun String.add(s1: String, s2: String): String {
    return this + s1 + s2
}

infix fun Int.greaterValue(other: Int): Int {
    if (this > other)
        return this
    return other
}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger) : BigInteger{
    if (n == 0)
        return b
    return getFibonacciNumber(n - 1, a + b, a)
}
// 0 1 1 2 3 5 8 13 21