class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = mutableMapOf<Int, Boolean>();

        for (num in nums) {
            if (seen.contains(num)) {
                return true;
            }

            seen.put(num, true);
        }

        return false;
    }
}
