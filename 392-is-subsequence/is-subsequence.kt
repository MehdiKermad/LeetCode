class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        val requiredLettersList = s.toMutableList()
        var cpt = 0
        
        while (requiredLettersList.isNotEmpty() && cpt < t.length) {
            if (requiredLettersList.firstOrNull() == t[cpt]) {
                requiredLettersList.removeFirst()
            }
            cpt++
        }
        
        return requiredLettersList.isEmpty()
    }
}