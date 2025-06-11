class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val finalList = mutableListOf<List<Int>>()
        finalList.add(listOf(1))
        
        for (i in 1 until numRows) {
            // A list size corresponds to n + 1
            val listSize = i + 1
            val currentList = MutableList<Int>(listSize) { 1 }

            // Aside of the extremes, each cell is calculated with n^i-1 + n^i cells of the previous one
            for (j in 1 until listSize - 1) {
                currentList[j] = finalList[i - 1][j - 1] + finalList[i - 1][j]
            }

            finalList.add(currentList)
        }
        
        return finalList
    }
}