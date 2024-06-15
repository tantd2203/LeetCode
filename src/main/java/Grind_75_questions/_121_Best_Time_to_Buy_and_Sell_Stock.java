package Grind_75_questions;

public class _121_Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {

        int sell = 1;
        int buy = 0;
        int profitMax = 0;


        while (sell < prices.length) {

            if (prices[buy] >= prices[sell]) {
                buy = sell;
            } else {
                int profit = prices[sell] - prices[buy];
                profitMax = Math.max(profitMax, profit);
            }
            sell++;
        }

        return profitMax;
    }

    public static void main(String[] args) {
        int a[] = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(a));
    }
}
/*
 *  bai nay tim khoang gia tri lon nhat trong mang va DK la So Bat dau phai lon hon co ket thuc
 *  vi tri bat dau  = buy va ket thuc = sell
 *
 * */