package programes

/**
 * Reverse String
 *
 * String Reversal: Write a function that takes a string as input and returns the reverse of that string
 * */
fun reverseString(inputString: String): String {
    if (inputString.length < 2) return inputString
    var reverseString = ""
    for (i in inputString.length - 1 downTo 0) {
        reverseString += inputString[i]
    }
    print(reverseString)
    return reverseString
}
