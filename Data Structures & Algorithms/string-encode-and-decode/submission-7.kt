class Solution {
    fun encode(strs: List<String>): String {
        val sb = StringBuilder()
        strs.forEach { it -> sb.append("${it.length}#$it") }
        return sb.toString()
    }

    fun decode(str: String): List<String> {
        val res = mutableListOf<String>()
        var currIndex = 0

        while (currIndex < str.length - 1) {
            val (start, end) = this.findNextWord(str, currIndex)
            res.add(str.substring(start, end))
            currIndex = end
        }

        return res
    }

    fun findNextWord(str: String, start: Int): Pair<Int, Int> {
        var end = start + 1
        
        while (end < str.length && str[end] != '#') {
            end++
        }

        val length = str.substring(start, end).toInt()
        val wordStart = end + 1
        val wordEnd = wordStart + length

        return wordStart to wordEnd
    }
}
