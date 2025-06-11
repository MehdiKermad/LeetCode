class Solution {
    fun isPalindrome(x: Int): Boolean {
        /*
        // First solution
        val str = x.toString()
        return str == str.reversed()
        */

        /*
        // Second solution
        when {
            x < 0 -> return false
            x < 10 -> return true
            else -> {
                val str = x.toString()
                return str == str.reversed()
            }
        }
        */

        // Third solution
        // If there is a minus sign, it's not a palindrome
        var reversedNumber = 0
        var number = x
        
        while (number > 0) {
        
            reversedNumber = (reversedNumber * 10) + (number % 10)
            number /= 10
        }
        return x == reversedNumber
    }
}