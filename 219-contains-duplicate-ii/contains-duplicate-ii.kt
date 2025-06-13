class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val numberPosMap = mutableMapOf<Int, Int>()
        
        // Checking each number position
        for (i in 0 until nums.size) {
            val numberPositionMatch = numberPosMap.getOrPut(nums[i]) { i }
            if (numberPositionMatch != i) {
                if (Math.abs(numberPositionMatch - i) <= k) {
                    // Checking if the previous occurence is in the range
                    return true
                } else {
                    // Or we update the position with the new one
                    numberPosMap[nums[i]] = i
                }
            }
        }
        
        return false
    }
}