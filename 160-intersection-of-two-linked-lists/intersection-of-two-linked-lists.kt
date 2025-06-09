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
        val seenSet = mutableMapOf<Int, ListNode>()
        var ptrA = headA
        var ptrB = headB

        while (ptrA != null || ptrB != null) {
            // If the both currents are the same, we can directly return it
            if (ptrA == ptrB) {
                return ptrA
            }

            // If not, we save what we saw in both list
            ptrA?.let {
                if (!seenSet.contains(System.identityHashCode(it))) {
                    seenSet[System.identityHashCode(it)] = it
                } else {
                    return it
                }
            }
            
            ptrB?.let {
                if (!seenSet.contains(System.identityHashCode(it))) {
                    seenSet[System.identityHashCode(it)] = it
                } else {
                    return it
                }
            }

            ptrA = ptrA?.next
            ptrB = ptrB?.next
        }
        return null
    }
}