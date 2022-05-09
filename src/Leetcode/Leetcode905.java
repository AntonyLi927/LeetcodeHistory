package Leetcode;

public class Leetcode905 {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = 0;
        while (index < nums.length) {
            if (nums[index] % 2 == 0) {
                res[left] = nums[index];
                left++;
            } else {
                res[right] = nums[index];
                right--;
            }
            index++;
        }
        return res;

    }
}
