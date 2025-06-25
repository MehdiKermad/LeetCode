class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val firstSet = nums1.toSet()
        val secondSet = nums2.toSet()
        return firstSet.intersect(secondSet).toIntArray()
    }
}