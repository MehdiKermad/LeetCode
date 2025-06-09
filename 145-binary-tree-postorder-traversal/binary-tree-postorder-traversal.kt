/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        // This time the priority goes left/right/current
        return exploreNode(root)
    }

    private fun exploreNode(root: TreeNode?): List<Int> {
        val finalList = mutableListOf<Int>()

        if (root == null) return finalList

        // We explore the left node then
        root?.left?.let {
            finalList.addAll(exploreNode(it))
        }

        // Then the right one
        root?.right?.let {
            finalList.addAll(exploreNode(it))
        }

        // And add the current node last
        finalList.add(root?.`val`!!)

        return finalList
    }
}