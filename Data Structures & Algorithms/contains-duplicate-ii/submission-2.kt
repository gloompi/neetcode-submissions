class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val seen = mutableSetOf<Int>()

        for (i in nums.indices) {
            if (nums[i] in seen) {
                return true
            }

            seen.add(nums[i])

            if (seen.size > k) {
                seen.remove(nums[i - k])
            }
        }

        return false
    }
}
