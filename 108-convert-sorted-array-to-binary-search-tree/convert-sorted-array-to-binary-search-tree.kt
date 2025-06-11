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
fun sortedArrayToBST(nums: IntArray): TreeNode? {
    val middle = nums.size / 2
    val currentVal = nums[middle]
    val treeNode = TreeNode(currentVal)
    
    nums.getOrNull(middle - 1)?.let {
        treeNode.left = sortedArrayToBST(nums.sliceArray(0..middle - 1))
    }
    nums.getOrNull(middle + 1)?.let {
        treeNode.right = sortedArrayToBST(nums.sliceArray(middle + 1..nums.size - 1))
    }
    
    return treeNode
}
}