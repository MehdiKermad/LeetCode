class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        // We transform needed letters as a list
        val availableLetters = magazine.toMutableList()
        
        // We try to remove each letter needed of available letters
        for (c in ransomNote) {
            // If we can't, it means this letter is missing
            if (availableLetters.remove(c) == false) {
                return false
            }
        }
        
        return true
    }
}