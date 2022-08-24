fun tribonacci(signature: DoubleArray, n: Int): DoubleArray {
    var first = signature[0]
    var second = signature[1]
    var third = signature[2]
    var endArray = signature

    for (i in 1..(n - 3)) {
        val result = first + second + third
        endArray += result
        first = second
        second = third
        third = result
    }
    return endArray
}