fun main() {
    val list: List<IntArray> = listOf(
        initIntArray(0, 0, 0),
        initIntArray(1 , 2, 2),
        initIntArray(1, 3, 5),
    )
    println("${sumOfRow(initIndex(), list)}")
    println("${sumOfCol(initIndex(), list)}")
}