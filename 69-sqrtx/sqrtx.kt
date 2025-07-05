class Solution {
    fun mySqrt(x: Int): Int {
        if (x == 0) return 0

        var factor: Long = 1L
        while (((factor + 1L) * (factor + 1L)) <= x) {
            factor++
        }
        return factor.toInt()
    }
}