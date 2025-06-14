class Solution {
    fun summaryRanges(nums: IntArray): List<String> {

        // If it's empty, we return an empty list
        if (nums.isEmpty()) return listOf()

        val rangesList = mutableListOf<String>()
        var firstElement = nums[0]
        var lastElement: Int? = null

        for (i in 1 until nums.size) {
            val diff = Math.abs(nums[i] - nums[i-1])
            if (diff == 1) {
                // If the difference between n - n-1 = 1, it's the same range
                lastElement = nums[i]
            } else if (diff != 1 && lastElement == null) {
                // Case where we start with an isolated number
                rangesList.add(firstElement.toString())
                firstElement = nums[i]
            } else {
                // Case where the range breaks
                rangesList.add("" + firstElement + "->" + nums[i-1])
                firstElement = nums[i]
                lastElement = null
            }
        }

        // Checking on the last element
        if (lastElement != null) {
            // Ranges case
            rangesList.add("" + firstElement + "->" + lastElement)
        } else {
            // Isolated number
            rangesList.add(firstElement.toString())
        }

        return rangesList
    }
}