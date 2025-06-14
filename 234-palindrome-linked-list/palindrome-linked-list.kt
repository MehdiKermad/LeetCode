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

        val deque = mutableListOf<Int>()
        //val reversedDeque = mutableListOf<Int>()
        var currentNode = head

        while (currentNode != null) {
            /* if (currentNode?.`val` == deque.lastOrNull()) {
                println("On retire " + currentNode?.`val` + " de " + deque.toString())
                deque.removeLast()
            } else {
                println("On ajoute " + currentNode?.`val` + " a " + deque.toString())
                deque.add(currentNode?.`val`!!)
            }*/
            deque.add(currentNode?.`val`!!)
            //reversedDeque.add(0, currentNode?.`val`!!)
            currentNode = currentNode?.next
        }

        return deque == deque.reversed()
    }
}