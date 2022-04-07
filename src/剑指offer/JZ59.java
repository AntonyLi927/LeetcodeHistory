package 剑指offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JZ59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        if (k == nums.length){
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= max) max = nums[i];
            }
            return new int[]{max};
        }
        int[] res = new int[nums.length - k + 1];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= nums.length - k; i++) {
            int temp = nums[i];
            for (int j = i + 1; j <= i + k - 1 ; j++) {
                if (nums[j] >= temp) temp = nums[j];
            }
            res[i] = temp;
        }

        return res;
    }
}
