package Leetcode;

public class Leetcode31 {
    public void nextPermutation(int[] nums) {
        int leftIndex = nums.length - 1;
        for (; leftIndex > 0 && nums[leftIndex] <= nums[leftIndex - 1]; leftIndex--) {}
        leftIndex--;

        int rightIndex = nums.length - 1;
        if (leftIndex >= 0){
            for (; rightIndex > leftIndex && nums[rightIndex] <= nums[leftIndex]; rightIndex--){}
            swap(nums, leftIndex, rightIndex);
        }


        reverse(nums, leftIndex + 1);

    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
