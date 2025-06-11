class Solution {
    fun lengthOfLastWord(s: String): Int {
        /*
        // First method
        var lastLength = 0
        var isLastCharBlank = false
        
        s.forEach {
            println(it)
            if (it.isWhitespace()) {
                isLastCharBlank = true
            } else if (!it.isWhitespace() && isLastCharBlank) {
                isLastCharBlank = false
                lastLength = 1
            } else {
                lastLength++
            }
        }
        
        return lastLength*/
        
        // Second method: starting from the end
        var lastLength = 0
        
        for (i in (s.length - 1) downTo 0) {
            if (!s[i].isWhitespace()) {
                lastLength++
            } else if (s[i].isWhitespace() && lastLength > 0) {
                return lastLength
            }
        }
        
        return lastLength
    }
}