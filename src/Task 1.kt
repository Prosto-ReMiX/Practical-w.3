fun main() {
    val selectedIndex: Int = readln().toInt() - 1
    initList()
    println("сумма строки ${selectedIndex + 1} = ${countSumOfRow(selectedIndex) { initList() }}")
    println("сумма столбца ${selectedIndex + 1} = ${countSumOfCol(selectedIndex) { initList() }}")
}