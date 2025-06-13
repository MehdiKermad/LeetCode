class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val numberPosMap = mutableMapOf<Int, Int>()
        
        // Checking each number position
        for (i in 0 until nums.size) {
            if (numberPosMap.contains(nums[i])) {
                if (Math.abs(numberPosMap[nums[i]]!! - i) <= k) {
                    // Checking if the previous occurence is in the range
                    return true
                } else {
                    // Or we update the position with the new one
                    numberPosMap[nums[i]] = i
                }
            } else {
                numberPosMap[nums[i]] = i
            }
        }
        
        return false
    }
}