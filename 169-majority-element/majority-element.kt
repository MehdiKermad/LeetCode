class Solution {
    fun majorityElement(nums: IntArray): Int {

        if (nums.size == 1) return nums.first()

        val threshold = nums.size / 2
        val frequencyMap = mutableMapOf<Int, Int>()
        
        for (n in nums) {
            val current = frequencyMap.getOrDefault(n, 0)
            if (current + 1 > threshold) {
                return n
            } else {
                frequencyMap[n] = current + 1
            }
        }

        return -1
    }
}