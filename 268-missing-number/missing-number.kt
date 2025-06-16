class Solution {
    fun missingNumber(nums: IntArray): Int {
        var size = 0
        var numsSum = 0
        
        for (i in 0 until nums.size) {
            numsSum += nums[i]
            size += (i + 1)
        }
        
        return size - numsSum
    }
}