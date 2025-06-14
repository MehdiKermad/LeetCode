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
    fun isPalindrome(head: ListNode?): Boolean {

        // If there is one or no element, it's a palindrome
        if (head == null || head?.next == null) return true

        val list = mutableListOf<Int>()
        var currentNode = head

        while (currentNode != null) {
            list.add(currentNode?.`val`!!)
            currentNode = currentNode?.next
        }

        return list == list.reversed()
    }
}