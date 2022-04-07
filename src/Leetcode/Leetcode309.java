package Leetcode;

public class Leetcode309 {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int[][] f = new int[prices.length][3];
        f[0][0] = - prices[0];

        for (int i = 1; i < prices.length; i++) {
            f[i][0] = Math.max(f[i - 1][0], f[i - 1][2] - prices[i]); //当前持有股票
            f[i][1] = f[i - 1][0] + prices[i]; //当前不持有股票，且下一天不能进行任何操作
            f[i][2] = Math.max(f[i - 1][1], f[i - 1][2]); // 当天不持有股票，下一天没有任何限制
        }

        return Math.max(f[prices.length - 1][1], f[prices.length - 1][2]);
    }
}
