package Leetcode;

import java.util.Stack;

public class Leetcode155 {
    public static class MinStack {


        Stack<Integer> minStack;
        Stack<Integer> stack;

        public MinStack() {
            minStack = new Stack<>();
            stack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if (minStack.empty()) {
                minStack.push(val);
            } else {
                if (val <= minStack.peek()) {
                    minStack.push(val);
                }
            }
        }

        public void pop() {
            int pop = stack.pop(); // 之前几次提交，这个地方都是写的Integer，测试用例512 -1024 -1024 512， 故不能通过
            if (minStack.peek() == pop) {
                minStack.pop();
            }
        }

        public int top() {
            if (stack.empty()) return 0;
            else return stack.peek();
        }

        public int getMin() {
            if (minStack.empty()) return 0;
            else return minStack.peek();
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
    }
}
