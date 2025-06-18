class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val patternArray = pattern.toCharArray()
        val wordArray = s.split(' ')
        val bijectionMap1 = mutableMapOf<String, String>()
        val bijectionMap2 = mutableMapOf<String, String>()
        
        // We check if size are equals first
        if (patternArray.size != wordArray.size) return false
        
        for (i in 0 until patternArray.size) {
            val currentChar = patternArray[i].toString()
            val currentWord = wordArray[i]
            
            if (!bijectionMap1.contains(currentChar)) {
                bijectionMap1[currentChar] = currentWord
            } else if (bijectionMap1[currentChar] != currentWord) {
                return false
            }
            
            if (!bijectionMap2.contains(currentWord)) {
                bijectionMap2[currentWord] = currentChar
            } else if (bijectionMap2[currentWord] != currentChar) {
                return false
            }
        }
        
        return true
    }
}