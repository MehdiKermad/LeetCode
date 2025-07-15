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
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        var total = 0

        // We handle the null case
        if (root == null) return 0

        // If the left node has no left/right children, it's a leaf to count
        if (root?.left?.left == null && root?.left?.right == null) {
            total += root?.left?.`val` ?: 0
        }

        // We explore children nodes to get their leaves values
        root?.left?.let {
            total += sumOfLeftLeaves(it)
        }
        root?.right?.let {
            total += sumOfLeftLeaves(it)
        }

        return total
    }
}