import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class UsaErroTest {

    @Test
    fun testErro() {
        assertThrows<NullPointerException> { erro(4, 4) }
    }
}