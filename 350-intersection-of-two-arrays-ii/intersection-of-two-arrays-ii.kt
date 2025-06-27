class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val seenList = mutableListOf<Int>()
        val interList = mutableListOf<Int>()

        if (nums1.size < nums2.size) {
            // We build a list of seen values
            nums1.forEach {
                seenList.add(it)
            }

            // Then we look at each value to determine which one is common
            nums2.forEach {
                if (seenList.contains(it)) {
                    seenList.remove(it)
                    interList.add(it)
                }
            }
        } else {
            // We build a list of seen values
            nums2.forEach {
                seenList.add(it)
            }

            // Then we look at each value to determine which one is common
            nums1.forEach {
                if (seenList.contains(it)) {
                    seenList.remove(it)
                    interList.add(it)
                }
            }
        }
    

        return interList.toIntArray()
    }
}