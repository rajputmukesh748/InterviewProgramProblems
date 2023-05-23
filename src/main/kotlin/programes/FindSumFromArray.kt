package programes


/**
 * Two Sum: Given an array of integers and a target sum,
 * write a function that returns the indices of two
 * numbers in the array that add up to the target sum.
 *
 * @Input
 * list = [2,4,10,74,100,3,6,74]
 * target = 102
 *
 * @SCENARIO
 * 2 - [2,2] [2,4] [2,10] [2,74] [2,100] [2,3] [2,6] [2,74]
 * 4 - [4,2] [4,4] [4,10] [4,74] [4,100] [4,3] [4,6] [4,74]
 * 10 -[10,2] [10,4] [10,10] [10,74] [10,100] [10,3] [10,6] [10,74]
 * 74 - [74,2] [74,4] [74,10] [74,74] [74,100] [74,3] [74,6] [74,74]
 * 100 -[100,2] [100,4] [100,10] [100,74] [100,100] [100,3] [100,6] [100,74]
 * 3 - [3,2] [3,4] [3,10] [3,74] [3,100] [3,3] [3,6] [3,74]
 * 6 - [6,2] [6,4] [6,10] [6,74] [6,100] [6,3] [6,6] [6,74]
 * 74 - [74,2] [74,4] [74,10] [74,74] [74,100] [74,3] [74,6] [74,74]
 *
 * @OUTPUT
 * [2,100]
 * */
fun findSumFromArray(list: List<Int>, targetSum: Int): List<Int> {
    val returnList = mutableListOf<Int>()
    firstLoop@ for (first in list) {
        secondLoop@ for (second in list) {
            if ((first + second) == targetSum) {
                returnList.add(first)
                returnList.add(second)
                break@firstLoop
            }
        }
    }
    return returnList
}