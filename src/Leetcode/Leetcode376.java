package Leetcode;

public class Leetcode376 {
    public int wiggleMaxLength(int[] nums) {
        int[][] dp = new int[nums.length][2];
        dp[0][0] = dp[0][1] = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i][0] = dp[i - 1][0];
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + 1);
            } else if (nums[i] < nums[i - 1]) {
                dp[i][1] = dp[i - 1][1];
                dp[i][0] = Math.max(dp[i - 1][1] + 1, dp[i - 1][0]);
            } else {
                dp[i][0] = dp[i - 1][0];
                dp[i][1] = dp[i - 1][1];
            }
        }
        return Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
    }


    public int wiggleMaxLength1(int[] nums) {
        if (nums.length < 2) return 1;
        int prevDiff = nums[1] - nums[0];
        int curDiff = 0;
        int res = 1;
        for (int i = 2; i < nums.length; i++) {
            curDiff = nums[i] - nums[i - 1];
            if ((curDiff > 0 && prevDiff < 0) || (curDiff < 0 && prevDiff > 0)){
                res++;
                prevDiff = curDiff;
            }
        }
        return res + 1;
    }
}
