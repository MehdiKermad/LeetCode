class Solution {
    fun firstUniqChar(s: String): Int {
        // Special cases
        if (s.length == 0) return -1
        else if (s.length == 1) return 0
        
        // LinkedMap keeps the insertion order
        val candidateMap = linkedMapOf<Char, Int>()
        val duplicateSet = mutableSetOf<Char>()
        
        for (i in 0 until s.length) {
            if (!duplicateSet.contains(s[i]) && !candidateMap.contains(s[i])) {
                // If it's a new one, we insert it
                candidateMap[s[i]] = i
            } else {
                candidateMap.remove(s[i])
                duplicateSet.add(s[i])
            }
        }
        
        return candidateMap.values.firstOrNull() ?: -1
    }
}