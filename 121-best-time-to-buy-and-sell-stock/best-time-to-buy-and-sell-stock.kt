class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minBuy = Int.MAX_VALUE
        var maxSell = 0

        for (p in prices) {
            // If we find a better buying day
            if (p < minBuy) {
                // We save the best profit we have and reset the selling day
                if (maxSell > 0) {
                    maxSell = 0
                }
                minBuy = p
                continue
            }
            
            // If we find a better selling day
            if (p > maxSell) {
                maxSell = p
                // We check the profit is better than the previous one if we had one
                if (maxProfit < (p - minBuy)) {
                    maxProfit = maxSell - minBuy
                }
            }
        }
        return maxProfit
    }
}