package Leetcode;

import java.util.*;

public class LC78 {

    List<List<Integer>> res;

    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            backward(i, nums, 0, new ArrayList<>(), 0);
        }
        return res;
    }

    public void backward(int length, int[] nums, int currentLength, List<Integer> temp, int begin){
        if (currentLength == length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = begin; i < nums.length; i++) {
            if (nums[i] != Integer.MIN_VALUE){
                int record = nums[i];
                temp.add(nums[i]);
                nums[i] = Integer.MIN_VALUE;
                backward(length, nums, currentLength + 1, temp, i + 1);
                nums[i] = record;
                temp.remove(temp.size() - 1);
            }
        }
    }
}
