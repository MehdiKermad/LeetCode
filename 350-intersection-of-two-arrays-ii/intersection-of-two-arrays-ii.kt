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
            for (i in nums2) {
                if (seenList.contains(i)) {
                    seenList.remove(i)
                    interList.add(i)
                    if (seenList.isEmpty()) break
                }
            }
        } else {
            // We build a list of seen values
            nums2.forEach {
                seenList.add(it)
            }

            // Then we look at each value to determine which one is common
            for (i in nums1) {
                if (seenList.contains(i)) {
                    seenList.remove(i)
                    interList.add(i)
                    if (seenList.isEmpty()) break
                }
            }
        }
    

        return interList.toIntArray()
    }
}