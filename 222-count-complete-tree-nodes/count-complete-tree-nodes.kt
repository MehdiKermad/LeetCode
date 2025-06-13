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
    fun countNodes(root: TreeNode?): Int {
        // If the the current node is null, nothing more to explore down
        if (root == null) return 0

        var finalCount = 1 // We count the current node

        // If there is a left node, we explore it and get its count recursively
        root?.left?.let {
            finalCount += countNodes(it)
        }
        // Same thing for the right one
        root?.right?.let {
            finalCount += countNodes(it)
        }

        return finalCount
    }
}