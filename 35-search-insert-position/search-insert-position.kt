class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        var middle = -1

        while (start <= end) {
            middle = ((start + end) / 2)
            when {
                nums[middle] == target -> {
                    return middle
                }
                nums[middle] > target -> {
                    end = middle - 1
                }
                nums[middle] < target -> {
                    start = middle + 1
                }
                else -> Unit
            }
        }
        
        return start
    }
}