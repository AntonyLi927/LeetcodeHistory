package Leetcode11;

/**
 * 双指针的思路
 */
public class Leetcode11 {
    public static int maxArea(int[] height) {
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

    public static void main(String[] args) {
        int[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println(Leetcode11.maxArea(array));
    }
}
