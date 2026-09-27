class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val sb = StringBuilder()
        var p1 = 0
        var p2 = 0

        while (p1 < word1.length && p2 < word2.length) {
            sb.append(word1[p1])
            sb.append(word2[p2])
            p1++
            p2++
        }

        while (p1 < word1.length) {
            sb.append(word1[p1])
            p1++
        }

        while (p2 < word2.length) {
            sb.append(word2[p2])
            p2++
        }

        return sb.toString()
    }
}
