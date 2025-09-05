
fun initList(): List<List<Int>> {
    val list = listOf(
        listOf(1, 2, 3),
        listOf(2, 3, 4),
        listOf(0, 0, 0)
    )
    return list
}

fun countSumOfRow(index: Int, list: () -> List<List<Int>>): Int {
    var sum = 0
    for (i in list().indices) {
        sum += list()[index][i]
    }
    return sum
}

fun countSumOfCol(index: Int, list: () -> List<List<Int>>): Int {
    var sum = 0
    for (j in list().indices) {
        sum += list()[j][index]
    }
    return sum
}


fun main() {
    val selectedIndex: Int = readln().toInt() - 1
    println("сумма строки ${selectedIndex + 1} = ${countSumOfRow(selectedIndex) { initList() }}")
    println("сумма столбца ${selectedIndex + 1} = ${countSumOfCol(selectedIndex) { initList() }}")
}

