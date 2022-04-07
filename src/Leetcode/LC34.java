package Leetcode;

public class LC34 {

    public int[] searchRange(int[] nums, int target) {
        int begin = -1;
        int end = -1;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;

            if (nums[mid] >= target){
                right = mid - 1;
                begin = mid;
            }
            else{
                left = mid + 1;
            }
        }

        left = 0;
        right = nums.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;

            if (nums[mid] <= target){
                left = mid + 1;
                end = mid;
            }
            else{
                right = mid - 1;
            }
        }

        if (begin > end || begin == -1 || end == -1) return new int[]{-1, -1};
        else return new int[]{begin, end };





    }

}
