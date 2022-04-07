package Leetcode;

import java.util.Arrays;

public class Leetcode698 {


    /**
     * 这个答案没有通过所有的案例
     */

    int val;
    int k;

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % k != 0) return false;
        val = sum / k;
        boolean[] used = new boolean[nums.length];
        this.k = k;
        Arrays.sort(nums);
        if (nums[nums.length - 1] > val) return false;

        return recursion(nums, nums.length - 1, used, 0);
    }

    public boolean recursion(int[] nums, int begin, boolean[] used, int curSum) {
        if (this.k == 1) {
            this.k--;
            return true;
        }
        if (curSum == val) {
            this.k--;
            return recursion(nums, nums.length - 1, used, 0);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (!used[i]) {
                if (curSum + nums[i] <= val) {
                    used[i] = true;
                    boolean res = recursion(nums, i - 1, used, curSum + nums[i]);
                    if (res) return true;
                    used[i] = false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Leetcode698 leetcode698 = new Leetcode698();
        leetcode698.canPartitionKSubsets(new int[]{2,2,2,2,3,4,5},4);
    }


}
