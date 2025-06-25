class Solution {
    fun countBits(n: Int): IntArray {
        val bitArray = Array<Int>(n + 1) { 0 } // Fixed size is more performant
        
        for (i in 0 .. n) {
            bitArray[i] = i.toString(2).count { it == '1'}
        }
        
        return bitArray.toIntArray()
    }
}