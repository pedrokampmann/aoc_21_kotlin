data class Submarine(var horizontalPosition: Int = 0, var depth: Int = 0, var aim: Int = 0) {
}

abstract class Command(var value: Int) {

    abstract fun move(submarine: Submarine);
}

class Forward(value: Int) : Command(value) {
    override fun move(submarine: Submarine) {
        submarine.horizontalPosition += value
        submarine.depth += submarine.aim * value
    }
}

class Down(value: Int) : Command(value) {
    override fun move(submarine: Submarine) {
        submarine.aim += value
    }
}

class Up(value: Int) : Command(value) {
    override fun move(submarine: Submarine) {
        submarine.aim -= value
    }
}

fun part1(submarine: Submarine, input: List<String>): Int {
    input.forEach { inputLine ->
        val command = parseCommand(inputLine)

        command.move(submarine)
    }

    return submarine.horizontalPosition * submarine.depth
}

//fun part2(submarine: Submarine, input:List<String>) {
//
//}

fun parseCommand(inputLine: String): Command {
    val list = inputLine.split(" ")

    val moveValue = list[1].toInt()

    return when (list[0]) {
        "forward" -> Forward(moveValue)
        "down" -> Down(moveValue)
        "up" -> Up(moveValue)
        else -> throw IllegalArgumentException("Non existing command")
    }
}

fun main() {

    val input = readInput("Day02")
    val submarine = Submarine()

    println(part1(submarine, input))
}