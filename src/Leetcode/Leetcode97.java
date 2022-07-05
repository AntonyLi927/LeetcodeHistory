package Leetcode;

public class Leetcode97 {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();
        if (s3.length() != m + n) {
            return false;
        }

        boolean f[][] = new boolean[n + 1][m + 1];
        f[0][0] = true;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                int p = i + j - 1;
                if (i > 0) f[i][j] = f[i][j] || (s1.charAt(i - 1) == s3.charAt(p) && f[i - 1][j]);
                if (j > 0) f[i][j] = f[i][j] || (s2.charAt(j - 1) == s3.charAt(p) && f[i][j - 1]);
            }
        }
        return f[n][m];
    }
}
