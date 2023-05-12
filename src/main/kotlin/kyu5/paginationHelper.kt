package kyu5

class PaginationHelper<T>(private val collection: List<T>, private val itemsPerPage: Int) {

    val itemCount: Int
        get() {
            return collection.size
        }

    val pageCount: Int
        get() {
            return if (this.hasCompletePages()) {
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
        return if (this.hasCompletePages() && (pageIndex + 1) <= pageCount) {
            itemsPerPage
        } else if (!this.hasCompletePages() && (pageIndex + 1) <= pageCount) {
            if (pageIndex + 1 == pageCount) {
                return itemCount % itemsPerPage
            } else {
                return pageCount
            }
        } else {
            -1
        }
    }


    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    fun pageIndex(itemIndex: Int): Int {
        TODO()
    }


    private fun hasCompletePages(): Boolean {
        return itemCount % itemsPerPage == 0
    }

}