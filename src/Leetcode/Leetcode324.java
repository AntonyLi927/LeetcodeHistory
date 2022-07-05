package Leetcode;

import java.util.Arrays;

public class Leetcode324 {
    public void wiggleSort(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.sort(nums);

        int minHigh = nums.length % 2 == 0 ? nums.length / 2 : nums.length / 2 + 1;
        int high = nums.length - 1;
        int maxLow = minHigh - 1;
        int index = 0;
        while (maxLow >= 0 || high >= minHigh) {
            if (index >= nums.length) break;
            if (maxLow >= 0) {
                res[index] = nums[maxLow];
                maxLow--;
                index++;
            }

            if (high >= minHigh) {
                res[index] = nums[high];
                high--;
                index++;
            }
        }
        System.arraycopy(res, 0, nums, 0, nums.length);
    }
}
