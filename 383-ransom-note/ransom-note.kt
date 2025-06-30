class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        // Special cases
        if (ransomNote.isEmpty()) return true
        if (magazine.length < ransomNote.length) return false
        
        // We count letters needed and available
        val neededLetters = mutableMapOf<Char, Int>()
        val availableLetters = mutableMapOf<Char, Int>()
        
        // We count letters needed and available
        for (i in 0 until magazine.length) {
            val neededChar = ransomNote.getOrNull(i)
            val availableChar = magazine[i]
            
            neededChar?.let {
                neededLetters[it] = neededLetters.getOrDefault(it, 0) + 1
            }
            availableLetters[availableChar] = availableLetters.getOrDefault(availableChar, 0) + 1
        }
        
        // For each letter needed, we check if we have enough of them
        for (entry in neededLetters) {
            val availableLetterCount = availableLetters.getOrDefault(entry.key, 0)
            if (availableLetterCount < entry.value) {
                return false
            }
        }
        
        return true
    }
}