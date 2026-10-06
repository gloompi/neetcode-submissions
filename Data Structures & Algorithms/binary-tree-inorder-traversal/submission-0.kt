/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) {
            return listOf<Int>()
        }

        var queue = mutableListOf<TreeNode>(root)
        val res = mutableListOf<Int>()

        while (queue.size != 0) {
            val node = queue.last()
            val left = node.left

            if (left != null) {
                queue.add(left)
                node.left = null
            } else {
                res.add(node.`val`)
                queue.removeLast()

                val right = node.right

                if (right != null) {
                    queue.add(right)
                    node.right = null
                }
            }
        }

        return res
    }
}
