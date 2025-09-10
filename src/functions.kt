//1. Создать три функции со следующими сигнатурами: () -> Unit; (Any) -> Any; (Any) -> Collections<Any>;
//2. Создать функцию с переменным количеством аргументов (vararg);
//<<<<<<<<<<<
fun initIntArray(vararg numbers: Int): IntArray {
    return numbers
}
//>>>>>>>>>>>
//3. Создать функцию с параметрами по умолчанию;
//<<<<<<<<<<<
fun sumOfCol(list: List<List<Int>>, index: Int = 1): Int {
    var sum = 0
    for (i in list.indices) {
        sum += list[i][index]
    }
    return sum
}
//>>>>>>>>>>>
//4. Создать функцию, аргументы которой можно передать только по имени;
// Решение не найдено
//5. Три функции нужно представить в следующем виде - полноценное объявление функции, анонимная функция, лямбда-функция;
//6. Создать функцию, которая в качестве аргумента принимает другую функцию;
//<<<<<<<<<<<
fun countSumOfRow(index: Int, list: () -> List<List<Int>>): Int {
    var sum = 0
    for (i in list().indices) {
        sum += list()[index][i]
    }
    return sum
}
//>>>>>>>>>>
//7. Создать функцию, которая в качестве возвращаемого значения возвращает другую функцию;
//<<<<<<<<<<
fun initInitArray(vararg numbers: Int): () -> IntArray = { numbers }
//>>>>>>>>>>
//8. Заменить один из циклов на рекурсивную функцию;
//>>>>>>>>>>
fun countSumOfRow2(index: Int, list: () -> List<List<Int>>): Int {
    fun helper(i: Int): Int {
        val row = list()[index]
        return if (i >= row.size) {
            0
        } else {
            row[i] + helper(i + 1)
        }
    }
    return helper(0)
}
//<<<<<<<<<<

fun initList(): List<List<Int>> {
    val list = listOf(
        listOf(1, 2, 3),
        listOf(2, 3, 4),
        listOf(0, 0, 0)
    )
    return list
}

fun initIndex(): Int {
    return readln().toInt() - 1
}

fun sumOfCol(index: Int, list: List<IntArray>): Int {
    var sum = 0
    for (i in list.indices) {
        sum += list[i][index]
    }
    return sum
}

fun sumOfRow(index: Int, list: List<IntArray>): Int {
    var sum = 0
    for (i in list.indices) {
        sum += list[index][i]
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




