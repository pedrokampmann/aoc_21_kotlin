import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day02KtTest {

    @Test
    fun part1Test() {
        val input = readInput("Day02_test")
        val submarine = Submarine()

        assertEquals(150, part1(submarine, input))

    }

    @Test
    fun part2Test() {
        val input = readInput("Day02_test")
        val submarine = Submarine()

        assertEquals(900, part1(submarine, input))
    }

}