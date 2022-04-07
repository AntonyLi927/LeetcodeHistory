package Leetcode;

public class Leetcode746 {
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        if (cost.length < 2) return cost[0];
        dp[0] = 0;
        dp[1] = cost[0];
        dp[2] = cost[1];
        for (int i = 3; i <= cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 1]);
        }
        return Math.min(dp[cost.length], dp[cost.length - 1]);
    }

    public static void main(String[] args) {
        minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1});
    }
}
