class Solution {
    fun addBinary(a: String, b: String): String {
        /*
        // First method
        val lngByteSize = maxOf(a.length, b.length) - 1
        val strBuilder = StringBuilder()
        var increaseNextBit = false
        
        // We reverse arrays to work
        val firstByte = a.toCharArray().reversedArray()
        val secByte = b.toCharArray().reversedArray()
        
        for (i in 0..lngByteSize) {
            val x = firstByte.getOrNull(i) ?: '0'
            val y = secByte.getOrNull(i) ?: '0'
            val newBit: Char
        
            // We have an operation to do only if we have two 1
            if (x == '1' && y == '1') {
                newBit = if (increaseNextBit) {
                    '1'
                } else {
                    '0'
                }
                increaseNextBit = true
            } else if (x == '0' && y == '0') {
                newBit = if (increaseNextBit) {
                    increaseNextBit = false
                    '1'
                } else {
                    '0'
                }
            } else {
                newBit = if (increaseNextBit) {
                    increaseNextBit = true
                    '0'
                } else {
                    '1'
                }
            }
            
            strBuilder.append(newBit)
        }

        // We add the last bit in a case of a last increase
        if (increaseNextBit) {
            strBuilder.append('1')
        }
        return strBuilder.toString().reversed() */
        
        // Second method
        return (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)
    }
}