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

    fun pageItemCount(pageIndex: Int): Int {
        if ((pageIndex + 1) > pageCount) {
            return -1
        }
        return if (this.hasCompletePages()) {
            itemsPerPage
        } else {
            return if (pageIndex + 1 == pageCount) {
                itemCount % itemsPerPage
            } else {
                pageCount
            }
        }
    }

    fun pageIndex(itemIndex: Int): Int {
        if (itemIndex > itemCount) {
            return - 1
        }
        return if (this.hasCompletePages()) {
            itemIndex / itemsPerPage
        } else {
            itemIndex / itemsPerPage + 1
        }
    }


    private fun hasCompletePages(): Boolean {
        return itemCount % itemsPerPage == 0
    }

}