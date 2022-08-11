fun repeatStr(r: Int, str: String) : String {
    var result = ""
    for (i in 1..r) {
        result += str
    }
    return result
}