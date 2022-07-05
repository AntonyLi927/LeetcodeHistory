package Leetcode;

import java.util.List;

public class Leetcode120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.get(triangle.size()).size()];
        dp[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j < triangle.get(i).size(); j++) {
                dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
            }
            dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);
        }

        int res = dp[triangle.size() - 1][0];
        for (int i = 1; i < triangle.get(triangle.size()).size(); i++) {
            res = Math.min(res, dp[triangle.size() - 1][i]);
        }

        return res;
    }
}
