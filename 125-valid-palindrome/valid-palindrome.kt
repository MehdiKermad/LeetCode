class Solution {
    fun isPalindrome(s: String): Boolean {
        //val stringBuilder = StringBuilder(s.length)
        var str = ""

        // We check if each character exist in Kotlin charsets
        for (c in s.lowercase()) {
            if (c.isLetterOrDigit()) {
                str += c
            }
        }
        return str == str.reversed()
    }
}