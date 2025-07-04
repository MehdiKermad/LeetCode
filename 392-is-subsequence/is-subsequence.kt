class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var foundLetters = 0 // Move to each needed character
        var cpt = 0 // Move in each character of the target word
        
        // We loop until we get all needed letters or we checked all the target word
        while (foundLetters < s.length && cpt < t.length) {
            if (s[foundLetters] == t[cpt]) {
                // If a needed char is found, we move to the next one
                foundLetters++
            }
            cpt++
        }
        
        return foundLetters == s.length
    }
}