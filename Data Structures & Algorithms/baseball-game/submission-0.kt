class Solution {
    fun calPoints(operations: Array<String>): Int {
        var res = mutableListOf<Int>()
        var i = 0

        for (op in operations) {
            when (op) {
                "+" -> res.size >= 2 && res.add(res.last() + res[res.lastIndex - 1])
                "D" -> res.add(res.last() * 2)
                "C" -> res.removeLast()
                else -> res.add(op.toInt())
            }
        }

        return res.sum()
    }
}
