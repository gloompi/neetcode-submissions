class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val seen = nums.toSet()
        var longest = 0

        for (num in seen) {
            if (num - 1 !in seen) {
                var length = 1

                while (num + length in seen) {
                    length++
                }

                longest = maxOf(longest, length)
            }
        }

        return longest
    }
}
