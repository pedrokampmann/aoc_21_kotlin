import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day01KtTest {

    @Test
    fun shouldReturnZeroForEmptyMeasurements() {
        val input = arrayListOf<Int>()

        assertEquals(part1(input), 0)

    }

    @Test
    fun shouldCountMeasurements() {
        val input = readInput("Day01_test").map { it -> it.toInt() }

        assertEquals(7, part1(input))
    }

    @Test
    fun shouldCountSlidingWindowMeasurements() {
        val input = readInput("Day01_test").map { it -> it.toInt() }

        assertEquals(5, part2(input))
    }
}