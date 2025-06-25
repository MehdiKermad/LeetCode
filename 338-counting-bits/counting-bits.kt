class Solution {
    fun countBits(n: Int): IntArray {
        //val bitArray = Array<Int>(n + 1) { 0 } // Fixed size is more performant
        val bitArray = mutableListOf<Int>()

        // We fill the array from 0 to n + 1
        for (i in 0 .. n) {
            bitArray.add(toBinary(i)) // The number to calculate is the current indice
        }
        
        return bitArray.toIntArray()
    }

    private fun toBinary(n: Int): Int {
        var res = n
        var posCount = 0 // Number of of bit worth 1
        while (res > 0) {
            posCount += res%2
            res /= 2
        }
        return posCount
    }
}