class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val seen = nums.toSet()
        var longest = 0

        for (num in seen) {
            if (!seen.contains(num - 1)) {
                var length = 1
                while (seen.contains(num + length)) {
                    length++
                }
                longest = maxOf(longest, length)
            }
        }

        return longest
    }
}
