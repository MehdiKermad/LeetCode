class Solution {
    fun isUgly(n: Int): Boolean {

        if (n < 1) { 
            // An ugly number has to be positive
            return false
        } else if (n == 1) {
            // 1 has only itself as a prime factor
            return true
        }

        var left = n

        // We keep dividing the number by 2, 3 or 5 as long as it's possible
        while (left != 1) {
            when {
                left % 2 == 0 -> {
                    left /= 2
                }
                left % 3 == 0 -> {
                    left /= 3
                }
                left % 5 == 0 -> {
                    left /= 5
                }
                else -> {
                    // If the number is not divisible by 2/3/5, it means we found a prime factor
                    return false
                }
            }
        }
        
        return true
    }
}