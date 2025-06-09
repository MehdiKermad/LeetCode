class Solution {
    fun isPalindrome(s: String): Boolean {
        val stringBuilder = StringBuilder()

        // We check if each character exist in Kotlin charsets
        for (c in s) {
            if (CharCategory.LOWERCASE_LETTER.contains(c) || c.isDigit()) {
                stringBuilder.append(c)
                continue
            }
            // If it's an uppercase we convert it
            if (CharCategory.UPPERCASE_LETTER.contains(c)) {
                stringBuilder.append(c.lowercaseChar())
            }
        }

        return stringBuilder.toString() == stringBuilder.toString().reversed()
    }
}