package Leetcode;

import java.util.Map;

public class LC53 {


    public int maxSubArray(int[] nums) {
       int max = nums[0];
       int temp = 0;
       for (int i : nums){
           temp = Math.max(temp + i, i);
           max = Math.max(temp, max);
       }
       return max;
    }


}
