class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var k = 0
        for (i in 0 until nums.size) {
            val currentVal = nums[i]
            if (currentVal != 0) {
                val oldValue = nums[k]
                nums[k++] = currentVal
                nums[i] = oldValue
            }
        }
    }
}