import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class ReturnNegativeTest {

    @Test
    fun test1() {
        assertEquals(-42, makeNegative(42))
    }
}