package org.example

import java.io.File

fun readFile(fileName: String): List<String> {
    return File("src/main/resources/$fileName").readLines()
}