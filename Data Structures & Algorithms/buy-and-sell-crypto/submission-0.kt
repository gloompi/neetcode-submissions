class Solution {
    fun maxProfit(prices: IntArray): Int {
        var best = 0
        var minimum = prices[0]

        for (price in prices) {
            best = maxOf(best, price - minimum)
            minimum = minOf(price, minimum)
        }

        return best
    }
}
