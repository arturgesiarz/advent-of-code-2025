package org.example.day1

import org.example.readFile

fun day1Part1(listOfSequence: List<String>): Int {
    var dial = 50

    return listOfSequence.count { sequence ->
        val steps = getRotateDistance(sequence) * getRotateDestination(sequence)

        dial = Math.floorMod(dial + steps, 100)

        dial == 0
    }
}

fun day1Part2(listOfSequence: List<String>): Int {
    var dial = 50

    return listOfSequence.sumOf { sequence ->
        val dir = getRotateDestination(sequence)
        val steps = getRotateDistance(sequence)

        var passes = 0

        if (dir == 1) {
            val distToZero = 100 - dial

            if (steps >= distToZero) {
                passes = 1 + (steps - distToZero) / 100
            }
        } else {
            val distToZero = if (dial == 0) 100 else dial

            if (steps >= distToZero) {
                passes = 1 + (steps - distToZero) / 100
            }
        }

        dial = Math.floorMod(dial + (steps * dir), 100)

        passes
    }
}

fun main() {
    // Example: listOf("L68", "L30", "R48", "L5", "R60", "L55", "L1", "L99", "R14", "L82")
    println(day1Part2(listOfSequence = readFile("day1_input")))
}