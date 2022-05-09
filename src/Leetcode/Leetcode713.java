package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode713 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0;
        int l = 0;
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            while (l <= i && prod >= k) {
                prod /= nums[l];
                l++;
            }

            res += i - l + 1;
        }

        return res;
    }



    public static void main(String[] args) {
        new Leetcode713().numSubarrayProductLessThanK(new int[]{10,5,2,6},100);
    }
}
