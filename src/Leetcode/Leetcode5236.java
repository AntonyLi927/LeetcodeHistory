package Leetcode;

public class Leetcode5236 {
    public static int minDeletion(int[] nums) {
        int newIndex = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (newIndex % 2 == 0) {
                if (i + 1 > nums.length - 1 || nums[i] == nums[i + 1]) {
                    res++;
                    newIndex--;
                }
            }
            newIndex++;
        }
        return res;
    }

    public static void main(String[] args) {
        minDeletion(new int[]{1,1,2,2,3,3});
    }
}
