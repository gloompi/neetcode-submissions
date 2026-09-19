class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var i = 0
        var minSize = strs[0].length

        for (str in strs) {
            minSize = minOf(minSize, str.length)
        }

        while (i < minSize && strs.all { str -> str[i] == strs[0][i] }) {
            i++
        }

        return strs[0].slice(0..<i)
    }
}
