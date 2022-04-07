package Leetcode;

public class Leetcode338 {
    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        int highBit = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0){
                highBit = i;
            }
            dp[i] = dp[i - highBit] + 1;
        }
        return dp;
    }

    public static void main(String[] args) {
        countBits(2);
    }
}
