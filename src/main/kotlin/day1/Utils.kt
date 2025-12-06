package org.example.day1

fun getRotateDestination(sequence: String): Int {
    val destination = sequence
        .getOrNull(0)
        ?.uppercase()
    return if (destination == "L") -1 else 1
}

fun getRotateDistance(sequence: String): Int {
    return sequence.subSequence(1, sequence.length).toString().toInt()
}