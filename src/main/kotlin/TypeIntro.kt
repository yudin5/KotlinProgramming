const val MAX_EXPERIENCE: Int = 5000

fun main() {
    var i = 5
    i += 1
    println("i = $i")
    var playerName = "Estragon"
    println("playerName = $playerName")
    playerName = "Madrigal"
    println("playerName = $playerName")

    val message = "MAX_EXPERIENCE = $MAX_EXPERIENCE"
    println(message) // Константа времени компиляции

    var hasSteed = false  // Быть хозяином скакуна
    println("hasSteed = $hasSteed")

    val tavernName = "Unicorn Horn"  // Название таверны
    println("tavernName = $tavernName")

    val innkeeperName = "Josh"  // Имя трактирщика
    println("innkeeperName = $innkeeperName")

    var moneyAmount = 50  // Количество денег
    println("moneyAmount = $moneyAmount")

    val drinkList = setOf("coke", "beer", "vodka", "water")  // Меню напитков
    println("drinkList = $drinkList")

    moneyAmount -= 20
    hasSteed = true
    println("moneyAmount = $moneyAmount, hasSteed = $hasSteed, drink list size = ${drinkList.size}")

    val playerNameAfterMagicMirror = playerName.reversed()  // Применяем волшебное зеркало, отображающее имя наоборот
    println("playerName = $playerName, playerNameAfterMagicMirror = $playerNameAfterMagicMirror")

    val x0 = "ab"
    val x1 = x0 + "c"
    val x2 = "abc"
    println("x1 == x2 = ${x1 == x2}")
    println("x1 === x2 = ${x1 === x2}")

}
