package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode16 {
    public int threeSumClosest(int[] nums, int target) {
        int res = 10000;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if ((Math.abs(sum - target)) < Math.abs(res - target)) {
                    res = sum;
                }

                if (sum - target == 0) {
                    return sum;
                }

                if (sum - target > 0) {
                    k--;
                } else {
                    j++;
                }
            }

        }
        return res;
    }
}
