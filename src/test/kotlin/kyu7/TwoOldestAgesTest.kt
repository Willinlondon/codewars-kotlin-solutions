import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class TwoOldestAgesTest {

    @Test
    fun `twoOldestAges(listOf(1,5,87,45,8,8)) should be listOf(45, 87)`() {
        assertEquals(listOf(45, 87), twoOldestAges(listOf(1,5,87,45,8,8)))
    }

    @Test
    fun `twoOldestAges(listOf(6,5,83,5,3,18)) should be listOf(18, 83)`() {
        assertEquals(listOf(18, 83), twoOldestAges(listOf(6,5,83,5,3,18)))
    }

}