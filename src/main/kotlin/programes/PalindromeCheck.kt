package programes

/**
 * Palindrome Check: Write a function that takes a string as input and returns true if the string is a palindrome, and false otherwise.
 * */
fun palindromeCheck(string: String): Boolean {
    if (string.length < 2) return true
    var reverseString = ""
    for (i in string.length - 1 downTo 0) {
        reverseString += string[i]
    }
    return string.lowercase() == reverseString.lowercase()
}