package Leetcode;

import java.util.LinkedList;
import java.util.Stack;

public class LC739 {
    /**
     * 单调栈
     * @param temperatures
     * @return
     */
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty()){
                int tempTop = stack.peek();
                if (temperatures[i] > temperatures[tempTop]){
                    stack.pop();
                    res[tempTop] = i - tempTop;
                }
                else {
                    stack.push(i);
                    break;
                }
            }
            stack.push(i);
        }
        return res;
    }
}
