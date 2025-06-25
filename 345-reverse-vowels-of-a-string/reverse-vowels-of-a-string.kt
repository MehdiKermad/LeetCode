class Solution {
    fun reverseVowels(s: String): String {
        val vowelsSet = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        val vowelsPosMap = mutableMapOf<Int, Char>()
        var newString = StringBuilder(s)
        
        // Getting vowels and their positions in the word
        for (i in 0 until s.length) {
            val currentLetter = s[i]
            if(vowelsSet.contains(currentLetter)){
                vowelsPosMap[i] = currentLetter
            }
        }
        
        val valuesArray = vowelsPosMap.values.toCharArray()
        val posArray = vowelsPosMap.keys.toIntArray()
        
        for (i in 0 until posArray.size) {
            newString[posArray[i]] = valuesArray[valuesArray.size - i - 1]
        }

        return newString.toString()
    }
}