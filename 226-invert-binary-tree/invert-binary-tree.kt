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
    fun invertTree(root: TreeNode?): TreeNode? {
        // Check first if the node exists
        if (root == null) return null

        var tempRight: TreeNode? = null
        var tempLeft: TreeNode? = null

        root?.left?.let {
            // If we can dive deeper, we call the function recursively
            tempLeft = invertTree(it)
        }
        root?.right?.let {
            // If we can dive deeper, we call the function recursively
            tempRight = invertTree(it)
        }

        // We swap the two nodes
        root?.left = tempRight
        root?.right = tempLeft

        return root
    }
}