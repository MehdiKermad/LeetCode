class Solution {
    fun convertToTitle(columnNumber: Int): String {
        val letterMap = mapOf(
            1 to 'A',
            2 to 'B',
            3 to 'C',
            4 to 'D',
            5 to 'E',
            6 to 'F',
            7 to 'G',
            8 to 'H',
            9 to 'I',
            10 to 'J',
            11 to 'K',
            12 to 'L',
            13 to 'M',
            14 to 'N',
            15 to 'O',
            16 to 'P',
            17 to 'Q',
            18 to 'R',
            19 to 'S',
            20 to 'T',
            21 to 'U',
            22 to 'V',
            23 to 'W',
            24 to 'X',
            25 to 'Y',
            26 to 'Z'
        )
        var strBuilder = StringBuilder()
        
        var left = columnNumber
        while (left > 0) {
            // Compensate the absence of zero in our basis
            left--
            
            val q = left/26
            val r = left%26
            
            strBuilder.insert(0, letterMap[1 + r])
            left = q
        }
        return strBuilder.toString()
    }
}