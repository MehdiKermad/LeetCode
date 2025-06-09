class Solution {
    fun majorityElement(nums: IntArray): Int {

        if (nums.size == 1) return nums.first()

        val threshold = nums.size / 2
        val frequencyMap = mutableMapOf<Int, Int>()
        for (n in nums) {
            if (frequencyMap.contains(n)) {
                if (frequencyMap[n]!! + 1 > threshold) {
                    return n
                } else {
                    frequencyMap[n] = frequencyMap[n]!! + 1
                }
            } else {
                frequencyMap[n] = 1
            }
        }

        return 0
    }
}