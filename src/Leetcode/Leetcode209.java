package Leetcode;

public class Leetcode209 {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        while (r < nums.length) {
            sum += nums[r];
            while (l <= r && sum >= target) {
                if (r - l + 1<= res) res = r - l + 1;
                sum -= nums[l];
                l++;
            }
            r++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}

