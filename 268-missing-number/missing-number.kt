class Solution {
    fun missingNumber(nums: IntArray): Int {
        return (0..nums.size).sum() - nums.sum()
    }
}