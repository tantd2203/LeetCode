package Array;

public class _121_Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        int sell = 1;

        while (sell < prices.length) {
            if (prices[buy] >= prices[sell]) {
                buy = sell; // update index of buy and sell buy = 1 and sell = 1
            } else {
                int potentialProfit = prices[sell] - prices[buy]; //  curr profit of index
                profit = Math.max(potentialProfit, profit);
            }
            sell++;
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices)); // Output: 5 (Buy at 1, sell at 6)
    }
}
