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
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {

        // Exploring the listNode
        var currentNode = head
        while (currentNode?.`val` != null) {
            // We skip each node that contains the target value
            while (currentNode?.next?.`val` == `val`) {
                currentNode?.next = currentNode?.next?.next
            }
            currentNode = currentNode?.next
        }

        // If root node contains the target value, we directly return the next node
        return if (head?.`val` == `val`) {
            head?.next
        } else {
            head
        }
    }
}