import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OppositeNumberTest {

    @Test
    fun testFixed() {
        assertEquals(-1, opposite(1));
        assertEquals(0, opposite(0));
        assertEquals(25, opposite(-25));
    }
}