class Solution {
    fun isValid(s: String): Boolean {
        val signOppositeMap = mapOf<Char, Char>(
            ')' to '(',
            '}' to '{',
            ']' to '['
        )

        // Preallocate memory reduce the cost
        var deque: ArrayDeque<Char> = ArrayDeque<Char>(s.length)
        for (c in s) {
            if (c == '(' || c == '[' || c == '{') {
                // Open arborescence
                deque.addLast(c)
            } else {
                // Closing arborescence, we need to check if arborescence is respected
                if (deque.removeLastOrNull() != signOppositeMap[c]) {
                    // Arborescence is violated
                    return false  
                }
            }
        }
        
        return deque.isEmpty()
    }
}