package Leetcode;

public class Leetcode283 {
    public static void moveZeroes(int[] nums) {
        int zeroCount = 0;

        for (int i = 0; i < nums.length - zeroCount; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                int j = i;
                for (; j < nums.length - zeroCount; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[j] = 0;
                i--;
            }
        }

    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
}
