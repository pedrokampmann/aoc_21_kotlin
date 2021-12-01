fun part1(input: List<Int>): Int {

    return input.windowed(2).count { list -> list[1] > list[0] }
}

fun part2(input: List<Int>): Int {
    val intInput = input
        .windowed(3)
        .map { list -> list.sum() }

    return(part1(intInput))
}

fun main() {
    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day01").map { it.toInt() }
//    println(part1(input))
    println(part2(input))
}
