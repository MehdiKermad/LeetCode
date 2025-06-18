class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var k = 0
        for (i in 0 until nums.size) {
            if (nums[i] != 0) {
                val oldValue = nums[k]
                nums[k] = nums[i]
                nums[i] = oldValue
                k++
            }
        }
    }
}