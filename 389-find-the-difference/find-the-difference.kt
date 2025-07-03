class Solution {
    fun findTheDifference(s: String, t: String): Char {
        var sumS = 0
        var sumT = 0
        
        // We get the sum of each character converted to an integer
        for (i in 0 until s.length) {
            sumS += s[i].toInt()
            sumT += t[i].toInt()
        }
        
        // We add the missing character from the longest string
        sumT += t[s.length].toInt()
        
        // Then we return the difference of both sums that we convert to a char
        return (sumT - sumS).toChar()
    }
}