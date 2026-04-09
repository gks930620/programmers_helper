package com.example.programmers_testcode

object ProblemRepository {

    fun getAllProblems(): List<Problem> = readIndex()

    private fun readIndex(): List<Problem> {
        val stream = ProblemRepository::class.java
            .getResourceAsStream("/templates/index.txt")
            ?: return emptyList()

        return stream.bufferedReader(Charsets.UTF_8).useLines { lines ->
            lines.map { it.trim() }
                .filter { it.isNotEmpty() && !it.startsWith("#") }
                .mapNotNull { line ->
                    // 형식: "Java/두 수의 합.java"
                    val slash = line.indexOf('/')
                    if (slash < 1) return@mapNotNull null
                    val language = line.substring(0, slash)
                    val file = line.substring(slash + 1)
                    Problem(language, file)
                }
                .sortedWith(compareBy({ it.language }, { it.title }))
                .toList()
        }
    }
}
