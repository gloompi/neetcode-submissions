class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val left = IntArray(n + 1) { 1 }
        val right = IntArray(n + 1) { 1 }
        val res = IntArray(n)

        for (i in nums.indices) {
            left[i + 1] = nums[i] * left[i]
            right[n - i - 1] = nums[n - i - 1] * right[n - i]
        }

        for (i in nums.indices) {
            res[i] = left[i] * right[i + 1]
        }

        return res
    }
}
