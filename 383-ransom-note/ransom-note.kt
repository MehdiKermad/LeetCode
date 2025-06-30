class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        // Special cases
        if (ransomNote.isEmpty()) return true
        if (magazine.length < ransomNote.length) return false
        
        // We count letters needed and available
        val neededLetters = ransomNote.groupingBy { it }.eachCount()
        val availableLetters = magazine.groupingBy { it }.eachCount()
        
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