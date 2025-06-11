class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = mutableMapOf<Int, Int>()
        for ((i, n) in nums.withIndex()) {
            val diff = target - n
            if (hashMap.contains(diff)) {
                // Found
                return intArrayOf(i, hashMap[diff]!!)
            } else {
                // Not found, we keep going
                hashMap.put(n, i)
            }
        }
        return intArrayOf()
    }
}