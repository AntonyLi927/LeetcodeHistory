package Leetcode;

public class Leetcode6027 {
    public static int countHillValley(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = nums[0];
        int res = 0;
        right[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                left[i] = left[i - 1];
            } else {
                left[i] = nums[i - 1];
            }
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == nums[i + 1]) {
                right[i] = right[i + 1];
            } else {
                right[i] = nums[i + 1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if ((num > left[i] && num > right[i]) || (num < left[i] && num < right[i])) {
                if (num != nums[i - 1]) res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        countHillValley(new int[]{2, 4, 1, 1 ,6 ,5});
    }
}
