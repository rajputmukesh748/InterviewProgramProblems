package programProblems

/**
 * How Do You Remove Duplicates From an Array in Place?
 * */
fun removeDuplicateNumber(list: List<Int>): List<Int> {
    val newList = mutableListOf<Int>()
    for (item in list) {
        if (!newList.contains(item)) newList.add(item)
    }
    return newList
}


/**
 * How Do You Find Duplicate Numbers in an Array With Multiple Duplicates?
 * */
fun findDuplicateNumber(list: List<Int>): Map<Int, Int> {
    val hashMap = HashMap<Int, Int>()
    for (item in list) {
        if (hashMap.containsKey(item)) {
            hashMap[item] = hashMap[item]?.plus(1) ?: 0
        } else {
            hashMap[item] = 1
        }
    }
    return hashMap
}


/**
 * How Do You Find the Largest and Smallest Number in an Array of 1–100?
 * */
fun findLargestSmallestNumber(list: List<Int>): Pair<Int, Int> {
    var smallNumber: Int = -1
    var largeNumber: Int = -1
    for (number in list) {
        if (smallNumber == -1 || number < smallNumber) {
            smallNumber = number
        } else if (number > largeNumber) {
            largeNumber = number
        }
    }
    return Pair(smallNumber, largeNumber)
}


/**
 * How Do You Find All Pairs in an Array of Integers That Add Up to a Specific Sum?
 * */
fun findPairOfSumInArray(list: List<Int>, sum: Int): List<Int>? {
    var pairList: List<Int>? = null
    firstLoop@ for (firstNumber in list) {
        secondLoop@ for (secondNumber in list) {
            val pairSum = firstNumber.plus(secondNumber)
            if (sum == pairSum) {
                pairList = listOf(firstNumber, secondNumber)
                break@firstLoop
            }
        }
    }
    return pairList
}