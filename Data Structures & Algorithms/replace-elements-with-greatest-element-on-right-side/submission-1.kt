class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var maxRight = -1

        for (i in arr.lastIndex downTo 0) {
            val curr = arr[i]
            arr[i] = maxRight
            maxRight = maxOf(curr, maxRight)
        }

        return arr
    }
}
