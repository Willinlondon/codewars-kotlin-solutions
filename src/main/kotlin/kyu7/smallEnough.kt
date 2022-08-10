fun smallEnough(a : IntArray, limit : Int) : Boolean {
    var counter = 0
    for (i in a) {
        if (i > limit) {
            counter ++
        }
    }
    return counter <= 0
}