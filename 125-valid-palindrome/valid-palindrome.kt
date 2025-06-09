class Solution {
    fun isPalindrome(s: String): Boolean {
        val stringBuilder = StringBuilder()
        val stringBuilderReversed = StringBuilder()

        // We check if each character exist in Kotlin charsets
        for (c in s) {
            if (CharCategory.LOWERCASE_LETTER.contains(c) || c.isDigit()) {
                stringBuilder.append(c)
                stringBuilderReversed.insert(0, c)
                continue
            }
            // If it's an uppercase we convert it
            if (CharCategory.UPPERCASE_LETTER.contains(c)) {
                stringBuilder.append(c.lowercaseChar())
                stringBuilderReversed.insert(0, c.lowercaseChar())
            }
        }

        return stringBuilder.toString() == stringBuilderReversed.toString()
    }
}