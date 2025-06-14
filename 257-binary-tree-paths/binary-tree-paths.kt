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
    fun binaryTreePaths(root: TreeNode?): List<String> {
        // If it's a null node we return an empty list
        if (root == null) {
            return listOf()
        }
        
        // If it's a leaf we return directly the value of it
        if (root?.left == null && root?.right == null) {
            return listOf("${root?.`val`}")
        }

        // We get the current node
        val finalList = mutableListOf<String>()
        val currentPath = "${root?.`val`}->"

        root?.left?.let {
            binaryTreePaths(it).forEach { path ->
                finalList.add(currentPath + path)
            }
        }
        
        root?.right?.let {
            binaryTreePaths(it).forEach { path ->
                finalList.add(currentPath + path)
            }
        }
        
        return finalList
    }
}