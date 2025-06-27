class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        return if (nums1.size < nums2.size) {
            intersectArrays(nums1, nums2)
        } else {
            intersectArrays(nums2, nums1)
        }
    }

    private fun intersectArrays(shortArr: IntArray, longArr: IntArray): IntArray {
        val seenList = mutableListOf<Int>()
        val interList = mutableListOf<Int>()
        
        // We build a list of seen values with the shortest array
        seenList.addAll(shortArr.toTypedArray())

        // Then we look at each value to determine which one is common
        for (i in longArr) {
            if (seenList.contains(i)) {
                interList.add(i)
                seenList.remove(i)
                if (seenList.isEmpty()) break
            }
        }
        
        return interList.toIntArray()
    }
}