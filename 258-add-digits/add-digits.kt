class Solution {
    fun addDigits(num: Int): Int {
        var left = num
        
        while (left > 9) {
            val q = left / 10
            val r = left % 10
            
            left = q + r
        }
        
        return left
    }
}