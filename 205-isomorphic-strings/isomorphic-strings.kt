class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val firstMap = s.zip(t).toMap()
        val secondMap = t.zip(s).toMap()
        
        // Both words have the same size
        for (i in 0 until s.length) {
            
            // We check the first matching
            if (firstMap[s[i]] != t[i]) { return false }
            
            // We check the second matching
            if (secondMap[t[i]] != s[i]) { return false }
        }

        return true
    }
}