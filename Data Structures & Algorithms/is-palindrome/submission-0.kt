class Solution {
    fun isPalindrome(s: String): Boolean {
        val cleaned = s
            .filter { it.isLetterOrDigit() }
            .lowercase()
        var l = 0
        var r = cleaned.lastIndex

        while (l < r) {
            if (cleaned[l] != cleaned[r]) {
                return false
            }

            l++
            r--
        }

        return true
    }
}
