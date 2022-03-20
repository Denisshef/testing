import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun test1() {
        // arrange
        val value = 5

        // act
        val result = test(
            i = value
        )

        // assert
        assertEquals(25, result)

    }
}