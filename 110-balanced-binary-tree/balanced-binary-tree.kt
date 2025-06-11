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
    fun isBalanced(root: TreeNode?): Boolean {
        // The logic appplied to the root node has to be applicable to other nodes
        return measureDepth(root, 0) > -1
    }

    fun measureDepth(root: TreeNode?, level: Int): Int {
        var deepestLeft = level
        var deepestRight = level

        // If we can go deeper we keep going
        root?.left?.let {
            measureDepth(it, level + 1)
            .takeIf { it > -1 }
            ?.let { deepestLeft = it }
            ?: run { return -1 }
        }
        root?.right?.let {
            measureDepth(it, level + 1)
            .takeIf { it > -1 }
            ?.let { deepestRight = it }
            ?: run { return -1 }
        }

        if (Math.abs(deepestLeft - deepestRight) > 1) {
            // If the difference is not respected , we return -1 as the violation value
            return -1
        } else {
            // Returning the deepest level found
            return maxOf(deepestLeft, deepestRight)
        }
    }
}