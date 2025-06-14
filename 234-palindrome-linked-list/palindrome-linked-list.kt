class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        val stack = ArrayList<ListNode?>()

        var node: ListNode? = head
        stack.add(node)
        while (node != null) {
            val next = node.next
            stack.add(next)
            node = next
        }
        stack.removeAt(stack.size - 1)

        node = head
        val min = stack.size shr 1
        while (stack.size > min) {
            if (node?.`val` != stack.removeAt(stack.size - 1)?.`val`) return false
            node = node?.next
        }
        return true
    }
}