package main.kotlin_6

enum class WeekDay {
    Monday,
    Tuesday,
    WednesdDay,
    Thursday,
    Friday,
    Saturday,
    Sunday
}

fun WeekDay.isWorkDay() =
    this == WeekDay.Sunday || this == WeekDay.Saturday

enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun rotateClockwise(direction: Direction) = when(direction){
    Direction.NORTH -> Direction.EAST
    Direction.EAST -> Direction.SOUTH
    Direction.SOUTH -> Direction.WEST
    Direction.WEST -> Direction.NORTH
}

fun main(){
    println(WeekDay.Sunday.isWorkDay())
    println(WeekDay.Monday.isWorkDay())

    val dir = Direction.NORTH
    println(rotateClockwise(dir))
    val dir2 = rotateClockwise(dir)
    println(rotateClockwise(dir2))

    println(Direction.valueOf("NORTH")) // NORTH
    //println(Direction.valueOf("NORTH_EAST"))
}

