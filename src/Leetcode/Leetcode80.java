package Leetcode;

public class Leetcode80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int slow = 2;
        int fast = 2;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        new Leetcode80().removeDuplicates(new int[]{1,1,1,2,2,3});
    }
}
