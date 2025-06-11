class Solution {
fun romanToInt(s: String): Int {
        val romanHashMap = hashMapOf<Char, Int>(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        
        var totalValue: Int = 0
        var romanLeft = s

        while (romanLeft.length > 0) {
            var treatedChar = 1
            val current = romanLeft.first()
            
            if (current == 'I' || current == 'X' || current == 'C') {
                
            	// Special case for I; X; C we have to check next character
                val next = romanLeft.getOrNull(1)
                next?.let {
                    when {
                        (current == 'I' && (next == 'V' || next == 'X')) ||
                        (current == 'X' && (next == 'L' || next == 'C')) ||
                        (current == 'C' && (next == 'D' || next == 'M')) -> {
                            // Substraction
                            totalValue += (romanHashMap[next]!! - romanHashMap[current]!!)
                            treatedChar++
                        }
                        else -> {
                            // The next roman number is independent
                            totalValue += romanHashMap[current]!!
                        }
                    }
                } ?: run {
                    // Last roman number; No substraction
                    totalValue += romanHashMap[current]!!
                }

            } else {
                // Normal case
                totalValue += romanHashMap[current]!!
                
            }
            romanLeft = romanLeft.substring(treatedChar..romanLeft.length - 1)
        }
        
        return totalValue
    }
}