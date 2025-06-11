class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        
        // If we only have nums1, we return it directly
        if (n == 0) return
        
        for (i in m..(m+n-1)) {
            nums1[i] = nums2[i-m]
        }
        nums1.sort()
    }
}