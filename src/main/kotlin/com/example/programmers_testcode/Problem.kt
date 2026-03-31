package com.example.programmers_testcode

data class Problem(
    val language: String,     // "Java", "JavaScript", "Kotlin", "Python"
    val templateFile: String  // "두 수의 합.java"
) {
    val title: String get() = templateFile.substringBeforeLast(".")
    val resourcePath: String get() = "$language/$templateFile"
}
