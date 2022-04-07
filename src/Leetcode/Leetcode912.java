package Leetcode;

public class Leetcode912 {



    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }


    //************** quick sort ***************
    public void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = partition(nums, left, right);
            quickSort(nums, left, mid);
            quickSort(nums, mid + 1, right);
        }
    }


    public int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        while (left < right) {
            while (nums[right] >= pivot && right > left) right--;
            nums[left] = nums[right];
            while (nums[left] < pivot && left < right) left++;
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }
    //*******************************************








}
