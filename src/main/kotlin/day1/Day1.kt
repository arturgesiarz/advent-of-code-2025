package org.example.day1

import java.io.File

fun readFile(): List<String> {
    return File("src/main/resources/day1_input").readLines()
}

fun getRotateDestination(sequence: String): Int {
    val destination = sequence
        .getOrNull(0)
        ?.uppercase()
    return if (destination == "L") -1 else 1
}

fun getRotateDistance(sequence: String): Int {
    return sequence.subSequence(1, sequence.length).toString().toInt()
}

fun day1(listOfSequence: List<String>): Int {
    var dial = 50
    var solution = 0

    listOfSequence.forEach { sequence ->
        val steps = getRotateDistance(sequence) * getRotateDestination(sequence)

        dial += steps

        dial = Math.floorMod(dial, 100)
        println(dial)

        if (dial == 0) {
            solution += 1
        }
    }

    return solution

}

fun main() {
    println(day1(listOfSequence = readFile()))

}