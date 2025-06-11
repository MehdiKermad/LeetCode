class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        /* First method
        // The prefix can't be longer than the shortest word
        val sorted = strs.sortedBy() { it.length }
        var longestPrefix = ""

        // Checking each letter of the shortest word
        for (i in 0..sorted.first().length - 1) {
            var isContainingPrefix = true
            val currentChar = sorted.first()[i]

            // Checking if each next word starts with the prefix
            for (wrd in sorted.subList(1, sorted.size)) {
                println("Checking : " + wrd + " with " + longestPrefix + currentChar + " => " + wrd.startsWith(longestPrefix + currentChar))
                isContainingPrefix = wrd.startsWith(longestPrefix + currentChar)
                if (!isContainingPrefix) break
            }

            if (isContainingPrefix) {
                longestPrefix += currentChar
            } else {
                break
            }
        } */
        
        /*
        // Second method
        var longestPrefix = ""
        val sorted = strs.sorted()
        val subList = sorted.subList(1, sorted.size)
        
        for (i in 0..sorted.first().length - 1) {
            val currentChar = sorted.first()[i]
            val count = subList.count() { it.startsWith(longestPrefix + currentChar) }
            if (count < subList.size) {
                break
            } else {
                longestPrefix += currentChar
            }
        }*/

        /*
        // Third method
        var longestPrefix = ""
        strs.sort() // Sort alphabetically the array
        val firstWrd = strs.first()
        val lastWrd = strs.last()
        
        for (i in 0..firstWrd.length - 1) {
            if (firstWrd[i] == lastWrd[i]) {
                longestPrefix += firstWrd[i]
            } else {
                break
            }
        }
        
        return longestPrefix*/

        // Fourth method
        var longestPrefix = strs.first()
        
        // We check every word
        for (wrd in 1..strs.size - 1) {
            // We check every letter
            for (i in 0..longestPrefix.length - 1) {
                if (longestPrefix.getOrNull(i) != strs[wrd].getOrNull(i)) {
                    // We cut the word until we find the common prefix
                    longestPrefix = longestPrefix.substring(0..i-1)
                    break
                }
            }
        }
        
        return longestPrefix
    }
}