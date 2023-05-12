package kyu5

class PaginationHelper<T>(private val collection: List<T>, private val itemsPerPage: Int) {

    val itemCount: Int
        get() {
            return collection.size
        }

    val pageCount: Int
        get() {
            return if (itemCount % itemsPerPage == 0) {
                itemCount / itemsPerPage
            } else {
                itemCount / itemsPerPage + 1
            }
        }


    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    fun pageItemCount(pageIndex: Int): Int {
        TODO()
    }


    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    fun pageIndex(itemIndex: Int): Int {
        TODO()
    }
}