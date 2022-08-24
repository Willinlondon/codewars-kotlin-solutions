import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class TestDecode {
    @Test
    fun basic() {
        assertEquals(0, decode(""))
        assertEquals(1, decode("I"))
        assertEquals(2, decode("II"))
        assertEquals(21, decode("XXI"))
        assertEquals(2008, decode("MMVIII"))
        assertEquals(1666, decode("MDCLXVI"))
    }

    @Test
    fun advanced() {
        assertEquals(4, decode("IV"))
        assertEquals(2009, decode("MMIX"))
        assertEquals(1664, decode("MDCLXIV"))
        assertEquals(40, decode("XL"))
        assertEquals(1478, decode("MCDLXXVIII"))
        assertEquals(444, decode("CDXLIV"))
    }

}