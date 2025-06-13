class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val firstMap = mutableMapOf<Char, Char>()
        val secondMap = mutableMapOf<Char, Char>()
        
        // Both words have the same size
        for (i in 0 until s.length) {
            
            // We check the first matching
            if (firstMap.getOrPut(s[i]) { t[i] } != t[i]) { return false }
            
            // We check the second matching
            if (secondMap.getOrPut(t[i]) { s[i] } != s[i]) { return false }
        }

        return true
    }
}