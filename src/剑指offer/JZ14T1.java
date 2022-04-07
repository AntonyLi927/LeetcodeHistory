package 剑指offer;

public class JZ14T1 {
    public static int cuttingRope(int n) {
        int dp[] = new int[n+1];
        dp[2] = 1;
        for (int i=3;i<=n;i++){
            for (int j=2;j<i;j++){
                dp[i] = Math.max(dp[i],Math.max(j*(i-j),(j*dp[i-j])));
                dp[i] = dp[i]%1000000007;
            }
        }
        return dp[n];
    }
}
