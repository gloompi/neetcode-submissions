class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var write = 1

        for (read in 1 until nums.size) {
            if (nums[read] != nums[read-1]) {
                nums[write++] = nums[read]
            }
        }

        return write
    }
}
