class Solution {
    val root = TrieNode()

    fun longestCommonPrefix(strs: Array<String>): String {
        for (word in strs) {
            this.addWord(word)
        }

        return this.findPrefix(strs.size)
    }

    fun addWord(word: String) {
        var curr = this.root

        for (char in word) {
            curr.length++
            val nextNode = curr.children.find { it.value == char }

            if (nextNode == null) {
                val newNode = TrieNode(char)
                curr.children.add(newNode)
                curr = newNode
            } else {
                curr = nextNode
            }
        }
    }

    fun findPrefix(size: Int): String {
        val sb = StringBuilder()
        var curr = this.root

        while (curr.children.size == 1 && curr.length == size) {
            curr = curr.children[0]
            sb.append(curr.value)
        }

        return sb.toString()
    }
}

data class TrieNode (
    val value: Char = '~',
    val children: MutableList<TrieNode> = mutableListOf<TrieNode>(),
    var length: Int = 0
)
