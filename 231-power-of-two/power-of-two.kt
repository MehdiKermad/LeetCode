class Solution {
    fun isPowerOfTwo(n: Int): Boolean {        
        if (n == 0) return false

        var res: Long = 1
        while (res < n) {
            res *= 2
        }
        return res == n.toLong()
    }
}