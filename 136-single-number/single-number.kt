class Solution {
    fun singleNumber(nums: IntArray): Int {
        val seenSet = mutableSetOf<Int>()
        val candidateSet = mutableSetOf<Int>()

        for (i in nums) {
            if (!seenSet.contains(i)) {
                seenSet.add(i)
                candidateSet.add(i)
            } else {
                candidateSet.remove(i)
            }
        }

        return candidateSet.first()
    }
}