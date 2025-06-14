class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if (s.length != t.length) return false

        val firstFrequency = mutableMapOf<Char, Int>()
        val secondFrequency = mutableMapOf<Char, Int>()
        
        for (i in 0 until s.length) {
            val firstCount = firstFrequency.getOrPut(s[i]) { 0 }
            firstFrequency[s[i]] = firstCount+1
            val secondCount = secondFrequency.getOrPut(t[i]) { 0 }
            secondFrequency[t[i]] = secondCount+1
        }
        
        return firstFrequency == secondFrequency
    }
}