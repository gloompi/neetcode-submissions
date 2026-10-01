class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.lastIndex

        while (l <= r) {
            val pivot = (l + r) shr 1

            if (nums[pivot] < target) {
                l = pivot + 1
            } else if (nums[pivot] > target) {
                r = pivot - 1
            } else {
                return pivot
            }
        }

        return -1
    }
}
