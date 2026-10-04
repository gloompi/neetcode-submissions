class Solution {
    fun mySqrt(x: Int): Int {
        if (x < 2) {
            return x
        }

        var l = 1
        var r = x / 2

        while (l <= r) {
            val mid = l + (r - l) / 2
            val square = mid.toLong() * mid

            when {
                square < x -> l = mid + 1
                square > x -> r = mid - 1
                else -> return mid
            }
        }

        return r
    }
}
