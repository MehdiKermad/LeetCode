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
            var cpt = 0
            while (seenList.isNotEmpty() && cpt < nums2.size) {
                if (seenList.contains(nums2[cpt])) {
                    seenList.remove(nums2[cpt])
                    interList.add(nums2[cpt])
                }
                cpt++
            }
        } else {
            // We build a list of seen values
            nums2.forEach {
                seenList.add(it)
            }

            // Then we look at each value to determine which one is common
            var cpt = 0
            while (seenList.isNotEmpty() && cpt < nums1.size) {
                if (seenList.contains(nums1[cpt])) {
                    seenList.remove(nums1[cpt])
                    interList.add(nums1[cpt])
                }
                cpt++
            }
        }
    

        return interList.toIntArray()
    }
}