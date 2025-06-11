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
    fun deleteDuplicates(head: ListNode?): ListNode? {

        if (head?.next == null) return head
         
        var current = head
        var nextNode = head?.next
        
        while (current != null) {
            
            while (current?.`val` == current?.next?.`val`) {
                // If the next node contains the same value, we skip it to the next value
                current?.next = current?.next?.next
            }
            current = current.next // We dive deeper in the node
        }
        
        return head
    }
}