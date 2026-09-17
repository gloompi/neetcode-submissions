class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val num = nums[i]

            if (target - num in seen) {
                return listOf<Int>(seen[target - num] as Int, i).toIntArray()
            }

            seen[num] = i
        }

        return IntArray(2)
    }
}
