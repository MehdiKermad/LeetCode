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
    fun minDepth(root: TreeNode?): Int {
        return measureDepth(root, 1)
    }

    private fun measureDepth(root: TreeNode?, level: Int): Int {
        var shallowestLeft = level
        var shallowestRight = level
        
        // We have to ignore the count when a direction doesn't have a child
        if (root == null) {
            return level - 1
        } else if (root?.left != null && root?.right != null) {
            // Case with two child
            shallowestLeft = measureDepth(root?.left!!, level + 1)
            shallowestRight = measureDepth(root?.right!!, level + 1)
        } else if (root?.left != null) {
            // Case with only a left node
            shallowestLeft = measureDepth(root?.left!!, level + 1)
            shallowestRight = Int.MAX_VALUE
        } else if (root?.right != null) {
            // Case with only a right node
            shallowestRight = measureDepth(root?.right!!, level + 1)
            shallowestLeft = Int.MAX_VALUE
        }

        // Returning the shallowest level found
        return minOf(shallowestLeft, shallowestRight)
    }
}