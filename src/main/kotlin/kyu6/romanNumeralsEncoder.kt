fun encode(num: Int): String {
    val result = mutableListOf<String>()
    val reversed = num.toString().toCharArray().reversedArray()

    when (reversed.size) {
        1 -> singleDigit(result, reversed)
        2 -> doubleDigit(result, reversed)
        3 -> tripleDigit(result, reversed)
        4 -> quadDigit(result, reversed)
    }
    return result.reversed().joinToString("")
}

private fun singleDigit(result: MutableList<String>, reversed: CharArray) {
    result.encodeDigit(reversed[0], "I", "V", "X")
}

private fun doubleDigit(result: MutableList<String>, reversed: CharArray) {
    singleDigit(result, reversed)
    result.encodeDigit(reversed[1], "X", "L", "C")
}

private fun tripleDigit(result: MutableList<String>, reversed: CharArray) {
    doubleDigit(result, reversed)
    result.encodeDigit(reversed[2], "C", "D", "M")
}

private fun quadDigit(result: MutableList<String>, reversed: CharArray) {
    tripleDigit(result, reversed)
    result.encodeDigit(reversed[3], "M", "", "")
}

private fun MutableList<String>.encodeDigit(index: Char, first: String, second: String, third: String) {
    when (index) {
        '1' -> add(first)
        '2' -> add(first + first)
        '3' -> add(first + first + first)
        '4' -> add(first + second)
        '5' -> add(second)
        '6' -> add(second + first)
        '7' -> add(second + first + first)
        '8' -> add(second + first + first + first)
        '9' -> add(first + third)
        '0' -> add("")
    }
}