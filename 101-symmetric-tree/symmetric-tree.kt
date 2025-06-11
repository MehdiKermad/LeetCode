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
    fun isSymmetric(root: TreeNode?): Boolean {
        return compareNode(root?.left, root?.right)
    }

    private fun compareNode(leftNode: TreeNode?, rightNode: TreeNode?): Boolean {
        // Handle the deepest level
        if (leftNode == null || rightNode == null) return  leftNode == rightNode

        // Compare the current value of both nodes
        if (leftNode?.`val` != rightNode?.`val`) return false

        return compareNode(leftNode?.left, rightNode?.right) && compareNode(leftNode?.right, rightNode?.left)
    }
}