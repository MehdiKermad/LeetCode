class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        val requiredLettersList = s.toMutableList()
        
        for (c in t) {
            if (requiredLettersList.firstOrNull() == c) {
                requiredLettersList.removeFirst()
            }
        }
        
        return requiredLettersList.isEmpty()
    }
}