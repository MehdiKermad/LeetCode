class Solution {
    fun isPalindrome(s: String): Boolean {
        val stringBuilder = StringBuilder(s.length)

        // We check if each character exist in Kotlin charsets
        for (c in s.lowercase()) {
            if (c.isLetterOrDigit()) {
                stringBuilder.append(c)
            }
        }
        return stringBuilder.toString() == stringBuilder.toString().reversed()
    }
}