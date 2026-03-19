package com.lovebabbar.dsa.array;

public class MaxProfitWith2Transactions {

    public static void main(String[] args) {
        int[] prices = {10, 22, 5, 75, 65, 80};
        int maxProfit = maxProfit(prices);
        System.out.println("Max Profit: " + maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int firstBuy = prices[0];
        int secondBuy = prices[0];
        int firstSell = 0;
        int secondSell = 0;
        for (int i = 1; i < prices.length; i++) {
            firstBuy = Math.min(firstBuy, prices[i]);
            firstSell = Math.max(firstSell, prices[i] - firstBuy);

            secondBuy = Math.min(secondBuy, prices[i] - firstSell);
            secondSell = Math.max(secondSell, prices[i] - secondBuy);
        }
        return secondSell;
    }
}
