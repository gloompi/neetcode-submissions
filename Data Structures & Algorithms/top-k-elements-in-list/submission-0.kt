import java.util.PriorityQueue

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var res = mutableListOf<Int>()
        val heap = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.second })
        nums.toList().groupingBy { it }.eachCount().forEach { (key, value) -> heap.add(key to value) }

        for (i in 0..<k) {
            res.add(heap.poll().first)
        }

        return res.toIntArray()
    }
}
