class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val seen = mutableSetOf<Int>()
        var longest = 0

        for (num in nums) {
            seen.add(num)
        }

        for (num in nums) {
            if (!seen.contains(num - 1)) {
                var length = 1
                while (seen.contains(num + length)) {
                    length++
                }
                longest = max(longest, length)
            }
        }

        return longest
    }
}
