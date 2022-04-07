package Leetcode;

public class Leetcode5253 {
    public long[] kthPalindrome(int[] queries, int intLength) {
        long[] res = new long[queries.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = -1;
        }
        int index = 0;
        int count = 0;
        for (long i = (long) Math.pow(10, intLength - 1); i < (long) Math.pow(10, intLength); i++) {
            if (index >= queries.length) break;
            if (checkPalindrome(i)) count++;
            if (checkPalindrome(i) && count == queries[index]) {
                res[index] = i;
                index++;
            }
        }
        return res;
    }
    public boolean checkPalindrome(Long num) {
        String s = String.valueOf(num);
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else return false;
        }
        return true;
    }
}
