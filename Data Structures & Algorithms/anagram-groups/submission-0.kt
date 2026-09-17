class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groups = mutableMapOf<Map<Char, Int>, MutableList<String>>()
        
        for (curr in strs) {
            val key = curr.groupingBy { it }.eachCount()
            groups.getOrPut(key) { mutableListOf() }.add(curr)
        }
        
        return groups.values.toList()
    }
}
