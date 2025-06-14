class Solution {
    fun isPowerOfTwo(n: Int): Boolean {        
        var factor: Long = 1 // We need to use long type for a bigger value range
        while (factor < n) {
            // We multiply the number until we reach n or go over it
            factor *= 2
        }
        
        // If the last operation is equals to n, it's a power of two
        return factor == n.toLong()
    }
}