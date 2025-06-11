class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        /* var leftCount = nums.size
        val goodDeque = ArrayDeque<Int>()
        val badDeque = ArrayDeque<Int>()

        for (i in nums.indices) {
            if(nums[i] != `val`) {
                goodDeque.add(nums[i])
            } else {
                badDeque.add(i)
                leftCount--
            }
        }

        for (i in nums.indices) {
            if (badDeque.contains(i)) {
                nums[i] = goodDeque.removeLastOrNull() ?: 0
            }
        }

        return leftCount*/
        
        // Second method
        var k = 0 // Pointer for the position to store elements not equal to `val`

        for (i in nums.indices) {
            // Only move elements that are not equal to `val`
            if (nums[i] != `val`) {
                nums[k] = nums[i] // Move the valid element to the `k`-th position
                k++
            }
        }

        return k // Return the count of elements not equal to `val`
    }
}