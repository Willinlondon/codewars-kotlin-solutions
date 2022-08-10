package kyu4

fun getPINs(observed: String): List<String> {

    val possibleDigits = observed.toCharArray().map {
        when (it) {
            '1' -> listOf("1", "2", "4")
            '2' -> listOf("1", "2", "3", "5")
            '3' -> listOf("2", "3", "6")
            '4' -> listOf("1", "4", "5", "7")
            '5' -> listOf("2", "4", "5", "6", "8")
            '6' -> listOf("3", "5", "6", "9")
            '7' -> listOf("4", "7", "8")
            '8' -> listOf("0", "5", "7", "8", "9")
            '9' -> listOf("6", "8", "9")
            '0' -> listOf("0", "8")
            else -> listOf()
        }
    }

    val result = mutableListOf<String>()

    calculateCombinations("", possibleDigits, result)

    return result
}

fun calculateCombinations(input: String, remaining: List<List<String>>, output: MutableList<String>) {
    if (remaining.isEmpty()) {
        output.add(input)
    } else {
        remaining[0].forEach { calculateCombinations(input + it, remaining.subList(1, remaining.size), output) }
    }
}