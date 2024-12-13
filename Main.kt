fun main() {
    // Задача 1
    val words = arrayOf("кот", "собака", "птица", "слон", "жираф")
    var longestWord = ""

    for (word in words) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }

    println("Самое длинное слово: $longestWord")
    println("Количество букв в этом слове: ${longestWord.length}")

    // Задача 2
    val matrix = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(5, 6, 7, 8),
        arrayOf(9, 10, 11, 12),
        arrayOf(13, 14, 15, 16)
    )

    var sum = 0

    for (i in 0 until 4) {
        sum += matrix[i][3 - i] // Элементы побочной диагонали
    }

    println("Сумма элементов побочной диагонали: $sum")

    // Задача 3
    val inkjet: Printer = object : Printer {
        override fun print() {
            println("Печать с помощью струйного принтера Canon")
        }

        override fun showName() {
            println("Имя принтера: Canon")
        }
    }

    val laser: Printer = object : Printer {
        override fun print() {
            println("Печать с помощью лазерного принтера HP")
        }

        override fun showName() {
            println("Имя принтера: HP")
        }
    }

    inkjet.showName()
    inkjet.print()

    laser.showName()
    laser.print()
}