package Leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Leetcode239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int maxVal = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < k; i++) {
            if (nums[i] >= maxVal) {
                maxIndex = i;
                maxVal = nums[i];
            }
        }
        res[0] = maxVal;

        for (int i = 1; i < nums.length - k + 1; i++) {
            if (nums[i + k - 1] >= maxVal) {
                res[i] = nums[i + k - 1];
                maxVal = nums[i + k - 1];
                maxIndex = i + k - 1;
            } else {
                if (maxIndex < i) {
                    int tempMax = Integer.MIN_VALUE;
                    int tempIndex = i;
                    for (int j = i; j < i + k; j++) {
                        if (nums[j] >= tempMax) {
                            tempMax = nums[j];
                            tempIndex = j;
                        }
                    }
                    maxVal = tempMax;
                    maxIndex = tempIndex;
                    res[i] = maxVal;
                } else {
                    res[i] = maxVal;
                }
            }
        }

        return res;
    }

}

