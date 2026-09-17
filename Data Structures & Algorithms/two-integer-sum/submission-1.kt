class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val num = nums[i]
            val previousIndex = seen[target - num]

            if (previousIndex != null) {
                return intArrayOf(previousIndex, i)
            }

            seen[num] = i
        }

        error("No solution")
    }
}
