/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val stack = ArrayDeque<TreeNode>()
        val res = mutableListOf<Int>()

        var current = root

        while (current != null || stack.isNotEmpty()) {
            while (current != null) {
                stack.addLast(current)
                current = current.left
            }

            val node = stack.removeLast()
            res.add(node.`val`)

            current = node.right
        }

        return res
    }
}
