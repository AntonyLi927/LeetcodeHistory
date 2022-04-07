package Leetcode;

public class LC5 {
    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        int maxLength = 1;
        int begin = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++){
            dp[i][i] = true;
        }

        for (int l = 2; l <= s.length(); l++){
            for (int i = 0; i < s.length(); i++) {
                int j = i + l - 1;
                if (j >= s.length()) break;

                if (s.charAt(i) != s.charAt(j)){
                    dp[i][j] = false;
                }

                else {
                    if (j - i < 3){
                        dp[i][j] = true;
                    }
                    else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 >= maxLength){
                    maxLength = j - i + 1;
                    begin = i;
                }
            }
        }

        return s.substring(begin, begin + maxLength);
    }
}
