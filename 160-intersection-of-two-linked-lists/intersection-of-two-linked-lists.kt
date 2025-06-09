/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        val seenSet = mutableSetOf<ListNode>()
        var ptrA = headA
        var ptrB = headB

        while (ptrA != null || ptrB != null) {
            // If the both currents are the same, we can directly return it
            if (ptrA == ptrB) {
                return ptrA
            }

            // If not, we save what we saw in both list
            ptrA?.let {
                if (!seenSet.contains(ptrA)) {
                    seenSet.add(ptrA)
                } else {
                    return ptrA
                }
            }
            
            ptrB?.let {
                if (!seenSet.contains(ptrB)) {
                    seenSet.add(ptrB)
                } else {
                    return ptrB
                }
            }


            ptrA = ptrA?.next
            ptrB = ptrB?.next
        }
        return null
    }
}