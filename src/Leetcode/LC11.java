package Leetcode;

public class LC11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while (left<right){
            int temp = (right-left)*Math.min(height[right],height[left]);
            if (temp>=maxArea){
                maxArea = temp;
            }
            if (height[left]<=height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}
