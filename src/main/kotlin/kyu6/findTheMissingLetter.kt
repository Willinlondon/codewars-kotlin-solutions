fun findMissingLetter(array: CharArray): Char {
    val alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()
    val firstLetter = array[0]
    val lastLetter = array[array.size - 1]
    val slicedAlphabet = alphabet.slice((alphabet.indexOf(firstLetter))..(alphabet.indexOf(lastLetter)))
    var result = charArrayOf()

    for (letter in slicedAlphabet) {
        if (letter !in array) {
            result += letter
        }
    }
    return result[0]
}