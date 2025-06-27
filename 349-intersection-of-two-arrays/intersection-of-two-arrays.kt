class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val maxSize = maxOf(nums1.size, nums2.size)
        val firstNumsSet = mutableSetOf<Int>()
        val secondNumsSet = mutableSetOf<Int>()
        val interSet = mutableSetOf<Int>()
        
        // We check both arrays simultanously 
        for (i in 0 until maxSize) {
            val currentFirst = nums1.getOrNull(i)
            val currentSecond = nums2.getOrNull(i)
            
            // We add everything we find in sets
            currentFirst?.let {
                firstNumsSet.add(it)
                
                // If it's present in the other set, it's a common element
                if (secondNumsSet.contains(it)) {
                    interSet.add(it)
                }
            }
            currentSecond?.let {
                secondNumsSet.add(it)
                if (firstNumsSet.contains(it)) {
                    interSet.add(it)
                }
            }
        }
        
        return interSet.toIntArray()
    }
}