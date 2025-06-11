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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var firstListPos: ListNode? = list1
        var secondListPos: ListNode? = list2

        // Initializing the finalNode
        var finalList: ListNode? = null
        val firstDeque = ArrayDeque<Int>()
        val secondDeque = ArrayDeque<Int>()

        while (firstListPos != null) {
            firstDeque.addLast(firstListPos.`val`)
            firstListPos = firstListPos.next
        }

        while (secondListPos != null) {
            secondDeque.addLast(secondListPos.`val`)
            secondListPos = secondListPos.next
        }

        while (firstDeque.isNotEmpty() || secondDeque.isNotEmpty()) {
            val firstVal = firstDeque.lastOrNull()
            val secondVal = secondDeque.lastOrNull()

            if (firstVal != null && secondVal != null) {
                if (firstVal > secondVal) {
                    finalList = ListNode(firstDeque.removeLast(), finalList)
                } else {
                    finalList = ListNode(secondDeque.removeLast(), finalList)
                }
            } else {
                finalList = ListNode(
                    firstDeque.removeLastOrNull() ?: secondDeque.removeLastOrNull() ?: 0,
                    finalList
                )
            }
        }

        return finalList
    }
}