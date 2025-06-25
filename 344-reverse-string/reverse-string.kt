class Solution {
    fun reverseString(s: CharArray): Unit {
        val stringSize = s.size
        for (i in 0 until stringSize / 2) {
            val tmp = s[i]
            s[i] = s[stringSize - i - 1]
            s[stringSize - i - 1] = tmp
        }
    }
}