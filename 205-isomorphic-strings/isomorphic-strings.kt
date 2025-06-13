class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val lettersMap = mutableMapOf<Char, Char>()
        val lettersMap2 = mutableMapOf<Char, Char>()
        for (i in 0 until s.length) {
            if (!lettersMap.contains(s[i])) {
                lettersMap[s[i]] = t[i]
            } else {
                if (lettersMap[s[i]] != t[i]) {
                    return false
                }
            }
            
            if (!lettersMap2.contains(t[i])) {
				lettersMap2[t[i]] = s[i]
            } else {
                if (lettersMap2[t[i]] != s[i]) {
					return false
                }
            }
        }

        return true
    }
}