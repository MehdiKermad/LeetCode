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
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        // First step is to identify a leaf
        // On a crosspath, we have to give the current count and reach to a leaf
        return isLeaf(root, targetSum)
    }

    private fun isLeaf(root: TreeNode?, sum: Int): Boolean {

        if (root == null) return false

        val currentSum = sum - (root?.`val` ?: 0)
        var leftPathHasSum = false
        var rightPathHasSum = false

        if (root?.left == null && root?.right == null) {
            // If it's a leaf, we check if it completes the sum
            return currentSum == 0
        } else {
            // If it's a cross path, we look deeper
            return isLeaf(root?.left, currentSum) || isLeaf(root?.right, currentSum)
        }
    }
}