class Solution {
    fun titleToNumber(columnTitle: String): Int {
        val letterMap = mapOf<Char, Int>(
            'A' to 1,
            'B' to 2,
            'C' to 3,
            'D' to 4,
            'E' to 5,
            'F' to 6,
            'G' to 7,
            'H' to 8,
            'I' to 9,
            'J' to 10,
            'K' to 11,
            'L' to 12,
            'M' to 13,
            'N' to 14,
            'O' to 15,
            'P' to 16,
            'Q' to 17,
            'R' to 18,
            'S' to 19,
            'T' to 20,
            'U' to 21,
            'V' to 22,
            'W' to 23,
            'X' to 24,
            'Y' to 25,
            'Z' to 26
        )
        val alphabetSize = 26
        var number: Int = 0 // Calculated number
        var factor = 1 // Each character will have be a factor of 26
        
        for (i in columnTitle.toCharArray().size - 1 downTo 0) {
            number += letterMap[columnTitle[i]]!! * factor
            factor *= alphabetSize
        }
        return number
    }
}