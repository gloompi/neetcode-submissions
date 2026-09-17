class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freq = Array(nums.size + 1) { mutableListOf<Int>() }

        nums.toList().groupingBy { it }.eachCount().forEach { (num, count) -> freq[count].add(num) }

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
