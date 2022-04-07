package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i] % nums.length;
            if (x == 0) x += nums.length;
            nums[x - 1] += nums.length;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= nums.length) {
                res.add(i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }
}
