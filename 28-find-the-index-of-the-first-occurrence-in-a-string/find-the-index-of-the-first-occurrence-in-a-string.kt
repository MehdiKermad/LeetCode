class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var foundSize = 0
        var foundStartPos = -1
        
        var i = 0
        while (i <= haystack.length - 1) {
            if (haystack[i] == needle.getOrNull(foundSize)) {
                if (foundSize == 0) {
                    foundStartPos = i
                }
                if (++foundSize == needle.length) {
                    return foundStartPos
                }
            } else {
                foundSize = 0
                i = foundStartPos++
            }
            i++
        }

        return -1
    }
}