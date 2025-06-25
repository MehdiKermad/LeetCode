class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        if (n == 0) return false

        var res: Long = 1
        while (res < n) {
            res *= 3
        }
        return res == n.toLong()
    }
}