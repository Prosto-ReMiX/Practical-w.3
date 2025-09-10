
fun main() {
    println("сумма строки ${initIndex() + 1} = ${countSumOfRow(initIndex()) { initList() }}")
    println("сумма столбца ${initIndex() + 1} = ${countSumOfCol(initIndex()) { initList() }}")
}

