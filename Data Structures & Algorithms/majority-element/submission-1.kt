class Solution {
    fun majorityElement(nums: IntArray): Int {
        val counts = nums
            .toList()
            .groupingBy { it }
            .eachCount()
        
        var major = nums[0] to counts[nums[0]]

        for ((num, freq) in counts) {
            if (freq > major.second!!) {
                major = num to freq
            }
        }

        return major.first
    }
}
