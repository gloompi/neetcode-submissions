/**
 * Definition for a binary tree 
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val res = mutableListOf<Int>()
        val stack = ArrayDeque<TreeNode>()
        var current = root

        while (current != null || stack.size > 0) {
            while (current != null) {
                stack.addLast(current)
                res.add(current.`val`)
                current = current.left
            }

            val node = stack.removeLast()
            if (node.right != null) {
                current = node.right
            }
        }

        return res
    }
}
