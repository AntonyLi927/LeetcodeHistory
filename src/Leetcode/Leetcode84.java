package Leetcode;

import java.util.Stack;

public class Leetcode84 {
    public int largestRectangleArea(int[] heights) {
//        int[] maxArea = new int[heights.length];
//        maxArea[0] = heights[0];
//        int res = maxArea[0];
//        int len = 0;
//        for (int i = 1; i < heights.length; i++) {
//            if (heights[i] > heights[i - 1]) {
//                if (heights[i] > maxArea[i - 1] + heights[i - 1]) {
//                    maxArea[i] = heights[i];
//                    len = 1;
//                } else {
//                    maxArea[i] = maxArea[i - 1] + heights[i - 1];
//                    len++;
//                }
//                res = Math.max(res, maxArea[i]);
//            } else {
//                if (heights[i] * (len + 1) > heights[i - 1]) {
//                    maxArea[i] = heights[i] * (len + 1);
//                    len++;
//                } else {
//                    maxArea[i] = maxArea[i - 1];
//                    len = 1;
//                }
//            }
//        }
//        return res;
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        int res = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();

            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();

            right[i] = stack.isEmpty() ? heights.length : stack.peek();
            stack.push(i);
        }

        for (int i = 0; i < heights.length; i++) {
            res = Math.max(res, (right[i] - left[i] - 1) * heights[i]);
        }

        return res;
    }
}
