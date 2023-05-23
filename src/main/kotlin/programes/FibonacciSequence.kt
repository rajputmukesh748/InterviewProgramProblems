package programes

/**
 * Fibonacci Sequence: Write a function that generates the nth number in the Fibonacci sequence.
 * */
fun fibonacciSequence(limit: Int): List<Int> {
    val list by lazy { mutableListOf<Int>() }
    if (limit == 0) return list
    list.add(0)
    if (limit == 1) return list
    list.add(1)
    if (limit == 2) return list
    for (i in 0 until (limit - 2)) {
        val newNumber = list[list.size - 1] + list[list.size - 2]
        list.add(newNumber)
    }
    return list
}