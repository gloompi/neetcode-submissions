class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freq = Array(nums.size) { mutableListOf<Int>() }

        nums.toList().groupingBy { it }.eachCount().forEach { (num, count) -> freq[count-1].add(num) }

        var filled = 0
        val res = mutableListOf<Int>()

        for (bucket in freq.reversed()) {
            for (num in bucket) {
                res.add(num)

                if (res.size == k) {
                    return res.toIntArray()
                }
            }
        }

        return res.toIntArray()
    }
}
