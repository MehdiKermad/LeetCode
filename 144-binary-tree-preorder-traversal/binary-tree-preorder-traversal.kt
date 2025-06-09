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
    fun preorderTraversal(root: TreeNode?): List<Int> {
        // This time the priority goes current/left/right
        return exploreNode(root)
    }

    private fun exploreNode(root: TreeNode?): List<Int> {
        val finalList = mutableListOf<Int>()

        if (root == null) return finalList

        // We add the current node first
        finalList.add(root?.`val`!!)

        // We explore the left node then
        root?.left?.let {
            finalList.addAll(exploreNode(it))
        }

        // Then the right one
        root?.right?.let {
            finalList.addAll(exploreNode(it))
        }

        return finalList
    }
}