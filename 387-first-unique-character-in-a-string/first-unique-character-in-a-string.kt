class Solution {
    fun firstUniqChar(s: String): Int {
        // Special cases
        if (s.length == 0) return -1
        else if (s.length == 1) return 0
        
        // LinkedMap keeps the insertion order; Pair<Position, Frequency>
        val candidateMap = linkedMapOf<Char, Pair<Int, Int>>()
        
        for (i in 0 until s.length) {
            candidateMap[s[i]] = candidateMap.getOrElse(s[i]) { Pair(i, 0) }.run { Pair(first, second + 1) }
        }
                
        // Getting the first element having only one occurrence
        candidateMap.forEach {
            if (it.value.second == 1) {
                return it.value.first
            }
        }
        
        return -1
    }
}