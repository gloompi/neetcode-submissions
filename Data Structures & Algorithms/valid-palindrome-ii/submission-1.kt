class Solution {
    fun validPalindrome(s: String): Boolean {
        return this.dfs(s, 0, s.lastIndex, false)
    }

    fun dfs(s: String, l: Int, r: Int, skipped: Boolean): Boolean {
        if (l >= r) {
            return true
        }
        
        if (skipped && s[l] != s[r]) {
            return false
        }
        
        if (s[l] != s[r]) {
            return this.dfs(s, l + 1, r, true) || this.dfs(s, l, r - 1, true)
        }

        return this.dfs(s, l + 1, r - 1, skipped)
    }
}
