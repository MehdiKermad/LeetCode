class Solution {
    fun isUgly(n: Int): Boolean {

        // An ugly number has to be positive
        if (n < 1) { 
            return false
        } else if (n == 1) {
            return true}

        var left = n
        while (left != 1) {
            when {
                left % 2 == 0 -> {
                    println("$left est un multiple de 2")
                    left /= 2
                }
                left % 3 == 0 -> {
                    println("$left est un multiple de 3")
                    left /= 3
                }
                left % 5 == 0 -> {
                    println("$left est un multiple de 5")
                    left /= 5
                }
                else -> return false
            }
        }
        
        return true
    }
}