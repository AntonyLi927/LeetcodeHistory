package Leetcode;

import java.util.Arrays;

public class Leetcode5219 {
    public int maximumCandies(int[] candies, long k) {

        long sum = 0;
        for (int i = 0; i < candies.length; i++) {
            sum += candies[i];
        }
        if (sum < k) return 0;
        long res = 0;
        long left = 1;
        long right = sum;
        while (left <= right) {
            long mid = (right - left) / 2 + left;
            if (check(mid, candies, k)) {
                left = mid + 1;
                res = mid;
            } else {
                right = mid - 1;
            }
        }
        return (int) res;
    }

    public boolean check(long num, int[] candies, long k) {
        for (int val : candies) {
            if (val < num) continue;
            else if (val == num) k--;
            else {
                k -= val / num;
            }
        }
        return k <= 0;
    }
}
