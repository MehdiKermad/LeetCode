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
        /*// First method
        val seenSet = mutableSetOf<Int>()
        var currentNode = head
        while (currentNode != null) {
            if (seenSet.contains(System.identityHashCode(currentNode!!))) {
                return true
            } else {
                seenSet.add(System.identityHashCode(currentNode!!))
            }
            currentNode = currentNode?.next
        }
        return false*/

        // Second method: Floyd's tortoise & hare
        var tortoise = head // Move by one step
        var hare = head?.next // Move by two steps

        // If hare is null, it means we reached the end and there is no loop
        while (hare?.next != null) {
            if (tortoise == hare) {
                return true
            }

            tortoise = tortoise?.next // Move by one step
            hare = hare?.next?.next // Move by two steps
        }

        return false
    }
}