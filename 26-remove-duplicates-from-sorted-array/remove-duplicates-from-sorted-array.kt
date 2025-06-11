class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val seenSet = mutableSetOf<Int>()
        var k = 0

        for (i in 0..nums.size - 1) {
            if (!seenSet.contains(nums[i])) {
                seenSet.add(nums[i])
                nums[k] = nums[i]
                k++
            }
        }
        return k
    }
}