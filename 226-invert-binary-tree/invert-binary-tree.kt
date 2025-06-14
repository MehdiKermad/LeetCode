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

        // We swap nodes and if we can dive deeper, we call the function recursively
        val tempNode = invertTree(root?.right)
        root?.right = invertTree(root?.left)
        root?.left = tempNode

        return root
    }
}