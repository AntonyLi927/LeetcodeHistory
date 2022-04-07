package Leetcode;


public class Leetcode42 {
    public static int trap(int[] height) {
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        int res = 0;
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            res = res + (minHeight - height[i] >= 0 ? (minHeight - height[i]) : 0);
        }

        return res;
    }

    public static void main(String[] args) {
        trap(new int[]{4,2,0,3,2,5});
    }










}
