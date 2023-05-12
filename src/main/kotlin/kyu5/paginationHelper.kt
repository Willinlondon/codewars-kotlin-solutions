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
        if ((pageIndex + 1) > pageCount || pageIndex < 0) {
            return -1
        }
        return if (this.hasCompletePages()) {
            itemsPerPage
        } else {
            return if (pageIndex + 1 == pageCount) {
                itemCount % itemsPerPage
            } else {
                itemsPerPage
            }
        }
    }

    fun pageIndex(itemIndex: Int): Int {
        if (itemIndex + 1 > itemCount || itemIndex < 0) {
            return - 1
        }
        return (itemIndex + 1) / itemsPerPage
    }


    private fun hasCompletePages(): Boolean {
        return itemCount % itemsPerPage == 0
    }

}