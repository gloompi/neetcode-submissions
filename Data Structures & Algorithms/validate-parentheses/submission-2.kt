class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val braces = mapOf(
            ')' to '(',
            '}' to '{',
            ']' to '['
        )

        for (c in s) {
            when (c) {
                '(', '{', '[' -> stack.addLast(c)
                else -> {
                    if (stack.size == 0 || stack.removeLast() != braces[c]) return false
                }
            }
        }

        return stack.size == 0
    }
}
