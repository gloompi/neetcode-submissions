class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val seen = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            if (nums[i] in seen && abs(i - seen.getOrDefault(nums[i], 0)) <= k) {
                return true
            }

            seen[nums[i]] = i
        }

        return false
    }
}
