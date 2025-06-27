class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var factor: Long = 1
        var poweredNumber: Long = 1
        
        while (poweredNumber < num) {
            poweredNumber = factor * factor
            factor++
        }
        
        return poweredNumber == num.toLong()
    }
}