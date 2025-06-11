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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val finalList = mutableListOf<Int>()
        
        // Priority goes left/current/right
        root?.let {
            finalList.addAll(extractNode(root))
        }
        
        return finalList
    }

    private fun extractNode(root: TreeNode): List<Int> {
        val nodeList = mutableListOf<Int>()
        
        // Handle the left node first
        root.left?.let {
            // If there is a left node we explore it recursively and get the result
            nodeList.addAll(extractNode(it))
        }
        
        nodeList.add(root.`val`) // Then get the current node value
        
        // Finish with the right node
        root.right?.let {
            // If there is a right node we explore it recursively and get the result
            nodeList.addAll(extractNode(it))
        }
        
        return nodeList
    }
}