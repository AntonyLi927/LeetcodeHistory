package Leetcode;

public class LC70 {
    public int climbStairs(int n) {
        if (n < 2) return 1;

        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= n; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n + 1];
    }
}