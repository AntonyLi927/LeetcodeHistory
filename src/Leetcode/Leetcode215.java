package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode215 {
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1);
        return nums[k - 1];
    }

    public void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int pivot = partition(nums, left, right);
            quickSort(nums, left, pivot);
            quickSort(nums, pivot + 1, right);
        }
    }

    public int partition(int[] nums, int left, int right) {
        int mark = nums[left];
        while (left < right) {
            while (left < right && nums[right] <= mark) right--;
            nums[left] = nums[right];
            while (left < right && nums[left] > mark) left++;
            nums[right] = nums[left];
        }
        nums[left] = mark;
        return left;
    }

}
