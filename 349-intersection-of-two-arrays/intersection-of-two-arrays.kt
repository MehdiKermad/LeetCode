class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val seenSet = mutableSetOf<Int>()
        val secondNumsSet = mutableSetOf<Int>()
        val interSet = mutableSetOf<Int>()
        
        // We build a set of seen values
        nums1.forEach {
            seenSet.add(it)
        }
        
        // Then we look at each value to determine which one is common
        nums2.forEach {
            if (seenSet.contains(it)) {
                interSet.add(it)
            }
        }
        
        return interSet.toIntArray()
    }
}