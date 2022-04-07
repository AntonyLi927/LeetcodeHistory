package Leetcode;

public class LC494 {


    /**
     * sum - neg - neg = target
     * sum - 2 * neg = target
     * neg = (sum - target) / 2
     *
     */
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i <nums.length; i++){
            sum += nums[i];
        }
        int neg = (sum - target) / 2;
        if (neg < 0 || (sum - target) % 2 != 0){
            return 0;
        }

        int[][] dp = new int[nums.length + 1][neg + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= nums.length; i++){
            for (int j = 0; j <= neg; j++){
                dp[i][j] += dp[i - 1][j];
                if (nums[i - 1] <= j){
                    dp[i][j] += dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        return dp[nums.length][neg];
    }


    /**
     * 能看见  
     * 看不见
     */




}
