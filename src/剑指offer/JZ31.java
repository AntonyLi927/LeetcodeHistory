package 剑指offer;

import java.util.Stack;

public class JZ31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i=0;
        for (int num:pushed){
            stack.add(num);
            while (!stack.isEmpty()&&(stack.peek()==popped[i])){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
