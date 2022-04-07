package Leetcode;

public class Leetcode279 {
    public int numSquares(int n) {
        int a = 1;
        int[] dp = new int[n + 1];

        for (int i = 1 ; i <= n; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i * i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int temp = i * i;
                if (j - temp >= 0) dp[j] = Math.min(dp[j], dp[j - temp] + 1);
            }
        }
        return dp[n];
    }
}
