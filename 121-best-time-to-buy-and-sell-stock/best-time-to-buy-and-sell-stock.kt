class Solution {
    //Time complexity: O(n)
    //Space complexity: O(1)
    fun maxProfit(prices: IntArray): Int {
        var buy = 0
        var sell = 1
        var max_profit = 0

        while(sell < prices.size) {
            if (prices[buy] < prices[sell]) {
                var profit = prices[sell] - prices[buy]
                max_profit = maxOf(max_profit, profit)
            } else {
                buy = sell
            }
            sell++
        }
        return max_profit
    }
}