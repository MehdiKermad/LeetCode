class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val lettersMap = mutableMapOf<Char, Char>()
        val lettersMap2 = mutableMapOf<Char, Char>()
        
        // Both words have the same size
        for (i in 0 until s.length) {
            
            // We check the first matching
            val firstMatch = lettersMap[s[i]]
            if (firstMatch == null) {
                lettersMap[s[i]] = t[i]
            } else {
                if (firstMatch != t[i]) {
                    return false
                }
            }
            
            // We check the second matching
            val secondMatch = lettersMap2[t[i]]
            if (secondMatch == null) {
				lettersMap2[t[i]] = s[i]
            } else {
                if (secondMatch != s[i]) {
					return false
                }
            }
        }

        return true
    }
}