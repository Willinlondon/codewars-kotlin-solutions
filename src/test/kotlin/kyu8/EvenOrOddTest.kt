import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class EvenOrOddTest {
    @Test
    fun testFixed() {
        assertEquals("Even", evenOrOdd(2))
        assertEquals("Even", evenOrOdd(0))
        assertEquals("Odd", evenOrOdd(7))
        assertEquals("Odd", evenOrOdd(1))
    }
}