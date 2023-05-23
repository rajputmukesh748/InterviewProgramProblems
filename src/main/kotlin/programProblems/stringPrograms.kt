package programProblems

/**
 * How Do You Reverse a String?
 * */
fun reverseString(string: String): String {
    if (string.length < 2) return string
    var reverseString = ""
    for (i in (string.length - 1) downTo 0) {
        reverseString += string[i]
    }
    return reverseString
}


/**
 * How Do You Calculate the Number of Vowels and Consonants in a String
 * */
fun vowelsAndConsonantsCount(string: String): String {
    var vowelsCount: Int = 0
    var consonants: Int = 0
    for (item in string.lowercase()) {
        when (item) {
            'a', 'e', 'i', 'o', 'u' -> vowelsCount += 1
            in 'a'..'z' -> consonants += 1
        }
    }
    return "Vowels Count:-$vowelsCount\nConsonants Count:-$consonants"
}


/**
 * How Do You Print the First Non-Repeated Character in a String
 * */
fun printFirstNonRepeatCharInString(string: String): String {
    var repeatedValue: Char? = null
    val tempList: MutableList<Char> = mutableListOf()
    for (item in string.lowercase()) {
        if (tempList.contains(item)) {
            repeatedValue = item
            break
        } else tempList.add(item)
    }
    return repeatedValue.toString().lowercase()
}


/**
 * How Do You Figure Out if the Provided String Is a Palindrome?
 * */
fun checkPalindrome(string: String): Boolean {
    if (string.length < 2) return true
    var reverseValue: String = ""
    for (i in (string.length - 1) downTo 0) {
        reverseValue += string[i]
    }
    return string.lowercase() == reverseValue.lowercase()
}


/**
 * How Do You Determine Whether the Following Two Strings Are Anagrams of Each Other?
 * */
fun checkValueIsAnagrams(string: String): Boolean {
    if (string.length < 2) return true
    val sortedValue = string.toList().sorted()
    print(sortedValue)
    return true //string == sortedValue
}
//https://www.springboard.com/blog/software-engineering/coding-interview-questions/