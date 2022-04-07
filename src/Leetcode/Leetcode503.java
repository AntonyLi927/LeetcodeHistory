package Leetcode;

import java.util.Stack;

public class Leetcode503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        int[] newNums = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
            newNums[i + nums.length] = nums[i];
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = newNums.length - 1; i >= 0; i--) {
            int temp = newNums[i];
            while (!stack.isEmpty() && temp >= stack.peek()) {
                stack.pop();
            }

            if (i < nums.length) {
                res[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(temp);
        }
        return res;
    }
}
