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
    fun hasCycle(head: ListNode?): Boolean {
        val seenSet = mutableSetOf<ListNode?>()

        var currentNode = head
        while (currentNode != null) {
            if (seenSet.contains(currentNode!!)) {
                return true
            } else {
                seenSet.add(currentNode!!)
            }
            currentNode = currentNode?.next
        }
        return false
    }
}