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
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return when {
            p == null && q == null -> true
            p != null && q == null -> false
            p == null && q != null -> false
            else -> extractNode(p!!) == extractNode(q!!)
        }
    }

    private fun extractNode(root: TreeNode, level: Int = 0): List<String> {
        val nodeList = mutableListOf<String>()
        
        // Handle the left node first
        root.left?.let {
            // If there is a left node we explore it recursively and get the result
            nodeList.addAll(extractNode(it, level + 1))
        }
        
        nodeList.add(""+level+"#"+root.`val`) // Then get the current node value
        
        // Finish with the right node
        root.right?.let {
            // If there is a right node we explore it recursively and get the result
            nodeList.addAll(extractNode(it, level + 1))
        }
        
        return nodeList
    }
}