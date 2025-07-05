class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        // If strings don't have the same size they can't be anagram
        if (s.length != t.length) return false

        val aVal = 'a'.toInt()
        var sArray = IntArray(size = 26) { 0 }
        var tArray = IntArray(size = 26) { 0 }

        // We get the numeric value of each char
        for (i in 0 until s.length) {
            val sVal = s[i].toInt()
            val tVal = t[i].toInt()
            
            sArray[sVal - aVal] = sArray[sVal - aVal] + 1
            tArray[tVal - aVal] = tArray[tVal - aVal] + 1
        }
        
        return sArray.contentEquals(tArray)
    }
}