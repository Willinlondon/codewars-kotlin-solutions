package kyu5;

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals;

class PaginationHelperTest {

    @Test
    fun testItemCount() {
        val helper = PaginationHelper<Int>(listOf(1,2,3,4,5,6,7,8,9,10,11), 3)
        assertEquals(11, helper.itemCount, "itemCount is returning incorrect value")
    }

    @Test
    fun testPageCountWhenNotExact() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f'), 4)
        assertEquals(2, helper.pageCount, "pageCount is returning incorrect value")
    }

    @Test
    fun testPageCountWhenExact() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), 2)
        assertEquals(4, helper.pageCount, "pageCount is returning incorrect value")
    }

    @Test
    fun testPageItemCountCompletePages() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), 2)
        assertEquals(2, helper.pageItemCount(3), "pageCount is returning incorrect value")
    }

    @Test
    fun testPageItemCountSinglePage() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), 8)
        assertEquals(8, helper.pageItemCount(0), "pageCount is returning incorrect value")
    }

    @Test
    fun testPageItemCountIncompleteSinglePage() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), 10)
        assertEquals(8, helper.pageItemCount(0), "pageCount is returning incorrect value")
    }

    @Test
    fun testPageItemCountIncompletePages() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), 3)
        assertEquals(2, helper.pageItemCount(2), "pageCount is returning incorrect value")
    }

    @Test
    fun testPageItemCountMoreIncompletePages() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'), 2)
        assertEquals(2, helper.pageItemCount(1), "pageCount is returning incorrect value")
    }

    @Test
    fun testPageItemCountPositiveIndexOutOfRange() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), 3)
        assertEquals(-1, helper.pageItemCount(6), "pageCount is returning incorrect value")
    }

    @Test
    fun testPageItemCountNegativeIndexOutOfRange() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), 3)
        assertEquals(-1, helper.pageItemCount(-24), "pageCount is returning incorrect value")
    }

    @Test
    fun testPageIndexOutOfRangePositive() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), 3)
        assertEquals(-1, helper.pageIndex(9), "pageCount is returning incorrect value")
    }

    @Test
    fun testPageIndexOutOfRangeNegative() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), 3)
        assertEquals(-1, helper.pageIndex(-24), "pageCount is returning incorrect value")
    }

    @Test
    fun testPageIndexCompletePages() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), 4)
        assertEquals(2, helper.pageIndex(7), "pageCount is returning incorrect value")
    }


    @Test
    fun testPageIndexSingleCompletePage() {
        val helper = PaginationHelper<Char>(listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), 8)
        assertEquals(1, helper.pageIndex(7), "pageCount is returning incorrect value")
    }

}