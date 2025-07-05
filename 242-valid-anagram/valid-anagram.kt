class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        // If strings don't have the same size they can't be anagram
        if (s.length != t.length) return false

        val aVal = 'a'.code
        val sArray = IntArray(size = 26)
        val tArray = IntArray(size = 26)

        // We get the numeric value of each char
        for (i in 0 until s.length) {
            val sPos = s[i].code - aVal
            val tPos = t[i].code - aVal
            
            sArray[sPos] = sArray[sPos] + 1
            tArray[tPos] = tArray[tPos] + 1
        }
        
        return sArray.contentEquals(tArray)
    }
}