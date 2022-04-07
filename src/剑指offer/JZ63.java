package 剑指offer;

public class JZ63 {
    //暴力法
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i=0;i<prices.length;i++){
            for (int j=i;j<prices.length;j++){
                int profit = prices[j]-prices[i];
                if (profit>=max) max = profit;
            }
        }
        return max;
    }

    //动态规划
    public int maxProfit1(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++){
           min = Math.min(min,prices[i]);
           profit = Math.max(profit,prices[i]-min);
       }
        return profit;
    }

}
