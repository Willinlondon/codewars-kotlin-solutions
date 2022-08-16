object EqualSidesOfAnArray {
    fun findEvenIndex(arr:IntArray): Int {
       return arr.indices.indexOfFirst { index -> (leftSideTotal(index, arr) == rightSideTotal(index, arr)) }
    }

    private fun leftSideTotal(index: Int, arr: IntArray): Int {
        return arr.slice(0 until index).sum()
    }

    private fun rightSideTotal(index: Int, arr: IntArray): Int {
        return arr.slice(index + 1 until arr.size).sum()
    }
}