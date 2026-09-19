class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        val ans = IntArray(arr.size) { -1 }

        for (i in arr.lastIndex - 1 downTo 0) {
            ans[i] = maxOf(ans[i + 1], arr[i + 1])
        }

        return ans
    }
}
