class Solution {
    fun reverseString(s: CharArray): Unit {
        for (i in 0 until s.size / 2) {
            val tmp = s[i]
            s[i] = s[s.size - i - 1]
            s[s.size - i - 1] = tmp
        }
    }
}