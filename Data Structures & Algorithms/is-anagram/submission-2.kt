class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sCounts = s.groupingBy { it }.eachCount();
        val tCounts = t.groupingBy { it }.eachCount();
        return sCounts == tCounts;
    }
}
