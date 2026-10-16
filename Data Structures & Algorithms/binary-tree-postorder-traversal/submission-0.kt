/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val res = mutableListOf<Int>()

        fun dfs(node: TreeNode?) {
            if (node == null) {
                return
            }

            if (node.left == null && node.right == null) {
                res.add(node.`val`)
                return
            }

            dfs(node.left)
            dfs(node.right)

            res.add(node.`val`)
        }

        dfs(root)

        return res
    }
}
