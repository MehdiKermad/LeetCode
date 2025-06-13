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
    fun reverseList(head: ListNode?): ListNode? {
        var reversedNode: ListNode? = null

        var currentNode = head
        while (currentNode != null) {
            val previousNode = reversedNode
            reversedNode = ListNode(currentNode?.`val`!!)
            reversedNode?.next = previousNode
            currentNode = currentNode?.next
        }

        return reversedNode
    }
}