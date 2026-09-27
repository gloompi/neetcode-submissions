class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var l = 0
        var r = 0

        while (r < nums.size) {
            if (nums[r] != nums[l]) {
                l++
                nums[l] = nums[r]
            }
            r++
        }

        return l + 1
    }
}
