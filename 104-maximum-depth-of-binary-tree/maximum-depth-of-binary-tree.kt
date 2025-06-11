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
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        return goDeeper(root)   
    }

    private fun goDeeper(root: TreeNode?, level: Int = 1): Int {
        var deepestLevel = level
        
        // Handle the left node first
        root?.left?.let {
            // If there is a left node we explore it recursively and get the result
            goDeeper(it, level + 1).takeIf { it > deepestLevel }?.let { deepestLevel = it }
        }
                
        // Finish with the right node
        root?.right?.let {
            // If there is a right node we explore it recursively and get the result
            goDeeper(it, level + 1).takeIf { it > deepestLevel }?.let { deepestLevel = it }
        }
        
        return deepestLevel
    }
}