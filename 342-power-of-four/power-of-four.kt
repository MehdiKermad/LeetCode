class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        if (n == 0) return false

        var res: Long = 1
        while (res < n) {
            res *= 4
        }
        return res == n.toLong()
    }
}