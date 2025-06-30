class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        // We transform needed letters as a list
        var availableLetters = StringBuilder(magazine)
        
        // We try to remove each letter needed of available letters
        for (c in ransomNote) {
            val charPos = availableLetters.indexOf(c)
            // If we can't, it means this letter is missing
            if (charPos > -1) {
                availableLetters = availableLetters.deleteAt(charPos)
            } else {
                return false
            }
        }
        
        return true
    }
}