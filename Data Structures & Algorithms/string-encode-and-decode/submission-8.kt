class Solution {
    fun encode(strs: List<String>): String = buildString {
        for (str in strs) {
            append(str.length)
            append('#')
            append(str)
        }
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0

        while (i < str.length) {
            val separator = str.indexOf('#', i)
            val length = str.substring(i, separator).toInt()

            val start = separator + 1
            val end = start + length

            result.add(str.substring(start, end))
            i = end
        }

        return result
    }
}
